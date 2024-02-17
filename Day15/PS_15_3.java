import java.util.Calendar;

public class PS_15_3 {
   public static void main(String[] args) {
      Calendar calendar = Calendar.getInstance();
      int hour = calendar.get(Calendar.HOUR_OF_DAY);
      int minute = calendar.get(Calendar.MINUTE);
      int second = calendar.get(Calendar.SECOND);
      System.out.println(hour + ":" + minute + ":" + second);
   } 
}
