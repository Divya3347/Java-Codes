package Static;

class Static_var1{  
	   int empno;  
	   String name;  
	   static String CEO ="John";//static variable  
	 
	   Static_var1(int e, String n){  
		   empno = e;  
		   name = n;  
	   }   
	   void display ()
	   {
		   System.out.println(empno+" "+name+" "+CEO);
	   }  
	}  
  
public class Static_var{  
	public static void main(String args[]){  
		Static_var1 s1 = new Static_var1(111,"Divy");  
		Static_var1 s2 = new Static_var1(222,"Harsh");  
		//we can change the CEO of all objects by the single line of code  
		//Static_var.CEO=" ";  
		s1.display();  
		s2.display();  
	} 
} 
