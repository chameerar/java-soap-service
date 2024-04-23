package io.github.chameerar;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.xml.ws.Endpoint;

@WebService
public class EchoService {
    @WebMethod
    public String echo(@WebParam(name = "message") String message) {
        return message;
    }

    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:8080/echoservice", new EchoService());
        System.out.println("Service published at http://localhost:8080/echoservice");
    }
}