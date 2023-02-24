package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import java.sql.Date;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Card {

    @Id
    @GeneratedValue
    private Long cardID;

    private Integer number;

    private Integer validationCode;

    private Float balance;

    private Date expirationDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
            return false;
        }
        Card card = (Card) o;
        return cardID != null && Objects.equals(cardID, card.cardID);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
