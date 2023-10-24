public class SuperHero extends Hero implements Poderes {
    private String nombre;
    private String traje;
    private boolean tieneCapa;
    private int nivel;

    public SuperHero(String nombre, String traje, boolean tieneCapa, int nivel, int saludInicial, int energiaInicial) {
        super(saludInicial, energiaInicial);
        this.nombre = nombre;
        this.traje = traje;
        this.tieneCapa = tieneCapa;
        this.nivel = nivel;
    }

    @Override
    public void volar() {
        if (energia >= 10) {
            System.out.println(nombre + " está volando.");
            energia -= 10;
        } else {
            System.out.println("No tienes suficiente energía para volar.");
        }
    }public void UltraInstinto(){
        if (energia >=12) {
            System.out.println(nombre + "Usando Ultra Instinto");
            energia -= 12;
        } else {
            System.out.println("No tienes energia para usar este poder");
        }
    }

    public void superFuerza() {
        if (energia >= 15) {
            System.out.println(nombre + " está usando su super fuerza.");
            energia -= 15;
        } else {
            System.out.println("No tienes suficiente energía para usar la super fuerza.");
        }
    }

    public void superPoder() {
        if (energia >= 15) {
            System.out.println(nombre + " está usando su superpoder especial.");
            energia -= 15;
            volar();
            superFuerza();
        } else {
            System.out.println("No tienes suficiente energía para usar el superpoder especial.");
        }
    }

    public void ataque() {
        if (salud >= 100) {
            System.out.println(nombre + " está atacando a un enemigo.");
            salud -= 100;
        } else {
            System.out.println("No tienes suficiente salud para realizar un ataque.");

        }
    }
}