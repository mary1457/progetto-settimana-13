public class RegistrazioneAudio extends ElementoMultimediale implements Play {

    private int durata;
    private int volume;

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;


    }

    public int getDurata() {
        return durata;
    }

    public int getVolume() {
        return volume;
    }

    public boolean controllo() {

        if (this.durata > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void alzaVolume() {
        volume++;

    }


    public void abbassaVolume() {
        if (this.volume > 0) {
            volume--;
        }
    }


    @Override
    public void play() {
        if (controllo()) {
            for (int i = 0; i < durata; i++) {
                System.out.println(getTitolo() + "!".repeat(volume));
            }

        } else {
            System.out.println("Registrazione audio non riproducibile");
        }
    }

    @Override
    public void mostra() {
        play();
    }
}
