package com.tec.torneo.torneos;

import com.tec.torneo.equipos.Equipo;
import com.tec.torneo.resultados.Resultado;
import com.tec.validation.ValidationManager;

import java.util.ArrayList;

public class Torneo {

    private String nombre;
    private ArrayList<Equipo> equipos;
    private Resultado resultado;

    public Torneo(String nombre) {
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
        this.resultado = new Resultado(this);
    }

    public void agregarEquipo() {
        String nombreEquipo = ValidationManager.validate(String.class,
                "Ingrese el nombre del equipo: ",
                "Nombre inválido.",
                "Agregar Equipo");
        equipos.add(new Equipo(nombreEquipo));
    }

    @Override
    public String toString() {
        return "Torneo %s".formatted(nombre);
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }
}
