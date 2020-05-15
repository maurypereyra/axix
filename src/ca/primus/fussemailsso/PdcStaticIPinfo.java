/**
 * PdcStaticIPinfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ca.primus.fussemailsso;

public class PdcStaticIPinfo  implements java.io.Serializable {
    private java.lang.String networkIP;

    private java.lang.String routerIP;

    public PdcStaticIPinfo() {
    }

    public PdcStaticIPinfo(
           java.lang.String networkIP,
           java.lang.String routerIP) {
           this.networkIP = networkIP;
           this.routerIP = routerIP;
    }


    /**
     * Gets the networkIP value for this PdcStaticIPinfo.
     * 
     * @return networkIP
     */
    public java.lang.String getNetworkIP() {
        return networkIP;
    }


    /**
     * Sets the networkIP value for this PdcStaticIPinfo.
     * 
     * @param networkIP
     */
    public void setNetworkIP(java.lang.String networkIP) {
        this.networkIP = networkIP;
    }


    /**
     * Gets the routerIP value for this PdcStaticIPinfo.
     * 
     * @return routerIP
     */
    public java.lang.String getRouterIP() {
        return routerIP;
    }


    /**
     * Sets the routerIP value for this PdcStaticIPinfo.
     * 
     * @param routerIP
     */
    public void setRouterIP(java.lang.String routerIP) {
        this.routerIP = routerIP;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PdcStaticIPinfo)) return false;
        PdcStaticIPinfo other = (PdcStaticIPinfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.networkIP==null && other.getNetworkIP()==null) || 
             (this.networkIP!=null &&
              this.networkIP.equals(other.getNetworkIP()))) &&
            ((this.routerIP==null && other.getRouterIP()==null) || 
             (this.routerIP!=null &&
              this.routerIP.equals(other.getRouterIP())));
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
        if (getNetworkIP() != null) {
            _hashCode += getNetworkIP().hashCode();
        }
        if (getRouterIP() != null) {
            _hashCode += getRouterIP().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PdcStaticIPinfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:pdcsvcinfowsdl", "pdcStaticIPinfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkIP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NetworkIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routerIP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RouterIP"));
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
