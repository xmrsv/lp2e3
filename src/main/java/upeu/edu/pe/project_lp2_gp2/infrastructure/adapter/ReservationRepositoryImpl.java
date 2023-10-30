package upeu.edu.pe.project_lp2_gp2.infrastructure.adapter;

import org.springframework.stereotype.Repository;
import upeu.edu.pe.project_lp2_gp2.app.repository.ReservationRepository;
import upeu.edu.pe.project_lp2_gp2.infrastructure.entity.ReservationEntity;

@Repository
public class ReservationRepositoryImpl implements ReservationRepository {
    private final ReservationCrudRepository reservationCrudRepository;

    public ReservationRepositoryImpl(ReservationCrudRepository reservationCrudRepository) {
        this.reservationCrudRepository = reservationCrudRepository;
    }

    @Override
    public Iterable<ReservationEntity> getAllReservations() {
        return reservationCrudRepository.findAll();
    }

    @Override
    public ReservationEntity getReservationById(Integer id) {
        return reservationCrudRepository.findById(id).get();
    }

    @Override
    public ReservationEntity saveReservation(ReservationEntity reservationEntity) {
        return reservationCrudRepository.save(reservationEntity);
    }

    @Override
    public void deleteReservationById(Integer id) {
        reservationCrudRepository.deleteById(id);
    }

}
