package org.test.module.search.repository;

import org.test.module.search.model.CriteriaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CriteriaRepository extends CrudRepository<CriteriaModel, UUID> {

}