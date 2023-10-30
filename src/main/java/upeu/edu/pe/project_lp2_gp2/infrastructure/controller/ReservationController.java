package upeu.edu.pe.project_lp2_gp2.infrastructure.controller;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import upeu.edu.pe.project_lp2_gp2.app.service.ReservationService;
import upeu.edu.pe.project_lp2_gp2.infrastructure.entity.ReservationEntity;

@Controller
@RequestMapping("/")
public class ReservationController {
    private final ReservationService reservationService;
    private static final Logger logger = LoggerFactory.getLogger(ReservationController.class);

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/create")
    public String create() {
        return "create";
    }

    @PostMapping("/create")
    public String saveProduct(ReservationEntity reservationEntity) {
        logger.debug("Producto recibido POST /create {}", reservationEntity);
        reservationEntity.setReservationDateTime(LocalDateTime.now());
        reservationService.saveReservation(reservationEntity);
        return "redirect:/";
    }

    @GetMapping()
    public String showProduct(Model model) {
        Iterable<ReservationEntity> reservations = reservationService.getAllReservations();
        model.addAttribute("reservations", reservations);
        return "home";
    }

    @GetMapping("/edit/{id}")
    public String editProduct(@PathVariable Integer id, Model model) {
        ReservationEntity reservationEntity = reservationService.getReservationById(id);
        logger.info("Reserva obtenida {}", reservationEntity.toString());
        model.addAttribute("reservation", reservationEntity);
        return "edit";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Integer id) {
        reservationService.deleteReservationById(id);
        return "redirect:/";
    }

}
