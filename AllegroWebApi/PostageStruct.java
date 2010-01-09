/**
 * PostageStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 15, 2009 (09:30:45 GMT) WSDL2Java emitter.
 */

package AllegroWebApi;

public class PostageStruct  implements java.io.Serializable {
    private java.lang.String postageName;

    private float postageAmount;

    public PostageStruct() {
    }

    public PostageStruct(
           java.lang.String postageName,
           float postageAmount) {
           this.postageName = postageName;
           this.postageAmount = postageAmount;
    }


    /**
     * Gets the postageName value for this PostageStruct.
     * 
     * @return postageName
     */
    public java.lang.String getPostageName() {
        return postageName;
    }


    /**
     * Sets the postageName value for this PostageStruct.
     * 
     * @param postageName
     */
    public void setPostageName(java.lang.String postageName) {
        this.postageName = postageName;
    }


    /**
     * Gets the postageAmount value for this PostageStruct.
     * 
     * @return postageAmount
     */
    public float getPostageAmount() {
        return postageAmount;
    }


    /**
     * Sets the postageAmount value for this PostageStruct.
     * 
     * @param postageAmount
     */
    public void setPostageAmount(float postageAmount) {
        this.postageAmount = postageAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostageStruct)) return false;
        PostageStruct other = (PostageStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.postageName==null && other.getPostageName()==null) || 
             (this.postageName!=null &&
              this.postageName.equals(other.getPostageName()))) &&
            this.postageAmount == other.getPostageAmount();
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
        if (getPostageName() != null) {
            _hashCode += getPostageName().hashCode();
        }
        _hashCode += new Float(getPostageAmount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PostageStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "PostageStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postageName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postage-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postageAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postage-amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
