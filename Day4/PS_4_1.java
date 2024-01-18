public class PS_4_1 {
    public static void main(String[] args) {
        int a= 10;
       // if(a=11)  
        // it will show an error as = is used in if statement which is assignment operator 
        // if relational operator would have used then if statement would have been executed
            System.out.println("In if statement if(a=11) is used then it will show an error as it is assignment operator ");
            System.out.println("If relational operator would have used then if statement would have been executed");
            // Therefore the code for relational operator would be
        if(a==11)
        {
            System.out.println("I am 11");
        }
        else{
            System.out.println("I am not 11");
        }
    }
}
