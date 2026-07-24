package br.com.petz.clientepet.cliente.application.api;

import br.com.petz.clientepet.cliente.application.service.ClienteService;
import br.com.petz.clientepet.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteApi {
    private final ClienteService clienteService;

    @Override
    public ClienteResponse postCliente(ClienteResquest clienteResquest) {
        log.info("[inicia]ClienteController - postCliente");
        ClienteResponse clienteCriado = clienteService.criaCliente(clienteResquest);
        log.info("[finaliza]ClienteController - postCliente");
        return clienteCriado;
    }
}
