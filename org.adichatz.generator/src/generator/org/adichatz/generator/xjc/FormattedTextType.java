//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2020.01.22 � 11:02:17 AM CET 
//


package org.adichatz.generator.xjc;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour formattedTextType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="formattedTextType">
 *   &lt;complexContent>
 *     &lt;extension base="{}controlFieldType">
 *       &lt;attribute name="editable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="locale" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="displayPattern" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="editPattern" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="format" type="{}formatEnum" default="Integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(factoryClass=WrapperFactory.class, factoryMethod="getFormattedTextType", name = "formattedTextType")
public class FormattedTextType
    extends ControlFieldType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "editable")
    protected String editable;
    @XmlAttribute(name = "locale")
    protected String locale;
    @XmlAttribute(name = "displayPattern")
    protected String displayPattern;
    @XmlAttribute(name = "editPattern")
    protected String editPattern;
    @XmlAttribute(name = "format")
    protected FormatEnum format;

    /**
     * Obtient la valeur de la propri�t� editable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditable() {
        return editable;
    }

    /**
     * D�finit la valeur de la propri�t� editable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditable(String value) {
        this.editable = value;
    }

    /**
     * Obtient la valeur de la propri�t� locale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * D�finit la valeur de la propri�t� locale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Obtient la valeur de la propri�t� displayPattern.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayPattern() {
        return displayPattern;
    }

    /**
     * D�finit la valeur de la propri�t� displayPattern.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayPattern(String value) {
        this.displayPattern = value;
    }

    /**
     * Obtient la valeur de la propri�t� editPattern.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditPattern() {
        return editPattern;
    }

    /**
     * D�finit la valeur de la propri�t� editPattern.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditPattern(String value) {
        this.editPattern = value;
    }

    /**
     * Obtient la valeur de la propri�t� format.
     * 
     * @return
     *     possible object is
     *     {@link FormatEnum }
     *     
     */
    public FormatEnum getFormat() {
        if (format == null) {
            return FormatEnum.INTEGER;
        } else {
            return format;
        }
    }

    /**
     * D�finit la valeur de la propri�t� format.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatEnum }
     *     
     */
    public void setFormat(FormatEnum value) {
        this.format = value;
    }

}
