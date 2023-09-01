package tech.ada.bootcamp.arquitetura.cartaoservice.services.Impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import tech.ada.bootcamp.arquitetura.cartaoservice.entities.Endereco;
import tech.ada.bootcamp.arquitetura.cartaoservice.entities.Usuario;
import tech.ada.bootcamp.arquitetura.cartaoservice.payloads.request.EnderecoRequest;
import tech.ada.bootcamp.arquitetura.cartaoservice.repositories.EnderecoRepository;
import tech.ada.bootcamp.arquitetura.cartaoservice.services.EnderecoService;

import java.util.UUID;
@Service
@RequiredArgsConstructor
public class EnderecoImpl implements EnderecoService {

    private final ModelMapper modelMapper;
    private final EnderecoRepository enderecoRepository;

    @Override
    public Endereco criarEndereco(EnderecoRequest enderecoRequest, Usuario usuario) {
        Endereco endereco = modelMapper.map(enderecoRequest, Endereco.class);
        endereco.setUsuario(usuario);

        return enderecoRepository.save(endereco);
    }
}
