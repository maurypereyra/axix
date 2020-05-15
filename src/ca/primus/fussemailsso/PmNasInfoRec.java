/**
 * PmNasInfoRec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ca.primus.fussemailsso;

public class PmNasInfoRec  implements java.io.Serializable {
    private java.lang.String nas_user_name;

    private java.lang.String nas_master_control;

    private java.lang.String nas_start_time;

    private java.lang.String nas_end_time;

    public PmNasInfoRec() {
    }

    public PmNasInfoRec(
           java.lang.String nas_user_name,
           java.lang.String nas_master_control,
           java.lang.String nas_start_time,
           java.lang.String nas_end_time) {
           this.nas_user_name = nas_user_name;
           this.nas_master_control = nas_master_control;
           this.nas_start_time = nas_start_time;
           this.nas_end_time = nas_end_time;
    }


    /**
     * Gets the nas_user_name value for this PmNasInfoRec.
     * 
     * @return nas_user_name
     */
    public java.lang.String getNas_user_name() {
        return nas_user_name;
    }


    /**
     * Sets the nas_user_name value for this PmNasInfoRec.
     * 
     * @param nas_user_name
     */
    public void setNas_user_name(java.lang.String nas_user_name) {
        this.nas_user_name = nas_user_name;
    }


    /**
     * Gets the nas_master_control value for this PmNasInfoRec.
     * 
     * @return nas_master_control
     */
    public java.lang.String getNas_master_control() {
        return nas_master_control;
    }


    /**
     * Sets the nas_master_control value for this PmNasInfoRec.
     * 
     * @param nas_master_control
     */
    public void setNas_master_control(java.lang.String nas_master_control) {
        this.nas_master_control = nas_master_control;
    }


    /**
     * Gets the nas_start_time value for this PmNasInfoRec.
     * 
     * @return nas_start_time
     */
    public java.lang.String getNas_start_time() {
        return nas_start_time;
    }


    /**
     * Sets the nas_start_time value for this PmNasInfoRec.
     * 
     * @param nas_start_time
     */
    public void setNas_start_time(java.lang.String nas_start_time) {
        this.nas_start_time = nas_start_time;
    }


    /**
     * Gets the nas_end_time value for this PmNasInfoRec.
     * 
     * @return nas_end_time
     */
    public java.lang.String getNas_end_time() {
        return nas_end_time;
    }


    /**
     * Sets the nas_end_time value for this PmNasInfoRec.
     * 
     * @param nas_end_time
     */
    public void setNas_end_time(java.lang.String nas_end_time) {
        this.nas_end_time = nas_end_time;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PmNasInfoRec)) return false;
        PmNasInfoRec other = (PmNasInfoRec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nas_user_name==null && other.getNas_user_name()==null) || 
             (this.nas_user_name!=null &&
              this.nas_user_name.equals(other.getNas_user_name()))) &&
            ((this.nas_master_control==null && other.getNas_master_control()==null) || 
             (this.nas_master_control!=null &&
              this.nas_master_control.equals(other.getNas_master_control()))) &&
            ((this.nas_start_time==null && other.getNas_start_time()==null) || 
             (this.nas_start_time!=null &&
              this.nas_start_time.equals(other.getNas_start_time()))) &&
            ((this.nas_end_time==null && other.getNas_end_time()==null) || 
             (this.nas_end_time!=null &&
              this.nas_end_time.equals(other.getNas_end_time())));
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
        if (getNas_user_name() != null) {
            _hashCode += getNas_user_name().hashCode();
        }
        if (getNas_master_control() != null) {
            _hashCode += getNas_master_control().hashCode();
        }
        if (getNas_start_time() != null) {
            _hashCode += getNas_start_time().hashCode();
        }
        if (getNas_end_time() != null) {
            _hashCode += getNas_end_time().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PmNasInfoRec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:pdcsvcinfowsdl", "pmNasInfoRec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nas_user_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nas_user_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nas_master_control");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nas_master_control"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nas_start_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nas_start_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nas_end_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nas_end_time"));
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
