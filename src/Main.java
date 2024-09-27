import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        ElementoMultimediale[]elementi=new ElementoMultimediale[5];

        for(int i=0; i< elementi.length; i++){
            System.out.println("Che cosa vuoi creare? 1 Registrazione 2 Video 3 Immagine");
            int scelta= scanner.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println("Inserisci titolo");
                    String titoloReg= scanner.next();
                    System.out.println("Inserisci durata");
                    int durataReg= scanner.nextInt();
                    System.out.println("Inserisci volume");
                    int volumeReg= scanner.nextInt();
                    RegistrazioneAudio audio= new RegistrazioneAudio(titoloReg,durataReg,volumeReg);
                    elementi[i]=audio;
                    break;
                case 2:
                    System.out.println("Inserisci titolo");
                    String titoloVid= scanner.next();
                    System.out.println("Inserisci durata");
                    int durataVid= scanner.nextInt();
                    System.out.println("Inserisci volume");
                    int volumeVid= scanner.nextInt();
                    System.out.println("Inserisci luminosità");
                    int luminositaVid= scanner.nextInt();
                    Video video= new Video(titoloVid,durataVid,volumeVid,luminositaVid);
                    elementi[i]=video;
                    break;
                case 3:
                    System.out.println("Inserisci titolo");
                    String titoloImg= scanner.next();
                    System.out.println("Inserisci luminosità");
                    int luminositaImg= scanner.nextInt();
                    Immagine immagine= new Immagine(titoloImg,luminositaImg);
                    elementi[i]=immagine;
                    break;
                default:
                    System.out.println("Numero non compreso tra 1 e 3");
                break;
            }

        }

        while (true) {
            System.out.print("Inserisci un numero da 1 a 5 (digita 0 per uscire): ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("Esci");
                break;
            }


           elementi[numero-1].mostra();
        }
    }


}