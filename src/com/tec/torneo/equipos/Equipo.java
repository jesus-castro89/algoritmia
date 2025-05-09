package com.tec.torneo.equipos;

import com.tec.torneo.jugadores.Jugador;
import com.tec.validation.ValidationManager;

import javax.xml.validation.Validator;
import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador() {
        String nombre = ValidationManager.validate(String.class,
                "Ingrese el nombre del Jugador",
                "Nombre inválido",
                "Agregar Jugador al Equipo");
        String nickname = ValidationManager.validate(String.class,
                "Ingrese el nickname del Jugador",
                "Nickname inválido",
                "Agregar Jugador al Equipo");
        int edad = ValidationManager.validate(Integer.class,
                "Ingrese la edad del Jugador",
                "Edad inválida",
                "Agregar Jugador al Equipo");
        jugadores.add(new Jugador(nombre, nickname, edad));
    }

    public void eliminarJugador() {
        Jugador jugador = ValidationManager.validate(jugadores.toArray(new Jugador[0]),
                "Seleccione el jugador a eliminar",
                "Jugador inválido",
                "Eliminar Jugador");
        jugadores.remove(jugador);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
