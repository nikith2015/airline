package trng.imcs.soap.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import trng.imcs.soap.jpa.SessionFactoryBuilder;
import trng.imcs.soap.pojo.Reservation;

public class ReservationDaoImpl implements ReservationDao {

	@Override
	public Reservation addReservation(Reservation reservation) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = openSession();
			transaction = session.beginTransaction();
			session.save(reservation);
			transaction.commit();
			session.flush();
			return reservation;
		} catch (Exception e) {
			transaction.rollback();
			return null;
		} finally {
			if (session.isOpen())
				session.close();
		}
	}

	@Override
	public Reservation updateReservation(Reservation reservation) {
		Session session = null;
        Transaction transaction = null;
        try {
            session = openSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(reservation);
            session.merge(reservation);
            transaction.commit();
            return reservation;
        } catch (Exception e) {
            transaction.rollback();
            return null;
        } finally {
            if (session.isOpen()) session.close();
        }
	}

	@Override
	public Reservation getReservation(String reservation_id) {
		Session session = null;
		Reservation reservation = null;
		try {
			session = openSession();
			reservation = (Reservation) session.get(Reservation.class, reservation_id);
			return reservation;
		} finally {
			if (session.isOpen())
				session.close();
		}
	}

	@Override
	public String deleteReservation(String reservation_id) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = openSession();
			transaction = session.beginTransaction();
			Reservation reservation = getReservation(reservation_id);
			session.delete(reservation);
			transaction.commit();
			return "Success";

		} catch (Exception e) {
			transaction.rollback();
			return null;
		} finally {
			if (session.isOpen())
				session.close();
		}
	}

	private Session openSession() {
		return SessionFactoryBuilder.getSessionFactory().openSession();
	}

}
