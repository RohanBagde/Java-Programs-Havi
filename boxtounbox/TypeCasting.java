package boxtounbox;

public class TypeCasting {

	public static void main(String[] args) {
		int a=50;  
        Integer a2=new Integer(a);//Boxing  
  
        Integer a3=5;//Boxing  
          
        System.out.println(a2+", "+a3);  
        
        
        //unboxing
        Integer i=new Integer(50);  
        int b=i;  
          
        System.out.println(b);  
		
	}

}
