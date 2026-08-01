package br.com.petz.clientepet.cliente.application.api;

import br.com.petz.clientepet.cliente.domain.Cliente;
import br.com.petz.clientepet.cliente.domain.Sexo;
import lombok.Value;
import org.jetbrains.annotations.Contract;

import java.time.LocalDate;
import java.util.UUID;

@Value
public class ClienteDetalhadoResponse {
    private UUID idCliente;
    private String nomeCompleto;
    private  String cpf;
    private  String celular;
    private Sexo sexo;
    private String email;
    private  Boolean aceitaTermos;
    private LocalDate dataHoraDoCadastro;

    public ClienteDetalhadoResponse(Cliente cliente) {
        this.idCliente = cliente.getIdCliente();
        this.nomeCompleto = cliente.getNomeCompleto();
        this.cpf = cliente.getCpf();
        this.celular = cliente.getCelular();
        this.sexo = cliente.getSexo();
        this.email = cliente.getEmail();
        this.aceitaTermos = cliente.getAceitaTermos();
        this.dataHoraDoCadastro = cliente.getDataNascimento();

    }
}
