package upeu.edu.pe.project_lp2_gp2.infrastructure.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ReservationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private LocalDateTime reservationDateTime;
    private String usageTime;
    private String responsibleName;
    private String status;
    private String shift;
    private Double cost;

    public ReservationEntity() {
    }

    public ReservationEntity(Integer id, LocalDateTime reservationDateTime, String usageTime, String responsibleName,
            String status, String shift, Double cost) {
        this.id = id;
        this.reservationDateTime = reservationDateTime;
        this.usageTime = usageTime;
        this.responsibleName = responsibleName;
        this.status = status;
        this.shift = shift;
        this.cost = cost;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getReservationDateTime() {
        return reservationDateTime;
    }

    public void setReservationDateTime(LocalDateTime reservationDateTime) {
        this.reservationDateTime = reservationDateTime;
    }

    public String getUsageTime() {
        return usageTime;
    }

    public void setUsageTime(String usageTime) {
        this.usageTime = usageTime;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "ReservationEntity [id=" + id + ", reservationDateTime=" + reservationDateTime + ", usageTime="
                + usageTime + ", responsibleName=" + responsibleName + ", status=" + status + ", shift=" + shift
                + ", cost=" + cost + "]";
    }

}
