static ArrayList<String> helper(String s) {

        if(s.length() == 1) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add(s);
            return temp;
        }


        ArrayList<String> recAns = helper(s.substring(1));

        ArrayList<String> ans = new ArrayList<>();

        for(int i = 0; i < recAns.size(); i++) {

            String curr = recAns.get(i);

            for(int j = 0; j <= curr.length(); j++) {

                String te = curr.substring(0, j) + s.charAt(0) + curr.substring(j);
                ans.add(te);
            }
            
        }

        return ans;
        
        
    }
    
   public static void permutationPrint(String ques, String asf)
    {


           ArrayList<String> ans = helper(ques);

        Collections.sort(ans);
        System.out.println(ans.get(0));
        
        for(int i = 1; i < ans.size(); i++) {
            if(!ans.get(i).equals(ans.get(i-1)))
                System.out.println(ans.get(i));
        }
        
        
    }
  }
