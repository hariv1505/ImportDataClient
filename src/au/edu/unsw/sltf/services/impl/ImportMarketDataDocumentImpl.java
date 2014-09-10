/*
 * An XML document type.
 * Localname: importMarketData
 * Namespace: http://sltf.unsw.edu.au/topdown
 * Java type: au.edu.unsw.sltf.services.ImportMarketDataDocument
 *
 * Automatically generated - do not modify.
 */
package au.edu.unsw.sltf.services.impl;
/**
 * A document containing one importMarketData(@http://sltf.unsw.edu.au/topdown) element.
 *
 * This is a complex type.
 */
public class ImportMarketDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.ImportMarketDataDocument
{
    
    public ImportMarketDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPORTMARKETDATA$0 = 
        new javax.xml.namespace.QName("http://sltf.unsw.edu.au/topdown", "importMarketData");
    
    
    /**
     * Gets the "importMarketData" element
     */
    public au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData getImportMarketData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData target = null;
            target = (au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData)get_store().find_element_user(IMPORTMARKETDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "importMarketData" element
     */
    public void setImportMarketData(au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData importMarketData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData target = null;
            target = (au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData)get_store().find_element_user(IMPORTMARKETDATA$0, 0);
            if (target == null)
            {
                target = (au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData)get_store().add_element_user(IMPORTMARKETDATA$0);
            }
            target.set(importMarketData);
        }
    }
    
    /**
     * Appends and returns a new empty "importMarketData" element
     */
    public au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData addNewImportMarketData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData target = null;
            target = (au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData)get_store().add_element_user(IMPORTMARKETDATA$0);
            return target;
        }
    }
    /**
     * An XML importMarketData(@http://sltf.unsw.edu.au/topdown).
     *
     * This is a complex type.
     */
    public static class ImportMarketDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData
    {
        
        public ImportMarketDataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SEC$0 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/topdown", "sec");
        private static final javax.xml.namespace.QName STARTDATE$2 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/topdown", "startDate");
        private static final javax.xml.namespace.QName ENDDATE$4 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/topdown", "endDate");
        private static final javax.xml.namespace.QName DATASOURCE$6 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/topdown", "dataSource");
        
        
        /**
         * Gets the "sec" element
         */
        public java.lang.String getSec()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEC$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sec" element
         */
        public org.apache.xmlbeans.XmlString xgetSec()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEC$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "sec" element
         */
        public void setSec(java.lang.String sec)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEC$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEC$0);
                }
                target.setStringValue(sec);
            }
        }
        
        /**
         * Sets (as xml) the "sec" element
         */
        public void xsetSec(org.apache.xmlbeans.XmlString sec)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEC$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEC$0);
                }
                target.set(sec);
            }
        }
        
        /**
         * Gets the "startDate" element
         */
        public java.lang.String getStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "startDate" element
         */
        public org.apache.xmlbeans.XmlString xgetStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTDATE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "startDate" element
         */
        public void setStartDate(java.lang.String startDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$2);
                }
                target.setStringValue(startDate);
            }
        }
        
        /**
         * Sets (as xml) the "startDate" element
         */
        public void xsetStartDate(org.apache.xmlbeans.XmlString startDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STARTDATE$2);
                }
                target.set(startDate);
            }
        }
        
        /**
         * Gets the "endDate" element
         */
        public java.lang.String getEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "endDate" element
         */
        public org.apache.xmlbeans.XmlString xgetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDDATE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "endDate" element
         */
        public void setEndDate(java.lang.String endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$4);
                }
                target.setStringValue(endDate);
            }
        }
        
        /**
         * Sets (as xml) the "endDate" element
         */
        public void xsetEndDate(org.apache.xmlbeans.XmlString endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENDDATE$4);
                }
                target.set(endDate);
            }
        }
        
        /**
         * Gets the "dataSource" element
         */
        public java.lang.String getDataSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASOURCE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "dataSource" element
         */
        public org.apache.xmlbeans.XmlString xgetDataSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATASOURCE$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "dataSource" element
         */
        public void setDataSource(java.lang.String dataSource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASOURCE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATASOURCE$6);
                }
                target.setStringValue(dataSource);
            }
        }
        
        /**
         * Sets (as xml) the "dataSource" element
         */
        public void xsetDataSource(org.apache.xmlbeans.XmlString dataSource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATASOURCE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATASOURCE$6);
                }
                target.set(dataSource);
            }
        }
    }
}
