CREATE DATABASE IF NOT EXISTS biblioteca;
USE biblioteca;
CREATE TABLE Editorial (
  ID_Editorial int NOT NULL AUTO_INCREMENT,
  Nombre varchar(255) NOT NULL,
  Contacto varchar(255) NOT NULL,
  PRIMARY KEY (ID_Editorial)
);

CREATE TABLE Libro (
  ID_Libro int NOT NULL AUTO_INCREMENT,
  Titulo varchar(255) NOT NULL,
  Autor varchar(255) NOT NULL,
  Tema varchar(255) NOT NULL,
  PRIMARY KEY (ID_Libro)
);

CREATE TABLE Socio (
  ID_Socio int NOT NULL AUTO_INCREMENT,
  Nombre varchar(255) NOT NULL,
  Categoria char(1) NOT NULL CHECK (Categoria IN ('B', 'C', 'D', 'E', 'F')),
  PRIMARY KEY (ID_Socio)
);

CREATE TABLE Ejemplar (
  ID_Ejemplar int NOT NULL AUTO_INCREMENT,
  ID_Libro int NOT NULL,
  ID_Editorial int NOT NULL,
  Categoria char(1) NOT NULL CHECK (Categoria IN ('A', 'B', 'C', 'D', 'E', 'F')),
  Ubicacion varchar(255) DEFAULT NULL,
  PRIMARY KEY (ID_Ejemplar),
  KEY ID_Libro_idx (ID_Libro),
  KEY ID_Editorial_idx (ID_Editorial),
  CONSTRAINT ID_Editorial FOREIGN KEY (ID_Editorial) REFERENCES Editorial (ID_Editorial),
  CONSTRAINT ID_Libro FOREIGN KEY (ID_Libro) REFERENCES Libro (ID_Libro)
);

CREATE TABLE Prestamo (
  ID_Prestamo int NOT NULL AUTO_INCREMENT,
  ID_Ejemplar int NOT NULL,
  ID_Socio int NOT NULL,
  Fecha_prestamo datetime NOT NULL,
  Fecha_Devolucion datetime DEFAULT NULL,
  Estado ENUM('Devuelto', 'Perdido', 'Atrasado') NOT NULL,
  Nota varchar(255) DEFAULT NULL,
  PRIMARY KEY (ID_Prestamo),
  KEY ID_Ejemplar_idx (ID_Ejemplar),
  KEY ID_Socio_idx (ID_Socio),
  CONSTRAINT ID_Ejemplar FOREIGN KEY (ID_Ejemplar) REFERENCES Ejemplar (ID_Ejemplar),
  CONSTRAINT ID_Socio FOREIGN KEY (ID_Socio) REFERENCES Socio (ID_Socio)
);

CREATE TABLE Historial (
  ID_Historial int NOT NULL AUTO_INCREMENT,
  ID_Prestamo int NOT NULL,
  Fecha_Cierre datetime NOT NULL,
  Motivo varchar(10) NOT NULL,
  Nota varchar(255) DEFAULT NULL,
  PRIMARY KEY (ID_Historial),
  KEY ID_Prestamo_idx (ID_Prestamo),
  CONSTRAINT ID_Prestamo FOREIGN KEY (ID_Prestamo) REFERENCES Prestamo (ID_Prestamo)
);
