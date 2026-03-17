package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte1.semana3.Creacionales.Ejercicio2AbstractFactory;

public interface ConsoleFactory {
    Controller createController();
    Game createGame();
    UI createUI();
}