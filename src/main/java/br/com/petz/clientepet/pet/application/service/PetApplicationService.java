package br.com.petz.clientepet.pet.application.service;

import br.com.petz.clientepet.cliente.application.service.ClienteService;
import br.com.petz.clientepet.pet.application.api.PetResponse;
import br.com.petz.clientepet.pet.application.api.PetResquest;
import br.com.petz.clientepet.pet.domain.Pet;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
@Log4j2
@RequiredArgsConstructor
public class PetApplicationService implements PetService {
    private  final ClienteService clienteService;
    private  final PetRepository petRepository;
    @Override
    public PetResponse criaPet(UUID idCliente, PetResquest petResquest) {
        log.info("[inicia]PetApplicationService - criaPet");
        clienteService.buscaClienteAtravesDoId(idCliente);
        Pet pet = petRepository.salvaPet(new Pet(idCliente, petResquest));
        log.info("[finaliza]PetApplicationService - criaPet");
        return new PetResponse(pet.getIdPet());
    }
}
