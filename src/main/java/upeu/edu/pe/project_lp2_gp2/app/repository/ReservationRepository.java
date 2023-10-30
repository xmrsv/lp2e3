/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.edu.pe.project_lp2_gp2.app.repository;

import upeu.edu.pe.project_lp2_gp2.infrastructure.entity.ReservationEntity;

public interface ReservationRepository {
    Iterable<ReservationEntity> getAllReservations();

    ReservationEntity getReservationById(Integer id);

    ReservationEntity saveReservation(ReservationEntity product);

    void deleteReservationById(Integer id);
}
