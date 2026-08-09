package br.com.petz.clientepet.pet.application.service;

import br.com.petz.clientepet.pet.application.api.PetClienteDetalheResponse;
import br.com.petz.clientepet.pet.application.api.PetClienteListResponse;
import br.com.petz.clientepet.pet.application.api.PetResponse;
import br.com.petz.clientepet.pet.application.api.PetResquest;

import java.util.List;
import java.util.UUID;

public interface PetService {
    PetResponse criaPet(UUID idCliente, PetResquest petResquest);
    List<PetClienteListResponse> buscaPetDoClienteComId(UUID idCliente);
    PetClienteDetalheResponse buscaPetDoClienteComId(UUID idCliente, UUID idPet);
    void deletaPetDoClienteComId(UUID idCliente, UUID idPet);
}
