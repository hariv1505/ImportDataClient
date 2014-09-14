
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import au.edu.unsw.sltf.client.ImportDownloadFaultException;
import au.edu.unsw.sltf.client.ImportDownloadServicesStub;
import au.edu.unsw.sltf.services.DownloadFileDocument;
import au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile;
import au.edu.unsw.sltf.services.DownloadFileResponseDocument;
import au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse;
import au.edu.unsw.sltf.services.ImportDownloadFaultDocument;
import au.edu.unsw.sltf.services.ImportDownloadFaultDocument.ImportDownloadFault;
import au.edu.unsw.sltf.services.ImportMarketDataDocument;
import au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData;
import au.edu.unsw.sltf.services.ImportMarketDataResponseDocument;
import au.edu.unsw.sltf.services.ImportMarketDataResponseDocument.ImportMarketDataResponse;
import au.edu.unsw.sltf.services.impl.ImportDownloadFaultDocumentImpl;
import au.edu.unsw.sltf.services.impl.ImportDownloadFaultDocumentImpl.ImportDownloadFaultImpl;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Web service client that connects to the TopDownSimpleServices
 * Web service.
 */
public class WebServiceClient {

    public static void main(String[] args) {
        String wsURL = "http://localhost:8080/axis2/services/ImportDownloadServices";
        try {
            ImportDownloadServicesStub stub = new ImportDownloadServicesStub(wsURL);
            System.out.println("The output of importMarketData operation is: ");
            System.out.println(callImportMarketDataOperation(stub));
            System.out.println("The output of downloadFile operation is: ");
            System.out.println(callDownloadFileOperation(stub));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static String callImportMarketDataOperation(ImportDownloadServicesStub stub) throws Exception {
        // Ready the request for rdthImport operation.
        ImportMarketDataDocument reqDoc = ImportMarketDataDocument.Factory.newInstance();
        ImportMarketData req = reqDoc.addNewImportMarketData();
        req.setDataSourceURL("http://localhost:8080/axis2/12345.csv");
        
        Date d = null;
        /*try {
        	d = new SimpleDateFormat("dd/MM/yyyy'T'hh:mm:ss.SSS").parse("29/06/2001T12:00:00.000");
        } catch(ParseException e) {
        	//TODO
        	return null;
        	//throw new ImportDownloadFaultException("Invalid start date");
        }*/
        
        Calendar s = Calendar.getInstance();
        s.set(Calendar.HOUR, 12);
        s.set(Calendar.MINUTE, 0);
        s.set(Calendar.SECOND, 0);
        s.set(Calendar.MILLISECOND, 0);
        s.set(Calendar.YEAR, 2001);
        s.set(Calendar.MONTH, 5);
        s.set(Calendar.DATE, 29);
        //s.setTime(d);
        req.setStartDate(s);
        
        req.setSec("ZXQ");
        
        /*
        try {
        	d = new SimpleDateFormat("dd/MM/yyyy'T'hh:mm:ss.SSS").parse("01/08/2001T12:00:00.000");
        } catch(ParseException e) {
        	//TODO
        	return null;
        	//throw new ImportDownloadFaultException("Invalid end date");
        }
        */
        Calendar e = Calendar.getInstance();
        //e.setTime(d);
        e.set(Calendar.HOUR, 12);
        e.set(Calendar.MINUTE, 0);
        e.set(Calendar.SECOND, 0);
        e.set(Calendar.MILLISECOND, 0);
        e.set(Calendar.YEAR, 2001);
        e.set(Calendar.MONTH, 7);
        e.set(Calendar.DATE, 1);
        req.setEndDate(e);

        String result = "";
        try {
        	ImportMarketDataResponseDocument respDoc = stub.importMarketData(reqDoc);
            ImportMarketDataResponse resp = respDoc.getImportMarketDataResponse();
            result += resp.getEventSetId();
        } catch (ImportDownloadFaultException ie) {
        	ImportDownloadFaultDocument faultDoc = ie.getFaultMessage();
        	ImportDownloadFault idf = faultDoc.getImportDownloadFault();
        	au.edu.unsw.sltf.services.ImportDownloadFaultType.Enum faultType = idf.getFaultType();
        	String faultMsg = idf.getFaultMessage();
        	
        	result += "Fault type: " + faultType + "\n";
        	result += "Fault message: " + faultMsg;
        }

        return result;
    }

    private static String callDownloadFileOperation(ImportDownloadServicesStub stub) throws Exception{
        // Ready the request for downloadFile operation.
        DownloadFileDocument reqDoc = DownloadFileDocument.Factory.newInstance();
        DownloadFile req = reqDoc.addNewDownloadFile();
        //TODO: establish event ID
        req.setEventSetId("12345");

        // Use the stub (from generated code) to make the call.
        String result = "";
        try {
        	DownloadFileResponseDocument respDoc = stub.downloadFile(reqDoc);
        	DownloadFileResponse resp = respDoc.getDownloadFileResponse();
        	result += resp.getDataURL();
        } catch (ImportDownloadFaultException ie) {
        	ImportDownloadFaultDocument faultDoc = ie.getFaultMessage();
        	ImportDownloadFault idf = faultDoc.getImportDownloadFault();
        	au.edu.unsw.sltf.services.ImportDownloadFaultType.Enum faultType = idf.getFaultType();
        	String faultMsg = idf.getFaultMessage();
        	
        	result += "Fault type: " + faultType + "\n";
        	result += "Fault message: " + faultMsg;
        }
        
        return result;
    }
}