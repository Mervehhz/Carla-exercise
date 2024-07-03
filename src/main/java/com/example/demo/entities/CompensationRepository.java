package com.example.demo.entities;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CompensationRepository extends PagingAndSortingRepository<Compensation, Long>, JpaSpecificationExecutor<Compensation> {
}
