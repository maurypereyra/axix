/**
 * BillInfoRec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ca.primus.fussemailsso;

public class BillInfoRec  implements java.io.Serializable {
    private java.lang.String balancedue;

    private java.lang.String balanceDue_asofdate;

    private java.lang.String currentInvoice_invoiceDueDate;

    private java.lang.String lastPayment_amountReceived;

    private java.lang.String lastPayment_dateReceived;

    private java.lang.String currentInvoice_amountDue;

    private java.lang.String balanceDue_amountBalance;

    public BillInfoRec() {
    }

    public BillInfoRec(
           java.lang.String balancedue,
           java.lang.String balanceDue_asofdate,
           java.lang.String currentInvoice_invoiceDueDate,
           java.lang.String lastPayment_amountReceived,
           java.lang.String lastPayment_dateReceived,
           java.lang.String currentInvoice_amountDue,
           java.lang.String balanceDue_amountBalance) {
           this.balancedue = balancedue;
           this.balanceDue_asofdate = balanceDue_asofdate;
           this.currentInvoice_invoiceDueDate = currentInvoice_invoiceDueDate;
           this.lastPayment_amountReceived = lastPayment_amountReceived;
           this.lastPayment_dateReceived = lastPayment_dateReceived;
           this.currentInvoice_amountDue = currentInvoice_amountDue;
           this.balanceDue_amountBalance = balanceDue_amountBalance;
    }


    /**
     * Gets the balancedue value for this BillInfoRec.
     * 
     * @return balancedue
     */
    public java.lang.String getBalancedue() {
        return balancedue;
    }


    /**
     * Sets the balancedue value for this BillInfoRec.
     * 
     * @param balancedue
     */
    public void setBalancedue(java.lang.String balancedue) {
        this.balancedue = balancedue;
    }


    /**
     * Gets the balanceDue_asofdate value for this BillInfoRec.
     * 
     * @return balanceDue_asofdate
     */
    public java.lang.String getBalanceDue_asofdate() {
        return balanceDue_asofdate;
    }


    /**
     * Sets the balanceDue_asofdate value for this BillInfoRec.
     * 
     * @param balanceDue_asofdate
     */
    public void setBalanceDue_asofdate(java.lang.String balanceDue_asofdate) {
        this.balanceDue_asofdate = balanceDue_asofdate;
    }


    /**
     * Gets the currentInvoice_invoiceDueDate value for this BillInfoRec.
     * 
     * @return currentInvoice_invoiceDueDate
     */
    public java.lang.String getCurrentInvoice_invoiceDueDate() {
        return currentInvoice_invoiceDueDate;
    }


    /**
     * Sets the currentInvoice_invoiceDueDate value for this BillInfoRec.
     * 
     * @param currentInvoice_invoiceDueDate
     */
    public void setCurrentInvoice_invoiceDueDate(java.lang.String currentInvoice_invoiceDueDate) {
        this.currentInvoice_invoiceDueDate = currentInvoice_invoiceDueDate;
    }


    /**
     * Gets the lastPayment_amountReceived value for this BillInfoRec.
     * 
     * @return lastPayment_amountReceived
     */
    public java.lang.String getLastPayment_amountReceived() {
        return lastPayment_amountReceived;
    }


    /**
     * Sets the lastPayment_amountReceived value for this BillInfoRec.
     * 
     * @param lastPayment_amountReceived
     */
    public void setLastPayment_amountReceived(java.lang.String lastPayment_amountReceived) {
        this.lastPayment_amountReceived = lastPayment_amountReceived;
    }


    /**
     * Gets the lastPayment_dateReceived value for this BillInfoRec.
     * 
     * @return lastPayment_dateReceived
     */
    public java.lang.String getLastPayment_dateReceived() {
        return lastPayment_dateReceived;
    }


    /**
     * Sets the lastPayment_dateReceived value for this BillInfoRec.
     * 
     * @param lastPayment_dateReceived
     */
    public void setLastPayment_dateReceived(java.lang.String lastPayment_dateReceived) {
        this.lastPayment_dateReceived = lastPayment_dateReceived;
    }


    /**
     * Gets the currentInvoice_amountDue value for this BillInfoRec.
     * 
     * @return currentInvoice_amountDue
     */
    public java.lang.String getCurrentInvoice_amountDue() {
        return currentInvoice_amountDue;
    }


    /**
     * Sets the currentInvoice_amountDue value for this BillInfoRec.
     * 
     * @param currentInvoice_amountDue
     */
    public void setCurrentInvoice_amountDue(java.lang.String currentInvoice_amountDue) {
        this.currentInvoice_amountDue = currentInvoice_amountDue;
    }


    /**
     * Gets the balanceDue_amountBalance value for this BillInfoRec.
     * 
     * @return balanceDue_amountBalance
     */
    public java.lang.String getBalanceDue_amountBalance() {
        return balanceDue_amountBalance;
    }


    /**
     * Sets the balanceDue_amountBalance value for this BillInfoRec.
     * 
     * @param balanceDue_amountBalance
     */
    public void setBalanceDue_amountBalance(java.lang.String balanceDue_amountBalance) {
        this.balanceDue_amountBalance = balanceDue_amountBalance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillInfoRec)) return false;
        BillInfoRec other = (BillInfoRec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.balancedue==null && other.getBalancedue()==null) || 
             (this.balancedue!=null &&
              this.balancedue.equals(other.getBalancedue()))) &&
            ((this.balanceDue_asofdate==null && other.getBalanceDue_asofdate()==null) || 
             (this.balanceDue_asofdate!=null &&
              this.balanceDue_asofdate.equals(other.getBalanceDue_asofdate()))) &&
            ((this.currentInvoice_invoiceDueDate==null && other.getCurrentInvoice_invoiceDueDate()==null) || 
             (this.currentInvoice_invoiceDueDate!=null &&
              this.currentInvoice_invoiceDueDate.equals(other.getCurrentInvoice_invoiceDueDate()))) &&
            ((this.lastPayment_amountReceived==null && other.getLastPayment_amountReceived()==null) || 
             (this.lastPayment_amountReceived!=null &&
              this.lastPayment_amountReceived.equals(other.getLastPayment_amountReceived()))) &&
            ((this.lastPayment_dateReceived==null && other.getLastPayment_dateReceived()==null) || 
             (this.lastPayment_dateReceived!=null &&
              this.lastPayment_dateReceived.equals(other.getLastPayment_dateReceived()))) &&
            ((this.currentInvoice_amountDue==null && other.getCurrentInvoice_amountDue()==null) || 
             (this.currentInvoice_amountDue!=null &&
              this.currentInvoice_amountDue.equals(other.getCurrentInvoice_amountDue()))) &&
            ((this.balanceDue_amountBalance==null && other.getBalanceDue_amountBalance()==null) || 
             (this.balanceDue_amountBalance!=null &&
              this.balanceDue_amountBalance.equals(other.getBalanceDue_amountBalance())));
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
        if (getBalancedue() != null) {
            _hashCode += getBalancedue().hashCode();
        }
        if (getBalanceDue_asofdate() != null) {
            _hashCode += getBalanceDue_asofdate().hashCode();
        }
        if (getCurrentInvoice_invoiceDueDate() != null) {
            _hashCode += getCurrentInvoice_invoiceDueDate().hashCode();
        }
        if (getLastPayment_amountReceived() != null) {
            _hashCode += getLastPayment_amountReceived().hashCode();
        }
        if (getLastPayment_dateReceived() != null) {
            _hashCode += getLastPayment_dateReceived().hashCode();
        }
        if (getCurrentInvoice_amountDue() != null) {
            _hashCode += getCurrentInvoice_amountDue().hashCode();
        }
        if (getBalanceDue_amountBalance() != null) {
            _hashCode += getBalanceDue_amountBalance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillInfoRec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:pdcsvcinfowsdl", "billInfoRec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balancedue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balancedue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceDue_asofdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balanceDue_asofdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentInvoice_invoiceDueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currentInvoice_invoiceDueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPayment_amountReceived");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastPayment_amountReceived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPayment_dateReceived");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastPayment_dateReceived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentInvoice_amountDue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currentInvoice_amountDue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceDue_amountBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balanceDue_amountBalance"));
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
