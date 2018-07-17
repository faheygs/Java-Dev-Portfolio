package labserialzation;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LabSerialization {
    public static void main(String[] args) {
        ListVsSetDemo demo = new ListVsSetDemo(
                new ColoredSquare(4, Color.RED),
                new ColoredSquare(6, Color.BLUE),
                new ColoredSquare(4, Color.RED),
                new ColoredSquare(8, Color.YELLOW));

        serialize(demo,"src/labserialzation/Demo.ser");
        System.out.println("Serialize is complete");
        ListVsSetDemo newdemo = deserialize("src/labserialzation/Demo.ser");
        testDemo(newdemo);
        

    }

    private static void testDemo(ListVsSetDemo demo) {
        System.out.println("List:");
        System.out.println(demo.getListElements());
        System.out.println("Set:");
        System.out.println(demo.getSetElements());
    }
    
    private static void serialize(ListVsSetDemo demo, String filename) {
    	try {
    		FileOutputStream fileOut = new FileOutputStream(filename);
    		ObjectOutputStream out = new ObjectOutputStream(fileOut);
    		out.writeObject(demo);
    		fileOut.close();
    		out.close();
    	} catch (IOException e) {
    		System.out.println(e.getMessage());
    	}
    }
    
    private static ListVsSetDemo deserialize(String file) {
    	ListVsSetDemo demo = null;
    	
    	try {
    		FileInputStream fileIn = new FileInputStream(file);
    		ObjectInputStream in = new ObjectInputStream(fileIn);
    		demo = (ListVsSetDemo) in.readObject();
    		in.close();
    		fileIn.close();
    	} catch (IOException e) {
    		e.printStackTrace();
    	} catch (ClassNotFoundException e) {
    		e.printStackTrace();
    	}
    	
    	return demo;
    }

}