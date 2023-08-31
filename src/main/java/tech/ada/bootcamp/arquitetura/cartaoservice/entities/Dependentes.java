package tech.ada.bootcamp.arquitetura.cartaoservice.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.ada.bootcamp.arquitetura.cartaoservice.payloads.request.CadastroUsuarioRequest;

@Data
@Entity
@Table(name = "usuario")
@NoArgsConstructor
public class Dependentes {
    @Id
    private String identificador;
    private String nome;
}
