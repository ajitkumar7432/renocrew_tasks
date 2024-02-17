import java.util.Scanner;
public class PS_14_3 {
    public static void main(String[] args) {
        boolean  b = true;
        int [] marks = new int[3];
        marks[0]=7;
        marks[1]=8;
        marks[2]=9;
        Scanner sc = new Scanner(System.in);
        int index;
        int i=0;
        System.out.println("Enter the value of index:");
        while(b && i<5)
        { try{
            index=sc.nextInt();
            System.out.println("The value marks[ind] is "+marks[index]);
            i++;
            break;
        }
        catch(Exception e){
            System.out.println("Invalid index");
            i++;
        }
        if(i>=5)
        System.out.println("Error");
        }
    }
}
