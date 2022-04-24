package com.scooty.scooty.table;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name= "bank_cards")
@Getter
@Setter
public class BankCards {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name ="number_bank_card")
    private String numberBankCards;

    @Column (name = "card_date")
    private Timestamp cardDate;

    @Column (name = "card_cvc")
    private int cardCvc;

    @JoinColumn (name = "id_user")
    @ManyToOne
    private User user;
}
