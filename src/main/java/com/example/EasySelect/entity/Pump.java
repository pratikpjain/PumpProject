package com.example.EasySelect.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@AllArgsConstructor
@Table(name = "pump")
public class Pump {
    @Id
    @Column(name = "pump_id")
    int pumpId;
    String pumpSize;
    int flow;
    int head;
    String materialCode;
    String motorSize;

    public Pump() {

    }
}

