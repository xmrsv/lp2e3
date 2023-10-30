/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.pe.project_lp2_gp2.infrastructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import upeu.edu.pe.project_lp2_gp2.app.repository.ReservationRepository;
import upeu.edu.pe.project_lp2_gp2.app.service.ReservationService;

@Configuration
public class BeanConfiguration {

   @Bean
   public ReservationService productService(ReservationRepository reservationRepository) {
      return new ReservationService(reservationRepository);
   }

}
