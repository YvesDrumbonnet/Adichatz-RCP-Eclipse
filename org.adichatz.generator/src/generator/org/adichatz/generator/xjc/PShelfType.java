//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v2.3.3 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.09.25 à 05:19:29 PM CEST 
//


package org.adichatz.generator.xjc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java pour pShelfType complex type.
 * 
 * &lt;p&gt;Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="pShelfType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{}collectionType"&amp;gt;
 *       &amp;lt;choice&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element name="pshelfItem" type="{}pShelfItemType" maxOccurs="unbounded"/&amp;gt;
 *           &amp;lt;element name="include" type="{}includeType" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *       &amp;lt;attribute name="delayed" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="layoutData" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="selection" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="shelfRenderer" type="{}shelfRendererEnum" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(factoryClass=WrapperFactory.class, factoryMethod="getPShelfType", name = "pShelfType", propOrder = {
    "pshelfItem",
    "include"
})
public class PShelfType
    extends CollectionType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<PShelfItemType> pshelfItem;
    protected List<IncludeType> include;
    @XmlAttribute(name = "delayed")
    protected String delayed;
    @XmlAttribute(name = "layoutData")
    protected String layoutData;
    @XmlAttribute(name = "selection")
    protected String selection;
    @XmlAttribute(name = "shelfRenderer")
    protected ShelfRendererEnum shelfRenderer;

    /**
     * Gets the value of the pshelfItem property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the pshelfItem property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPshelfItem().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link PShelfItemType }
     * 
     * 
     */
    public List<PShelfItemType> getPshelfItem() {
        if (pshelfItem == null) {
            pshelfItem = new ArrayList<PShelfItemType>();
        }
        return this.pshelfItem;
    }

    /**
     * Gets the value of the include property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the include property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getInclude().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link IncludeType }
     * 
     * 
     */
    public List<IncludeType> getInclude() {
        if (include == null) {
            include = new ArrayList<IncludeType>();
        }
        return this.include;
    }

    /**
     * Obtient la valeur de la propriété delayed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayed() {
        return delayed;
    }

    /**
     * Définit la valeur de la propriété delayed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayed(String value) {
        this.delayed = value;
    }

    /**
     * Obtient la valeur de la propriété layoutData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayoutData() {
        return layoutData;
    }

    /**
     * Définit la valeur de la propriété layoutData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayoutData(String value) {
        this.layoutData = value;
    }

    /**
     * Obtient la valeur de la propriété selection.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelection() {
        return selection;
    }

    /**
     * Définit la valeur de la propriété selection.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelection(String value) {
        this.selection = value;
    }

    /**
     * Obtient la valeur de la propriété shelfRenderer.
     * 
     * @return
     *     possible object is
     *     {@link ShelfRendererEnum }
     *     
     */
    public ShelfRendererEnum getShelfRenderer() {
        return shelfRenderer;
    }

    /**
     * Définit la valeur de la propriété shelfRenderer.
     * 
     * @param value
     *     allowed object is
     *     {@link ShelfRendererEnum }
     *     
     */
    public void setShelfRenderer(ShelfRendererEnum value) {
        this.shelfRenderer = value;
    }

}
