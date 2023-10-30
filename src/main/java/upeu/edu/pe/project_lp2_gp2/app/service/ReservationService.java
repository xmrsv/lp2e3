package upeu.edu.pe.project_lp2_gp2.app.service;

import upeu.edu.pe.project_lp2_gp2.app.repository.ReservationRepository;
import upeu.edu.pe.project_lp2_gp2.infrastructure.entity.ReservationEntity;

public class ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public Iterable<ReservationEntity> getAllReservations() {
        return reservationRepository.getAllReservations();
    }

    public ReservationEntity getReservationById(Integer id) {
        return reservationRepository.getReservationById(id);
    }

    public ReservationEntity saveReservation(ReservationEntity reservationEntity) {
        return reservationRepository.saveReservation(reservationEntity);

    }

    public void deleteReservationById(Integer id) {
        ReservationEntity reservationEntity = new ReservationEntity();
        reservationEntity = reservationRepository.getReservationById(id);
        reservationRepository.deleteReservationById(id);
    }

}
