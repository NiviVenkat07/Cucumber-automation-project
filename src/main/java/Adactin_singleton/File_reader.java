package Adactin_singleton;

public class File_reader {
	
 private  File_reader() {
	
	}
	

	public static File_reader get_instance_FRM() {
		
		File_reader Frm =new File_reader();
		 return Frm;		
		
	}
	
	
	public Singleton get_instance_SD() {

	    Singleton S= new Singleton ();		    
	    return S;	
}
	
	
	
	
	
}
