package com.azatkhaliullin.tacocloud.data;

import com.azatkhaliullin.tacocloud.Ingredient;
import org.springframework.data.repository.CrudRepository;


public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {

}
