package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Compensation;
import com.example.demo.services.CompensationService;
import com.example.demo.specifications.CompensationSpecification;

import java.util.List;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.rsocket.RSocketProperties.Server.Spec;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.domain.Sort;


@RestController
public class CompensationController {

    @Autowired
    private CompensationService compensationService;

    @GetMapping(value="/getCompensation")
    public List<Compensation> getCompensations(@RequestParam Map<String, String> params) {
        Specification<Compensation> finalSpec = Specification.where(null);
        Sort sort = Sort.unsorted();

        for (Map.Entry<String, String> entry : params.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if (key.equals("employer")) {
                finalSpec = finalSpec.and(CompensationSpecification.employerContains(value));
            }
            else if(key.equals("location")) {
                finalSpec = finalSpec.and(CompensationSpecification.locationContains(value));
            }
            else if(key.equals("title")) {
                finalSpec = finalSpec.and(CompensationSpecification.titleContains(value));
            }
            else if(key.equals("years_employer.lt")) {
                finalSpec = finalSpec.and(CompensationSpecification.yearsEmployerSmaller(Integer.parseInt(value)));
            }
            else if(key.equals("years_employer.lte")) {
                finalSpec = finalSpec.and(CompensationSpecification.yearsEmployerSmallerOrEqual(Integer.parseInt(value)));
            }
            else if(key.equals("years_employer.gt")) {
                finalSpec = finalSpec.and(CompensationSpecification.yearsEmployerGreater(Integer.parseInt(value)));
            }
            else if(key.equals("years_employer.gte")) {
                finalSpec = finalSpec.and(CompensationSpecification.yearsEmployerGreaterOrEqual(Integer.parseInt(value)));
            }
            else if(key.equals("years_employer")) {
                finalSpec = finalSpec.and(CompensationSpecification.yearsEmployerEqual(Integer.parseInt(value)));
            }
            else if(key.equals("years_experience.lt")) {
                finalSpec = finalSpec.and(CompensationSpecification.yearsExperienceSmaller(Integer.parseInt(value)));
            }
            else if(key.equals("years_experience.lte")) {
                finalSpec = finalSpec.and(CompensationSpecification.yearsExperienceSmallerOrEqual(Integer.parseInt(value)));
            }
            else if(key.equals("years_experience.gt")) {
                finalSpec = finalSpec.and(CompensationSpecification.yearsExperienceGreater(Integer.parseInt(value)));
            }
            else if(key.equals("years_experience.gte")) {
                finalSpec = finalSpec.and(CompensationSpecification.yearsExperienceGreaterOrEqual(Integer.parseInt(value)));
            }
            else if(key.equals("years_experience")) {
                finalSpec = finalSpec.and(CompensationSpecification.yearsExperienceEqual(Integer.parseInt(value)));
            }
            else if(key.equals("salary.lt")) {
                finalSpec = finalSpec.and(CompensationSpecification.salarySmaller(Integer.parseInt(value)));
            }
            else if(key.equals("salary.lte")) {
                finalSpec = finalSpec.and(CompensationSpecification.salarySmallerOrEqual(Integer.parseInt(value)));
            }
            else if(key.equals("salary.gt")) {
                finalSpec = finalSpec.and(CompensationSpecification.salaryGreater(Integer.parseInt(value)));
            }
            else if(key.equals("salary.gte")) {
                finalSpec = finalSpec.and(CompensationSpecification.salaryGreaterOrEqual(Integer.parseInt(value)));
            }
            else if(key.equals("salary")) {
                finalSpec = finalSpec.and(CompensationSpecification.salaryEqual(Integer.parseInt(value)));
            }
            else if(key.equals("signing_bonus.lt")) {
                finalSpec = finalSpec.and(CompensationSpecification.signingBonusSmaller(Integer.parseInt(value)));
            }
            else if(key.equals("signing_bonus.lte")) {
                finalSpec = finalSpec.and(CompensationSpecification.signingBonusSmallerOrEqual(Integer.parseInt(value)));
            }
            else if(key.equals("signing_bonus.gt")) {
                finalSpec = finalSpec.and(CompensationSpecification.signingBonusGreater(Integer.parseInt(value)));
            }
            else if(key.equals("signing_bonus.gte")) {
                finalSpec = finalSpec.and(CompensationSpecification.signingBonusGreaterOrEqual(Integer.parseInt(value)));
            }
            else if(key.equals("signing_bonus")) {
                finalSpec = finalSpec.and(CompensationSpecification.signingBonusEqual(Integer.parseInt(value)));
            }

            else if(key.equals("annual_bonus.lt")) {
                finalSpec = finalSpec.and(CompensationSpecification.annualBonusSmaller(Integer.parseInt(value)));
            }
            else if(key.equals("annual_bonus.lte")) {
                finalSpec = finalSpec.and(CompensationSpecification.annualBonusSmallerOrEqual(Integer.parseInt(value)));
            }
            else if(key.equals("annual_bonus.gt")) {
                finalSpec = finalSpec.and(CompensationSpecification.annualBonusGreater(Integer.parseInt(value)));
            }
            else if(key.equals("annual_bonus.gte")) {
                finalSpec = finalSpec.and(CompensationSpecification.annualBonusGreaterOrEqual(Integer.parseInt(value)));
            }
            else if(key.equals("annual_bonus")) {
                finalSpec = finalSpec.and(CompensationSpecification.annualBonusEqual(Integer.parseInt(value)));
            }

            else if(key.equals("stock_bonus.lt")) {
                finalSpec = finalSpec.and(CompensationSpecification.stockBonusSmaller(Integer.parseInt(value)));
            }
            else if(key.equals("stock_bonus.lte")) {
                finalSpec = finalSpec.and(CompensationSpecification.stockBonusSmallerOrEqual(Integer.parseInt(value)));
            }
            else if(key.equals("stock_bonus.gt")) {
                finalSpec = finalSpec.and(CompensationSpecification.stockBonusGreater(Integer.parseInt(value)));
            }
            else if(key.equals("stock_bonus.gte")) {
                finalSpec = finalSpec.and(CompensationSpecification.stockBonusGreaterOrEqual(Integer.parseInt(value)));
            }
            else if(key.equals("stock_bonus")) {
                finalSpec = finalSpec.and(CompensationSpecification.stockBonusEqual(Integer.parseInt(value)));
            }

            if (key.equals("gender")) {
                finalSpec = finalSpec.and(CompensationSpecification.genderContains(value));
            }
            else if(key.equals("comments")) {
                finalSpec = finalSpec.and(CompensationSpecification.commentsContains(value));
            }


            if (params.containsKey("sortBy")) {
                String sortBy = params.get("sortBy");
                String sortDirection = params.getOrDefault("sortDir", "asc");
                sort = Sort.by(sortDirection.equalsIgnoreCase("desc") ? Sort.Direction.DESC : Sort.Direction.ASC, sortBy);
            }
        }

        return compensationService.getCompensations(finalSpec, sort);
    }

    
}
