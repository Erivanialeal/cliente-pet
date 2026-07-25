package br.com.petz.clientepet.cliente.application.service;

import br.com.petz.clientepet.cliente.application.api.ClienteResponse;
import br.com.petz.clientepet.cliente.application.api.ClienteResquest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ClienteApplicationService implements ClienteService {

    @Override
    public ClienteResponse criaCliente(ClienteResquest clienteResquest) {
        log.info("[inicia]ClienteApplicationService - criaCliente");
        Cliente cliente =clienteRepository.salva(new Cliente(clienteResquest));
        log.info("[finaliza]ClienteApplicationService - criaCliente");
        return null;
    }
}
