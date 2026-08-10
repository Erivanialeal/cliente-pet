package br.com.petz.clientepet.pet.domain;


import br.com.petz.clientepet.pet.application.api.PetAlteracaoResquest;
import br.com.petz.clientepet.pet.application.api.PetResquest;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idPet",updatable = false, unique = true,nullable = false)
    private UUID idPet;
    @NotNull
    @Column(columnDefinition = "uuid", name = "idClienteTutor",nullable = false)
    private UUID idClienteTutor;
    @NotBlank
    private String nomePet;
    @Enumerated(EnumType.STRING)
    private Porte porte;
    @Enumerated(EnumType.STRING)
    @NotNull
    private TipoPet tipoPet;
    private String microchip;
    @NotBlank
    private String raca;
    @Enumerated(EnumType.STRING)
    @NotNull
    private SexoPet sexo;
    private String pelagemCor;
    @NotNull
    private LocalDate dataNascimento;
    private String rga;
    private Integer peso;

    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaUltimaAlteracao;

    public Pet(UUID idCliente, @Valid PetResquest petResquest) {
        this.idClienteTutor = idCliente;
        this.nomePet = petResquest.getNomePet();
        this.porte = petResquest.getPorte();
        this.tipoPet = petResquest.getTipo();
        this.microchip = petResquest.getMicrochip();
        this.raca = petResquest.getRaca();
        this.sexo = petResquest.getSexo();
        this.pelagemCor = petResquest.getPelagemCor();
        this.dataNascimento = petResquest.getDataNascimento();
        this.rga = petResquest.getRga();
        this.peso = petResquest.getPeso();
        this.dataHoraDoCadastro = LocalDateTime.now();

    }

    public void altera(PetAlteracaoResquest petResquest) {
        this.nomePet = petResquest.getNomePet();
        this.porte = petResquest.getPorte();
        this.tipoPet = petResquest.getTipo();
        this.microchip = petResquest.getMicrochip();
        this.raca = petResquest.getRaca();
        this.sexo = petResquest.getSexo();
        this.pelagemCor = petResquest.getPelagemCor();
        this.dataNascimento = petResquest.getDataNascimento();
        this.rga = petResquest.getRga();
        this.peso = petResquest.getPeso();
        this.dataHoraDaUltimaAlteracao = LocalDateTime.now();

    }
}
