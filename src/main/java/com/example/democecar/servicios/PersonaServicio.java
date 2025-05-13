package com.example.demoCECAR.servicios;

import com.example.demoCECAR.entidades.Persona;

import java.util.List;

public class PersonaServicio implements BaseServicios<Persona>{
    
    @Override
    public List<Persona> findAll() throws Exception {
        return List.of();
    }

    @Override
    public Persona finById(Long id) throws Exception {
        return null;
    }

    @Override
    public Persona save(Persona entidad) throws Exception {
        return null;
    }

    @Override
    public Persona update(Long id, Persona entidad) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long id) throws Exception {
        return false;
    }
}
