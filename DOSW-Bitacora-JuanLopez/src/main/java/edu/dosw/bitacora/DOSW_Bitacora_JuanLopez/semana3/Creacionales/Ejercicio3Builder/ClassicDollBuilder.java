package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.semana3.Creacionales.Ejercicio3Builder;

public class ClassicDollBuilder implements ToyDollBuilder {
    private ToyDoll doll;

    public ClassicDollBuilder() {
        this.doll = new ToyDoll();
    }

    @Override
    public void buildHead() {
        doll.setHead("Cabeza clasica con cabello largo");
    }

    @Override
    public void buildBody() {
        doll.setBody("Cuerpo clasico con vestido");
    }

    @Override
    public void buildArms() {
        doll.setArms("Brazos delgados clasicos");
    }

    @Override
    public void buildLegs() {
        doll.setLegs("Piernas clasicas con zapatos");
    }

    @Override
    public void addAccessories() {
        doll.setHasAccessories(false);
    }

    public ToyDoll getResult() {
        return doll;
    }
}