package com.azatkhaliullin.tacocloud.data;

import com.azatkhaliullin.tacocloud.dto.Ingredient;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {

    List<Ingredient> findAll();

}
