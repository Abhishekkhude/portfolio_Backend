package com.abhishek.portfolio.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "portfolio")
public class Portfolio {

    @Id
    private String id;

    private String name;
    private String email;
    private String phone;
    private String location;
    private String summary;

    private List<String> programmingLanguages;
    private List<String> backendTechnologies;
    private List<String> webTechnologies;
    private List<String> databases;
    private List<String> tools;

    private List<Education> education;
    private List<Project> projects;

    // --- Education ---
    public static class Education {
        private String degree;
        private String institute;
        private String year;
        private String score;

        public String getDegree() { return degree; }
        public void setDegree(String degree) { this.degree = degree; }
        public String getInstitute() { return institute; }
        public void setInstitute(String institute) { this.institute = institute; }
        public String getYear() { return year; }
        public void setYear(String year) { this.year = year; }
        public String getScore() { return score; }
        public void setScore(String score) { this.score = score; }
    }

    // --- Project ---
    public static class Project {
        private String title;
        private String description;
        private List<String> technologies;

        public String getTitle() { return title; }
        public void setTitle(String title) { this.title = title; }
        public String getDescription() { return description; }
        public void setDescription(String description) { this.description = description; }
        public List<String> getTechnologies() { return technologies; }
        public void setTechnologies(List<String> technologies) { this.technologies = technologies; }
    }

    // --- Getters & Setters ---
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public String getSummary() { return summary; }
    public void setSummary(String summary) { this.summary = summary; }
    public List<String> getProgrammingLanguages() { return programmingLanguages; }
    public void setProgrammingLanguages(List<String> v) { this.programmingLanguages = v; }
    public List<String> getBackendTechnologies() { return backendTechnologies; }
    public void setBackendTechnologies(List<String> v) { this.backendTechnologies = v; }
    public List<String> getWebTechnologies() { return webTechnologies; }
    public void setWebTechnologies(List<String> v) { this.webTechnologies = v; }
    public List<String> getDatabases() { return databases; }
    public void setDatabases(List<String> v) { this.databases = v; }
    public List<String> getTools() { return tools; }
    public void setTools(List<String> v) { this.tools = v; }
    public List<Education> getEducation() { return education; }
    public void setEducation(List<Education> education) { this.education = education; }
    public List<Project> getProjects() { return projects; }
    public void setProjects(List<Project> projects) { this.projects = projects; }
}
