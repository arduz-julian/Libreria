package com.example.libreria.model

data class Categoria(
    val id: Int,
    val nombre: String,
    val descripcion: String
) {

    fun mostrarInfo(): String {
        return "$nombre - $descripcion"
    }

    override fun toString(): String {
        return mostrarInfo()
    }
}