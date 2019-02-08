package br.ufu.facom.bianca.CompanhiaArea.domain

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Mecanico (
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,

        var nome: String,
        var cpf: String,
        var salario: Number
) {
    // Relatorios de manuntencao feitos por esse mecanico
}