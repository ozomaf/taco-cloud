package com.azatkhaliullin.tacocloud.data;

import com.azatkhaliullin.tacocloud.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder order);
}
