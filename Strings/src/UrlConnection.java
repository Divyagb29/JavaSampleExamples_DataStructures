import java.util.*;
import java.net.*;
import java.io.*;
class UrlConnection
{
	public static void main(String ag[])throws Exception
	{
		URL ur = new URL("https://www.google.com");
		HttpURLConnection huc = (HttpURLConnection) ur.openConnection();
		System.out.println(huc.getRequestMethod());
		System.out.println(huc.getResponseCode());
		System.out.println(huc.getResponseMessage());
	    Map<String,List<String>> mp = huc.getHeaderFields();
	    Set<String> st = mp.keySet();
	    for(String k: st)
	    {
	    	System.out.println("key : "+k+ " value" + mp.get(k));
	    }
	}
}
