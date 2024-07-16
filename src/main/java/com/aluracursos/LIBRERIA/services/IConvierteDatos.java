package com.aluracursos.LIBRERIA.services;

public interface IConvierteDatos
{
    <T> T obtenerDatos(String json, Class<T> tClass);
}
