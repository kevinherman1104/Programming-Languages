public class TheTime {

    private int hour;
    private int minute;
    private int second;

    public TheTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    @Override
    public String toString()
    {
        return String.format("%02d : %02d : %02d" ,hour,minute,second);
    }

    public TheTime nextSecond()
    {
        this.second += 1;
        if (this.second == 60)
        {
            this.second = 0;
            this.minute += 1;

        }
        if (this.minute == 60)
        {
            this.minute = 0;
            this.hour += 1;

        }

        if  (this.hour == 24)
        {
            this.hour = 0;
            this.hour = 0;
            this.hour = 0;

        }
        return this;

    }
    public TheTime previousSecond()
    {
        this.second -= 1;
        if (this.second < 0)
        {
            this.second= 59;
            this.minute -= 1;
        }
        if (this.minute <0)
        {
            this.minute = 59;
            this.hour -= 1;

        }

        if(this.hour < 0)
        {
            this.hour = 23;

        }
        return this;

    }
}
