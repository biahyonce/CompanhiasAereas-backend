package br.ufu.facom.bianca.CompanhiaArea.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Manutencao (
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long

        // Mecanico
        // Aeronave
) {
    // var manuntencoes
}