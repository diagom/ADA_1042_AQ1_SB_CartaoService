package tech.ada.bootcamp.arquitetura.cartaoservice.payloads.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;
import tech.ada.bootcamp.arquitetura.cartaoservice.payloads.TipoCartao;

import java.time.LocalDate;
import java.util.List;

@Data
public class CadastroUsuarioRequest {

    private @NotNull @CPF String identificador;
    private @NotNull String nome;
    private @NotNull EnderecoRequest enderecoRequest;
    private @NotNull TipoCartao tipoCartao;
    private List<String> dependentes;
}
