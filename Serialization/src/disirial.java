import java.io.*;
class disirial implements Serializable
{
	 public static void main(String ag[]) throws IOException, ClassNotFoundException
	 {
			String path = "C:\\Users\\Divya\\Desktop\\series.txt";
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new  ObjectInputStream(fis);
            Cricket c = (Cricket) ois.readObject();
            c.display();
	 }
}
