public static ArrayList<String> getStairPaths(int n) {

            if(n < 0) {
                ArrayList<String> ans = new ArrayList<>();
                return ans;
            }

            if(n = 0) {
                ArrayList<String> ans = new ArrayList<>();
                ans.add("");
                return ans;
            }


            ArrayList<String> one = getStairPaths(n-1);
            ArrayList<String> two = getStairPaths(n-2);
            ArrayList<String> three = getStairPaths(n-3);
            
            ArrayList<String> ans = new ArrayList<>();

            for(int i = 0; i < one.size(); i++) {
                ans.add("1" + one.get(i));
            }
    
            for(int i = 0; i < two.size(); i++) {
                ans.add("2" + two.get(i));
            }
    
            for(int i = 0; i < three.size(); i++) {
                ans.add("3" + three.get(i));
            }
    
            return ans;
        

        
    }
