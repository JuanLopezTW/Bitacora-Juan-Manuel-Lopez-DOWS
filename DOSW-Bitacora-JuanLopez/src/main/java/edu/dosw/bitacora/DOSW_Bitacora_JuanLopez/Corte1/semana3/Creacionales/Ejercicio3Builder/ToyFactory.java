package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte1.semana3.Creacionales.Ejercicio3Builder;

public class ToyFactory {
    private ToyDollBuilder builder;

    public void constructDoll(ToyDollBuilder builder) {
        this.builder = builder;
        builder.buildHead();
        builder.buildBody();
        builder.buildArms();
        builder.buildLegs();
        builder.addAccessories();
    }
}
