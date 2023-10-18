package com.example.EasySelect.service.Impl;


import com.example.EasySelect.entity.Pump;
import com.example.EasySelect.repositories.PumpRepository;
import com.example.EasySelect.service.PumpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PumpServiceImpl implements PumpService {

    private PumpRepository pumpRepository;

    @Autowired
    public void PumpServiceImpl(PumpRepository pumpRepository) {
        this.pumpRepository = pumpRepository;
    }
    @Override
    public void CreatePump(int pumpId, String pumpSize, int flow, int head, String materialCode, String motorSize ) {
        Pump pump = new Pump(pumpId, pumpSize, flow, head, materialCode, motorSize);
        pumpRepository.save(pump);
    }


}
