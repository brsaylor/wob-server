/**
 * LinkResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cos.org.datacontract.schemas._2004._07.WCFService_Portal;

public class LinkResponse  extends cos.org.datacontract.schemas._2004._07.WCFService_Portal.Response  implements java.io.Serializable {
    private Integer curPage;

    private Boolean DESC;

    private cos.org.datacontract.schemas._2004._07.LINQ2Entities.Links[] links;

    private String message;

    private String networkId;

    private String orderBy;

    private Integer pageAvailable;

    private Object[] searchParameters;

    private Integer totals;

    public LinkResponse() {
    }

    public LinkResponse(
           String _message,
           Integer curPage,
           Boolean DESC,
           cos.org.datacontract.schemas._2004._07.LINQ2Entities.Links[] links,
           String message,
           String networkId,
           String orderBy,
           Integer pageAvailable,
           Object[] searchParameters,
           Integer totals) {
        super(
            _message);
        this.curPage = curPage;
        this.DESC = DESC;
        this.links = links;
        this.message = message;
        this.networkId = networkId;
        this.orderBy = orderBy;
        this.pageAvailable = pageAvailable;
        this.searchParameters = searchParameters;
        this.totals = totals;
    }


    /**
     * Gets the curPage value for this LinkResponse.
     *
     * @return curPage
     */
    public Integer getCurPage() {
        return curPage;
    }


    /**
     * Sets the curPage value for this LinkResponse.
     *
     * @param curPage
     */
    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }


    /**
     * Gets the DESC value for this LinkResponse.
     *
     * @return DESC
     */
    public Boolean getDESC() {
        return DESC;
    }


    /**
     * Sets the DESC value for this LinkResponse.
     *
     * @param DESC
     */
    public void setDESC(Boolean DESC) {
        this.DESC = DESC;
    }


    /**
     * Gets the links value for this LinkResponse.
     *
     * @return links
     */
    public cos.org.datacontract.schemas._2004._07.LINQ2Entities.Links[] getLinks() {
        return links;
    }


    /**
     * Sets the links value for this LinkResponse.
     *
     * @param links
     */
    public void setLinks(cos.org.datacontract.schemas._2004._07.LINQ2Entities.Links[] links) {
        this.links = links;
    }


    /**
     * Gets the message value for this LinkResponse.
     *
     * @return message
     */
    public String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this LinkResponse.
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * Gets the networkId value for this LinkResponse.
     *
     * @return networkId
     */
    public String getNetworkId() {
        return networkId;
    }


    /**
     * Sets the networkId value for this LinkResponse.
     *
     * @param networkId
     */
    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }


    /**
     * Gets the orderBy value for this LinkResponse.
     *
     * @return orderBy
     */
    public String getOrderBy() {
        return orderBy;
    }


    /**
     * Sets the orderBy value for this LinkResponse.
     *
     * @param orderBy
     */
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }


    /**
     * Gets the pageAvailable value for this LinkResponse.
     *
     * @return pageAvailable
     */
    public Integer getPageAvailable() {
        return pageAvailable;
    }


    /**
     * Sets the pageAvailable value for this LinkResponse.
     *
     * @param pageAvailable
     */
    public void setPageAvailable(Integer pageAvailable) {
        this.pageAvailable = pageAvailable;
    }


    /**
     * Gets the searchParameters value for this LinkResponse.
     *
     * @return searchParameters
     */
    public Object[] getSearchParameters() {
        return searchParameters;
    }


    /**
     * Sets the searchParameters value for this LinkResponse.
     *
     * @param searchParameters
     */
    public void setSearchParameters(Object[] searchParameters) {
        this.searchParameters = searchParameters;
    }


    /**
     * Gets the totals value for this LinkResponse.
     *
     * @return totals
     */
    public Integer getTotals() {
        return totals;
    }


    /**
     * Sets the totals value for this LinkResponse.
     *
     * @param totals
     */
    public void setTotals(Integer totals) {
        this.totals = totals;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof LinkResponse)) return false;
        LinkResponse other = (LinkResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
            ((this.curPage==null && other.getCurPage()==null) ||
             (this.curPage!=null &&
              this.curPage.equals(other.getCurPage()))) &&
            ((this.DESC==null && other.getDESC()==null) ||
             (this.DESC!=null &&
              this.DESC.equals(other.getDESC()))) &&
            ((this.links==null && other.getLinks()==null) ||
             (this.links!=null &&
              java.util.Arrays.equals(this.links, other.getLinks()))) &&
            ((this.message==null && other.getMessage()==null) ||
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.networkId==null && other.getNetworkId()==null) ||
             (this.networkId!=null &&
              this.networkId.equals(other.getNetworkId()))) &&
            ((this.orderBy==null && other.getOrderBy()==null) ||
             (this.orderBy!=null &&
              this.orderBy.equals(other.getOrderBy()))) &&
            ((this.pageAvailable==null && other.getPageAvailable()==null) ||
             (this.pageAvailable!=null &&
              this.pageAvailable.equals(other.getPageAvailable()))) &&
            ((this.searchParameters==null && other.getSearchParameters()==null) ||
             (this.searchParameters!=null &&
              java.util.Arrays.equals(this.searchParameters, other.getSearchParameters()))) &&
            ((this.totals==null && other.getTotals()==null) ||
             (this.totals!=null &&
              this.totals.equals(other.getTotals())));
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
        if (getCurPage() != null) {
            _hashCode += getCurPage().hashCode();
        }
        if (getDESC() != null) {
            _hashCode += getDESC().hashCode();
        }
        if (getLinks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLinks());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getLinks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getNetworkId() != null) {
            _hashCode += getNetworkId().hashCode();
        }
        if (getOrderBy() != null) {
            _hashCode += getOrderBy().hashCode();
        }
        if (getPageAvailable() != null) {
            _hashCode += getPageAvailable().hashCode();
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
        if (getTotals() != null) {
            _hashCode += getTotals().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LinkResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WCFService.Portal", "LinkResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WCFService.Portal", "CurPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DESC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WCFService.Portal", "DESC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("links");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WCFService.Portal", "Links"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LINQ2Entities", "Links"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LINQ2Entities", "Links"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WCFService.Portal", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WCFService.Portal", "NetworkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("pageAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WCFService.Portal", "PageAvailable"));
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
        elemField.setFieldName("totals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WCFService.Portal", "Totals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
