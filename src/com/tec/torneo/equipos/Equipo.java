package com.tec.torneo.equipos;

import com.tec.torneo.jugadores.Jugador;
import com.tec.input.InputManager;

import javax.swing.*;
import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador() {
        String nombre = InputManager.validate(String.class,
                "Ingrese el nombre del jugador",
                "El nombre no puede estar vacío",
                "Agregar Jugador");
        String nickname = InputManager.validate(String.class,
                "Ingrese el nickname del jugador",
                "El nickname no puede estar vacío",
                "Agregar Jugador");
        int edad = InputManager.validate(Integer.class,
                "Ingrese la edad del jugador",
                "La edad no puede estar vacía",
                "Agregar Jugador");
        jugadores.add(new Jugador(nombre, nickname, edad));
    }

    public void eliminarJugador() {
        Jugador jugador = InputManager.getOption(
                "Seleccione el jugador a eliminar",
                "Eliminar Jugador",
                jugadores.toArray(new Jugador[0]));
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
