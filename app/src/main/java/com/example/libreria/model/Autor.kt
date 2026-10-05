package com.example.libreria.model

data class Autor(
    val id: Int,
    val nombre: String,
    val nacionalidad: String
) {

    fun mostrarInfo(): String {
        return "$nombre - $nacionalidad"
    }

    override fun toString(): String {
        return mostrarInfo()
    }
}