public class Immagine extends ElementoMultimediale implements Show {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;


    }

    public void aumentaLuminosita() {
        luminosita++;

    }


    public void diminuisciLuminosita() {
        if (this.luminosita > 0) {
            luminosita--;
        }
    }


    @Override
    public void show() {


        System.out.println(getTitolo() + "*".repeat(luminosita));
    }

    @Override
    public void mostra() {
        show();
    }

}

