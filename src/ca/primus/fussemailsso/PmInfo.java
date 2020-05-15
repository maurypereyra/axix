/**
 * PmInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ca.primus.fussemailsso;

public class PmInfo  implements java.io.Serializable {
    private java.lang.String loginName;

    private java.lang.String hasPMCaptivePortal;

    public PmInfo() {
    }

    public PmInfo(
           java.lang.String loginName,
           java.lang.String hasPMCaptivePortal) {
           this.loginName = loginName;
           this.hasPMCaptivePortal = hasPMCaptivePortal;
    }


    /**
     * Gets the loginName value for this PmInfo.
     * 
     * @return loginName
     */
    public java.lang.String getLoginName() {
        return loginName;
    }


    /**
     * Sets the loginName value for this PmInfo.
     * 
     * @param loginName
     */
    public void setLoginName(java.lang.String loginName) {
        this.loginName = loginName;
    }


    /**
     * Gets the hasPMCaptivePortal value for this PmInfo.
     * 
     * @return hasPMCaptivePortal
     */
    public java.lang.String getHasPMCaptivePortal() {
        return hasPMCaptivePortal;
    }


    /**
     * Sets the hasPMCaptivePortal value for this PmInfo.
     * 
     * @param hasPMCaptivePortal
     */
    public void setHasPMCaptivePortal(java.lang.String hasPMCaptivePortal) {
        this.hasPMCaptivePortal = hasPMCaptivePortal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PmInfo)) return false;
        PmInfo other = (PmInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loginName==null && other.getLoginName()==null) || 
             (this.loginName!=null &&
              this.loginName.equals(other.getLoginName()))) &&
            ((this.hasPMCaptivePortal==null && other.getHasPMCaptivePortal()==null) || 
             (this.hasPMCaptivePortal!=null &&
              this.hasPMCaptivePortal.equals(other.getHasPMCaptivePortal())));
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
        if (getLoginName() != null) {
            _hashCode += getLoginName().hashCode();
        }
        if (getHasPMCaptivePortal() != null) {
            _hashCode += getHasPMCaptivePortal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PmInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:pdcsvcinfowsdl", "pmInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasPMCaptivePortal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasPMCaptivePortal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
