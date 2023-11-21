public class MyClass {
    
    /*
    
    Start

Exception in thread "main" java.lang.ArithmeticException: / by zero
	at MyClass.main(MyClass.java:11)

    */
    
    public static void main(String args[]) {
      
      System.out.println("Start");
      
      try {
          
          int x = 10;
          int y = 3;
          int z = x / y;
          System.out.println(z);
          
          int arr[] = new int[5];
          arr[6] = 10;
      }
      catch(ArithmeticException e) {
          System.out.println(e);
      }
      catch(ArrayIndexOutOfBoundsException e) {
          System.out.println(e);
      }
     
      
      System.out.println("End");
      
     
    }
}
