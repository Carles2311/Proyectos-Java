from sqlalchemy import Table, Column, ForeignKey
from sqlalchemy.sql.sqltypes import Integer, String, Boolean
from sqlalchemy.orm import relationship
from config.db import meta, engine

categorias = Table("categorias", meta,
    Column("id", Integer, primary_key=True),
    Column("nombre", String(255))
)

movies = Table("movies", meta, 
              Column ("id", Integer, primary_key=True), 
              Column("titulo", String(255)),
              Column("año", String(255)), 
              Column("director", String(255)), 
              Column("imagen", String(255)),
              Column("idiomas", String(255)),
              Column("descripcion", String(255)),
              Column("valoracion", Integer),
              Column("pegi", Boolean),
              Column("categoria", Integer, ForeignKey('categorias.id')),
              Column("duracion", Integer),
              Column("enCartelera", Boolean),)


meta.create_all(engine)