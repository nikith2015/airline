
package com.imcs.project.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateReservationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateReservationRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reservation_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="no_of_passengers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="total_price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="schedule_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateReservationRequest", propOrder = {
    "reservationId",
    "noOfPassengers",
    "totalPrice",
    "scheduleId"
})
public class UpdateReservationRequest {

    @XmlElement(name = "reservation_id", required = true)
    protected String reservationId;
    @XmlElement(name = "no_of_passengers")
    protected int noOfPassengers;
    @XmlElement(name = "total_price")
    protected double totalPrice;
    @XmlElement(name = "schedule_id", required = true)
    protected String scheduleId;

    /**
     * Gets the value of the reservationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationId() {
        return reservationId;
    }

    /**
     * Sets the value of the reservationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationId(String value) {
        this.reservationId = value;
    }

    /**
     * Gets the value of the noOfPassengers property.
     * 
     */
    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    /**
     * Sets the value of the noOfPassengers property.
     * 
     */
    public void setNoOfPassengers(int value) {
        this.noOfPassengers = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     */
    public void setTotalPrice(double value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the scheduleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleId() {
        return scheduleId;
    }

    /**
     * Sets the value of the scheduleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleId(String value) {
        this.scheduleId = value;
    }

}
