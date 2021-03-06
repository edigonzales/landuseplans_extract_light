
package net.opengis.gml.v_3_2_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompositeValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompositeValueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGMLType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}valueComponent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}valueComponents" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AggregationAttributeGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeValueType", propOrder = {
    "valueComponent",
    "valueComponents"
})
@XmlSeeAlso({
    ValueArrayType.class
})
public class CompositeValueType
    extends AbstractGMLType
{

    protected List<ValuePropertyType> valueComponent;
    protected ValueArrayPropertyType valueComponents;
    @XmlAttribute(name = "aggregationType")
    protected AggregationType aggregationType;

    /**
     * Gets the value of the valueComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValuePropertyType }
     * 
     * 
     */
    public List<ValuePropertyType> getValueComponent() {
        if (valueComponent == null) {
            valueComponent = new ArrayList<ValuePropertyType>();
        }
        return this.valueComponent;
    }

    public boolean isSetValueComponent() {
        return ((this.valueComponent!= null)&&(!this.valueComponent.isEmpty()));
    }

    public void unsetValueComponent() {
        this.valueComponent = null;
    }

    /**
     * Gets the value of the valueComponents property.
     * 
     * @return
     *     possible object is
     *     {@link ValueArrayPropertyType }
     *     
     */
    public ValueArrayPropertyType getValueComponents() {
        return valueComponents;
    }

    /**
     * Sets the value of the valueComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueArrayPropertyType }
     *     
     */
    public void setValueComponents(ValueArrayPropertyType value) {
        this.valueComponents = value;
    }

    public boolean isSetValueComponents() {
        return (this.valueComponents!= null);
    }

    /**
     * Gets the value of the aggregationType property.
     * 
     * @return
     *     possible object is
     *     {@link AggregationType }
     *     
     */
    public AggregationType getAggregationType() {
        return aggregationType;
    }

    /**
     * Sets the value of the aggregationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregationType }
     *     
     */
    public void setAggregationType(AggregationType value) {
        this.aggregationType = value;
    }

    public boolean isSetAggregationType() {
        return (this.aggregationType!= null);
    }

}
