//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2019.10.15 � 11:55:00 AM CEST 
//


package org.adichatz.testing.xjc;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour suiteType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="suiteType">
 *   &lt;complexContent>
 *     &lt;extension base="{}collectionTestType">
 *       &lt;attribute name="expanded" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suiteType")
public class SuiteType
    extends CollectionTestType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "expanded", required = true)
    protected boolean expanded;

    /**
     * Obtient la valeur de la propri�t� expanded.
     * 
     */
    public boolean isExpanded() {
        return expanded;
    }

    /**
     * D�finit la valeur de la propri�t� expanded.
     * 
     */
    public void setExpanded(boolean value) {
        this.expanded = value;
    }

}
