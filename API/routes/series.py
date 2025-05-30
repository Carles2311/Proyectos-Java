from fastapi import APIRouter
from config.db import conn
from models.series import series
from models.movies import categorias
from schemas.series import Series
from sqlalchemy import select
from sqlalchemy.orm import aliased
serie = APIRouter()

@serie.get("/series")
def get_serie():
    categorias_alias = aliased(categorias)
    query = select(
        series.c.id, 
        series.c.titulo, 
        series.c.año, 
        series.c.temporadas,
        series.c.imagen,
        series.c.idiomas,
        series.c.descripcion,
        series.c.valoracion,
        series.c.pegi, 
        categorias_alias.c.nombre.label('categoria') ,
        series.c.duracion,
        series.c.enEmision,
        series.c.capitulos
    ).select_from(
        series
    ).join(
        categorias_alias, series.c.categoria == categorias_alias.c.id
    )
    result = conn.execute(query).fetchall()
    columns = [column[0] for column in conn.execute(query).cursor.description]
    return [dict(zip(columns, row)) for row in result]

@serie.post("/series")
def create_serie(serie :Series):
    print(serie)
    new_content = {"id": serie.id, "titulo" : serie.titulo, "año": serie.año, "temporadas": serie.temporadas, "imagen": serie.imagen,"idiomas": serie.idiomas, "descripcion": serie.descripcion,"valoracion":serie.valoracion, "pegi": serie.pegi,"categoria": serie.categoria, "duracion": serie.duracion, "enEmision": serie.enEmision, "capitulos": serie.capitulos}
    result = conn.execute(series.insert().values(new_content))
    conn.commit()
    print(result)
    return "you made it"

@serie.get("/series/{id}")
def get_serie(id: str):
    content_id = int(id)  
    print(content_id)
    categorias_alias = aliased(categorias)
    query = select(
        series.c.id, 
        series.c.titulo, 
        series.c.año, 
        series.c.temporadas,
        series.c.imagen,
        series.c.idiomas,
        series.c.descripcion,
        series.c.valoracion,
        series.c.pegi, 
        categorias_alias.c.nombre.label('categoria') ,
        series.c.duracion,
        series.c.enEmision,
        series.c.capitulos
    ).select_from(
        series
    ).join(
        categorias_alias, series.c.categoria == categorias_alias.c.id
    ).where(series.c.id == content_id)
    result = conn.execute(query).fetchall()
    print(result)
    resultado_dict = []
    for item in result:
        resultado_dict.append({
            "id": item[0],
            "titulo": item[1],
            "año": item[2],
            "temporadas": item[3],
            "imagen": item[4],
            "idiomas": item[5],
            "descripcion": item[6],
            "validacion": item[7],
            "pegi": item[8],
            "categoria": item[9],
            "duracion": item[10],
            "enEmision": item[11],
            "capitulos": item[12],
        })

    return resultado_dict