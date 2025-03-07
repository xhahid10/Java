package JavaPrograms;

public class Assignment2 {
	
	// (((((10-2)+2)*2)-2)/2)
	
	
	  public int sum(int a, int b) {
		  
		int c;
		c=a+b; 
		System.out.println("The sum result is " +c);
		return c;
		    
	  }
	  public int sub(int x , int y) {
		  
		  int z;
		  z=x-y;
		  System.out.println("The subtraction result is "+z);
		  return z;
	  }
	  
	  public int multi(int k , int l) {
		  int j;
		  
		  j=k*l;
		  System.out.println("The multiplication result is " +j);
		  return j;
	  }
	  
	  public void div(int m , int n) {
		  
		int o;
		o=m/n;
		System.out.println("The divison result is  "+o);
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment2 obj1=new Assignment2();
		int sub1=obj1.sub(10, 2);
		int sum1=obj1.sum(sub1,2);
		int multi1=obj1.multi(sum1, 2);
		int sub2=obj1.sub(multi1, 2);
		obj1.div(sub2, 2);
		

	}

}
