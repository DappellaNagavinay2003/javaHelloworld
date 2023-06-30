class Basic_function_calls{
    
    //This is main method
    public static void main(String args[])
    {
        a();//Here a is the method call without parameter,we can give any name and call that method
        b(10);//same function call but passing integer parameter inside method =10
        int e1=10;
        String e2="vinay";
        c(e1,e2);//Here we are passing more than one parameter with different datatypes by storing it in variables
        
    }
    
    //below method call called_method(no parameter){statment}
    public static void a()
    {
      System.out.println("Method 'a' is called");
    }
  
    //below method call called_method(Passing parameter variable declereation){statment}
    public static void b(int d){
      System.out.println("This is parameter value passed: "+d);
    }
    //below method call called_method(Passing parameter's variable declereation's){statment}
  public static void c(int e3,String e4)
    {
      System.out.println("This are the parameters value passed: "+e3+","+e4);
    }
  
}
