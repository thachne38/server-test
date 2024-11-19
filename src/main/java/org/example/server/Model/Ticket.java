package org.example.server.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticketId", nullable = false)
    private int ticketId;
    @Column(name = "ticket_code", nullable = false)
    private String ticketCode;
    @Column(name = "userId", nullable = false)
    private int userId;
    @Column(name = "tripId", nullable = false)
    private int tripId;
    @Column(name = "seatId", nullable = false)
    private int seatId;
    @Column(name = "pickup_point_id", nullable = false)
    private int pickupPointId;
    @Column(name = "dropoff_point_id", nullable = false)
    private int dropPointId;
    @Column(name = "booking_time", nullable = false)
    private String bookingTime;
    @Column(name = "cancel_time", nullable = false)
    private String cancelTime;
    @Column(name = "qrCode", nullable = false)
    private String qrCode;
    @Column(name = "paymentId", nullable = false)
    private int paymentId;
    @Column(name = "status", nullable = false)
    private int status;

    public Ticket() {
    }

    public Ticket(int ticketId, String ticketCode, int userId, int tripId, int seatId, int pickupPointId, int dropPointId, String bookingTime, String cancelTime, String qrCode, int paymentId, int status) {
        this.ticketId = ticketId;
        this.ticketCode = ticketCode;
        this.userId = userId;
        this.tripId = tripId;
        this.seatId = seatId;
        this.pickupPointId = pickupPointId;
        this.dropPointId = dropPointId;
        this.bookingTime = bookingTime;
        this.cancelTime = cancelTime;
        this.qrCode = qrCode;
        this.paymentId = paymentId;
        this.status = status;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public int getPickupPointId() {
        return pickupPointId;
    }

    public void setPickupPointId(int pickupPointId) {
        this.pickupPointId = pickupPointId;
    }

    public int getDropPointId() {
        return dropPointId;
    }

    public void setDropPointId(int dropPointId) {
        this.dropPointId = dropPointId;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }

    public String getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(String cancelTime) {
        this.cancelTime = cancelTime;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
