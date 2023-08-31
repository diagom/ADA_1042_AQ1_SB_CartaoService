package tech.ada.bootcamp.arquitetura.cartaoservice.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.ada.bootcamp.arquitetura.cartaoservice.payloads.request.CompraRequest;
import tech.ada.bootcamp.arquitetura.cartaoservice.payloads.response.CompraResponse;

@Tag(name = "Realizar compra", description = "realizar compra a partir de cartão")
@RestController
@RequestMapping("/compra")
@Slf4j
public class RealizarCompraController {

    @PostMapping(path = "", produces = "application/json" )
    public CompraResponse realizarCompra(@RequestBody CompraRequest compraRequest){
        return new CompraResponse();
    }
}
