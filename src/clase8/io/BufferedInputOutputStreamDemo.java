package clase8.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.LocalDateTime;

/**
 * 
 * @author Marcos Echague
 *
 */

public class BufferedInputOutputStreamDemo {
	
	 public static void main(String args[]) throws IOException {  
	      System.out.println(LocalDateTime.now());
	      copy(new File("prueba.pdf"), new File("prueba-copia.pdf"));
	      System.out.println(LocalDateTime.now());
	      File f = new File("prueba.pdf");
	      boolean eliminado = f.delete();
	      System.out.println("Fue eliminado ? "+eliminado);
	   }
	 
	 public static void copy(File origen, File destino) throws IOException {
		 try (  
			   InputStream in = new BufferedInputStream(new FileInputStream(origen));
		       OutputStream out = new BufferedOutputStream( new FileOutputStream(destino)) ) {
				 byte[] buffer = new byte[1024];
				 int lengthRead;
				 while ((lengthRead = in.read(buffer)) > 0) {
				 out.write(buffer,0,lengthRead);
				 out.flush();
			 	}
		 	}
		 }
}
