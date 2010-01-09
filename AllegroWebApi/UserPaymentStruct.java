/**
 * UserPaymentStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 15, 2009 (09:30:45 GMT) WSDL2Java emitter.
 */

package AllegroWebApi;

public class UserPaymentStruct  implements java.io.Serializable {
    private long payTransId;

    private long payTransItId;

    private int payTransSellerId;

    private java.lang.String payTransType;

    private java.lang.String payTransStatus;

    private float payTransAmount;

    private long payTransCreateDate;

    public UserPaymentStruct() {
    }

    public UserPaymentStruct(
           long payTransId,
           long payTransItId,
           int payTransSellerId,
           java.lang.String payTransType,
           java.lang.String payTransStatus,
           float payTransAmount,
           long payTransCreateDate) {
           this.payTransId = payTransId;
           this.payTransItId = payTransItId;
           this.payTransSellerId = payTransSellerId;
           this.payTransType = payTransType;
           this.payTransStatus = payTransStatus;
           this.payTransAmount = payTransAmount;
           this.payTransCreateDate = payTransCreateDate;
    }


    /**
     * Gets the payTransId value for this UserPaymentStruct.
     * 
     * @return payTransId
     */
    public long getPayTransId() {
        return payTransId;
    }


    /**
     * Sets the payTransId value for this UserPaymentStruct.
     * 
     * @param payTransId
     */
    public void setPayTransId(long payTransId) {
        this.payTransId = payTransId;
    }


    /**
     * Gets the payTransItId value for this UserPaymentStruct.
     * 
     * @return payTransItId
     */
    public long getPayTransItId() {
        return payTransItId;
    }


    /**
     * Sets the payTransItId value for this UserPaymentStruct.
     * 
     * @param payTransItId
     */
    public void setPayTransItId(long payTransItId) {
        this.payTransItId = payTransItId;
    }


    /**
     * Gets the payTransSellerId value for this UserPaymentStruct.
     * 
     * @return payTransSellerId
     */
    public int getPayTransSellerId() {
        return payTransSellerId;
    }


    /**
     * Sets the payTransSellerId value for this UserPaymentStruct.
     * 
     * @param payTransSellerId
     */
    public void setPayTransSellerId(int payTransSellerId) {
        this.payTransSellerId = payTransSellerId;
    }


    /**
     * Gets the payTransType value for this UserPaymentStruct.
     * 
     * @return payTransType
     */
    public java.lang.String getPayTransType() {
        return payTransType;
    }


    /**
     * Sets the payTransType value for this UserPaymentStruct.
     * 
     * @param payTransType
     */
    public void setPayTransType(java.lang.String payTransType) {
        this.payTransType = payTransType;
    }


    /**
     * Gets the payTransStatus value for this UserPaymentStruct.
     * 
     * @return payTransStatus
     */
    public java.lang.String getPayTransStatus() {
        return payTransStatus;
    }


    /**
     * Sets the payTransStatus value for this UserPaymentStruct.
     * 
     * @param payTransStatus
     */
    public void setPayTransStatus(java.lang.String payTransStatus) {
        this.payTransStatus = payTransStatus;
    }


    /**
     * Gets the payTransAmount value for this UserPaymentStruct.
     * 
     * @return payTransAmount
     */
    public float getPayTransAmount() {
        return payTransAmount;
    }


    /**
     * Sets the payTransAmount value for this UserPaymentStruct.
     * 
     * @param payTransAmount
     */
    public void setPayTransAmount(float payTransAmount) {
        this.payTransAmount = payTransAmount;
    }


    /**
     * Gets the payTransCreateDate value for this UserPaymentStruct.
     * 
     * @return payTransCreateDate
     */
    public long getPayTransCreateDate() {
        return payTransCreateDate;
    }


    /**
     * Sets the payTransCreateDate value for this UserPaymentStruct.
     * 
     * @param payTransCreateDate
     */
    public void setPayTransCreateDate(long payTransCreateDate) {
        this.payTransCreateDate = payTransCreateDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserPaymentStruct)) return false;
        UserPaymentStruct other = (UserPaymentStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.payTransId == other.getPayTransId() &&
            this.payTransItId == other.getPayTransItId() &&
            this.payTransSellerId == other.getPayTransSellerId() &&
            ((this.payTransType==null && other.getPayTransType()==null) || 
             (this.payTransType!=null &&
              this.payTransType.equals(other.getPayTransType()))) &&
            ((this.payTransStatus==null && other.getPayTransStatus()==null) || 
             (this.payTransStatus!=null &&
              this.payTransStatus.equals(other.getPayTransStatus()))) &&
            this.payTransAmount == other.getPayTransAmount() &&
            this.payTransCreateDate == other.getPayTransCreateDate();
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
        _hashCode += new Long(getPayTransId()).hashCode();
        _hashCode += new Long(getPayTransItId()).hashCode();
        _hashCode += getPayTransSellerId();
        if (getPayTransType() != null) {
            _hashCode += getPayTransType().hashCode();
        }
        if (getPayTransStatus() != null) {
            _hashCode += getPayTransStatus().hashCode();
        }
        _hashCode += new Float(getPayTransAmount()).hashCode();
        _hashCode += new Long(getPayTransCreateDate()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserPaymentStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "UserPaymentStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-trans-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransItId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-trans-it-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransSellerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-trans-seller-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-trans-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-trans-status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-trans-amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-trans-create-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
