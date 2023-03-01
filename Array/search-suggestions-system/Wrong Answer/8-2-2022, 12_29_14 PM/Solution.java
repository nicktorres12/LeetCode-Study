// https://leetcode.com/problems/search-suggestions-system

class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        int max = 3;
        List<List<String>> ret = new ArrayList();
        List<String> copy = new ArrayList();
        Arrays.sort(products);
            
       for(int i = 0; i < searchWord.length();i++){
           List<String> arr = new ArrayList();
           char cur = searchWord.charAt(i);
           if(i == 0){
           for(String prod : products){
               if(cur == prod.charAt(0) && arr.size() < max){     
                   arr.add(prod);          
             }
           }
               
               copy = arr;
               ret.add(arr);
               
           }
           
           
           else{
               for(String res : copy){
                   if(cur == res.charAt(i)){
                       arr.add(res);
                   }
               }
               
               copy = arr;
               ret.add(arr);
           
       }
       }
        
        return ret;
        
    }
}