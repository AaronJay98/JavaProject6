public class Appointment {
    protected String description;
    protected int[] date = new int[3];

    public Appointment(String inDescription, int year, int month, int day) {
        this.description = inDescription;
        this.date[0] = year;
        this.date[1] = month;
        this.date[2] = day;
    }

    public boolean occursOn(int year, int month, int day) {
        if(this.date[0] == year && this.date[1] == month && this.date[2] == day) {
            return true;
        }
        return false;
    }

    public String getDescription() {
        return description;
    }

    public int[] getDate() {
        return date;
    }
}
