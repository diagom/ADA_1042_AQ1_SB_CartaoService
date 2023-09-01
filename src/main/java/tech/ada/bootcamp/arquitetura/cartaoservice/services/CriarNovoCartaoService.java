package tech.ada.bootcamp.arquitetura.cartaoservice.services;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import tech.ada.bootcamp.arquitetura.cartaoservice.entities.Cartao;
import tech.ada.bootcamp.arquitetura.cartaoservice.entities.Usuario;
import tech.ada.bootcamp.arquitetura.cartaoservice.payloads.request.CadastroUsuarioRequest;
import tech.ada.bootcamp.arquitetura.cartaoservice.payloads.response.CadastroUsuarioResponse;
import tech.ada.bootcamp.arquitetura.cartaoservice.repositories.CartaoRepository;
import tech.ada.bootcamp.arquitetura.cartaoservice.services.Impl.CriarUsuarioImpl;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;
import java.util.stream.IntStream;

@Service
@RequiredArgsConstructor
public class CriarNovoCartaoService {
    private static Random random;
    private final CartaoRepository cartaoRepository;
    private final CriarUsuarioService criarUsuarioService;
    private final EnderecoService enderecoService;

    public CadastroUsuarioResponse execute(CadastroUsuarioRequest cadastroUsuarioRequest){
        Usuario usuarioGravado = criarUsuarioService.criarUsuario(cadastroUsuarioRequest);
        enderecoService.criarEndereco(cadastroUsuarioRequest.getEnderecoRequest(), usuarioGravado);

        return criarCartao(cadastroUsuarioRequest, usuarioGravado);
    }

    private CadastroUsuarioResponse criarCartao(CadastroUsuarioRequest cadastroUsuarioRequest,Usuario usuario ){
        LocalDate dataAtual = LocalDate.now();
        Cartao cartao = new Cartao();

        cartao.setUsuario(usuario);
        cartao.setNomeTitular(cadastroUsuarioRequest.getNome());
        cartao.setTipoCartao(cadastroUsuarioRequest.getTipoCartao());
        cartao.setIdContaBanco(UUID.randomUUID().toString());
        cartao.setVencimentoCartao(dataAtual.plusYears(5));
        cartao.setCodigoSeguranca(gerarNumeroAleatorio(3));
        cartao.setNumeroCartao(gerarNumeroAleatorio(12));

        Cartao cartaoSalvo = cartaoRepository.save(cartao);

        return criarUsuarioService.gerarNovoUsuarioResponse(cartaoSalvo);
    }


    private String gerarNumeroAleatorio(int length) {

        final int tamanho = length<=0?1:length;
        IntStream stream =  getRandom().ints(tamanho,0,9);
        StringBuilder builder = new StringBuilder();
        stream.forEachOrdered(builder::append);
        return builder.toString();
    }

    private static Random getRandom(){
        if(Objects.isNull(random)){
            random = new Random();
        }
        return random;
    }
}
