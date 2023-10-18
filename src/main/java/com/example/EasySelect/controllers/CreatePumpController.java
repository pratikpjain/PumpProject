package com.example.EasySelect.controllers;

import com.example.EasySelect.service.PumpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class CreatePumpController {

    private final PumpService pumpService;

    @Autowired
    public CreatePumpController(PumpService pumpService) {
        this.pumpService = pumpService;
    }

    @PostMapping("/create-pump")
    public ResponseEntity CreatePump(@RequestParam(value = "pump_id") int pumpId,
                                     @RequestParam(value = "pump_size") String pumpSize,
                                     @RequestParam(value = "flow") int flow,
                                     @RequestParam(value = "head") int head,
                                     @RequestParam(value = "material_code") String materialCode,
                                     @RequestParam(value = "motor_size") String motorSize) {
        pumpService.CreatePump(pumpId, pumpSize, flow, head, materialCode, motorSize);
        return new ResponseEntity<> ("Hi", HttpStatus.OK);
    }
}
