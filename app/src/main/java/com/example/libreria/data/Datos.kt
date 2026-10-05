package com.example.libreria.data

import com.example.libreria.model.Autor
import com.example.libreria.model.Categoria
import com.example.libreria.model.Libro

object Datos {

    val autores = listOf(
        Autor(
            id = 1,
            nombre = "J.K. Rowling",
            nacionalidad = "Británica"
        ),

        Autor(
            id = 2,
            nombre = "George Orwell",
            nacionalidad = "Británica"
        ),

        Autor(
            id = 3,
            nombre = "Gabriel García Márquez",
            nacionalidad = "Colombiana"
        )
    )

    val categorias = listOf(
        Categoria(
            id = 1,
            nombre = "Fantasía",
            descripcion = "Historias imaginarias y mágicas"
        ),

        Categoria(
            id = 2,
            nombre = "Ciencia ficción",
            descripcion = "Historias relacionadas con ciencia y tecnología"
        ),

        Categoria(
            id = 3,
            nombre = "Novela",
            descripcion = "Narraciones literarias extensas"
        )
    )

    val libros = listOf(
        Libro(
            id = 1,
            titulo = "Harry Potter y la piedra filosofal",
            precio = 25.0,
            genero = "Fantasía",
            autor = autores[0],
            categoria = categorias[0]
        ),

        Libro(
            id = 2,
            titulo = "1984",
            precio = 18.0,
            genero = "Ciencia ficción",
            autor = autores[1],
            categoria = categorias[1]
        ),

        Libro(
            id = 3,
            titulo = "Cien años de soledad",
            precio = 22.0,
            genero = "Novela",
            autor = autores[2],
            categoria = categorias[2]
        )
    )
}