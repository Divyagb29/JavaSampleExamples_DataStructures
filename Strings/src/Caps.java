import java.util.*;
import java.net.*;
import java.io.*;
class Caps
{
	public static void main(String ag[]) throws IOException
	{
		URL u = new URL("https://www.google.com/downloads");
		System.out.println("Protocol :" + u.getProtocol());
		System.out.println("Port :" + u.getPort());
		System.out.println("Host :" + u.getHost());
		System.out.println("File :" + u.getFile());
		System.out.println("External :" + u.toExternalForm());
		System.out.println("OpenSource :" + u.openConnection());
	}
}