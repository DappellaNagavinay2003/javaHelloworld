import java.util.Scanner;

class Basic_datatype_read{
    
    
    public static void main(String args[]){
        
        
        Scanner a=new Scanner(System.in);/*Here 'a' is variable*/
        //we can use one scanner variable'a' to read many different datatypes values
        System.out.println("Enter integer value ");
        int b=a.nextInt();//Here 'b' is another variable with integer
        System.out.println("output: "+b+"\n");
        
        System.out.println("Enter Character value ");
        char c=a.next().charAt(0);//Here 'c' is another variable with Character
        System.out.println("output: "+c+"\n");
        
        System.out.println("Enter String value ");
        String d=a.next();//Here 'd' is another variable with String
        System.out.println("output: "+d+"\n");
        
        System.out.println("Enter Float(decimal) value ");
        float e=a.nextFloat();//Here 'e' is another variable with Float
        System.out.println("output: "+e+"\n");
        
        
    }
}
