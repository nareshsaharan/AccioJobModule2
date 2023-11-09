public class Main {
    static void printStairPaths(int n,String pathSoFar) {

        if(n == 0) {
            System.out.println(pathSoFar);
            return ;
        }

        if(n < 0) {
            return ;
        }

        // one step
        printStairPaths(n-1, pathSoFar + "1");

        //two steps
        printStairPaths(n-2, pathSoFar + "2");

        //three steps
        printStairPaths(n-3, pathSoFar + "3");
        
    }
