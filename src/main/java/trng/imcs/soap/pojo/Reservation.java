package trng.imcs.soap.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservation {

	@Id
	private String reservation_id;
	private int no_of_passengers;
	private double total_price;
	private String schedule_id;

	public Reservation() {
		super();
	}

	public Reservation(String reservation_id, int no_of_passengers, double total_price, String schedule_id) {
		super();
		this.reservation_id = reservation_id;
		this.no_of_passengers = no_of_passengers;
		this.total_price = total_price;
		this.schedule_id = schedule_id;
	}

	public String getReservation_id() {
		return reservation_id;
	}

	public void setReservation_id(String reservation_id) {
		this.reservation_id = reservation_id;
	}

	public int getNo_of_passengers() {
		return no_of_passengers;
	}

	public void setNo_of_passengers(int no_of_passengers) {
		this.no_of_passengers = no_of_passengers;
	}

	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}

	public String getSchedule_id() {
		return schedule_id;
	}

	public void setSchedule_id(String schedule_id) {
		this.schedule_id = schedule_id;
	}

	@Override
	public String toString() {
		return "Reservation [reservation_id=" + reservation_id + ", no_of_passengers=" + no_of_passengers
				+ ", total_price=" + total_price + ", schedule_id=" + schedule_id + "]";
	}

}
