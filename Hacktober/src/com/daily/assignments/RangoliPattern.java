package com.daily.assignments;

public class RangoliPattern {
public static void main(String args[]) {
	RangoliPattern rangoli = new RangoliPattern();
	rangoli.start(3);
}

private void start(int n) {
	
      int colum =1;
     for(int i =1;i<n;i=i+2) {
    	 colum+=8;
     }
     for(int i =0;i<n;i++) {
    	 for(int j =1;j<=colum;j++) {
    		 
    	 }
     }
//    	 for(int j = 0;j<n*3;j++) {
//    		 if(j==n+1) {
//    			 System.out.print("*");
//    		 }else
//    			 System.out.print("-");
//    	 }
//    	 System.out.println();
//     }
//	
}
}
