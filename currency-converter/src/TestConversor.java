import javax.swing.JOptionPane;

public  class TestConversor{

	public static void main(String[] args) {
		Conversor monedas = new ConversorMonedas();
		Conversor temperatura = new ConversorTemperatura();
		
		String userInput = (JOptionPane.showInputDialog(null,"Selecciona una option de convercion","Menu", 
				  JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de monedas", "Conversor de temperatura"},"Conversor de monedas")).toString();
		
		String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir");
		
		temperatura.setOption(userInput);
		
		
		
		System.out.println(temperatura.calculoConversion(temperatura.selectTipoConversion(), temperatura.cantidad(input)));
		System.out.println(temperatura.getOption());
		System.out.println(temperatura.cantidad(input));
		
	}

}
