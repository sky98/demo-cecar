package com.example.democecar.servicios;

import com.example.democecar.entidades.Persona;
import com.example.democecar.repositorios.PersonaRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServicio implements BaseServicios<Persona>{

    private final PersonaRepositorio repositorio;

    public PersonaServicio(PersonaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Persona> findAll() throws Exception {
        try {
            return repositorio.findAll();
        } catch (Exception ex){
            throw new Exception("Error al listar personas : "+ ex.getMessage());
        }
    }

    @Override
    public Persona finById(Long id) throws Exception {
        try {
            return repositorio.findById(id).get();
        } catch (Exception ex){
            throw new Exception("Error al buscar persona por id : " + id + ", mensaje : "+ ex.getMessage());
        }
    }

    @Override
    public Persona save(Persona entidad) throws Exception {
        try {
            return repositorio.save(entidad);
        } catch (Exception ex){
            throw new Exception("Error al guardar personas : "+ ex.getMessage());
        }
    }

    @Override
    public Persona update(Long id, Persona entidad) throws Exception {
        try {
            Optional<Persona> entidadOpcional = repositorio.findById(id);
            return repositorio.save(entidadOpcional.get());
        } catch (Exception ex){
            throw new Exception("Error al actualizar personaa : "+ ex.getMessage());
        }
    }

    @Override
    public boolean delete(Long id) throws Exception {
        try {
            if (repositorio.existsById(id)){
                repositorio.deleteById(id);
                return true;
            } else {
                throw new Exception("Persona con id : "+ id + " no existe en el sistema");
            }
        } catch (Exception ex){
            throw new Exception("Error al eliminar persona : "+ ex.getMessage());
        }
    }
}
