package com.example.libreria.model

class Libreria {

    private val libros = mutableListOf<Libro>()
    private val autores = mutableListOf<Autor>()
    private val categorias = mutableListOf<Categoria>()

    fun agregarLibro(libro: Libro) {
        libros.add(libro)
    }

    fun agregarAutor(autor: Autor) {
        autores.add(autor)
    }

    fun agregarCategoria(categoria: Categoria) {
        categorias.add(categoria)
    }

    fun obtenerLibros(): List<Libro> {
        return libros
    }

    fun obtenerAutores(): List<Autor> {
        return autores
    }

    fun obtenerCategorias(): List<Categoria> {
        return categorias
    }
}