package Static;

public class Static_class  
{  
	static String s= "Javatpoint";  
 
	static class inner_class  
		{  
			public void show()   
				{    
					System.out.println(s);   
				}  
		}  
	public static void main(String args[])  
		{  
			Static_class.inner_class obj = new Static_class.inner_class();  
			obj.show();  
		}  
}  