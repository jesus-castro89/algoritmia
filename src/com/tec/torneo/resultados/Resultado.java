package com.tec.torneo.resultados;

import com.tec.torneo.equipos.Equipo;
import com.tec.torneo.torneos.Torneo;

public class Resultado {

    private Torneo torneo;
    private Equipo equipoGanador;

    public Resultado(Torneo torneo) {
        this.torneo = torneo;
        this.equipoGanador = null;
    }

    public Torneo getTorneo() {
        return torneo;
    }

    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }

    public Equipo getEquipoGanador() {
        return equipoGanador;
    }

    public void setEquipoGanador(Equipo equipoGanador) {
        this.equipoGanador = equipoGanador;
    }
}
