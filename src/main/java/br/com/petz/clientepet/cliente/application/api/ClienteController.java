package br.com.petz.clientepet.cliente.application.api;

import br.com.petz.clientepet.cliente.domain.Cliente;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class ClienteController implements ClienteApi {
    @Override
    public ClienteResponse postCliente(ClienteResquest clienteResquest) {
        log.info("[inicia]ClienteController - postCliente");
        log.info("[finaliza]ClienteController - postCliente");
        return null;
    }
}
