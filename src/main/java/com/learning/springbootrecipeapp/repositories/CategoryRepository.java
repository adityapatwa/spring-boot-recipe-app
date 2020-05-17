package com.learning.springbootrecipeapp.repositories;

import com.learning.springbootrecipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
