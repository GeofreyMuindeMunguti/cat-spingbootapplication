package com.cat.demo.models;

public class Reason {

    private Long studentId;
    private String reason;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Reason(){}

    public Reason(Long studentId, String reason) {
        this.studentId = studentId;
        this.reason = reason;
    }
}
