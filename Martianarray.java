package javajava;

public class Martianarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub//
		int a[]= {1,2,1,2,1,9};
		System.out.println(isMartialarray(a));

	}
    public static int isMartialarray(int a[]) {
      boolean d=true;
      int count=0, c=0;
      for(int i=0;i<a.length-1;i++) {
    	  if(a[i]==a[i+1]) {
    		  d=false;
    		   return 0;
    		   }
     for(int j=0;j<a.length;j++) {  
    	  if(a[j]==1) {
    		  count++;
    	  }
    	  if(a[j]==2) {
    		  c++;
    	  }}
      }
      if(d==true && count>c)
    	  return 1;
      else return 0;
    }
}
