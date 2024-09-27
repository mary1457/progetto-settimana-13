public class Video extends RegistrazioneAudio implements Play {
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata, volume);
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
    public void play() {
        if (controllo()) {
            for (int i = 0; i < getDurata(); i++) {
                System.out.println(getTitolo() + "!".repeat(getVolume()) + "*".repeat(luminosita));
            }

        } else {
            System.out.println("Video non riproducibile");
        }
    }

    @Override
    public void mostra() {
        play();
    }
}
