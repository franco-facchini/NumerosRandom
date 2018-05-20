import java.util.Random;
import javax.swing.JOptionPane;

public class JuegoDeNumeros{
	public static void main(String[] args) {
		Random r = new Random();
		int numrandom = r.nextInt(100); // genera un número entre 0 y 99
		int i = 0; // se crea la variable contador que es usada para contar los intentos fallidos
		int apuesta = input("Adivina el número secreto entre 0 y 99. ¿Que número es?");
		while (numrandom != apuesta) { // si el número escrito es distinto al generado repite
			i++; // incrementa variable contador
			if (numrandom > apuesta) {
				apuesta = input("El número a adivinar es más grande. \n Intentelo otra vez");
			} else {
				apuesta = input("El número a adivinar es más chico. \n Intentelo otra vez");
			}
		}
		JOptionPane.showMessageDialog(null, "Felicitaciones ha dado con el número con " + i + " intentos fallidos");
	}

	/**
	 * Muestra una ventana con el mensaje text y solicita una respuesta
	 * 
	 * @param text
	 * @return devuelve un número int
	 */
	private static int input(String text) {
		return Integer.parseInt(JOptionPane.showInputDialog(text));
	}
}