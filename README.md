# Two Factor Auth OTP Code generation demo by Java (powered by "aerogear-otp-java")

## Requirement

- Java JDK 8
- Maven ver.3

## How to build?

Execute follow command,

```shell
> mvn package
```

then `myapp-1.0-SNAPSHOT-jar-with-dependencies.jar` will be created in `targets` folder.

## How to run?

Execute follow command,

```shell
> java -jar target\myapp-1.0-SNAPSHOT-jar-with-dependencies.jar
```

then you can get OTP code in console.

**NOTICE:** secret key for OTP is hard coded in .java source file, because this is demonstration code.  
The secret key comes from [this sample code.](https://github.com/sample-by-jsakamoto/Selenium-E2ETest-for-OTP2FAAuth)

## How to compute OTP code?

Powered by [`aerogear-otp-java`](https://github.com/aerogear/aerogear-otp-java).

All of the java source code of this sample is this:

```java
package com.myapp;

import org.jboss.aerogear.security.otp.Totp;

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
```

## License

[The Unlicense](LICENSE)