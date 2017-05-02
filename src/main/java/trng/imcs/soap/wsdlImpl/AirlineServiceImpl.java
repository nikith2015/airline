package trng.imcs.soap.wsdlImpl;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

import trng.imcs.soap.dao.ReservationDao;
import trng.imcs.soap.dao.ReservationDaoImpl;
import trng.imcs.soap.gen.AddReservationRequest;
import trng.imcs.soap.gen.AddReservationResponse;
import trng.imcs.soap.gen.AirlineService;
import trng.imcs.soap.gen.DeleteReservationRequest;
import trng.imcs.soap.gen.DeleteReservationResponse;
import trng.imcs.soap.gen.GetReservationRequest;
import trng.imcs.soap.gen.GetReservationResponse;
import trng.imcs.soap.gen.UpdateReservationRequest;
import trng.imcs.soap.gen.UpdateReservationResponse;
import trng.imcs.soap.pojo.Reservation;

@WebService(endpointInterface = "trng.imcs.soap.gen.AirlineService")
@Component("AirlineSoapWS")
public class AirlineServiceImpl implements AirlineService {

	ReservationDao reservationDao;

	public AirlineServiceImpl() {
		reservationDao = new ReservationDaoImpl();
	}

	@Override
	public AddReservationResponse addOperation(AddReservationRequest addRequest) {
		Reservation reservation = new Reservation();
		reservation.setReservation_id(addRequest.getReservationId());
		reservation.setNo_of_passengers(addRequest.getNoOfPassengers());
		reservation.setTotal_price(addRequest.getTotalPrice());
		reservation.setSchedule_id(addRequest.getScheduleId());
		
		Reservation reseravation1 = reservationDao.addReservation(reservation);
		AddReservationResponse reservationResponse = new AddReservationResponse();
		reservationResponse.setTotalPrice(reseravation1.getTotal_price());
		return reservationResponse;
	}

	@Override
	public GetReservationResponse getOperation(GetReservationRequest getRequest) {
		
		Reservation reservation=reservationDao.getReservation(getRequest.getReservationId());
		GetReservationResponse getReservationResponse=new GetReservationResponse();
		getReservationResponse.setReservationId(reservation.getReservation_id());
		getReservationResponse.setNoOfPassengers(reservation.getNo_of_passengers());
		getReservationResponse.setTotalPrice(reservation.getTotal_price());
		getReservationResponse.setScheduleId(reservation.getSchedule_id());
		return getReservationResponse;
	}

	@Override
	public DeleteReservationResponse deleteOperation(DeleteReservationRequest deleteRequest) {
		String status = reservationDao.deleteReservation(deleteRequest.getReservationId());
		DeleteReservationResponse deleteReservationResponse = new DeleteReservationResponse();
		if (status == "Success") {
			deleteReservationResponse.setMessagecode("201");
			deleteReservationResponse.setMessage("Reservation Successfully Deleted");
		} else {
			deleteReservationResponse.setMessagecode("401");
			deleteReservationResponse.setMessage("Could not delete the reservation");
		}
		return deleteReservationResponse;	}

	@Override
	public UpdateReservationResponse updateOperation(UpdateReservationRequest updateRequest) {
		Reservation reservation = new Reservation();
		reservation.setReservation_id(updateRequest.getReservationId());
		reservation.setNo_of_passengers(updateRequest.getNoOfPassengers());
		reservation.setTotal_price(updateRequest.getTotalPrice());
		reservation.setSchedule_id(updateRequest.getScheduleId());
		Reservation reservation1 = reservationDao.updateReservation(reservation);
		UpdateReservationResponse reservationResponse = new UpdateReservationResponse();
		reservationResponse.setReservationId(reservation1.getReservation_id());
		reservationResponse.setTotalPrice(reservation1.getTotal_price());
		return reservationResponse;
	}

}
