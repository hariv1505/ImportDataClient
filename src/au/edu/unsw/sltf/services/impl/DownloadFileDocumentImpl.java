/*
 * An XML document type.
 * Localname: downloadFile
 * Namespace: http://sltf.unsw.edu.au/topdown
 * Java type: au.edu.unsw.sltf.services.DownloadFileDocument
 *
 * Automatically generated - do not modify.
 */
package au.edu.unsw.sltf.services.impl;
/**
 * A document containing one downloadFile(@http://sltf.unsw.edu.au/topdown) element.
 *
 * This is a complex type.
 */
public class DownloadFileDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.DownloadFileDocument
{
    
    public DownloadFileDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOWNLOADFILE$0 = 
        new javax.xml.namespace.QName("http://sltf.unsw.edu.au/topdown", "downloadFile");
    
    
    /**
     * Gets the "downloadFile" element
     */
    public au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile getDownloadFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile target = null;
            target = (au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile)get_store().find_element_user(DOWNLOADFILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "downloadFile" element
     */
    public void setDownloadFile(au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile downloadFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile target = null;
            target = (au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile)get_store().find_element_user(DOWNLOADFILE$0, 0);
            if (target == null)
            {
                target = (au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile)get_store().add_element_user(DOWNLOADFILE$0);
            }
            target.set(downloadFile);
        }
    }
    
    /**
     * Appends and returns a new empty "downloadFile" element
     */
    public au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile addNewDownloadFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile target = null;
            target = (au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile)get_store().add_element_user(DOWNLOADFILE$0);
            return target;
        }
    }
    /**
     * An XML downloadFile(@http://sltf.unsw.edu.au/topdown).
     *
     * This is a complex type.
     */
    public static class DownloadFileImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile
    {
        
        public DownloadFileImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EVENTSETID$0 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/topdown", "eventSetID");
        
        
        /**
         * Gets the "eventSetID" element
         */
        public java.lang.String getEventSetID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTSETID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "eventSetID" element
         */
        public org.apache.xmlbeans.XmlString xgetEventSetID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTSETID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "eventSetID" element
         */
        public void setEventSetID(java.lang.String eventSetID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTSETID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTSETID$0);
                }
                target.setStringValue(eventSetID);
            }
        }
        
        /**
         * Sets (as xml) the "eventSetID" element
         */
        public void xsetEventSetID(org.apache.xmlbeans.XmlString eventSetID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTSETID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTSETID$0);
                }
                target.set(eventSetID);
            }
        }
    }
}
