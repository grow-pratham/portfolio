package com.prathamesh.portfolio.skill;

import jakarta.persistence.*;

@Entity
@Table(name = "skills")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false, length = 50, unique = true)
    private String name;

    @Column(name = "category", nullable = false, length = 50)
    private String category;

    @Column(name = "proficiency_level", nullable = false)
    private int proficiencyLevel;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getProficiencyLevel() {
        return proficiencyLevel;
    }

    public void setProficiencyLevel(int proficiencyLevel) {
        this.proficiencyLevel = proficiencyLevel;
    }
}
