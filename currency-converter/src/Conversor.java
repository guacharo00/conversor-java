import javax.swing.JOptionPane;

public class Conversor {

	public static void main(String[] args) {
		String option;
		String input = "";
		String tipoConversion;
		double valor;
		double total;
		boolean bool = true;
		
		option = (JOptionPane.showInputDialog(null,"Selecciona una option de convercion","Menu", 
				  JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de monedas", "Conversor de temperatura"},"Conversor de monedas")).toString();
		
		while(bool) {
			input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir");
			
			if(input.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No introdujiste ningun valor");
			} else {
				bool = false;
			}
		}
		
		tipoConversion = (JOptionPane.showInputDialog(null,"Elija la moneda a la que desea convertir su dinero","Monedas", 
				  JOptionPane.PLAIN_MESSAGE, null, new Object[] {
						  "De peso a Dolar",
						  "De peso a Euro",
						  "De peso a Libras",
						  "De peso a Yen",
						  "De peso a Won coreano",
						  "De Dolar a Peso",
						  "De Euro a Peso",
						  "De Libras a Peso",
						  "De Yen a Peso",
						  "De Won coreano a Peso",
				  },"De peso a Dolar")).toString();
		
		valor = Double.parseDouble(input);
		JOptionPane.showMessageDialog(null, "Tienes $ " + valor + "Dolares");
		JOptionPane.showConfirmDialog(null, "Deseas continuar?","Select", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Programa Terminado");
		System.out.println(input);

	}

}
