package tech.ada.bootcamp.arquitetura.cartaoservice.services;

import tech.ada.bootcamp.arquitetura.cartaoservice.entities.Endereco;
import tech.ada.bootcamp.arquitetura.cartaoservice.entities.Usuario;
import tech.ada.bootcamp.arquitetura.cartaoservice.payloads.request.EnderecoRequest;

public interface EnderecoService {
    Endereco criarEndereco(EnderecoRequest enderecoRequest, Usuario usuario);
}
