from sqlalchemy import Table, Column, ForeignKey
from sqlalchemy.sql.sqltypes import Integer, String, Boolean
from sqlalchemy.orm import relationship
from config.db import meta, engine


series = Table("series", meta, 
              Column ("id", Integer, primary_key=True), 
              Column("titulo", String(255)),
              Column("año", String(255)), 
              Column("temporadas", Integer), 
              Column("imagen", String(255)),
              Column("idiomas", String(255)),
              Column("descripcion", String(255)),
              Column("valoracion", Integer),
              Column("pegi", Boolean),
              Column("categoria", Integer, ForeignKey('categorias.id')),
              Column("duracion", Integer),
              Column("enEmision", Boolean),
              Column("capitulos", Integer))


meta.create_all(engine)