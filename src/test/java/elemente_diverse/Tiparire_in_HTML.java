package elemente_diverse;

import java.io.FileWriter;
import java.io.IOException;


public class Tiparire_in_HTML {

        public static void main(String[] args) {
            // Rezultatele testului (puteți să le obțineți din variabile sau obiecte)
            String testResult = "Acesta este un mod de testare daca se scrie in cod HTML";
            String testDate = "Data testului - azi";

            // Calea către fișierul HTML
            String filePath = "raport_test.html";

            try {
                // Deschideți un fișier HTML pentru scriere
                FileWriter fileWriter = new FileWriter(filePath);

                // Scrieți conținutul HTML cu rezultatele
                fileWriter.write("<html><head><title>Rezultate Test</title></head><body>");
                fileWriter.write("<h1>Rezultate Test</h1>");
                fileWriter.write("<p>" + testResult + "</p>");
                fileWriter.write("<p>" + testDate + "</p>");
                fileWriter.write("</body></html>");

                // Închideți fișierul
                fileWriter.close();

                System.out.println("Rezultatele au fost scrise în " + filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
