package com.ms1.datas.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = Student.class)
public class Student {
    private String name;
    private String role;
    private String schoolName;
    private Integer scienceMarks;
    private Integer mathMarks;
    private Integer socialScienceMarks;
    private Integer artMarks;
    private Integer sportMarks;

    public Student() {
    }

    public Student(String name, String role, String schoolName, Integer scienceMarks, Integer mathMarks, Integer socialScienceMarks, Integer artMarks, Integer sportMarks) {
        this.name = name;
        this.role = role;
        this.schoolName = schoolName;
        this.scienceMarks = scienceMarks;
        this.mathMarks = mathMarks;
        this.socialScienceMarks = socialScienceMarks;
        this.artMarks = artMarks;
        this.sportMarks = sportMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Integer getScienceMarks() {
        return scienceMarks;
    }

    public void setScienceMarks(Integer scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public Integer getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(Integer mathMarks) {
        this.mathMarks = mathMarks;
    }

    public Integer getSocialScienceMarks() {
        return socialScienceMarks;
    }

    public void setSocialScienceMarks(Integer socialScienceMarks) {
        this.socialScienceMarks = socialScienceMarks;
    }

    public Integer getArtMarks() {
        return artMarks;
    }

    public void setArtMarks(Integer artMarks) {
        this.artMarks = artMarks;
    }

    public Integer getSportMarks() {
        return sportMarks;
    }

    public void setSportMarks(Integer sportMarks) {
        this.sportMarks = sportMarks;
    }
}
