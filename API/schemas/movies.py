from typing import Optional
from pydantic import BaseModel
class Movies(BaseModel):
    id: Optional[int]
    titulo: str
    año: str
    director: str
    imagen: str
    idiomas: str
    descripcion: str
    valoracion: int
    pegi: bool
    categoria: int
    duracion: int
    enCartelera: bool