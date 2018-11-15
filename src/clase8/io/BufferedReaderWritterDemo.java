package clase8.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Marcos Echague
 *
 */
public class BufferedReaderWritterDemo {

	public static List<String> readFile(File origen) throws IOException {
		List<String> data = new ArrayList<String>();
		try (BufferedReader reader = new BufferedReader(new FileReader(origen))) {
			String s;
			while((s = reader.readLine()) != null) {
				  data.add(s);
			}
		}
		return data;
	}
	public static void writeFile(List<String> data, File destination) throws IOException {
		try (BufferedWriter writer = new BufferedWriter( new FileWriter(destination))) {
			for(String s: data) {
					writer.write(s);
					writer.newLine();
				}
		}
	}
		
	public static void main(String[] args) throws IOException {
		File origen = new File("input-buffer.txt");
		File destino = new File("output-buffer.txt");
		List<String> data = readFile(origen);
		for(String record: data) {
			System.out.println(record);
		}
		writeFile(data,destino);
	}
}
