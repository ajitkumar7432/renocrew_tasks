import java.sql.Date;

public class PS_15_2 {
   public static void main(String[] args) {
    Date d = new Date();
    System.out.println(d.getHours() + ":" + d.getMinutes()+":" +d.getSeconds());  // prints the current hour and minute
   } 
}
