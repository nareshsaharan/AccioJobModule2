import java.util.*;

public class Main {

    static boolean isSafe(int n, int m, int h, int v) {

        // safe condi
        if(h <= 0 || v <= 0 || h > m || v > n) {
            return false;
        }

        return true;
        
    }
    
    static int countAllPath(int n, int m, int h, int v, boolean vis[][])
    {
        
        // base cond
        if(h == m && v == n) {
            return 1;
        }

        
        
        int dirH[] = {1, 1, 0, -1, -1, -1, 0, 1};
        int dirV[] = {0, 1, 1, 1, 0, -1, -1, -1};
        
        
        int ans = 0;
        for(int k = 0; k < 8; k++) {
            
            int nh = h + dirH[k];
            int nv = v + dirV[k];
            if(isSafe(n, m, nh, nv) && !vis[nv][nh]) {
                vis[nv][nh] = true;
                ans += countAllPath(n, m, nh, nv, vis);
                vis[nv][nh] = false;
                
            }
            
        }
        return ans;

        
        
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        boolean vis[][] = new boolean[n+1][m+1];
        vis[1][1] = true;
        System.out.println(countAllPath(n,m, 1, 1, vis));
    }
}
