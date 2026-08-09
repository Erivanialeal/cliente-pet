package br.com.petz.clientepet.pet.application.api;

import br.com.petz.clientepet.pet.domain.Pet;
import br.com.petz.clientepet.pet.domain.Porte;
import br.com.petz.clientepet.pet.domain.SexoPet;
import br.com.petz.clientepet.pet.domain.TipoPet;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class PetClienteDetalheResponse {
    private UUID idPet;
    private String nomePet;
    private Porte porte;
    private TipoPet tipoPet;
    private String microchip;
    private String raca;
    private SexoPet sexo;
    private String pelagemCor;
    private LocalDate dataNascimento;
    private String rga;
    private Integer peso;

    public PetClienteDetalheResponse(Pet pet) {

        this.idPet = pet.getIdPet();
        this.nomePet = pet.getNomePet();
        this.porte = pet.getPorte();
        this.tipoPet = pet.getTipoPet();
        this.microchip = pet.getMicrochip();
        this.raca = pet.getRaca();
        this.sexo = pet.getSexo();
        this.pelagemCor = pet.getPelagemCor();
        this.dataNascimento = pet.getDataNascimento();
        this.rga = pet.getRga();
        this.peso = pet.getPeso();
    }
}
