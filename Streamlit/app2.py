import streamlit as st
from PIL import Image
import plotly.express as px
import pandas as pd

img = Image.open("imagen.png")

st.set_page_config(page_title="Aprendiendo", page_icon="img", layout="wide", initial_sidebar_state="collapsed")

def main():
    st.title("Hola")
    st.sidebar.header("Navegación")
    df = pd.read_csv("employee_data.csv")
    st.dataframe(df)
    df_count = df.groupby('PayZone').count().reset_index()
    fig = px.pie(df_count, values="EmpID", names="PayZone", title="Zonas")
    st.plotly_chart(fig)
    df_avg = df.groupby('EmployeeClassificationType')['LocationCode'].mean().reset_index()
    fig2 = px.bar(df_avg, x="EmployeeClassificationType", y="LocationCode", color="EmployeeClassificationType")
    st.plotly_chart(fig2)
    
    
if __name__ == '__main__':
    main()