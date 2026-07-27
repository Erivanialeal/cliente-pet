package br.com.petz.clientepet.cliente.application.service;

import br.com.petz.clientepet.cliente.application.api.ClienteListResponse;
import br.com.petz.clientepet.cliente.application.api.ClienteResponse;
import br.com.petz.clientepet.cliente.application.api.ClienteResquest;

import java.util.List;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteResquest clienteResquest);
    List<ClienteListResponse> buscaTodosOsClientes();
}
