package com.cat.demo.models;

public class Match {
    private Long id;
    private Student student;
    private Student match;
    private String requested;
    private String reason;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getMatch() {
        return match;
    }

    public void setMatch(Student match) {
        this.match = match;
    }

    public String getRequested() {
        return requested;
    }

    public void setRequested(String requested) {
        this.requested = requested;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Match(){}

    public Match(Long id, Student student, Student match, String requested, String reason) {
        this.id = id;
        this.student = student;
        this.match = match;
        this.requested = requested;
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Match{" +
                "id=" + id +
                ", student=" + student +
                ", match=" + match +
                ", requested='" + requested + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
