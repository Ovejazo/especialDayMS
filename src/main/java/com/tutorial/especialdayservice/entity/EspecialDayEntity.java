package com.tutorial.especialdayservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "especial")
@NoArgsConstructor
@AllArgsConstructor
public class EspecialDayEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int frecuencyClient;
}


