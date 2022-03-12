package ru.geekbrains.spring.winter.market.endpoints;

import lombok.RequiredArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import ru.geekbrains.spring.winter.market.services.ProductSoapService;
import ru.geekbrains.spring.winter.market.soap.GetAllProductsRequest;
import ru.geekbrains.spring.winter.market.soap.GetAllProductsResponse;
import ru.geekbrains.spring.winter.market.soap.GetProductByIdRequest;
import ru.geekbrains.spring.winter.market.soap.GetProductByIdResponse;

@Endpoint
@RequiredArgsConstructor
public class ProductSoapEndpoints {
    private static final String NAMESPACE_URI = "http://www.geekbrains.ru/spring/ws/products";
    private final ProductSoapService productSoapService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllProductsRequest")
    @ResponsePayload
    public GetAllProductsResponse getAllProducts(@RequestPayload GetAllProductsRequest request) {
        GetAllProductsResponse response = new GetAllProductsResponse();

        productSoapService.getAllProducts().forEach(response.getProducts()::add);

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getProductByIdRequest")
    @ResponsePayload
    public GetProductByIdResponse getProductByTitle(@RequestPayload GetProductByIdRequest request) {
        GetProductByIdResponse response = new GetProductByIdResponse();

        response.setProduct(productSoapService.getProductById(request.getId()));

        return response;
    }
}
