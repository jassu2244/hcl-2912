package com.hcl.library.model;

public class Magazine extends LibraryItem {
    private int issueNum;

    public int getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }

    public Magazine(String title, int year, int issueNumber) {
        super(title, year);
        this.issueNum = issueNumber;
    }

    @Override
    public double lateFee(int daysLate) {
        return Math.max(0, daysLate) * 1.0;
    }

    @Override
    public String toString() {
        return super.toString().replace("]", ",issue " + issueNum + "]");
    }
}