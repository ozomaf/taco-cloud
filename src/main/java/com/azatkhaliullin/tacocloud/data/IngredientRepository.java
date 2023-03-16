package com.azatkhaliullin.tacocloud.data;

import com.azatkhaliullin.tacocloud.Ingredient;

import java.util.Optional;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();
    Optional<Ingredient> findById(String id);
    Ingredient save(Ingredient ingredient);
}
