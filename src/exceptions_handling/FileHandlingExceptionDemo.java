package exceptions_handling;

import java.io.*;

public class FileHandlingExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter writer = null;
		try {
			writer = new FileWriter("F:\\simpli (Joel)\\sessions\\session3\\demo.txt");
			writer.write("lets learn");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				writer.close(); //always do in finally block so in case of thrown exception, FileWriter will be closed too!!!
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
