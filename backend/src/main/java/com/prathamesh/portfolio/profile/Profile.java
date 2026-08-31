package com.prathamesh.portfolio.profile;


import jakarta.persistence.*;

@Entity
@Table(name = "profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "full_name", nullable = false, length = 100)
    private String fullName;

    @Column(name = "title", nullable = false, length = 150)
    private String title;

    @Column(name = "bio", nullable = false)
    private String bio;

    @Column(name = "home_intro", nullable = true)
    private String homeIntro;

    @Column(name = "contact_email", nullable = false, length = 150)
    private String contactEmail;

    @Column(name = "social_links", nullable = true)
    private String socialLinks;

    public long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getTitle() {
        return title;
    }

    public String getBio() {
        return bio;
    }

    public String getHomeIntro() {
        return homeIntro;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public String getSocialLinks() {
        return socialLinks;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setHomeIntro(String homeIntro) {
        this.homeIntro = homeIntro;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public void setSocialLinks(String socialLinks) {
        this.socialLinks = socialLinks;
    }
}
