public abstract class ElementoMultimediale {


    private String titolo;

    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;


    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String nuovoTitolo) {
        this.titolo = nuovoTitolo;
    }

    public void mostra() {
        System.out.println(titolo);
    }

}