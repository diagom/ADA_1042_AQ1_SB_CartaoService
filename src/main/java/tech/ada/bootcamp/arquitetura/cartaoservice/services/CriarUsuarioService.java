package tech.ada.bootcamp.arquitetura.cartaoservice.services;

import tech.ada.bootcamp.arquitetura.cartaoservice.entities.Cartao;
import tech.ada.bootcamp.arquitetura.cartaoservice.entities.Usuario;
import tech.ada.bootcamp.arquitetura.cartaoservice.payloads.request.CadastroUsuarioRequest;
import tech.ada.bootcamp.arquitetura.cartaoservice.payloads.response.CadastroUsuarioResponse;

public interface CriarUsuarioService {

    Usuario criarUsuario(CadastroUsuarioRequest cadastroUsuarioRequest);

    CadastroUsuarioResponse gerarNovoUsuarioResponse(Cartao cartao);

}
