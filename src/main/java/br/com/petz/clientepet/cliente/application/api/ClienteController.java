package br.com.petz.clientepet.cliente.application.api;

import br.com.petz.clientepet.cliente.application.service.ClienteService;
import br.com.petz.clientepet.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {
    private final ClienteService clienteService;

    @Override
    public ClienteResponse postCliente(ClienteResquest clienteResquest) {
        log.info("[inicia]ClienteController - postCliente");
        ClienteResponse clienteCriado = clienteService.criaCliente(clienteResquest);
        log.info("[finaliza]ClienteController - postCliente");
        return clienteCriado;
    }

    @Override
    public List<ClienteListResponse> getTodosClientes() {
        log.info("[inicia]ClienteController - getTodosClientes");
        List<ClienteListResponse> clientes = clienteService.buscaTodosOsClientes();
        log.info("[finaliza]ClienteController - getTodosClientes");
        return clientes;
    }

    @Override
    public ClienteDetalhadoResponse getTodosClienteAtravesId(UUID idCliente) {
        log.info("[inicia]ClienteController - getTodosClienteAtravesId");
        log.info("[inicia]{}", idCliente);
        ClienteDetalhadoResponse clienteDetalhado = clienteService.buscaClienteAtravesDoId(idCliente);
        log.info("[finaliza]ClienteController - getTodosClienteAtravesId");
        return clienteDetalhado;
    }

    @Override
    public void deletaTodosClienteAtravesId(UUID idCliente) {
        log.info("[inicia]ClienteController - deletaTodosClienteAtravesId");
        log.info("[inicia]{}", idCliente);
        clienteService.deletaClienteAtravesDoId(idCliente);
        log.info("[finaliza]ClienteController - deletaTodosClienteAtravesId");

    }
}
