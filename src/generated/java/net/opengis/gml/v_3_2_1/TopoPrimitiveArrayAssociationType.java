
package net.opengis.gml.v_3_2_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TopoPrimitiveArrayAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopoPrimitiveArrayAssociationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractTopoPrimitive"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoPrimitiveArrayAssociationType", propOrder = {
    "abstractTopoPrimitive"
})
public class TopoPrimitiveArrayAssociationType {

    @XmlElementRef(name = "AbstractTopoPrimitive", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends AbstractTopoPrimitiveType>> abstractTopoPrimitive;
    @XmlAttribute(name = "owns")
    protected java.lang.Boolean owns;

    /**
     * Gets the value of the abstractTopoPrimitive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractTopoPrimitive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractTopoPrimitive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link NodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTopoPrimitiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link TopoSolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link FaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link EdgeType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractTopoPrimitiveType>> getAbstractTopoPrimitive() {
        if (abstractTopoPrimitive == null) {
            abstractTopoPrimitive = new ArrayList<JAXBElement<? extends AbstractTopoPrimitiveType>>();
        }
        return this.abstractTopoPrimitive;
    }

    public boolean isSetAbstractTopoPrimitive() {
        return ((this.abstractTopoPrimitive!= null)&&(!this.abstractTopoPrimitive.isEmpty()));
    }

    public void unsetAbstractTopoPrimitive() {
        this.abstractTopoPrimitive = null;
    }

    /**
     * Gets the value of the owns property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * Sets the value of the owns property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setOwns(boolean value) {
        this.owns = value;
    }

    public boolean isSetOwns() {
        return (this.owns!= null);
    }

    public void unsetOwns() {
        this.owns = null;
    }

}
