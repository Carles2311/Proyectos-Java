from sqlalchemy import Table, Column, ForeignKey
from sqlalchemy.sql.sqltypes import Integer, String
from config.db import meta, engine


history = Table("history", meta, 
              Column ("id", Integer, primary_key=True), 
              Column("player1id", Integer,ForeignKey('users.id')),
              Column("player2id", Integer, ForeignKey('users.id')),
              Column("time", Integer))


users = Table("users", meta, 
              Column ("id", Integer, primary_key=True), 
              Column("username", String(255)),
              Column("password", String(255)),
              Column("email", String(255)), 
              Column("victories", Integer))

meta.create_all(engine)