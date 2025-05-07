package com.tec.torneo;

import com.tec.input.InputManager;
import com.tec.torneo.equipos.Equipo;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Main {

    static {
        UIManager.put("OptionPane.messageFont",
                new Font("Arial", Font.BOLD, 24));
        UIManager.put("OptionPane.buttonFont",
                new Font("Arial", Font.BOLD, 24));
        UIManager.put("TextField.font",
                new Font("Arial", Font.PLAIN, 24));
        UIManager.put("ComboBox.font",
                new Font("Arial", Font.BOLD, 24));
    }

    public static void main(String[] args) {
        Equipo equipo = new Equipo("Equipo 1");
        equipo.agregarJugador();
        equipo.agregarJugador();
        equipo.agregarJugador();
        JOptionPane.showMessageDialog(null,
                equipo.getJugadores(),
                "Jugadores del equipo",
                JOptionPane.INFORMATION_MESSAGE);
        equipo.eliminarJugador();
        JOptionPane.showMessageDialog(null,
                equipo.getJugadores(),
                "Jugadores del equipo",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
