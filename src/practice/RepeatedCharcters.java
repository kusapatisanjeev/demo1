package practice;

public class RepeatedCharcters {

	public static void main(String[] args) {
		String str="ramajagga";
	          char[] c=  str.toCharArray();
	          for(char ch='a';ch<='z';ch++) {
	        	  int count=0;
	        	  for(int i=0;i<str.length();i++) {
	        		  if(ch==c[i]) {
	        			  count++;
	        		  }
	        	  }
	        	  if(count>1) {
	        		  System.out.println(ch+" repeated: "+count+" times");
	        	  }
	          }
	}

}
