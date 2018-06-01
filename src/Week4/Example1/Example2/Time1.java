package Week4.Example1.Example2;

public class Time1 {
   public int hour; // Between 0 - 23
   public int minute; // Between 0 - 59
   public int second; // Between 0 - 59

    // Ability to set the time
    public void setTime(int hour, int minute, int second) {
        if(hour < 0 || hour >= 24 ||
                minute < 0 || minute >= 60 ||
                second < 0 || second >= 60)
        {
            throw new IllegalArgumentException("Hour, minute and/or second was out of range");
        }

        // Assuming the values are correct
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Converts into universal time (HH:MM:SS) AKA 24 HOUR CLOCK
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Converts into standard time (H:MM:SS AM/PM)
    public String toString() {
        // Will convert any hour value above 12 into the appropriate "12-hour" value
        return String.format("%d:%02d:%02d %s",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute,
                second,
                (hour < 12 ? "AM" : "PM")); // FANCY IF STATEMENT
    }
}
