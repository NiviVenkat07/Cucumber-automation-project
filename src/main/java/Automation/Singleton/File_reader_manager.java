package Automation.Singleton;

public class File_reader_manager {
	
 private  File_reader_manager() {
	
	}
	

	public static File_reader_manager get_instance_FRM() {
		
		File_reader_manager Frm =new File_reader_manager();
		 return Frm;		
		
	}
	
	
	public Singleton_design get_instance_SD() {

	    Singleton_design S= new Singleton_design ();		    
	    return S;	
}
	
	
	
	
}
