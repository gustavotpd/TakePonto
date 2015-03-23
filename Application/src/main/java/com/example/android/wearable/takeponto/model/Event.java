package com.example.android.wearable.takeponto.model;


/**
 * Created by gustavo on 14/03/15.
 */
public class Event {

    private int id;
    private String note;
    private int status;
    private String startTime;
    private String endTime;

    // constructors
    public Event() {
    }

    public Event(String startTime, String endTime, String note, int status) {
        this.setStartTime(startTime);
        this.setEndTime(endTime);
        this.setNote(note);
        this.setStatus(status);
    }

    public Event(int id, String startTime, String endTime, String note, int status) {
        this.setId(id);
        this.setStartTime(startTime);
        this.setEndTime(endTime);
        this.setNote(note);
        this.setStatus(status);
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    // getters
    public long getId() {
        return this.id;
    }

    public String getNote() {
        return this.note;
    }

    public int getStatus() {
        return this.status;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }
}