public class Hero {
    protected int salud;
    protected int energia;

    public Hero(int saludInicial, int energiaInicial) {
        this.salud = saludInicial;
        this.energia = energiaInicial;
    }

    public void recuperarSalud(int cantidad) {
        salud += cantidad;
    }

    public void recuperarEnergia(int cantidad) {
        energia += cantidad;
    }
}
