CREATE TABLE autores (
    id INTEGER PRIMARY KEY,
    nombre TEXT NOT NULL,
    nacionalidad TEXT NOT NULL
);

CREATE TABLE categorias (
    id INTEGER PRIMARY KEY,
    nombre TEXT NOT NULL,
    descripcion TEXT NOT NULL
);

CREATE TABLE libros (
    id INTEGER PRIMARY KEY,
    titulo TEXT NOT NULL,
    precio REAL NOT NULL,
    genero TEXT NOT NULL,
    autor_id INTEGER NOT NULL,
    categoria_id INTEGER NOT NULL,
    FOREIGN KEY (autor_id) REFERENCES autores(id),
    FOREIGN KEY (categoria_id) REFERENCES categorias(id)
);

INSERT INTO autores (id, nombre, nacionalidad)
VALUES
(1, 'J.K. Rowling', 'Británica'),
(2, 'George Orwell', 'Británica'),
(3, 'Gabriel García Márquez', 'Colombiana');

INSERT INTO categorias (id, nombre, descripcion)
VALUES
(1, 'Fantasía', 'Historias imaginarias y mágicas'),
(2, 'Ciencia ficción', 'Historias relacionadas con ciencia y tecnología'),
(3, 'Novela', 'Narraciones literarias extensas');

INSERT INTO libros
(id, titulo, precio, genero, autor_id, categoria_id)
VALUES
(1, 'Harry Potter y la piedra filosofal', 25.0, 'Fantasía', 1, 1),
(2, '1984', 18.0, 'Ciencia ficción', 2, 2),
(3, 'Cien años de soledad', 22.0, 'Novela', 3, 3);