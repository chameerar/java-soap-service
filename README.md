# Java SOAP Service
 Simple SOAP Service to Echo a message.

## How to build
```bash
mvn clean package
```

## How to run
```bash
java -jar target/java-soap-service-1.0-SNAPSHOT.jar
```

## Testing

WSDL URL: http://localhost:8080/echoservice?wsdl

Import the WSDL to SOAP UI and test the service using the sample request.
### Sample Request
```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:cham="http://chameerar.github.io/">
   <soapenv:Header/>
   <soapenv:Body>
      <cham:echo>
         <message>Hello</message>
      </cham:echo>
   </soapenv:Body>
</soapenv:Envelope>
```
