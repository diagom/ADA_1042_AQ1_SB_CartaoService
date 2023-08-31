package tech.ada.bootcamp.arquitetura.cartaoservice.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import tech.ada.bootcamp.arquitetura.cartaoservice.payloads.request.CadastroUsuarioRequest;
import tech.ada.bootcamp.arquitetura.cartaoservice.payloads.response.CadastroUsuarioResponse;
import tech.ada.bootcamp.arquitetura.cartaoservice.payloads.response.FaturaResponse;

@RestController
@Tag(name = "fatura", description = "Gerar fatura")
@RequestMapping("/fatura")
@Slf4j
public class VerFaturaController {

    @GetMapping(path = "/{numeroCartao}/{mes}/{ano}", produces = "application/json" )
    public FaturaResponse adicionarDependente(@PathVariable("numeroCartao") String numeroCartao
            , @PathVariable("mes") Integer mes, @PathVariable("ano") Integer ano){
        return new FaturaResponse();
    }

}
