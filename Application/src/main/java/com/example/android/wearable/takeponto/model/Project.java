package com.example.android.wearable.takeponto.model;

/**
 * Created by gustavo on 15/03/15.
 */
public class Project {

    private int id;
    private String name;
    private String note;
    private int status;
    private String costCenter;

    // constructors
    public Project() {
    }

    public Project(String name, String costCenter, String note, int status) {
        this.setName(name);
        this.setCostCenter(costCenter);
        this.setNote(note);
        this.setStatus(status);
    }

    public Project(int id, String name, String costCenter, String note, int status) {
        this.setId(id);
        this.setName(name);
        this.setCostCenter(costCenter);
        this.setNote(note);
        this.setStatus(status);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }
}
