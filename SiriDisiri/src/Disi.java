import java.io.*;
class Disi implements Serializable
{
	 public static void main(String ag[]) throws IOException, ClassNotFoundException
	 {
		    String path = "C:\\Users\\Divya\\Desktop\\series1.txt";
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new  ObjectInputStream(fis);
            Employee  c = (Employee) ois.readObject();
            c.display();
	 }
}
