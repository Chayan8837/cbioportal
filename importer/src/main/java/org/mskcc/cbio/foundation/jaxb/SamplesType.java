//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.05 at 10:50:18 AM EDT 
//


package org.mskcc.cbio.foundation.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for samplesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="samplesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sample" type="{}sampleType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "samplesType", propOrder = {
    "sample"
})
public class SamplesType {

    @XmlElement(required = true)
    protected SampleType sample;

    /**
     * Gets the value of the sample property.
     * 
     * @return
     *     possible object is
     *     {@link SampleType }
     *     
     */
    public SampleType getSample() {
        return sample;
    }

    /**
     * Sets the value of the sample property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleType }
     *     
     */
    public void setSample(SampleType value) {
        this.sample = value;
    }

}