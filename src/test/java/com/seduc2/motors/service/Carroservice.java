package com.seduc2.motors.service;


import com.seduc2.motors.entity.Carro;
import com.seduc2.motors.repository.CarroRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Carroservice {
    private final CarroRepository repository;

    public Carroservice(CarroRepository repository){
        this.repository = repository;
    }
public List<Carro>mostrarCarros(){
        List<Carro> Carrolist = new ArrayList<>();
        return Carrolist= repository.findAll();
}
public void cadastrarCarro(Carro novo){
        Carro carro = new Carro();
    carro.setDataCadastro(novo.getDataCadastro());
    carro.setVersao(novo.getVersao());
    carro.setMarca(novo.getMarca());
    carro.setDataVenda(novo.getDataVenda());
    carro.setModelo(novo.getModelo());
    carro.setQuilometragem(novo.getQuilometragem());

}
}

