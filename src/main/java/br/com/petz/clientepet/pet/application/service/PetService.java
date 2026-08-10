package br.com.petz.clientepet.pet.application.service;

import br.com.petz.clientepet.pet.application.api.*;

import java.util.List;
import java.util.UUID;

public interface PetService {
    PetResponse criaPet(UUID idCliente, PetResquest petResquest);
    List<PetClienteListResponse> buscaPetDoClienteComId(UUID idCliente);
    PetClienteDetalheResponse buscaPetDoClienteComId(UUID idCliente, UUID idPet);
    void deletaPetDoClienteComId(UUID idCliente, UUID idPet);
    void alteraPetDoClienteComId(UUID idCliente, UUID idPet, PetAlteracaoResquest petAlteracaoResquest);
}
