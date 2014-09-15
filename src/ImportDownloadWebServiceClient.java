import java.rmi.RemoteException;
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
public class ImportDownloadWebServiceClient {

    public static String main(String[] args) {
        String wsURL = "http://hvee350.srvr:8080/axis2/services/ImportDownloadServices";
        try {
            ImportDownloadServicesStub stub = new ImportDownloadServicesStub(wsURL);
            if(args[0].equals("import")) {
            	//System.out.println(args[0] + " " + args[1] + " " + args[2] + " " + args[3] + " " + args[4]);
            	return (callImportMarketDataOperation(stub,args[1],args[2],args[3],args[4]));
            }
            else
            	return (callDownloadFileOperation(stub,args[1]));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "";
    }

    private static String callImportMarketDataOperation(ImportDownloadServicesStub stub, String sec, String startDate, String endDate, String dataSourceURL) throws Exception {
        // Ready the request for rdthImport operation.
        ImportMarketDataDocument reqDoc = ImportMarketDataDocument.Factory.newInstance();
        ImportMarketData req = reqDoc.addNewImportMarketData();
        //System.out.println(sec + " " + startDate + " " + endDate + " " + dataSourceURL);
        req.setDataSourceURL(dataSourceURL);
        
        Calendar s = createCalendar(startDate);
        Calendar e = createCalendar(endDate);
        req.setStartDate(s);
        req.setEndDate(e);
        
        req.setSec(sec);
        
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
        } catch (RemoteException re) {
        	System.out.println(re.getMessage());
        	re.printStackTrace();
        	
        }

        return result;
    }

    private static Calendar createCalendar(String time) {
		String[] times = time.split("T");
		try {
			Date d = new SimpleDateFormat("yyyy-MMM-dd").parse(times[0]);
			Calendar c = Calendar.getInstance();
			c.setTime(d);
			convertTime(times[1], c);
			return c;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
    
    private static void convertTime(String time, Calendar c) {
		String[] times = time.split(":");
		String[] seconds = times[2].split("\\.");
		c.set(Calendar.HOUR, Integer.parseInt(times[0]));
		c.set(Calendar.MINUTE, Integer.parseInt(times[1]));
		c.set(Calendar.SECOND, Integer.parseInt(seconds[0]));
		c.set(Calendar.MILLISECOND, Integer.parseInt(seconds[1]));
	}

	private static String callDownloadFileOperation(ImportDownloadServicesStub stub, String eventSetId) throws Exception{
        // Ready the request for downloadFile operation.
        DownloadFileDocument reqDoc = DownloadFileDocument.Factory.newInstance();
        DownloadFile req = reqDoc.addNewDownloadFile();
        req.setEventSetId(eventSetId);

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