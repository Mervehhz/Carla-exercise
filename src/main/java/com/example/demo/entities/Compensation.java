package com.example.demo.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "compensation")
public class Compensation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    public Long id;

    @Column(name = "timestamp", nullable = false)
    public Date timestamp;

    @Column(name = "employer", nullable = false)
    public String employer;

    @Column(name = "location", nullable = false)
    public String location;

    @Column(name = "title", nullable = false)
    public String title;

    @Column(name = "years_employer", nullable = false)
    public int years_employer;

    @Column(name = "years_experience", nullable = false)
    public int years_experience;

    @Column(name = "salary", nullable = false)
    public int salary;

    @Column(name = "signing_bonus", nullable = false)
    public int signing_bonus;

    @Column(name = "annual_bonus", nullable = false)
    public int annual_bonus;

    @Column(name = "stock_bonus", nullable = false)
    public int stock_bonus;

    @Column(name = "gender", nullable = false)
    public String gender;

    @Column(name = "comments", nullable = true)
    public String comments;

    @Override
    public String toString() {
        return "Compensation [id=" + id + ", timestamp=" + timestamp + ", employer=" + employer + ", location=" + location
                + ", title=" + title + ", years_employer=" + years_employer + ", years_experience=" + years_experience
                + ", salary=" + salary + ", signing_bonus=" + signing_bonus + ", annual_bonus=" + annual_bonus
                + ", stock_bonus=" + stock_bonus + ", gender=" + gender + ", comments=" + comments + "]";
    }
}
