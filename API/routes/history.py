from fastapi import APIRouter
from config.db import conn
from models.users import users
from models.users import history
from schemas.history import History

from sqlalchemy import select
from sqlalchemy.orm import aliased

historial = APIRouter()

@historial.get("/history")
def get_history():
    user_alias_1 = aliased(users)  # Alias para player1
    user_alias_2 = aliased(users)  # Alias para player2
    
    query = select(
        history.c.id, 
        user_alias_1.c.username.label('player1id'),
        user_alias_2.c.username.label('player2id'),
        history.c.time
    ).select_from(
        history
    ).join(
        user_alias_1, history.c.player1id == user_alias_1.c.id  # Primer JOIN para player1
    ).join(
        user_alias_2, history.c.player2id == user_alias_2.c.id  # Segundo JOIN para player2
    )
    
    result = conn.execute(query).fetchall()
    columns = [column[0] for column in conn.execute(query).cursor.description]
    return [dict(zip(columns, row)) for row in result]

@historial.post("/history")
def create_history(hist :History):
    print(hist)
    new_user = {"id": hist.id, "player1id": hist.player1id, "player2id" : hist.player2id, "time": hist.time}
    result = conn.execute(history.insert().values(new_user))
    conn.commit()
    print(result)
    return "you made it"

@historial.get("/history/{id}")
def helloworld(id: int):  
    user_id = int(id)  
    print(user_id)
    user_alias_1 = aliased(users)  
    user_alias_2 = aliased(users)  
    
    query = select(
        history.c.id, 
        user_alias_1.c.username.label('player1id'),
        user_alias_2.c.username.label('player2id'),
        history.c.time
    ).select_from(
        history
    ).join(
        user_alias_1, history.c.player1id == user_alias_1.c.id  
    ).join(
        user_alias_2, history.c.player2id == user_alias_2.c.id  
    ).where(history.c.player1id == user_id)
    result = conn.execute(query).fetchall()
    print(result)
    resultado_dict = []
    for item in result:
        resultado_dict.append({
            "id": item[0],
            "player1id": item[1],
            "player2id": item[2],
            "time": item[3]

        })

    return resultado_dict
