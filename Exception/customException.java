class CustomException extends Exception {
    
    public CustomException(String message) {
        super(message);
    }
}

public class MyClass {
    public static void main(String args[]) {
      
      try {
          int x = 10;
          if( x == 10) {
              throw new CustomException("My Exception");
          }
      }catch(CustomException e) {
          System.out.println(e.getMessage());
      }
      
    }
}
