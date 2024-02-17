import java.util.Calendar;
import java.text.SimpleDateFormat;

public class PS_15_4 {
   public static void main(String[] args) {
      Calendar calendar = Calendar.getInstance();
      SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
      String currentTime = sdf.format(calendar.getTime());
      System.out.println(currentTime);
   } 
}