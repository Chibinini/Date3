
import java.time.OffsetDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        // Ottiene l'anno
        int anno = data.getYear();

        // Ottiene il mese
        int mese = data.getMonthValue();

        // Ottiene il giorno del mese
        int giornoDelMese = data.getDayOfMonth();


        // Ottiene il giorno della settimana italiana
        String giornoDellaSettimana = data.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALIAN);

        System.out.println("Anno: " + anno);
        System.out.println("Mese: " + mese);
        System.out.println("Giorno: " + giornoDelMese);
        System.out.println("Giorno della settimana: " + giornoDellaSettimana);

    }
}
//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console

