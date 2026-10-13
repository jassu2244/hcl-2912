package com.hcl.library.model;

import java.time.Year;

public abstract class LibraryItem implements Borrowable, Comparable<LibraryItem> {

    private static int nextId = 1001;

    private final int id;
    private String title;
    private final int year;
    private boolean available = true;

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        LibraryItem.nextId = nextId;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public LibraryItem(String title, int year) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }

        if (year < 1900 || year > Year.now().getValue()) {
            throw new IllegalArgumentException("Invalid publication year");
        }

        this.id = nextId++;
        this.title = title;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override public boolean isAvailable() {
        return available;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        this.title = title;
    }

    @Override public void borrow() {
        available = false;
    }

    @Override public void giveBack() {
        available = true;
    }

    public abstract double lateFee(int daysLate);

    @Override
    public int compareTo(LibraryItem other) {
        return title.compareTo(other.title);
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + id + ", " + title + ", " +
                year + ", " + (available ? "Available" : "Issued") + "]";
    }
}