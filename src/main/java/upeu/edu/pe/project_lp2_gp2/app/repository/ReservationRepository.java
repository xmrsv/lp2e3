package upeu.edu.pe.project_lp2_gp2.app.repository;

import upeu.edu.pe.project_lp2_gp2.infrastructure.entity.ReservationEntity;

public interface ReservationRepository {
    Iterable<ReservationEntity> getAllReservations();

    ReservationEntity getReservationById(Integer id);

    ReservationEntity saveReservation(ReservationEntity product);

    void deleteReservationById(Integer id);
}
