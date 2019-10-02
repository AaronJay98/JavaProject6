package edu.sjsu.macaldo.aaronjay;

public abstract class Appointment {
    protected final String description;
    protected final int[] date = new int[3];

    public Appointment(String inDescription, int year, int month, int day) {
        this.description = inDescription;
        this.date[0] = year;
        this.date[1] = month;
        this.date[2] = day;
    }

    public String getDescription() {
        return description;
    }

    public int[] getDate() {
        return date;
    }

    public abstract boolean occursOn(int year, int month, int day);
}
