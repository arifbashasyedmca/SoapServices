/**
 * 
 */
package com.sab;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author Arif.Syed
 *
 */

@WebService(targetNamespace = "http://sab.com/")
public interface CalculatorService {
    @WebMethod
    int add(@WebParam(name = "a") int a, @WebParam(name = "b") int b);
    
    @WebMethod
    int subtract(@WebParam(name = "a") int a, @WebParam(name = "b") int b);
    
    @WebMethod
    int multiply(@WebParam(name = "a") int a, @WebParam(name = "b") int b);    
    
    @WebMethod
    int divide(@WebParam(name = "a") int a, @WebParam(name = "b") int b);     
}
