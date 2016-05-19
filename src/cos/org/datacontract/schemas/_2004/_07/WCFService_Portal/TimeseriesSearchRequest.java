/**
 * TimeseriesSearchRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cos.org.datacontract.schemas._2004._07.WCFService_Portal;

public class TimeseriesSearchRequest  extends cos.org.datacontract.schemas._2004._07.WCFService_Portal.Request  implements java.io.Serializable {
    private Boolean DESC;

    private Boolean loadTimesteps;

    private String orderBy;

    private Integer page;

    private Integer pageSize;

    private Object[] searchParameters;

    private cos.org.datacontract.schemas._2004._07.LINQ2Entities.User user;

    private String whereClause;

    public TimeseriesSearchRequest() {
    }

    public TimeseriesSearchRequest(
           Boolean DESC,
           Boolean loadTimesteps,
           String orderBy,
           Integer page,
           Integer pageSize,
           Object[] searchParameters,
           cos.org.datacontract.schemas._2004._07.LINQ2Entities.User user,
           String whereClause) {
        this.DESC = DESC;
        this.loadTimesteps = loadTimesteps;
        this.orderBy = orderBy;
        this.page = page;
        this.pageSize = pageSize;
        this.searchParameters = searchParameters;
        this.user = user;
        this.whereClause = whereClause;
    }


    /**
     * Gets the DESC value for this TimeseriesSearchRequest.
     *
     * @return DESC
     */
    public Boolean getDESC() {
        return DESC;
    }


    /**
     * Sets the DESC value for this TimeseriesSearchRequest.
     *
     * @param DESC
     */
    public void setDESC(Boolean DESC) {
        this.DESC = DESC;
    }


    /**
     * Gets the loadTimesteps value for this TimeseriesSearchRequest.
     *
     * @return loadTimesteps
     */
    public Boolean getLoadTimesteps() {
        return loadTimesteps;
    }


    /**
     * Sets the loadTimesteps value for this TimeseriesSearchRequest.
     *
     * @param loadTimesteps
     */
    public void setLoadTimesteps(Boolean loadTimesteps) {
        this.loadTimesteps = loadTimesteps;
    }


    /**
     * Gets the orderBy value for this TimeseriesSearchRequest.
     *
     * @return orderBy
     */
    public String getOrderBy() {
        return orderBy;
    }


    /**
     * Sets the orderBy value for this TimeseriesSearchRequest.
     *
     * @param orderBy
     */
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }


    /**
     * Gets the page value for this TimeseriesSearchRequest.
     *
     * @return page
     */
    public Integer getPage() {
        return page;
    }


    /**
     * Sets the page value for this TimeseriesSearchRequest.
     *
     * @param page
     */
    public void setPage(Integer page) {
        this.page = page;
    }


    /**
     * Gets the pageSize value for this TimeseriesSearchRequest.
     *
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this TimeseriesSearchRequest.
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the searchParameters value for this TimeseriesSearchRequest.
     *
     * @return searchParameters
     */
    public Object[] getSearchParameters() {
        return searchParameters;
    }


    /**
     * Sets the searchParameters value for this TimeseriesSearchRequest.
     *
     * @param searchParameters
     */
    public void setSearchParameters(Object[] searchParameters) {
        this.searchParameters = searchParameters;
    }


    /**
     * Gets the user value for this TimeseriesSearchRequest.
     *
     * @return user
     */
    public cos.org.datacontract.schemas._2004._07.LINQ2Entities.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this TimeseriesSearchRequest.
     *
     * @param user
     */
    public void setUser(cos.org.datacontract.schemas._2004._07.LINQ2Entities.User user) {
        this.user = user;
    }


    /**
     * Gets the whereClause value for this TimeseriesSearchRequest.
     *
     * @return whereClause
     */
    public String getWhereClause() {
        return whereClause;
    }


    /**
     * Sets the whereClause value for this TimeseriesSearchRequest.
     *
     * @param whereClause
     */
    public void setWhereClause(String whereClause) {
        this.whereClause = whereClause;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TimeseriesSearchRequest)) return false;
        TimeseriesSearchRequest other = (TimeseriesSearchRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
            ((this.DESC==null && other.getDESC()==null) ||
             (this.DESC!=null &&
              this.DESC.equals(other.getDESC()))) &&
            ((this.loadTimesteps==null && other.getLoadTimesteps()==null) ||
             (this.loadTimesteps!=null &&
              this.loadTimesteps.equals(other.getLoadTimesteps()))) &&
            ((this.orderBy==null && other.getOrderBy()==null) ||
             (this.orderBy!=null &&
              this.orderBy.equals(other.getOrderBy()))) &&
            ((this.page==null && other.getPage()==null) ||
             (this.page!=null &&
              this.page.equals(other.getPage()))) &&
            ((this.pageSize==null && other.getPageSize()==null) ||
             (this.pageSize!=null &&
              this.pageSize.equals(other.getPageSize()))) &&
            ((this.searchParameters==null && other.getSearchParameters()==null) ||
             (this.searchParameters!=null &&
              java.util.Arrays.equals(this.searchParameters, other.getSearchParameters()))) &&
            ((this.user==null && other.getUser()==null) ||
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.whereClause==null && other.getWhereClause()==null) ||
             (this.whereClause!=null &&
              this.whereClause.equals(other.getWhereClause())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDESC() != null) {
            _hashCode += getDESC().hashCode();
        }
        if (getLoadTimesteps() != null) {
            _hashCode += getLoadTimesteps().hashCode();
        }
        if (getOrderBy() != null) {
            _hashCode += getOrderBy().hashCode();
        }
        if (getPage() != null) {
            _hashCode += getPage().hashCode();
        }
        if (getPageSize() != null) {
            _hashCode += getPageSize().hashCode();
        }
        if (getSearchParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchParameters());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSearchParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getWhereClause() != null) {
            _hashCode += getWhereClause().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeseriesSearchRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WCFService.Portal", "TimeseriesSearchRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DESC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WCFService.Portal", "DESC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadTimesteps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WCFService.Portal", "LoadTimesteps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WCFService.Portal", "OrderBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("page");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WCFService.Portal", "Page"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WCFService.Portal", "PageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WCFService.Portal", "SearchParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "anyType"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WCFService.Portal", "User"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LINQ2Entities", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("whereClause");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WCFService.Portal", "WhereClause"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
