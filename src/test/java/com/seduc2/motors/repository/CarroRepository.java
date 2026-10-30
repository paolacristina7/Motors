package com.seduc2.motors.repository;

import com.seduc2.motors.entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface CarroRepository extends JpaRepository<Carro,Long>{

    }

