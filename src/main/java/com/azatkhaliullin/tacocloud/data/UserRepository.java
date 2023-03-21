package com.azatkhaliullin.tacocloud.data;

import com.azatkhaliullin.tacocloud.dto.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository
        extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
