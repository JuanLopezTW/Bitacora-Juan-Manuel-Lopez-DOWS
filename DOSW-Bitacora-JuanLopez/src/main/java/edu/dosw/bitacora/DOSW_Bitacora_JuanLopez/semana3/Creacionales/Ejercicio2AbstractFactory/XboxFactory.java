package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.semana3.Creacionales.Ejercicio2AbstractFactory;

public class XboxFactory implements ConsoleFactory {
    @Override
    public Controller createController() {
        return new XboxController();
    }

    @Override
    public Game createGame() {
        return new XboxGame();
    }

    @Override
    public UI createUI() {
        return new XboxUI();
    }
}