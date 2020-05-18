package com.learning.springbootrecipeapp.repositories;

import com.learning.springbootrecipeapp.domain.UnitOfMeasure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class UnitOfMeasureRepositoryIT {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;


    @BeforeEach
    void setUp() {
    }

    @Test
    void findByDescription() {

        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Tablespoon");
        assertEquals("Tablespoon", unitOfMeasure.get().getDescription());
    }
}