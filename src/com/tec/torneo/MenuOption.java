package com.tec.torneo;

public enum MenuOption {

    ADD_TOURNAMENT("Agregar Torneo"),
    ADD_TEAM_TO_TOURNAMENT("Agregar Equipo a Torneo"),
    ADD_PLAYER_TO_TEAM("Agregar Jugador a Equipo"),
    REMOVE_PLAYER_FROM_TEAM("Eliminar Jugador de Equipo"),
    REMOVE_TEAM_FROM_TOURNAMENT("Eliminar Equipo de Torneo"),
    REMOVE_TOURNAMENT("Eliminar Torneo"),
    ASSIGN_RESULT_TO_TOURNAMENT("Asignar Resultado a Torneo"),
    SHOW_TOURNAMENT_RESULT("Mostrar Resultados de Torneo"),
    SHOW_TEAMS_FROM_TOURNAMENT("Mostrar Equipos de Torneo"),
    SHOW_PLAYERS_FROM_TEAM("Mostrar Jugadores de Equipo"),
    SHOW_TOURNAMENT_PLAYERS("Mostrar Jugadores de Torneo"),
    EXIT("Salir");

    private final String description;

    MenuOption(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "%d. %s".formatted(ordinal() + 1, description);
    }
}
