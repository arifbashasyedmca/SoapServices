/**
 * 
 */
package com.sab;

import javax.xml.ws.Endpoint;

/**
 * @author Arif.Syed
 *
 */
public class CalculatorServicePublisher {
	
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/ws/calculator", new CalculatorServiceImpl());
        System.out.println("Service is published at http://localhost:8080/ws/calculator?wsdl");
    }
    
}
