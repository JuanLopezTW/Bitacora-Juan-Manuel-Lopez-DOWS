package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte1.semana3.Creacionales.Ejercicio2AbstractFactory;

public class PlayStationFactory implements ConsoleFactory {
    @Override
    public Controller createController() {
        return new PlayStationController();
    }

    @Override
    public Game createGame() {
        return new PlayStationGame();
    }

    @Override
    public UI createUI() {
        return new PlayStationUI();
    }
}