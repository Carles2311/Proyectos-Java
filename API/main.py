from fastapi import FastAPI
from routes.users import user
from routes.movies import movie
from routes.history import historial
from routes.series import serie
from fastapi.middleware.cors import CORSMiddleware
app = FastAPI()



origins = [
    "http://172.17.40.20",
    "http://locahost",
    "http://172.17.40.1"
 
]

app.add_middleware(
    CORSMiddleware,
    allow_origins=["*"],  
    allow_credentials=True,
    allow_methods=["GET", "POST", "PUT", "DELETE", "OPTIONS"],  
    allow_headers=["*"],
)

app.include_router(user)
app.include_router(movie)
app.include_router(historial)
app.include_router(serie)