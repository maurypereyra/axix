/**
 * DslinfobymctrlList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ca.primus.fussemailsso;

public class DslinfobymctrlList  implements java.io.Serializable {
    private java.lang.String status;

    private java.lang.String message;

    private ca.primus.fussemailsso.AccountInfo accountInfo;

    private ca.primus.fussemailsso.ModemInfo modemInfo;

    public DslinfobymctrlList() {
    }

    public DslinfobymctrlList(
           java.lang.String status,
           java.lang.String message,
           ca.primus.fussemailsso.AccountInfo accountInfo,
           ca.primus.fussemailsso.ModemInfo modemInfo) {
           this.status = status;
           this.message = message;
           this.accountInfo = accountInfo;
           this.modemInfo = modemInfo;
    }


    /**
     * Gets the status value for this DslinfobymctrlList.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this DslinfobymctrlList.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the message value for this DslinfobymctrlList.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this DslinfobymctrlList.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the accountInfo value for this DslinfobymctrlList.
     * 
     * @return accountInfo
     */
    public ca.primus.fussemailsso.AccountInfo getAccountInfo() {
        return accountInfo;
    }


    /**
     * Sets the accountInfo value for this DslinfobymctrlList.
     * 
     * @param accountInfo
     */
    public void setAccountInfo(ca.primus.fussemailsso.AccountInfo accountInfo) {
        this.accountInfo = accountInfo;
    }


    /**
     * Gets the modemInfo value for this DslinfobymctrlList.
     * 
     * @return modemInfo
     */
    public ca.primus.fussemailsso.ModemInfo getModemInfo() {
        return modemInfo;
    }


    /**
     * Sets the modemInfo value for this DslinfobymctrlList.
     * 
     * @param modemInfo
     */
    public void setModemInfo(ca.primus.fussemailsso.ModemInfo modemInfo) {
        this.modemInfo = modemInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DslinfobymctrlList)) return false;
        DslinfobymctrlList other = (DslinfobymctrlList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.accountInfo==null && other.getAccountInfo()==null) || 
             (this.accountInfo!=null &&
              this.accountInfo.equals(other.getAccountInfo()))) &&
            ((this.modemInfo==null && other.getModemInfo()==null) || 
             (this.modemInfo!=null &&
              this.modemInfo.equals(other.getModemInfo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getAccountInfo() != null) {
            _hashCode += getAccountInfo().hashCode();
        }
        if (getModemInfo() != null) {
            _hashCode += getModemInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DslinfobymctrlList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:pdcsvcinfowsdl", "dslinfobymctrlList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:pdcsvcinfowsdl", "accountInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modemInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modemInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:pdcsvcinfowsdl", "modemInfo"));
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
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
