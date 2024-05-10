package modulos;

public enum Moneda {
    USD("Dolar Americano"),
    ARS("Peso Argentino"),
    BRL("Real Brasileño"),
    COP("Peso Colombiano"),
    MXN("Peso Mexicano");

    private final String nombre;

    Moneda(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSigla() {
        return name();
    }


}
