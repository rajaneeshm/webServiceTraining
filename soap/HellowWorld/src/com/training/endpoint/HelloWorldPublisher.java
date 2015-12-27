package com.training.endpoint;
 
import javax.xml.ws.Endpoint;
import com.training.ws.HelloWorldImpl;
 
//Endpoint publisher
public class HelloWorldPublisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:8080/HelloWorld/hello", new HelloWorldImpl());
    }
 
}