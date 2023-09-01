package tech.ada.bootcamp.arquitetura.cartaoservice.payloads.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class EnderecoRequest {
    private @NotNull String cep;
    private @NotNull String rua;
    private @NotNull String bairro;
    private @NotNull String cidade;
    private @NotNull String estado;
    private @NotNull String numero;
    private String complemento;
}
