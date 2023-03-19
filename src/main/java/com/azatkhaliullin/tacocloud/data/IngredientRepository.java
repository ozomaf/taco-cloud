package com.azatkhaliullin.tacocloud.data;

import com.azatkhaliullin.tacocloud.dto.Ingredient;
import org.springframework.data.repository.CrudRepository;


public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {

}
