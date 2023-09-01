package tech.ada.bootcamp.arquitetura.cartaoservice.services.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tech.ada.bootcamp.arquitetura.cartaoservice.entities.Cartao;
import tech.ada.bootcamp.arquitetura.cartaoservice.entities.Usuario;
import tech.ada.bootcamp.arquitetura.cartaoservice.payloads.request.CadastroUsuarioRequest;
import tech.ada.bootcamp.arquitetura.cartaoservice.payloads.response.CadastroUsuarioResponse;
import tech.ada.bootcamp.arquitetura.cartaoservice.repositories.CartaoRepository;
import tech.ada.bootcamp.arquitetura.cartaoservice.repositories.UsuarioRepository;
import tech.ada.bootcamp.arquitetura.cartaoservice.services.CriarUsuarioService;

@Service
@RequiredArgsConstructor
public class CriarUsuarioImpl implements CriarUsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Override
    public Usuario criarUsuario(CadastroUsuarioRequest cadastroUsuarioRequest) {
        Usuario usuario =  new Usuario();
        usuario.setNome(cadastroUsuarioRequest.getNome());
        usuario.setIdentificador(cadastroUsuarioRequest.getIdentificador());

        Usuario usuarioGravado = usuarioRepository.save(usuario);

        return usuarioGravado;
    }

    @Override
    public CadastroUsuarioResponse gerarNovoUsuarioResponse(Cartao cartao) {
        CadastroUsuarioResponse usuarioResponse = new CadastroUsuarioResponse();

        usuarioResponse.setNumeroCartao(cartao.getNumeroCartao());
        usuarioResponse.setTipoCartao(cartao.getTipoCartao());
        usuarioResponse.setNomeTitularCartao(cartao.getNomeTitular());
        usuarioResponse.setNomeTitularConta(cartao.getNomeTitular());

        return usuarioResponse;
    }
}
