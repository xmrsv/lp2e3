package upeu.edu.pe.project_lp2_gp2.infrastructure.adapter;

import org.springframework.data.repository.CrudRepository;
import upeu.edu.pe.project_lp2_gp2.infrastructure.entity.ReservationEntity;

public interface ReservationCrudRepository extends CrudRepository<ReservationEntity, Integer> {

}
