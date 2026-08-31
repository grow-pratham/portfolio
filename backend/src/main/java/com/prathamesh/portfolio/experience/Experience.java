package com.prathamesh.portfolio.experience;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "experience")
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "company", nullable = false, length = 150)
    private String company;

    @Column(name = "role", nullable = false, length = 150)
    private String role;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "end_date", nullable = true)
    private LocalDate endDate;

    @Column(name = "description", nullable = false)
    private String description;

    public long getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public String getRole() {
        return role;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
