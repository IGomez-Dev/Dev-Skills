import streamlit as st
import pandas as pd
from PIL import Image

df = pd.read_csv('superhero.csv')

def main():
    st.title("Curso de Streamlit")
    # st.header("Hola mundo grande")
    # st.subheader("Hola mundo")
    # st.text("Esto es un texto")
    # nombre = "Ivan"
    # st.text(f"Hola {nombre}, esto es un texto")
    # st.markdown("# Hola mundo desde markdown")
    
    # st.success("Éxito")
    # st.warning("Esto es una advertencia")
    # st.info("ESTO  es informacion")
    # st.error("Esto es un error")
    # st.exception("Esto es una excepcion")
    
    # st.write("Texto Normal")
    # st.write("## Esto es un texto markdown")
    # st.write(1+4)
    
    # st.dataframe(df)
    # # st.table(df)}        # Muestra todo la tabla
    # st.write(df.head(20))
    # st.json({"clave": "valor"})

    # codigo = """
    # def saludar():
    #     print("Hola")
    # """
    # st.code(codigo, language="python")
    
    # option = st.selectbox(
    #     'Elige tu fruta favorita',
    #     ['manzana', 'naranja', 'plátano', 'fresa']
    # )
    
    # st.write(option)
    
    # optiones = st.multiselect(
    #     'Elige tu color favorito',
    #     ['azul', 'rojo', 'amarillo', 'negro', 'blanco']
    # )
    
    # st.write(f"Elige tus colores favoritos", optiones)
    
    # edad = st.slider(
    #     "Selecciona tu edad",
    #     min_value=0,
    #     max_value=100,
    #     value=25,
    #     step=1
    # )
    
    # st.write(f"Tu edad es: ", edad)
    
    # nivel = st.select_slider(
    #     "Selecciona tu nivel de satisfacción",
    #     options=['Muy Bajo', 'Bajo', 'Medio', 'Alto', 'Muy Alto'],
    #     value='Medio'
    # )
    
    # st.write("Tu nivel de satisfacción es: ", nivel)
    
    # img = Image.open("imagen.png")
    # st.image(img, use_container_width=True)
    # st.image("https://picsum.photos/800")
    
    # with open("video.mp4", "rb") as video_file:
    #     st.video(video_file.read(), start_time=0)
    
    # with open("musica.mp3", "rb") as audio_file:
    #     st.audio(audio_file.read()) 
        
    nombre = st.text_input("Ingrese su nombre: ")
    st.title(nombre)
    
    texto = st.text_area("Ingrese su texto: ", height=100)
    st.write(texto)
    
    numero = st.number_input("Ingresa un número", 1, 25, step=3)
    st.write(numero)
    
    cita = st.date_input("Ingresa una fecha")
    st.write(cita)
    
    hora = st.time_input("Seleccione una hora")
    st.write(hora)
    
    color = st.color_picker("Seleccione el color")
    st.write(color)
    
if __name__ == '__main__':
    main()
    