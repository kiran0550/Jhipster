package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Label;
import org.springframework.stereotype.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the Label entity.
 */
@SuppressWarnings("unused")
@Repository
public interface LabelRepository extends MongoRepository<Label, String> {

}
