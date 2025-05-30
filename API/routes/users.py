from fastapi import APIRouter
from config.db import conn
from models.users import users
from schemas.user import User
from sqlalchemy import select
user = APIRouter()

@user.get("/users")
def get_users():
    result = conn.execute(users.select()).fetchall()
    columns = [column[0] for column in conn.execute(users.select()).cursor.description]
    return [dict(zip(columns, row)) for row in result]

@user.post("/users")
def create_user(user :User):
    print(user)
    new_user = {"id": user.id, "username": user.username, "password" : user.password, "email": user.email, "victories": user.victories}
    result = conn.execute(users.insert().values(new_user))
    conn.commit()
    print(result)
    return "you made it"
@user.get("/users/{id}")
def helloworld(id: str):
    user_id = int(id)  
    print(user_id)
    result = conn.execute(users.select().where(users.c.id == user_id)).fetchall()
    print(result)
    resultado_dict = []
    for item in result:

        resultado_dict.append({
            "id": item[0],
            "username":item[1],
            "password": item[2],
            "email": item[3],
            "victories": item[4]
        })

    return resultado_dict

