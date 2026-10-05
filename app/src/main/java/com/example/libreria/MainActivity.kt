package com.example.libreria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.libreria.data.Datos
import com.example.libreria.ui.theme.LibreriaTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            LibreriaTheme {

                var pantallaActual by remember {
                    mutableStateOf("libros")
                }

                when (pantallaActual) {

                    "libros" -> {

                        LibroScreen(
                            libros = Datos.libros,
                            irAutores = {
                                pantallaActual = "autores"
                            }
                        )
                    }

                    "autores" -> {

                        AutorScreen(
                            autores = Datos.autores,
                            irLibros = {
                                pantallaActual = "libros"
                            }
                        )
                    }
                }
            }
        }
    }
}