package br.com.petz.clientepet.cliente.application.service;

import br.com.petz.clientepet.cliente.application.api.ClienteDetalhadoResponse;
import br.com.petz.clientepet.cliente.application.api.ClienteListResponse;
import br.com.petz.clientepet.cliente.application.api.ClienteResponse;
import br.com.petz.clientepet.cliente.application.api.ClienteResquest;

import java.util.List;
import java.util.UUID;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteResquest clienteResquest);
    List<ClienteListResponse> buscaTodosOsClientes();
    ClienteDetalhadoResponse buscaClienteAtravesDoId(UUID idCliente);
    void deletaClienteAtravesDoId(UUID idCliente);
}
