# Java Applets 
An applet is a Java program that runs in a Web browser. 
An applet can be a fully functional Java application because it has the entire Java API at its disposal 

There is now very limited applet support in most modern browsers, as they no longer support the NPAPI plugin required for showing Java applets. This page exists as a reference only. Please see Java Chrome FAQ or JDK9 Plugin FAQ on the Java website.


    An applet is a Java class that extends the java.applet.Applet class.

    A main() method is not invoked on an applet, and an applet class will not define main().

    Applets are designed to be embedded within an HTML page.

    When a user views an HTML page that contains an applet, the code for the applet is downloaded to the user's machine.

    A JVM is required to view an applet. The JVM can be either a plug-in of the Web browser or a separate runtime environment.

    The JVM on the user's machine creates an instance of the applet class and invokes various methods during the applet's lifetime.

    Applets have strict security rules that are enforced by the Web browser. The security of an applet is often referred to as sandbox security, comparing the applet to a child playing in a sandbox with various rules that must be followed.

    Other classes that the applet needs can be downloaded in a single Java Archive (JAR) file.


## Lifecycle of an applet


    init − This method is intended for whatever initialization is needed for your applet. It is called after the param tags inside the applet tag have been processed.

    start − This method is automatically called after the browser calls the init method. It is also called whenever the user returns to the page containing the applet after having gone off to other pages.

    stop − This method is automatically called when the user moves off the page on which the applet sits. It can, therefore, be called repeatedly in the same applet.

    destroy − This method is only called when the browser shuts down normally. Because applets are meant to live on an HTML page, you should not normally leave resources behind after a user leaves the page that contains the applet.

    paint − Invoked immediately after the start() method, and also any time the applet needs to repaint itself in the browser. The paint() method is actually inherited from the java.awt.


Hello world applet (HelloWorldApplet.java)
import java.applet.*;
import java.awt.*;

public class HelloWorldApplet extends Applet {
   public void paint (Graphics g) {
      g.drawString ("Hello World", 25, 50);
   }
}


## Invoking a Java Applet 
An applet may be invoked by embedding directives in an HTML file and viewing the file through an applet viewer or Java-enabled browser.

<html>
   <title>The Hello, World Applet</title>
   <hr>
   <applet code = "HelloWorldApplet.class" width = "320" height = "120">
      If your browser was Java-enabled, a "Hello, World"
      message would appear here.
   </applet>
   <hr>
</html>