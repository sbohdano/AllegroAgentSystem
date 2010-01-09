/**
 * ArrayOfItemCat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 15, 2009 (09:30:45 GMT) WSDL2Java emitter.
 */

package AllegroWebApi;

public class ArrayOfItemCat  implements java.io.Serializable {
    private AllegroWebApi.ItemCatList catList;

    public ArrayOfItemCat() {
    }

    public ArrayOfItemCat(
           AllegroWebApi.ItemCatList catList) {
           this.catList = catList;
    }


    /**
     * Gets the catList value for this ArrayOfItemCat.
     * 
     * @return catList
     */
    public AllegroWebApi.ItemCatList getCatList() {
        return catList;
    }


    /**
     * Sets the catList value for this ArrayOfItemCat.
     * 
     * @param catList
     */
    public void setCatList(AllegroWebApi.ItemCatList catList) {
        this.catList = catList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfItemCat)) return false;
        ArrayOfItemCat other = (ArrayOfItemCat) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.catList==null && other.getCatList()==null) || 
             (this.catList!=null &&
              this.catList.equals(other.getCatList())));
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
        if (getCatList() != null) {
            _hashCode += getCatList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfItemCat.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemCat"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cat-list"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemCatList"));
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
