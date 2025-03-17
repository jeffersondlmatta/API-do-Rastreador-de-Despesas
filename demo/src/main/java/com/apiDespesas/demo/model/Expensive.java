package com.apiDespesas.demo.model;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Expensive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private double amount;

    private LocalDate data;

    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    @Enumerated(EnumType.STRING)
    private Category category;

}
