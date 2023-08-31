package tech.ada.bootcamp.arquitetura.cartaoservice.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import tech.ada.bootcamp.arquitetura.cartaoservice.payloads.request.CadastroUsuarioRequest;
import tech.ada.bootcamp.arquitetura.cartaoservice.payloads.response.CadastroUsuarioResponse;

@Tag(name = "Usuario", description = "Adicionar usuario e seus dependentes")
@RestController
@RequestMapping("/usuario")
@Slf4j
public class UsuarioController {

    @PostMapping(path = "", produces = "application/json" )
    @CrossOrigin(origins = "/*")
    public CadastroUsuarioResponse cadastrarUsuario(@RequestBody CadastroUsuarioRequest cadastroUsuarioRequest){
        return new CadastroUsuarioResponse();
    }

    @PostMapping(path = "/dependente/{idUsuario}", produces = "application/json" )
    public CadastroUsuarioResponse adicionarDependente(@RequestBody CadastroUsuarioRequest cadastroUsuarioRequest, @PathVariable("idUsuario") String idUsuario){
        return new CadastroUsuarioResponse();
    }

}
