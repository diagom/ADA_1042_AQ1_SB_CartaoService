package tech.ada.bootcamp.arquitetura.cartaoservice.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import tech.ada.bootcamp.arquitetura.cartaoservice.payloads.request.CadastroUsuarioRequest;
import tech.ada.bootcamp.arquitetura.cartaoservice.payloads.response.CadastroUsuarioResponse;
import tech.ada.bootcamp.arquitetura.cartaoservice.services.CriarNovoCartaoService;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/usuario")
@Tag(name = "Usuario", description = "Adicionar usuario e seus dependentes")
public class UsuarioController {

    private final CriarNovoCartaoService criarNovoCartaoService;

    @PostMapping(path = "", produces = "application/json" )
    @CrossOrigin(origins = "/*")
    public CadastroUsuarioResponse cadastrarUsuario(@RequestBody CadastroUsuarioRequest cadastroUsuarioRequest){
        return  criarNovoCartaoService.execute(cadastroUsuarioRequest);
    }

    @PostMapping(path = "/dependente/{idUsuario}", produces = "application/json" )
    public CadastroUsuarioResponse adicionarDependente(@RequestBody CadastroUsuarioRequest cadastroUsuarioRequest, @PathVariable("idUsuario") String idUsuario){
        return  criarNovoCartaoService.execute(cadastroUsuarioRequest);
    }

}
