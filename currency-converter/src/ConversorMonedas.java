import javax.swing.JOptionPane;

public class ConversorMonedas extends Conversor {

	
	private String tipoConversion;
	
	
	public String selectTipoConversion() {
		this.tipoConversion = (JOptionPane.showInputDialog(null,"Elija la moneda a la que desea convertir su dinero","Monedas", 
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
		return tipoConversion;
	}
	
	public double calculoConversion(String tipoConvercion, double cantidad) {
		
		switch (tipoConversion) {
		case "De peso a Dolar":
			cantidad = cantidad / 56.0;
			
			break;
			
		case "De peso a Euro":
			cantidad = cantidad / 62.0;
			
			break;
			
		case "De peso a Libras":
			cantidad = cantidad / 69.69;
			
			break;
			
		case "De peso a Yen":
			cantidad = cantidad / 2.30;
			
			break;
			
		case "De peso a Won coreano":
			cantidad = cantidad * 22.81;
			
			break;
			
		case "De Dolar a Peso":
			cantidad = cantidad * 56.0;
			
			break;
			
		case "De Euro a Peso":
			cantidad = cantidad * 62.0;
			
			break;
			
		case "De Libras a Peso":
			cantidad = cantidad * 69.69;
			
			break;
			
		case "De Yen a Peso":
			cantidad = cantidad * 2.30;
			
			break;
			
		case "De Won coreano a Peso":
			cantidad = cantidad / 22.81;
			
			break;
			

		default:
			break;
		}
		return cantidad;
		
	}
	
}
