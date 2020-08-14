package test;

import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.URLDecoder;
import java.net.UnknownHostException;

public class InetAddressTest {
	
	public static void main(String[] args) throws UnknownHostException, UnsupportedEncodingException {
		String s=URLDecoder.decode("%25E5%2593%2588%25E5%2593%2588","GBK");
		System.out.println(s);
	}

}
