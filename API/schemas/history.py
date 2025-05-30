from typing import Optional
from pydantic import BaseModel
class History(BaseModel):
    id: int
    player1id: int
    player2id: int
    time: int