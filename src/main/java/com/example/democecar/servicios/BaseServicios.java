package com.example.democecar.servicios;

import java.util.List;

public interface BaseServicios<E> {
    List<E> findAll() throws Exception;
    E finById(Long id) throws Exception;
    E save(E entidad) throws Exception;
    E update(Long id, E entidad) throws Exception;
    boolean delete(Long id) throws Exception;
}
