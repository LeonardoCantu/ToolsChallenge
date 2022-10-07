package com.leonardo.toolsChallenge.service;

import com.leonardo.toolsChallenge.config.Context;
import com.leonardo.toolsChallenge.pattern.exception.ObjectNotFountException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Optional;


public abstract class GenericService<E, I, T> implements Serializable {

    private final Class<E> clazz;


    protected GenericService() {
        this.clazz = (Class<E>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    private Context getContext() {
        return new Context();
    }

    public JpaRepository<E, I> getRepository(Class<T> clazz) {
        return (JpaRepository<E, I>) ((Optional) getContext().getRepositoryFromClass(clazz)).get();
    }

    public E findById(I id) {
        return (E) getRepository((Class<T>) clazz)
                .findById(id)
                .orElseThrow(() -> new ObjectNotFountException("Nenhum registro encotrado com o Id ".concat(id.toString())));
    }
}
