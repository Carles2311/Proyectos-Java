from fastapi import APIRouter
from config.db import conn
from models.movies import movies
from models.movies import categorias
from schemas.movies import Movies
from sqlalchemy import select
from sqlalchemy.orm import aliased
movie = APIRouter()

@movie.get("/movies")
def get_movie():
    categorias_alias = aliased(categorias)
    query = select(
        movies.c.id, 
        movies.c.titulo, 
        movies.c.año, 
        movies.c.director,
        movies.c.imagen,
        movies.c.idiomas,
        movies.c.descripcion,
        movies.c.valoracion,
        movies.c.pegi, 
        categorias_alias.c.nombre.label('categoria') ,
        movies.c.duracion,
        movies.c.enCartelera
    ).select_from(
        movies
    ).join(
        categorias_alias, movies.c.categoria == categorias_alias.c.id
    )
    result = conn.execute(query).fetchall()
    columns = [column[0] for column in conn.execute(query).cursor.description]
    return [dict(zip(columns, row)) for row in result]

@movie.post("/movies")
def create_movie(movie :Movies):
    print(movie)
    new_content = {"id": movie.id, "titulo" : movie.titulo, "año": movie.año, "director":movie.director, "imagen": movie.imagen,"idiomas": movie.idiomas, "descripcion": movie.descripcion,"valoracion":movie.valoracion, "pegi": movie.pegi,"categoria": movie.categoria, "duracion": movie.duracion, "enCartelera": movie.enCartelera}
    result = conn.execute(movies.insert().values(new_content))
    conn.commit()
    print(result)
    return "you made it"

@movie.get("/movies/{id}")
def get_movie(id: str):
    content_id = int(id)  
    print(content_id)
    categorias_alias = aliased(categorias)
    query = select(
        movies.c.id, 
        movies.c.titulo, 
        movies.c.año, 
        movies.c.director,
        movies.c.imagen,
        movies.c.idiomas,
        movies.c.descripcion,
        movies.c.valoracion,
        movies.c.pegi, 
        categorias_alias.c.nombre.label('categoria') ,
        movies.c.duracion,
        movies.c.enCartelera
    ).select_from(
        movies
    ).join(
        categorias_alias, movies.c.categoria == categorias_alias.c.id
    ).where(movies.c.id == content_id)
    result = conn.execute(query).fetchall()
    print(result)
    resultado_dict = []
    for item in result:
        resultado_dict.append({
            "id": item[0],
            "titulo": item[1],
            "año": item[2],
            "director": item[3],
            "imagen": item[4],
            "idiomas": item[5],
            "descripcion": item[6],
            "validacion": item[7],
            "pegi": item[8],
            "categoria": item[9],
            "duracion": item[10],
            "enCartelera": item[11],
        })

    return resultado_dict