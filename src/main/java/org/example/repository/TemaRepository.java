package org.example.repository;

import org.example.domain.*;
import org.example.validation.*;
public class TemaRepository extends AbstractCRUDRepository<String, Tema> {
    public TemaRepository(Validator<Tema> validator) {
        super(validator);
    }
}

