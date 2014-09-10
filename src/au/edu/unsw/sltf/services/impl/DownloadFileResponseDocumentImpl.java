/*
 * An XML document type.
 * Localname: downloadFileResponse
 * Namespace: http://sltf.unsw.edu.au/topdown
 * Java type: au.edu.unsw.sltf.services.DownloadFileResponseDocument
 *
 * Automatically generated - do not modify.
 */
package au.edu.unsw.sltf.services.impl;
/**
 * A document containing one downloadFileResponse(@http://sltf.unsw.edu.au/topdown) element.
 *
 * This is a complex type.
 */
public class DownloadFileResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.DownloadFileResponseDocument
{
    
    public DownloadFileResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOWNLOADFILERESPONSE$0 = 
        new javax.xml.namespace.QName("http://sltf.unsw.edu.au/topdown", "downloadFileResponse");
    
    
    /**
     * Gets the "downloadFileResponse" element
     */
    public au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse getDownloadFileResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse target = null;
            target = (au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse)get_store().find_element_user(DOWNLOADFILERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "downloadFileResponse" element
     */
    public void setDownloadFileResponse(au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse downloadFileResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse target = null;
            target = (au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse)get_store().find_element_user(DOWNLOADFILERESPONSE$0, 0);
            if (target == null)
            {
                target = (au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse)get_store().add_element_user(DOWNLOADFILERESPONSE$0);
            }
            target.set(downloadFileResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "downloadFileResponse" element
     */
    public au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse addNewDownloadFileResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse target = null;
            target = (au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse)get_store().add_element_user(DOWNLOADFILERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML downloadFileResponse(@http://sltf.unsw.edu.au/topdown).
     *
     * This is a complex type.
     */
    public static class DownloadFileResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse
    {
        
        public DownloadFileResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/topdown", "return");
        
        
        /**
         * Gets the "return" element
         */
        public java.lang.String getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "return" element
         */
        public org.apache.xmlbeans.XmlString xgetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "return" element
         */
        public boolean isNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(java.lang.String xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETURN$0);
                }
                target.setStringValue(xreturn);
            }
        }
        
        /**
         * Sets (as xml) the "return" element
         */
        public void xsetReturn(org.apache.xmlbeans.XmlString xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Nils the "return" element
         */
        public void setNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
    }
}
