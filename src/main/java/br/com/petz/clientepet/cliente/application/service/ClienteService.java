package br.com.petz.clientepet.cliente.application.service;

import br.com.petz.clientepet.cliente.application.api.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.UUID;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteResquest clienteResquest);
    List<ClienteListResponse> buscaTodosOsClientes();
    ClienteDetalhadoResponse buscaClienteAtravesDoId(UUID idCliente);
    void deletaClienteAtravesDoId(UUID idCliente);
    void patchAlteraCliente(UUID idCliente,ClienteAlteracaoResquest clienteAlteracaoResquest);
}
