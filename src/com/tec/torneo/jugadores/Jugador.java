package com.tec.torneo.jugadores;

public class Jugador {

    private String nombre;
    private String nickname;
    private int edad;

    public Jugador(String nombre, String nickname, int edad) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "%s".formatted(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
