package com.springrest.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    private Long id;
    private String title;
    private String description;

    public Course(Long id, String title, String description) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
    }
    public Course(int i, String springBoot, String creatingRestApi) {
        super();
    }

    public Course() {
        super();
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Course{" +
                "id=" + id +
                (title != null ? ", title='" + title + '\'' : "") +
                (description != null ? ", description='" + description + '\'' : "") +
                '}';
    }

}
