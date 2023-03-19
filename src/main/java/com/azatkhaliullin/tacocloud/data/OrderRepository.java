package com.azatkhaliullin.tacocloud.data;

import com.azatkhaliullin.tacocloud.dto.TacoOrder;
import org.springframework.data.repository.CrudRepository;


public interface OrderRepository
        extends CrudRepository<TacoOrder, Long> {
}
