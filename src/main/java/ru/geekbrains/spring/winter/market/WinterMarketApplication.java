package ru.geekbrains.spring.winter.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WinterMarketApplication {
	// Домашнее задание выполнено

	// POST http://localhost:8189/winter/ws
	// <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:f="http://www.geekbrains.ru/spring/ws/products">
	//    <soapenv:Header/>
	//    <soapenv:Body>
	//        <f:getAllProductsRequest/>
	//    </soapenv:Body>
	//</soapenv:Envelope>
	//
	//<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
	//    <SOAP-ENV:Header/>
	//    <SOAP-ENV:Body>
	//        <ns2:getAllProductsResponse xmlns:ns2="http://www.geekbrains.ru/spring/ws/products">
	//            <ns2:products>
	//                <ns2:id>1</ns2:id>
	//                <ns2:title>Milk</ns2:title>
	//                <ns2:price>80.0</ns2:price>
	//            </ns2:products>
	//            <ns2:products>
	//                <ns2:id>2</ns2:id>
	//                <ns2:title>Bread</ns2:title>
	//                <ns2:price>25.0</ns2:price>
	//            </ns2:products>
	//            <ns2:products>
	//                <ns2:id>3</ns2:id>
	//                <ns2:title>Cheese</ns2:title>
	//                <ns2:price>300.0</ns2:price>
	//            </ns2:products>
	//        </ns2:getAllProductsResponse>
	//    </SOAP-ENV:Body>
	//</SOAP-ENV:Envelope>


	// POST http://localhost:8189/winter/ws
	// <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:f="http://www.geekbrains.ru/spring/ws/products">
	//    <soapenv:Header/>
	//    <soapenv:Body>
	//        <f:getProductByIdRequest>
	//            <f:id>2</f:id>
	//        </f:getProductByIdRequest>
	//    </soapenv:Body>
	// </soapenv:Envelope>
	//
	//<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
	//    <SOAP-ENV:Header/>
	//    <SOAP-ENV:Body>
	//        <ns2:getProductByIdResponse xmlns:ns2="http://www.geekbrains.ru/spring/ws/products">
	//            <ns2:product>
	//                <ns2:id>2</ns2:id>
	//                <ns2:title>Bread</ns2:title>
	//                <ns2:price>25.0</ns2:price>
	//            </ns2:product>
	//        </ns2:getProductByIdResponse>
	//    </SOAP-ENV:Body>
	//</SOAP-ENV:Envelope>


	public static void main(String[] args) {
		SpringApplication.run(WinterMarketApplication.class, args);
	}
}
