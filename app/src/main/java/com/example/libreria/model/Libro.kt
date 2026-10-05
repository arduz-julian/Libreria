package com.example.libreria.model

data class Libro(
    val id: Int,
    val titulo: String,
    val precio: Double,
    val genero: String,
    val autor: Autor,
    val categoria: Categoria
) {

    fun mostrarInfo(): String {
        return "$titulo - ${autor.nombre} - $genero - $precio Bs."
    }

    override fun toString(): String {
        return mostrarInfo()
    }
}