package com.myapp;

import org.jboss.aerogear.security.otp.Totp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
	{
	    // Sample secret key: see http://j.mp/2mOovSV
	    String secretKey = "6jm7n6xwitpjooh7ihewyyzeux7aqmw2";

        Totp totp = new Totp(secretKey);
        System.out.println(totp.now());
    }
}
