
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import au.edu.unsw.sltf.client.ImportDownloadServicesStub;
import au.edu.unsw.sltf.services.DownloadFileDocument;
import au.edu.unsw.sltf.services.DownloadFileResponseDocument;
import au.edu.unsw.sltf.services.ImportMarketDataDocument;
import au.edu.unsw.sltf.services.ImportMarketDataResponseDocument;
import au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile;
import au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse;
import au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData;
import au.edu.unsw.sltf.services.ImportMarketDataResponseDocument.ImportMarketDataResponse;

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
        String wsURL = "http://localhost:8080/axis2/services/TopDownSimpleServices";
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
        req.setDataSourceURL("http://www.cse.unsw.edu.au/~hpaik/9322/assignments/common/files_csv_spec/FinDataSimple.csv");
        
        Date d = new SimpleDateFormat("dd/mm/yyyy").parse("29/06/2001");
        Calendar s = Calendar.getInstance();
        s.setTime(d);
        req.setStartDate(s);
        
        req.setSec("ABCD");
        
        d = new SimpleDateFormat("dd/mm/yyyy").parse("01/08/2001");
        Calendar e = Calendar.getInstance();
        e.setTime(d);
        req.setEndDate(e);

        // Use the stub (from generated code) to make the call.
        ImportMarketDataResponseDocument respDoc = stub.importMarketData(reqDoc);
        ImportMarketDataResponse resp = respDoc.getImportMarketDataResponse();
        String result = resp.getEventSetId();

        return result;
    }

    private static String callDownloadFileOperation(ImportDownloadServicesStub stub) throws Exception{
        // Ready the request for downloadFile operation.
        DownloadFileDocument reqDoc = DownloadFileDocument.Factory.newInstance();
        DownloadFile req = reqDoc.addNewDownloadFile();
        //TODO: establish event ID
        req.setEventSetId("3");

        // Use the stub (from generated code) to make the call.
        DownloadFileResponseDocument respDoc = stub.downloadFile(reqDoc);
        DownloadFileResponse resp = respDoc.getDownloadFileResponse();
        String result = resp.getDataURL();

        return result;
    }
}