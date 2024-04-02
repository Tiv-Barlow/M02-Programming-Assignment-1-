//M02 Programming Assignment (1)
//Ivy Tech Community College
//SDEV 200 - Java
//Professor Bumgardner
//Nativida Muhammad
//01 April 2024

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
  private int year;
  private int month;
  private int day;

  public Main() {
    this(System.currentTimeMillis());
  }

  public Main(long elapsedTime) {
    setDate(elapsedTime);
  }

  public Main(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public int getYear() {
    return year;
  }

  public int getMonth() {
    return month;
  }

  public int getDay() {
    return day;
  }

  public void setDate(long elapsedTime) {
    GregorianCalendar calendar = new GregorianCalendar();
    calendar.setTimeInMillis(elapsedTime);
    this.year = calendar.get(Calendar.YEAR);
    this.month = calendar.get(Calendar.MONTH);
    this.day = calendar.get(Calendar.DAY_OF_MONTH);
  }

  public static void main(String[] args) {
    System.out.println("Hello, Professor Bumgardner.");

    Main date1 = new Main();
    Main date2 = new Main(34355555133101L);

    System.out.println("Date 1: Year=" + date1.getYear() + ", Month=" + date1.getMonth() + ", Day=" + date1.getDay());
    System.out.println("Date 2: Year=" + date2.getYear() + ", Month=" + date2.getMonth() + ", Day=" + date2.getDay());
  }
}
