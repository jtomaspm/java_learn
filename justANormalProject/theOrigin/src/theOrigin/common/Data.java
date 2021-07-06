package theOrigin.common;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;
import java.util.LinkedList;
import java.util.Scanner;

public class Data {
	
	private LinkedList<Client> clients;
	private LinkedList<Sale> sales;
	private File clientsF;
	private File salesF;
	
	
	public Data() throws Exception{
		this.clientsF = new File("D:/jtoma/Documents/code/java/justANormalProject/theOrigin/src/theOrigin/resources/clients.txt");
		this.salesF = new File("D:/jtoma/Documents/code/java/justANormalProject/theOrigin/src/theOrigin/resources/sales.txt");
		Scanner scf = new Scanner(clientsF);
		while(scf.hasNextLine()) {
			Client c = (Client) fromString(scf.nextLine());
			clients.add(c);
		}
		scf = new Scanner(salesF);
		while(scf.hasNextLine()) {
			Sale s = (Sale) fromString(scf.nextLine());
			sales.add(s);
		}
	}
	
	 /** Read the object from Base64 string. */
	   private static Object fromString( String s ) throws IOException ,
	                                                       ClassNotFoundException {
	        byte [] data = Base64.getDecoder().decode( s );
	        ObjectInputStream ois = new ObjectInputStream( 
	                                        new ByteArrayInputStream(  data ) );
	        Object o  = ois.readObject();
	        ois.close();
	        return o;
	   }

	    /** Write the object to a Base64 string. */
	    private static String toString( Serializable o ) throws IOException {
	        ByteArrayOutputStream baos = new ByteArrayOutputStream();
	        ObjectOutputStream oos = new ObjectOutputStream( baos );
	        oos.writeObject( o );
	        oos.close();
	        return Base64.getEncoder().encodeToString(baos.toByteArray()); 
	    }

}
