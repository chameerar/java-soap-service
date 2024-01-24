# Java SOAP Service
 Simple SOAP Service to Echo a message.
 
## Sample Request
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
