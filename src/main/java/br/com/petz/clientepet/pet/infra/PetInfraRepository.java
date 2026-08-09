package br.com.petz.clientepet.pet.infra;

import br.com.petz.clientepet.handler.APIException;
import br.com.petz.clientepet.pet.application.service.PetRepository;
import br.com.petz.clientepet.pet.domain.Pet;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PetInfraRepository implements PetRepository {
    private final PetStringDataJPARepository petStringDataJPARepository;
    @Override
    public Pet salvaPet(Pet pet) {
        log.info("[inicia]PetInfraRepository - salvaPet");
        petStringDataJPARepository.save(pet);
        log.info("[finaliza]PetInfraRepository - salvaPet");
        return pet;
    }

    @Override
    public List<Pet> buscaPetDoClienteComId(UUID idCliente) {
        log.info("[inicia]PetInfraRepository - buscaPetDoClienteComId");
        var pets = petStringDataJPARepository.findByIdClienteTutor(idCliente);
        log.info("[finaliza]PetInfraRepository - buscaPetDoClienteComId");
        return pets;
    }

    @Override
    public Pet buscaPet(UUID idPet) {
        log.info("[inicia]PetInfraRepository - buscaPet");
        var pet = petStringDataJPARepository.findById(idPet)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND,"Pet não encontrado para o IdPet =" + idPet));
        log.info("[finaliza]PetInfraRepository - buscaPet");
        return pet;
    }
}
