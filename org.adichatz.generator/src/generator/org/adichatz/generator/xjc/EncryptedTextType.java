//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v2.3.3 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.09.25 à 05:19:29 PM CEST 
//


package org.adichatz.generator.xjc;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java pour encryptedTextType complex type.
 * 
 * &lt;p&gt;Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="encryptedTextType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{}textType"&amp;gt;
 *       &amp;lt;attribute name="encryptedKey" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(factoryClass=WrapperFactory.class, factoryMethod="getEncryptedTextType", name = "encryptedTextType")
public class EncryptedTextType
    extends TextType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "encryptedKey")
    @XmlSchemaType(name = "anySimpleType")
    protected String encryptedKey;

    /**
     * Obtient la valeur de la propriété encryptedKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedKey() {
        return encryptedKey;
    }

    /**
     * Définit la valeur de la propriété encryptedKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedKey(String value) {
        this.encryptedKey = value;
    }

}
