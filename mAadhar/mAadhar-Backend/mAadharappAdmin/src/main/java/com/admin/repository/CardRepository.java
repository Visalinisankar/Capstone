package com.admin.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.repository.CrudRepository;
import com.admin.model.CardDetails;

public interface CardRepository extends CrudRepository<CardDetails,Long> {

	List<CardDetails> findByState(String state);

	CardDetails findByName(String name);

}