public class PS_14_2{
    public static void main(String[] args) {
        try{
        int e = 720/0;
        }
        catch(IllegalArgumentException e){
            System.out.println("HeHe");
        }
        catch(ArithmeticException e)
        {
        System.out.println("HaHa");
        }
    }
}