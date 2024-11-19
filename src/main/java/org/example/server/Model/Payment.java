package org.example.server.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paymentId", nullable = false)
    private int paymentId;
    @Column(name = "userId", nullable = false)
    private int userId;
    @Column(name = "paymentMethod", nullable = false)
    private String paymentMethod;
    @Column(name = "paymentStatus", nullable = false)
    private String paymentStatus;
    @Column(name = "paymentTime", nullable = false)
    private String paymentTime;
    @Column(name = "transactionId", nullable = false)
    private String transactionId;
    @Column(name = "amount", nullable = false)
    private int amount;
    @Column(name = "paymentType", nullable = false)
    private String paymentType;

    public Payment() {
    }

    public Payment(int paymentId, int userId, String paymentMethod, String paymentStatus, String paymentTime, String transactionId, int amount, String paymentType) {
        this.paymentId = paymentId;
        this.userId = userId;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
        this.paymentTime = paymentTime;
        this.transactionId = transactionId;
        this.amount = amount;
        this.paymentType = paymentType;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}
