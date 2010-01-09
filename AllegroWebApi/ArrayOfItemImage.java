/**
 * ArrayOfItemImage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 15, 2009 (09:30:45 GMT) WSDL2Java emitter.
 */

package AllegroWebApi;

public class ArrayOfItemImage  implements java.io.Serializable {
    private AllegroWebApi.ItemImageList imageList;

    public ArrayOfItemImage() {
    }

    public ArrayOfItemImage(
           AllegroWebApi.ItemImageList imageList) {
           this.imageList = imageList;
    }


    /**
     * Gets the imageList value for this ArrayOfItemImage.
     * 
     * @return imageList
     */
    public AllegroWebApi.ItemImageList getImageList() {
        return imageList;
    }


    /**
     * Sets the imageList value for this ArrayOfItemImage.
     * 
     * @param imageList
     */
    public void setImageList(AllegroWebApi.ItemImageList imageList) {
        this.imageList = imageList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfItemImage)) return false;
        ArrayOfItemImage other = (ArrayOfItemImage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.imageList==null && other.getImageList()==null) || 
             (this.imageList!=null &&
              this.imageList.equals(other.getImageList())));
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
        if (getImageList() != null) {
            _hashCode += getImageList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfItemImage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemImage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "image-list"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemImageList"));
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
