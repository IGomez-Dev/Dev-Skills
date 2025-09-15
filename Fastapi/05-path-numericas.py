from fastapi import FastAPI, Path, Query
from typing import Annotated

app = FastAPI()

@app.get("/items/{item_id}")
async def read_items(
    item_id: Annotated[int, Path(title="The ID of the item to get")],
    q: Annotated[str | None, Query(alias="item-query")] = None):
    results = {"item_id": item_id}
    if q:
        results.update({"q": q})
    return results

@app.get("/itengs/{item_id}")
async def read_items(*, item_id: int = Path(title="The ID of item to get"), q: str):
    results = {"item_id": item_id}
    if q:
        results.update({"q": q})
    return results

@app.get("/itim/{item_id}")
async def read_items(item_id: Annotated[int, Path(title="ID of the item",gt=0,le=9999)], 
                     q: str,
                     size: Annotated[float, Query(gt=0, lt=10.5)]):
    results = {"item_id": item_id}
    if q:
        results.update({"q": q})
    if size:
        results.update({"size": size})
    return results        