from fastapi import FastAPI
from pydantic import BaseModel, HttpUrl
from typing import List, Union, Set

app = FastAPI()

class Image(BaseModel):
    url: HttpUrl
    name: str
    
class Item(BaseModel):
    name: str
    description: str | None = None      # Union[str, None]
    price: float
    tax: float | None = None            # Union[float, None]
    tags: Set[str] = set()                  # List[str] = [] or list[str] = []        
    image: List[Image] | None = None        # Anidado

class Offer(BaseModel):
    name: str
    description: str | None = None
    price: float
    items: List[Item]
    
@app.put("/item/{item_id}")
async def update_item(item_id: int, item: Item):
    results = {"item_id": item_id, "item": item}
    return results

@app.put("/offers/")
async def create_offer(offer: Offer):
    return offer

@app.post("/images/multiple/")
async def create_multiple_images(images: list[Image]):
    return images

@app.post("/index-weights/")
async def create_index_weights(weights: dict[int, float]):
    return weights