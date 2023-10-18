package com.example.EasySelect.repositories;

import com.example.EasySelect.entity.Pump;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PumpRepository extends JpaRepository<Pump, Integer> {

}
