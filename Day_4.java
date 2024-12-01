package sample1;


class Day_4 {
	public static String compressedString(String word) {

      int count=1;
      String comp="";
      int len=word.length();
      
      for(int i=0;i<len;i++) {
    	  
    	  if(i+1<len&& word.charAt(i)==word.charAt(i+1)) {
    		  
    		  count++;
    		  
    	  }
    	  else {
    	  while(count > 9) {
    		  comp+="9"+word.charAt(i);
    		  count-=9;
    	  }
    	 if(count>0) {
    	  comp+=count+ "" +word.charAt(i);
    	 }
    	 
    	 count=1;
    }
      }
    	
      return comp;

}

	
	
	public static void main(String args[]) {
		
		
		
		
		
	System.out.println(compressedString("ffaabbca")); 
	}
}