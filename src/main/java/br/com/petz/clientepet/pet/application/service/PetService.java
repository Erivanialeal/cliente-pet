package br.com.petz.clientepet.pet.application.service;

import br.com.petz.clientepet.pet.application.api.PetResponse;
import br.com.petz.clientepet.pet.application.api.PetResquest;

import java.util.UUID;

public interface PetService {
    PetResponse criaPet(UUID idCliente, PetResquest petResquest);
}
