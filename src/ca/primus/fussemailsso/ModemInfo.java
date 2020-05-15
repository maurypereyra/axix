/**
 * ModemInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ca.primus.fussemailsso;

public class ModemInfo  implements java.io.Serializable {
    private java.lang.String serial;

    private java.lang.String mac;

    private java.lang.String modemtype;

    private java.lang.String manufacturer;

    private java.lang.String firmwareVersion;

    private java.lang.String loginName;

    private java.lang.String[] wanIP;

    private java.lang.String lastInform;

    private java.lang.String downstreamCurrRate;

    private java.lang.String upstreamCurrRate;

    private java.lang.String upstreamNoiseMargin;

    private java.lang.String downstreamNoiseMargin;

    private java.lang.String[] deviceLabels;

    public ModemInfo() {
    }

    public ModemInfo(
           java.lang.String serial,
           java.lang.String mac,
           java.lang.String modemtype,
           java.lang.String manufacturer,
           java.lang.String firmwareVersion,
           java.lang.String loginName,
           java.lang.String[] wanIP,
           java.lang.String lastInform,
           java.lang.String downstreamCurrRate,
           java.lang.String upstreamCurrRate,
           java.lang.String upstreamNoiseMargin,
           java.lang.String downstreamNoiseMargin,
           java.lang.String[] deviceLabels) {
           this.serial = serial;
           this.mac = mac;
           this.modemtype = modemtype;
           this.manufacturer = manufacturer;
           this.firmwareVersion = firmwareVersion;
           this.loginName = loginName;
           this.wanIP = wanIP;
           this.lastInform = lastInform;
           this.downstreamCurrRate = downstreamCurrRate;
           this.upstreamCurrRate = upstreamCurrRate;
           this.upstreamNoiseMargin = upstreamNoiseMargin;
           this.downstreamNoiseMargin = downstreamNoiseMargin;
           this.deviceLabels = deviceLabels;
    }


    /**
     * Gets the serial value for this ModemInfo.
     * 
     * @return serial
     */
    public java.lang.String getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this ModemInfo.
     * 
     * @param serial
     */
    public void setSerial(java.lang.String serial) {
        this.serial = serial;
    }


    /**
     * Gets the mac value for this ModemInfo.
     * 
     * @return mac
     */
    public java.lang.String getMac() {
        return mac;
    }


    /**
     * Sets the mac value for this ModemInfo.
     * 
     * @param mac
     */
    public void setMac(java.lang.String mac) {
        this.mac = mac;
    }


    /**
     * Gets the modemtype value for this ModemInfo.
     * 
     * @return modemtype
     */
    public java.lang.String getModemtype() {
        return modemtype;
    }


    /**
     * Sets the modemtype value for this ModemInfo.
     * 
     * @param modemtype
     */
    public void setModemtype(java.lang.String modemtype) {
        this.modemtype = modemtype;
    }


    /**
     * Gets the manufacturer value for this ModemInfo.
     * 
     * @return manufacturer
     */
    public java.lang.String getManufacturer() {
        return manufacturer;
    }


    /**
     * Sets the manufacturer value for this ModemInfo.
     * 
     * @param manufacturer
     */
    public void setManufacturer(java.lang.String manufacturer) {
        this.manufacturer = manufacturer;
    }


    /**
     * Gets the firmwareVersion value for this ModemInfo.
     * 
     * @return firmwareVersion
     */
    public java.lang.String getFirmwareVersion() {
        return firmwareVersion;
    }


    /**
     * Sets the firmwareVersion value for this ModemInfo.
     * 
     * @param firmwareVersion
     */
    public void setFirmwareVersion(java.lang.String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }


    /**
     * Gets the loginName value for this ModemInfo.
     * 
     * @return loginName
     */
    public java.lang.String getLoginName() {
        return loginName;
    }


    /**
     * Sets the loginName value for this ModemInfo.
     * 
     * @param loginName
     */
    public void setLoginName(java.lang.String loginName) {
        this.loginName = loginName;
    }


    /**
     * Gets the wanIP value for this ModemInfo.
     * 
     * @return wanIP
     */
    public java.lang.String[] getWanIP() {
        return wanIP;
    }


    /**
     * Sets the wanIP value for this ModemInfo.
     * 
     * @param wanIP
     */
    public void setWanIP(java.lang.String[] wanIP) {
        this.wanIP = wanIP;
    }


    /**
     * Gets the lastInform value for this ModemInfo.
     * 
     * @return lastInform
     */
    public java.lang.String getLastInform() {
        return lastInform;
    }


    /**
     * Sets the lastInform value for this ModemInfo.
     * 
     * @param lastInform
     */
    public void setLastInform(java.lang.String lastInform) {
        this.lastInform = lastInform;
    }


    /**
     * Gets the downstreamCurrRate value for this ModemInfo.
     * 
     * @return downstreamCurrRate
     */
    public java.lang.String getDownstreamCurrRate() {
        return downstreamCurrRate;
    }


    /**
     * Sets the downstreamCurrRate value for this ModemInfo.
     * 
     * @param downstreamCurrRate
     */
    public void setDownstreamCurrRate(java.lang.String downstreamCurrRate) {
        this.downstreamCurrRate = downstreamCurrRate;
    }


    /**
     * Gets the upstreamCurrRate value for this ModemInfo.
     * 
     * @return upstreamCurrRate
     */
    public java.lang.String getUpstreamCurrRate() {
        return upstreamCurrRate;
    }


    /**
     * Sets the upstreamCurrRate value for this ModemInfo.
     * 
     * @param upstreamCurrRate
     */
    public void setUpstreamCurrRate(java.lang.String upstreamCurrRate) {
        this.upstreamCurrRate = upstreamCurrRate;
    }


    /**
     * Gets the upstreamNoiseMargin value for this ModemInfo.
     * 
     * @return upstreamNoiseMargin
     */
    public java.lang.String getUpstreamNoiseMargin() {
        return upstreamNoiseMargin;
    }


    /**
     * Sets the upstreamNoiseMargin value for this ModemInfo.
     * 
     * @param upstreamNoiseMargin
     */
    public void setUpstreamNoiseMargin(java.lang.String upstreamNoiseMargin) {
        this.upstreamNoiseMargin = upstreamNoiseMargin;
    }


    /**
     * Gets the downstreamNoiseMargin value for this ModemInfo.
     * 
     * @return downstreamNoiseMargin
     */
    public java.lang.String getDownstreamNoiseMargin() {
        return downstreamNoiseMargin;
    }


    /**
     * Sets the downstreamNoiseMargin value for this ModemInfo.
     * 
     * @param downstreamNoiseMargin
     */
    public void setDownstreamNoiseMargin(java.lang.String downstreamNoiseMargin) {
        this.downstreamNoiseMargin = downstreamNoiseMargin;
    }


    /**
     * Gets the deviceLabels value for this ModemInfo.
     * 
     * @return deviceLabels
     */
    public java.lang.String[] getDeviceLabels() {
        return deviceLabels;
    }


    /**
     * Sets the deviceLabels value for this ModemInfo.
     * 
     * @param deviceLabels
     */
    public void setDeviceLabels(java.lang.String[] deviceLabels) {
        this.deviceLabels = deviceLabels;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModemInfo)) return false;
        ModemInfo other = (ModemInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serial==null && other.getSerial()==null) || 
             (this.serial!=null &&
              this.serial.equals(other.getSerial()))) &&
            ((this.mac==null && other.getMac()==null) || 
             (this.mac!=null &&
              this.mac.equals(other.getMac()))) &&
            ((this.modemtype==null && other.getModemtype()==null) || 
             (this.modemtype!=null &&
              this.modemtype.equals(other.getModemtype()))) &&
            ((this.manufacturer==null && other.getManufacturer()==null) || 
             (this.manufacturer!=null &&
              this.manufacturer.equals(other.getManufacturer()))) &&
            ((this.firmwareVersion==null && other.getFirmwareVersion()==null) || 
             (this.firmwareVersion!=null &&
              this.firmwareVersion.equals(other.getFirmwareVersion()))) &&
            ((this.loginName==null && other.getLoginName()==null) || 
             (this.loginName!=null &&
              this.loginName.equals(other.getLoginName()))) &&
            ((this.wanIP==null && other.getWanIP()==null) || 
             (this.wanIP!=null &&
              java.util.Arrays.equals(this.wanIP, other.getWanIP()))) &&
            ((this.lastInform==null && other.getLastInform()==null) || 
             (this.lastInform!=null &&
              this.lastInform.equals(other.getLastInform()))) &&
            ((this.downstreamCurrRate==null && other.getDownstreamCurrRate()==null) || 
             (this.downstreamCurrRate!=null &&
              this.downstreamCurrRate.equals(other.getDownstreamCurrRate()))) &&
            ((this.upstreamCurrRate==null && other.getUpstreamCurrRate()==null) || 
             (this.upstreamCurrRate!=null &&
              this.upstreamCurrRate.equals(other.getUpstreamCurrRate()))) &&
            ((this.upstreamNoiseMargin==null && other.getUpstreamNoiseMargin()==null) || 
             (this.upstreamNoiseMargin!=null &&
              this.upstreamNoiseMargin.equals(other.getUpstreamNoiseMargin()))) &&
            ((this.downstreamNoiseMargin==null && other.getDownstreamNoiseMargin()==null) || 
             (this.downstreamNoiseMargin!=null &&
              this.downstreamNoiseMargin.equals(other.getDownstreamNoiseMargin()))) &&
            ((this.deviceLabels==null && other.getDeviceLabels()==null) || 
             (this.deviceLabels!=null &&
              java.util.Arrays.equals(this.deviceLabels, other.getDeviceLabels())));
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
        if (getSerial() != null) {
            _hashCode += getSerial().hashCode();
        }
        if (getMac() != null) {
            _hashCode += getMac().hashCode();
        }
        if (getModemtype() != null) {
            _hashCode += getModemtype().hashCode();
        }
        if (getManufacturer() != null) {
            _hashCode += getManufacturer().hashCode();
        }
        if (getFirmwareVersion() != null) {
            _hashCode += getFirmwareVersion().hashCode();
        }
        if (getLoginName() != null) {
            _hashCode += getLoginName().hashCode();
        }
        if (getWanIP() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWanIP());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWanIP(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastInform() != null) {
            _hashCode += getLastInform().hashCode();
        }
        if (getDownstreamCurrRate() != null) {
            _hashCode += getDownstreamCurrRate().hashCode();
        }
        if (getUpstreamCurrRate() != null) {
            _hashCode += getUpstreamCurrRate().hashCode();
        }
        if (getUpstreamNoiseMargin() != null) {
            _hashCode += getUpstreamNoiseMargin().hashCode();
        }
        if (getDownstreamNoiseMargin() != null) {
            _hashCode += getDownstreamNoiseMargin().hashCode();
        }
        if (getDeviceLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeviceLabels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeviceLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModemInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:pdcsvcinfowsdl", "modemInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mac");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mac"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modemtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modemtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manufacturer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firmwareVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firmwareVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wanIP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wanIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastInform");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastInform"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downstreamCurrRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DownstreamCurrRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upstreamCurrRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UpstreamCurrRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upstreamNoiseMargin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UpstreamNoiseMargin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downstreamNoiseMargin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DownstreamNoiseMargin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceLabels"));
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
