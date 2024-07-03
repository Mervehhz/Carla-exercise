package com.example.demo.specifications;

import java.sql.Date;

import org.springframework.data.jpa.domain.Specification;
import com.example.demo.entities.Compensation;


public class CompensationSpecification {
    public static Specification<Compensation> timestampSmaller(Date timestamp) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.lessThan(root.get("timestamp"), timestamp);
    }

    public static Specification<Compensation> timestampSmallerOrEqual(Date timestamp) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.lessThanOrEqualTo(root.get("timestamp"), timestamp);
    }

    public static Specification<Compensation> timestampGreater(Date timestamp) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.greaterThan(root.get("timestamp"), timestamp);
    }

    public static Specification<Compensation> timestampGreaterOrEqual(Date timestamp) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.greaterThanOrEqualTo(root.get("timestamp"), timestamp);
    }

    public static Specification<Compensation> timestampEqual(Date timestamp) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("timestamp"), timestamp);
    }

    public static Specification<Compensation> employerContains(String employer) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("employer"), "%" + employer + "%");
    }

    public static Specification<Compensation> locationContains(String location) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("location"), "%" + location + "%");
    }

    public static Specification<Compensation> titleContains(String title) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("title"), "%" + title + "%");
    }

    public static Specification<Compensation> yearsExperienceSmaller(int years_experience) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.lessThan(root.get("years_experience"), years_experience);
    }
    
    public static Specification<Compensation> yearsExperienceSmallerOrEqual(int years_experience) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.lessThanOrEqualTo(root.get("yearsExperience"), years_experience);
    }

    public static Specification<Compensation> yearsExperienceGreater(int years_experience) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.greaterThan(root.get("years_experience"), years_experience);
    }

    public static Specification<Compensation> yearsExperienceGreaterOrEqual(int years_experience) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.greaterThanOrEqualTo(root.get("years_experience"), years_experience);
    }

    public static Specification<Compensation> yearsExperienceEqual(int years_experience) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("years_experience"), years_experience);
    }

    public static Specification<Compensation> yearsEmployerSmaller(int years_employer) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.lessThan(root.get("years_employer"), years_employer);
    }

    public static Specification<Compensation> yearsEmployerSmallerOrEqual(int years_employer) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.lessThanOrEqualTo(root.get("years_employer"), years_employer);
    }

    public static Specification<Compensation> yearsEmployerGreater(int years_employer) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.greaterThan(root.get("years_employer"), years_employer);
    }

    public static Specification<Compensation> yearsEmployerGreaterOrEqual(int years_employer) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.greaterThanOrEqualTo(root.get("years_employer"), years_employer);
    }

    public static Specification<Compensation> yearsEmployerEqual(int years_employer) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("years_employer"), years_employer);
    }

    public static Specification<Compensation> salarySmaller(int salary) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.lessThan(root.get("salary"), salary);
    }

    public static Specification<Compensation> salarySmallerOrEqual(int salary) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.lessThanOrEqualTo(root.get("salary"), salary);
    }

    public static Specification<Compensation> salaryGreater(int salary) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.greaterThan(root.get("salary"), salary);
    }

    public static Specification<Compensation> salaryGreaterOrEqual(int salary) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.greaterThanOrEqualTo(root.get("salary"), salary);
    }

    public static Specification<Compensation> salaryEqual(int salary) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("salary"), salary);
    }

    // signing_bonus

    public static Specification<Compensation> signingBonusSmaller(int signing_bonus) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.lessThan(root.get("signing_bonus"), signing_bonus);
    }

    public static Specification<Compensation> signingBonusSmallerOrEqual(int signing_bonus) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.lessThanOrEqualTo(root.get("signing_bonus"), signing_bonus);
    }

    public static Specification<Compensation> signingBonusGreater(int signing_bonus) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.greaterThan(root.get("signing_bonus"), signing_bonus);
    }

    public static Specification<Compensation> signingBonusGreaterOrEqual(int signing_bonus) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.greaterThanOrEqualTo(root.get("signing_bonus"), signing_bonus);
    }

    public static Specification<Compensation> signingBonusEqual(int signing_bonus) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("signing_bonus"), signing_bonus);
    }

    // annual_bonus

    public static Specification<Compensation> annualBonusSmaller(int annual_bonus) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.lessThan(root.get("annual_bonus"), annual_bonus);
    }

    public static Specification<Compensation> annualBonusSmallerOrEqual(int annual_bonus) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.lessThanOrEqualTo(root.get("annual_bonus"), annual_bonus);
    }

    public static Specification<Compensation> annualBonusGreater(int annual_bonus) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.greaterThan(root.get("annual_bonus"), annual_bonus);
    }

    public static Specification<Compensation> annualBonusGreaterOrEqual(int annual_bonus) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.greaterThanOrEqualTo(root.get("annual_bonus"), annual_bonus);
    }

    public static Specification<Compensation> annualBonusEqual(int annual_bonus) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("annual_bonus"), annual_bonus);
    }

    // stock_bonus

    public static Specification<Compensation> stockBonusSmaller(int stock_bonus) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.lessThan(root.get("stock_bonus"), stock_bonus);
    }

    public static Specification<Compensation> stockBonusSmallerOrEqual(int stock_bonus) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.lessThanOrEqualTo(root.get("stock_bonus"), stock_bonus);
    }

    public static Specification<Compensation> stockBonusGreater(int stock_bonus) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.greaterThan(root.get("stock_bonus"), stock_bonus);
    }

    public static Specification<Compensation> stockBonusGreaterOrEqual(int stock_bonus) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.greaterThanOrEqualTo(root.get("stock_bonus"), stock_bonus);
    }

    public static Specification<Compensation> stockBonusEqual(int stock_bonus) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("stock_bonus"), stock_bonus);
    }

    public static Specification<Compensation> genderContains(String gender) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("gender"), "%" + gender + "%");
    }

    public static Specification<Compensation> commentsContains(String comments) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("comments"), "%" + comments + "%");
    }
}
