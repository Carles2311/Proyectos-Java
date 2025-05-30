from typing import Optional
from pydantic import BaseModel
class Series(BaseModel):
    id: Optional[int]
    titulo: str
    año: str
    temporadas: int
    imagen: str
    idiomas: str
    descripcion: str
    valoracion: int
    pegi: bool
    categoria: int
    duracion: int
    enEmision: bool
    capitulos: int