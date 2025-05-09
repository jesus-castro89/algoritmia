package com.tec.torneo;

import com.tec.torneo.equipos.Equipo;
import com.tec.torneo.torneos.Torneo;
import com.tec.validation.ValidationManager;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class App {

    private static final ArrayList<Torneo> TORNEOS = new ArrayList<>();

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

    public static void menu() {
        MenuOption option = ValidationManager.validate(MenuOption.values(),
                "Seleccione una opción: ",
                "Opción inválida.",
                "Menú de opciones");
        switch (option) {
            case ADD_TOURNAMENT -> addTournament();
            case ADD_TEAM_TO_TOURNAMENT -> addTeamToTournament();
            case ADD_PLAYER_TO_TEAM -> addPlayerToTeam();
            /*case REMOVE_PLAYER_FROM_TEAM -> removePlayerFromTeam();
            case REMOVE_TEAM_FROM_TOURNAMENT -> removeTeamFromTournament();
            case REMOVE_TOURNAMENT -> removeTournament();
            case ASSIGN_RESULT_TO_TOURNAMENT -> assignResultToTournament();
            case SHOW_TOURNAMENT_RESULT -> showTournamentResult();
            case SHOW_TEAMS_FROM_TOURNAMENT -> showTeamsFromTournament();
            case SHOW_PLAYERS_FROM_TEAM -> showPlayersFromTeam();
            case SHOW_TOURNAMENT_PLAYERS -> showTournamentPlayers();*/
            default -> {
                JOptionPane.showMessageDialog(null,
                        "Saliendo del programa.",
                        "Salir",
                        JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        }
    }

    private static void addTournament() {
        String name = ValidationManager.validate(String.class,
                "Ingrese el nombre del torneo: ",
                "Nombre inválido.",
                "Agregar Torneo");
        TORNEOS.add(new Torneo(name));
        menu();
    }

    private static void addTeamToTournament() {
        if (!TORNEOS.isEmpty()) {
            Torneo selectedTournament = ValidationManager.validate(TORNEOS.toArray(new Torneo[0]),
                    "Seleccione un torneo: ",
                    "Torneo inválido.",
                    "Agregar Equipo a Torneo");
            selectedTournament.agregarEquipo();
        } else {
            JOptionPane.showMessageDialog(null,
                    "No hay torneos disponibles.",
                    "Agregar Equipo a Torneo",
                    JOptionPane.ERROR_MESSAGE);
        }
        menu();
    }

    private static void addPlayerToTeam() {
        if (!TORNEOS.isEmpty()) {
            Torneo selectedTournament = ValidationManager.validate(TORNEOS.toArray(new Torneo[0]),
                    "Seleccione un torneo: ",
                    "Torneo inválido.",
                    "Agregar Jugador a Equipo");
            if (!selectedTournament.getEquipos().isEmpty()) {
                Equipo selectedTeam = ValidationManager.validate(selectedTournament.getEquipos().toArray(new Equipo[0]),
                        "Seleccione un equipo: ",
                        "Equipo inválido.",
                        "Agregar Jugador a Equipo");
                selectedTeam.agregarJugador();
            } else {
                JOptionPane.showMessageDialog(null,
                        "No hay equipos disponibles en el torneo seleccionado.",
                        "Agregar Jugador a Equipo",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "No hay torneos disponibles.",
                    "Agregar Jugador a Equipo",
                    JOptionPane.ERROR_MESSAGE);
        }
        menu();
    }
}
