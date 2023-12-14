package L09_Testing.DateClass;

public class Date
{
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day)
    {
        if (year < 0 || month < 0 || day < 0)
        {
            throw new IllegalArgumentException();
        }

        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void addDays(int days)
    {
        if (days < 0)
        {
            throw new IllegalArgumentException();
        }

        while (days > 0)
        {
            if (day == 28 && month == 2 && !isLeapYear())
            {
                day = 1;
                month++;
            }
            else if (day == 29 && month == 2 && isLeapYear())
            {
                day = 1;
                month++;
            }
            else if (day == 30 && (month == 2 || month == 4 || month == 6 || month == 9 || month == 11))
            {
                day = 1;
                month++;
            }
            else if (day == 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
                    || month == 12))
            {
                day = 1;
                month++;
            }
            else
            {
                day++;
            }

            if (month == 13)
            {
                month = 1;
                year++;
            }

            days--;
        }
    }

    public void addWeeks(int weeks)
    {
        addDays(weeks * 7);
    }

    public int daysTo(Date other)
    {
        if ((this.year > other.year) || (this.year == other.year && this.month > other.month)
                || (this.year == other.year && this.month == other.month && this.day >= other.day))
        {
            return 0;
        }

        int result = 0;
        Date currDate = new Date(this.year, this.month, this.day);
        while(currDate.year != other.year || currDate.month != other.month || currDate.day != other.day)
        {
            currDate.addDays(1);
            result++;
        }

        return result;
    }

    public int getDay()
    {
        return day;
    }

    public int getMonth()
    {
        return month;
    }

    public int getYear()
    {
        return year;
    }

    public boolean isLeapYear()
    {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String toString()
    {
        String strDate = "";

        strDate += year;
        strDate += "/";

        if (month < 10)
            strDate += "0";
        strDate += month;
        strDate += "/";

        if (day < 10)
            strDate += "0";
        strDate += day;

        return strDate;
    }
}
