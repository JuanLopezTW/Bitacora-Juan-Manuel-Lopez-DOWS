package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.semana3.Estructurales.Ejercicio9Command;

public class AttackCommand implements Command {
    private GameCharacter character;

    public AttackCommand(GameCharacter character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.attack();
    }
}
