static String[] arr = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};


    static ArrayList<String> helper(String s) {

        if(s.length() == 1) {
            String temp = arr[s.charAt(0) - '0']; // "abc"
            ArrayList<String> allValue = new ArrayList<>();

            for(int i = 0; i <temp.length(); i++) {
                allValue.add(temp.charAt(i)+"");
            }

            return allValue;
        }
        
        ArrayList<String> recAns = helper(s.substring(1));

        ArrayList<String> allValue = new ArrayList<>();

        String temp = arr[s.charAt(0) - '0']; // "abc"

        for(int i = 0; i < temp.length(); i++) {

            for(int j = 0; j < recAns.size(); j++) {
                String curr = temp.charAt(i) + recAns.get(j);
                allValue.add(curr);
            }
        }

        return allValue;
        
        
        
    }
    
    static void printKPC(String ques) {

        ArrayList<String> ans = helper(ques);

        for(int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
        
    }

