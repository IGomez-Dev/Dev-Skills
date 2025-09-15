from fastapi import FastAPI, Query
from typing import Annotated, Union

app = FastAPI()


@app.get("/items/")
async def read_items(q: Annotated[str | None, Query(min_length=3,max_length=50)] = None):
    results = {"items": [{"item_id": "Foo"}, {"item_id": "Bar"}]}
    if q:
        results.update({"q": q})
    return results

# Expresiones Regulares
@app.get("/item/")
async def read_items(q: Annotated[str | None, Query(min_length=3,max_length=50, pattern="^fixedquery$")] = None):
    results = {"items": [{"item_id": "Foo"}, {"item_id": "Bar"}]}
    if q:
        results.update({"q": q})
    return results

# Valores por defecto
@app.get("/iten/")
async def read_items(q: Annotated[str, Query(min_length=3)] = "Hola-mundo"):
    results = {"items": [{"item_id": "Foo"}, {"item_id": "Bar"}]}
    if q:
        results.update({"q": q})
    return results

# Parámetros requeridos
@app.get("/itens/")
async def read_items(q: Annotated[str | None, Query(min_length=3)]):
    results = {"items": [{"item_id": "Foo"}, {"item_id": "Bar"}]}
    if q:
        results.update({"q": q})
    return results

# Lista de Query      -  ?q=foo&q=bar
@app.get("/itim/")
async def read_items(q: Annotated[list[str] | None, Query()] = None):
    query_items = {"q": q}
    return query_items

@app.get("/itims/")
async def read_items(q: Annotated[list, Query()] = []):
    query_items = {"q": q}
    return query_items

# Título, descripcion y alias
@app.get("/itengs/")
async def read_items(
    q: Annotated[
        str | None,
        Query(
            alias="item-query",
            title="Query string",
            description="Query string for the items to search in the database that have a good match",
            min_length=3,
            max_length=50,
            deprecated=True,
        ),
    ] = None,
):
    results = {"items": [{"item_id": "Foo"}, {"item_id": "Bar"}]}
    if q:
        results.update({"q": q})
    return results