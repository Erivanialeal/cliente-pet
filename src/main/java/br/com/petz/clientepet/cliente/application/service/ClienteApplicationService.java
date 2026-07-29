package br.com.petz.clientepet.cliente.application.service;

import br.com.petz.clientepet.cliente.application.api.ClienteDetalhadoResponse;
import br.com.petz.clientepet.cliente.application.api.ClienteListResponse;
import br.com.petz.clientepet.cliente.application.api.ClienteResponse;
import br.com.petz.clientepet.cliente.application.api.ClienteResquest;
import br.com.petz.clientepet.cliente.application.repository.ClienteRepository;
import br.com.petz.clientepet.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {

    private final ClienteRepository clienteRepository;

    @Override
    public ClienteResponse criaCliente(ClienteResquest clienteResquest) {
        log.info("[inicia]ClienteApplicationService - criaCliente");
        Cliente cliente =clienteRepository.salva(new Cliente(clienteResquest));
        log.info("[finaliza]ClienteApplicationService - criaCliente");
        return ClienteResponse.builder().idCliente(cliente.getIdCliente()).build();
    }

    @Override
    public List<ClienteListResponse> buscaTodosOsClientes() {
        log.info("[inicia]ClienteApplicationService - buscaTodosOsClientes");
        List<Cliente> clientes = clienteRepository.buscarTodosClientes();
        log.info("[finaliza]ClienteApplicationService - buscaTodosOsClientes");
        return ClienteListResponse.converte(clientes);
    }

    @Override
    public ClienteDetalhadoResponse buscaClienteAtravesDoId(UUID idCliente) {
        log.info("[inicia]ClienteApplicationService - buscaClienteAtravesDoId");
        log.info("[inicia]ClienteApplicationService - buscaClienteAtravesDoId");
        return null;
    }
}
