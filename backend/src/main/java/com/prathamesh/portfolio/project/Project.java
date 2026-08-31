package com.prathamesh.portfolio.project;

import jakarta.persistence.*;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title", nullable = false, length = 150)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "repo_url", nullable = true, length = 255)
    private String repoUrl;

    @Column(name = "live_url", nullable = true, length = 255)
    private String liveUrl;

    @Column(name = "image_url", nullable = true, length = 255)
    private String imageUrl;

    @Column(name = "display_order", nullable = false)
    private int displayOrder;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getRepoUrl() {
        return repoUrl;
    }

    public String getLiveUrl() {
        return liveUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
    }

    public void setLiveUrl(String liveUrl) {
        this.liveUrl = liveUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }

}
