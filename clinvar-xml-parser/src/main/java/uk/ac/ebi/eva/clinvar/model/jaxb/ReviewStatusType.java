//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.18 at 10:27:29 PM BST 
//


package uk.ac.ebi.eva.clinvar.model.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReviewStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReviewStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="no assertion provided"/>
 *     &lt;enumeration value="no assertion criteria provided"/>
 *     &lt;enumeration value="criteria provided, single submitter"/>
 *     &lt;enumeration value="criteria provided, multiple submitters, no conflicts"/>
 *     &lt;enumeration value="criteria provided, conflicting interpretations"/>
 *     &lt;enumeration value="reviewed by expert panel"/>
 *     &lt;enumeration value="practice guideline"/>
 *     &lt;enumeration value="classified by single submitter"/>
 *     &lt;enumeration value="reviewed by professional society"/>
 *     &lt;enumeration value="not classified by submitter"/>
 *     &lt;enumeration value="classified by multiple submitters"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReviewStatusType")
@XmlEnum
public enum ReviewStatusType {

    @XmlEnumValue("no assertion provided")
    NO_ASSERTION_PROVIDED("no assertion provided"),
    @XmlEnumValue("no assertion criteria provided")
    NO_ASSERTION_CRITERIA_PROVIDED("no assertion criteria provided"),
    @XmlEnumValue("criteria provided, single submitter")
    CRITERIA_PROVIDED_SINGLE_SUBMITTER("criteria provided, single submitter"),
    @XmlEnumValue("criteria provided, multiple submitters, no conflicts")
    CRITERIA_PROVIDED_MULTIPLE_SUBMITTERS_NO_CONFLICTS("criteria provided, multiple submitters, no conflicts"),
    @XmlEnumValue("criteria provided, conflicting interpretations")
    CRITERIA_PROVIDED_CONFLICTING_INTERPRETATIONS("criteria provided, conflicting interpretations"),
    @XmlEnumValue("reviewed by expert panel")
    REVIEWED_BY_EXPERT_PANEL("reviewed by expert panel"),
    @XmlEnumValue("practice guideline")
    PRACTICE_GUIDELINE("practice guideline"),
    @XmlEnumValue("classified by single submitter")
    CLASSIFIED_BY_SINGLE_SUBMITTER("classified by single submitter"),
    @XmlEnumValue("reviewed by professional society")
    REVIEWED_BY_PROFESSIONAL_SOCIETY("reviewed by professional society"),
    @XmlEnumValue("not classified by submitter")
    NOT_CLASSIFIED_BY_SUBMITTER("not classified by submitter"),
    @XmlEnumValue("classified by multiple submitters")
    CLASSIFIED_BY_MULTIPLE_SUBMITTERS("classified by multiple submitters");
    private final String value;

    ReviewStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReviewStatusType fromValue(String v) {
        for (ReviewStatusType c: ReviewStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
