package com.sab;

import javax.jws.HandlerChain;
import javax.jws.WebService;

@WebService(endpointInterface = "com.sab.CalculatorService", targetNamespace = "http://sab.com/")
@HandlerChain(file = "handler-chain.xml")
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int add(int a, int b) {
        System.out.println("Received parameters: a=" + a + ", b=" + b);
        return a + b;
    }

	@Override
	public int subtract(int a, int b) {
		System.out.println("Received parameters: a=" + a + ", b=" + b);
		return a-b;
	}

	@Override
	public int multiply(int a, int b) {
		 System.out.println("Received parameters: a=" + a + ", b=" + b);
		return a * b;
	}

	@Override
	public int divide(int a, int b) {
		System.out.println("Received parameters: a=" + a + ", b=" + b);
		return a/b;
	}
}

