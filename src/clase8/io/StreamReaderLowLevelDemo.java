package clase8.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
/**
 * 
 * @author Marcos Echague
 *
 */
public class StreamReaderLowLevelDemo {

	
	  public static void main(String args[])  {  
	     
		  FileInputStream in = null;
//	      FileReader in = null;
	      FileOutputStream out = null;
//	      FileWriter out = null;
	      
	      System.out.println(LocalDateTime.now());
	      try {
	    	  
	         in = new FileInputStream(new File("prueba.pdf"));
//	         in = new FileReader("input.txt");
	         out = new FileOutputStream("prueba-copia.pdf");
//	         out = new FileWriter("output.txt");
	         int c;
	         while ( (c = in.read() ) != -1) {
	            out.write(c);
	         }
	      }catch(IOException e) {
	    	  System.err.println(e);
	      
	      }finally {
	    	  if (in != null) {
	            try {
	            	in.close();
	            }catch(Exception e) {
	            	System.out.println("Ńo se cerror correctamente el in");
	            }
	         }
	         
	    	  if (out != null) {
	        	 try {
	        		 out.close();
	        	 }catch(Exception e) {
		           	System.out.println("Ńo se cerror correctamente el in");
	        	 }
	         }
	      }
	      
	      System.out.println(LocalDateTime.now());
	      
	      File f = new File("prueba.pdf");
	      boolean eliminado = f.delete();
	      System.out.println("Fue eliminado ? "+eliminado);
	   }
}
