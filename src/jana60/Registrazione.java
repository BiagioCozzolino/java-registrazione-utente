package jana60;

import java.util.Scanner;

public class Registrazione {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean flag = true;

		System.out.println("Ciao benvenuto/a nella pagina di registrazione di Java!");

		do {
			try {
				System.out.print("Inserisci il tuo Nome: ");
				String nome = scan.nextLine();
				System.out.print("Inserisci il tuo Cognome: ");
				String cognome = scan.nextLine();
				System.out.print("Inserisci la tua E-mail: ");
				String email = scan.nextLine();
				System.out.print("Inserisci la tua Password: ");
				String password = scan.nextLine();
				System.out.print("Inserisci la tua età: ");
				int eta = Integer.parseInt(scan.nextLine());

				Utente nuovoUtente = new Utente(nome, cognome, email, password, eta);

				System.out.println(nuovoUtente.toString());
				flag = false;

				System.out.println("Hai creato correttamente il tuo Account!");

			} catch (NumberFormatException nfe) {
				System.out.println("Hai inserito un carattere non valido per l'età! Inserisci solo numeri");
				System.out.println(nfe.getMessage());
			} catch (Exception e) {
				System.out.println("Hai sbagliato ad immettere i dati, ricomincia.");
				System.out.println(e.getMessage());

			} finally {
				System.out.println("Arrivederci e alla prossima registrazione!");
			}
		} while (flag);
		scan.close();
	}

}
