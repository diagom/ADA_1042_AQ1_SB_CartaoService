package tech.ada.bootcamp.arquitetura.cartaoservice.payloads.request;

import lombok.Data;

@Data
public class EnderecoRequest {
    private String cep;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String complemento;
    private String numero;

}
