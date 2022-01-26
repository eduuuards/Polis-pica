import javax.swing.JOptionPane;

public class picerija {
	
	Pica pica;
	double cena;
	static double rekins=0;
	static int picasIzm;
	static int skaits=0;
	
	public static double pasutitPicu1(double rekins) {
		
		
		do {
			picasIzm = Integer.parseInt(JOptionPane.showInputDialog(null, "Cik lielu picu vçlies pasûtit? \n 20cm $6,59 \n 30cm $7,59 \n 50cm $9,99 \n "));
		switch(picasIzm) {
		case 20:
			rekins = rekins + 6.59;
			break;
		case 30:
			rekins = rekins + 7.59;
			break;
		case 50:
			rekins = rekins + 9.99;
			break;
		default:
			JOptionPane.showMessageDialog(null, "Lielums neatbilst", null, JOptionPane.ERROR_MESSAGE);
		}
		}while(picasIzm !=20 && picasIzm !=30 && picasIzm !=50);
		
		
		return rekins;
	}
	
	
	public static void main(String[] args) {
		String izvele;
		
		
		try {
		do {
			izvele = JOptionPane.showInputDialog("[1]Pasûtît picu | [2] Apskatît pasûtîjumu | [3] Sagatavot rçíinu | [x] Atcelt");
			
		switch(izvele) {
		case "1":
			pasutitPicu1(rekins);
			break;
		case "2":
			//apskatitPasutijumu();
			break;
		case "3":
			//skatitRekinu();
			break;
		case "x":
			JOptionPane.showMessageDialog(null, "Pasutijums atcelts", null, JOptionPane.WARNING_MESSAGE);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Darbiba nepastav");
		}
		}while(!izvele.equals("x"));
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Notika kluda pasûtijuma veikðanâ!");
		}

	}


	private static void pasutitPicu(double rekins2) {
		// TODO Auto-generated method stub
		
	}

}
