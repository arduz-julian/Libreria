package com.example.libreria

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.libreria.model.Libro
import androidx.compose.material3.ExperimentalMaterial3Api

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun LibroScreen(
    libros: List<Libro>,
    irAutores: () -> Unit
) {

    Scaffold(

        topBar = {
            TopAppBar(
                title = {
                    Text("📚 Mi Librería")
                }
            )
        },

        bottomBar = {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),

                horizontalArrangement = Arrangement.SpaceEvenly
            ) {

                TextButton(
                    onClick = { }
                ) {
                    Text("📚 Libros")
                }

                TextButton(
                    onClick = irAutores
                ) {
                    Text("👤 Autores")
                }
            }
        }

    ) { paddingValues ->

        LazyColumn(

            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),

            verticalArrangement = Arrangement.spacedBy(12.dp)

        ) {

            item {

                Text(
                    text = "Libros disponibles",
                    style = MaterialTheme.typography.headlineSmall,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
            }

            items(libros) { libro ->

                Card(
                    modifier = Modifier.fillMaxWidth()
                ) {

                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {

                        Text(
                            text = "📖 ${libro.titulo}",
                            style = MaterialTheme.typography.titleLarge
                        )

                        Text(
                            text = "Autor: ${libro.autor.nombre}"
                        )

                        Text(
                            text = "Género: ${libro.genero}"
                        )

                        Text(
                            text = "Categoría: ${libro.categoria.nombre}"
                        )

                        Text(
                            text = "Precio: Bs. ${libro.precio}",
                            style = MaterialTheme.typography.titleMedium
                        )
                    }
                }
            }
        }
    }
}