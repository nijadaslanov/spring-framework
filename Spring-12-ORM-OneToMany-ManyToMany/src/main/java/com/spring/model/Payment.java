package com.spring.model;

import com.spring.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "payments")
@Data
@NoArgsConstructor
public class Payment {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "DATE")
    private LocalDate createdDate;


    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToOne(cascade = CascadeType.ALL)
    private PaymentDetail paymentDetail;


    @ManyToOne
    private Merchant merchant;

    @ManyToOne
    private Customer customer;


    public Payment(LocalDate createdDate, BigDecimal amount, Status status) {
        this.createdDate = createdDate;
        this.amount = amount;
        this.status = status;
    }
}
