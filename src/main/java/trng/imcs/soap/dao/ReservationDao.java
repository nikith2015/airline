package trng.imcs.soap.dao;


import trng.imcs.soap.pojo.Reservation;;

public interface ReservationDao {

	public Reservation addReservation(Reservation reservation);

	public Reservation updateReservation(Reservation reservation);

	public Reservation getReservation(String reservation_id);

	public String deleteReservation(String reservation_id);

}
