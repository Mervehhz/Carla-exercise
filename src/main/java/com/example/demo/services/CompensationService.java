package com.example.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Compensation;
import com.example.demo.entities.CompensationRepository;
import com.example.demo.specifications.CompensationSpecification;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.domain.Sort;


@Service
public class CompensationService {
    
     @Autowired
    private CompensationRepository compensationRepository;

    public List<Compensation> getCompensations(Specification<Compensation> spec, Sort sort) {
        if (spec == null) {
            throw new IllegalArgumentException("Specification must not be null");
        }
        return compensationRepository.findAll(spec, sort);
    }
}
