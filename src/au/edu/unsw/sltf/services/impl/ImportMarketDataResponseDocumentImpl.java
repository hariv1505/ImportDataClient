/*
 * An XML document type.
 * Localname: importMarketDataResponse
 * Namespace: http://sltf.unsw.edu.au/topdown
 * Java type: au.edu.unsw.sltf.services.ImportMarketDataResponseDocument
 *
 * Automatically generated - do not modify.
 */
package au.edu.unsw.sltf.services.impl;
/**
 * A document containing one importMarketDataResponse(@http://sltf.unsw.edu.au/topdown) element.
 *
 * This is a complex type.
 */
public class ImportMarketDataResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.ImportMarketDataResponseDocument
{
    
    public ImportMarketDataResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPORTMARKETDATARESPONSE$0 = 
        new javax.xml.namespace.QName("http://sltf.unsw.edu.au/topdown", "importMarketDataResponse");
    
    
    /**
     * Gets the "importMarketDataResponse" element
     */
    public au.edu.unsw.sltf.services.ImportMarketDataResponseDocument.ImportMarketDataResponse getImportMarketDataResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.ImportMarketDataResponseDocument.ImportMarketDataResponse target = null;
            target = (au.edu.unsw.sltf.services.ImportMarketDataResponseDocument.ImportMarketDataResponse)get_store().find_element_user(IMPORTMARKETDATARESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "importMarketDataResponse" element
     */
    public void setImportMarketDataResponse(au.edu.unsw.sltf.services.ImportMarketDataResponseDocument.ImportMarketDataResponse importMarketDataResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.ImportMarketDataResponseDocument.ImportMarketDataResponse target = null;
            target = (au.edu.unsw.sltf.services.ImportMarketDataResponseDocument.ImportMarketDataResponse)get_store().find_element_user(IMPORTMARKETDATARESPONSE$0, 0);
            if (target == null)
            {
                target = (au.edu.unsw.sltf.services.ImportMarketDataResponseDocument.ImportMarketDataResponse)get_store().add_element_user(IMPORTMARKETDATARESPONSE$0);
            }
            target.set(importMarketDataResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "importMarketDataResponse" element
     */
    public au.edu.unsw.sltf.services.ImportMarketDataResponseDocument.ImportMarketDataResponse addNewImportMarketDataResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.ImportMarketDataResponseDocument.ImportMarketDataResponse target = null;
            target = (au.edu.unsw.sltf.services.ImportMarketDataResponseDocument.ImportMarketDataResponse)get_store().add_element_user(IMPORTMARKETDATARESPONSE$0);
            return target;
        }
    }
    /**
     * An XML importMarketDataResponse(@http://sltf.unsw.edu.au/topdown).
     *
     * This is a complex type.
     */
    public static class ImportMarketDataResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.ImportMarketDataResponseDocument.ImportMarketDataResponse
    {
        
        public ImportMarketDataResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
    }
}
