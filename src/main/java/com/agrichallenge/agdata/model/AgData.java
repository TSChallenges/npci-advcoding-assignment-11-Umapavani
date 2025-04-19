package com.agrichallenge.agdata.model;

public class AgData {

    private Integer id;
    private String crop;
    private String region;
    private Integer yield;
    private Integer year;


    // TODO: Default constructor - No arguments

    public AgData() {
    }


    // TODO: Parameterized constructor


    public AgData(String crop, Integer id, String region, Integer year, Integer yield) {
        this.crop = crop;
        this.id = id;
        this.region = region;
        this.year = year;
        this.yield = yield;
    }

    public String getCrop() {
        return crop;
    }

    public void setCrop(String crop) {
        this.crop = crop;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getYield() {
        return yield;
    }

    public void setYield(Integer yield) {
        this.yield = yield;
    }


    // TODO: Getters and Setters


}
