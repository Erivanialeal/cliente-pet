package br.com.petz.clientepet.cliente.domain;

import br.com.petz.clientepet.cliente.application.api.ClienteAlteracaoResquest;
import br.com.petz.clientepet.cliente.application.api.ClienteResquest;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idCliente",updatable = false, unique = true,nullable = false)
    private UUID idCliente;
    @NotBlank
    private String nomeCompleto;
    @NotBlank
    @Email
    @Column(unique = true)
    private String email;
    @NotBlank
    private String celular;
    private String telefone;
    private Sexo sexo;
    @NotNull
    private LocalDate dataNascimento;
    @CPF
    @Column(unique = true)
    private String cpf;
    @NotNull
    private Boolean aceitaTermos;

    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaUltimaAlteracao;

    public Cliente(ClienteResquest clienteResquest) {
        this.nomeCompleto = clienteResquest.getNomeCompleto();
        this.email = clienteResquest.getEmail();
        this.celular = clienteResquest.getCelular();
        this.telefone = clienteResquest.getTelefone();
        this.sexo = clienteResquest.getSexo();
        this.dataNascimento = clienteResquest.getDataNascimento();
        this.cpf = clienteResquest.getCpf();
        this.aceitaTermos = clienteResquest.getAceitaTermos();
        this.dataHoraDoCadastro = LocalDateTime.now();

    }

    public void altera(ClienteAlteracaoResquest clienteResquest) {
        this.nomeCompleto = clienteResquest.getNomeCompleto();
        this.celular = clienteResquest.getCelular();
        this.telefone = clienteResquest.getTelefone();
        this.sexo = clienteResquest.getSexo();
        this.dataNascimento = clienteResquest.getDataNascimento();
        this.aceitaTermos = clienteResquest.getAceitaTermos();
        this.dataHoraDaUltimaAlteracao = LocalDateTime.now();
    }
}
