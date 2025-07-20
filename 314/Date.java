
public class Date{

  private int month;
  private int day;
  private int year;

  public Date(int month, int day, int year)
  {
this.day = day;
this. year = year;
  }
// method setting month
public void setMonth(int month)
{
  this.month = month;

}
  
//method returning month

public int getMonth()

{
  return month;
}

//method setting day
public void setDay(int day)
{
  this.day = day;

}
  
//method returning day

public int getDay()

{
  return day;
}

//method setting  year
public void setYear(int year)
{
  this.year = year;

}
  
//method returning year

public int getYear()

{
  return year;
}

//method for displaying date

public void displayDate()
{
  System.out.println("Date is :" + month + "/" + day +"/" + year);
}
  }
