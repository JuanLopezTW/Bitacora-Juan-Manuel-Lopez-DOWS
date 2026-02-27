package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.semana3.Creacionales.Ejercicio2AbstractFactory;

public interface ConsoleFactory {
    Controller createController();
    Game createGame();
    UI createUI();
}