package com.Feature.WSFeature;

import org.springframework.data.repository.CrudRepository;

import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {
    Iterable<User> findAllByName (@NotBlank String name);
}
