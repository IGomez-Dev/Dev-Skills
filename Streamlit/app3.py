import streamlit as st
from PIL import Image
import pandas as pd
from PyPDF2 import PdfReader

@st.cache_data
def cargar_imagen(image_file):
    img = Image.open(image_file)
    return img

def leer_pdf(file):
    pdfReader = PdfReader(file)
    count = len(pdfReader.pages)
    todo_el_texto = ""
    for i in range(count):
        pagina = pdfReader.pages[i]
        todo_el_texto += pagina.extract_text()
    return todo_el_texto

def main():
    st.title("Tutorial de Carga de Archivos")
    menu = ["Imagenes", "Conjunto de Datos", "Archivos de Documentos"]
    eleccion = st.sidebar.selectbox("Menú", menu)
    
    if eleccion == 'Imagenes':
        st.subheader("Imagenes")
        archivo_imagen = st.file_uploader("Subir Imágenes", type=["png","jpg","jpeg"])
        
        if archivo_imagen is not None:
            detalles_archivo = {"nombre_archivo": archivo_imagen.name,
                                "tipo_archivo": archivo_imagen.type,
                                "tamaño_archivo": archivo_imagen.size}
            st.write(detalles_archivo)
            st.write(cargar_imagen(archivo_imagen), width=100)

if __name__ == '__main__':
    main()