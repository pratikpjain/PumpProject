package com.example.EasySelect.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Pump {
    int pumpId;
    String pumpSize;
    int flow;
    int head;
    String materialCode;
    String motorSize;
}