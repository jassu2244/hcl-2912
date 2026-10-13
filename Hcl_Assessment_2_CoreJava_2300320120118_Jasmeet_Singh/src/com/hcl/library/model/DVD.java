package com.hcl.library.model;

public class DVD extends LibraryItem {
    private int durationMins;

    public DVD(String title, int year, int durationMins) {
        super(title, year);
        this.durationMins = durationMins;
    }

    public int getDurationMins() {
        return durationMins;
    }

    public void setDurationMins(int durationMins) {
        this.durationMins = durationMins;
    }

    @Override
    public double lateFee(int daysLate) {
        return Math.max(0, daysLate) * 5.0;
    }

    @Override
    public String toString() {
        return super.toString().replace("]", "," + durationMins + "min]");
    }
}