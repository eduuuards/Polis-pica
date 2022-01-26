import javax.swing.JOptionPane;

public class picerija {
	
	Pica pica;
	double cena;
	static double rekins=0;
	static int picasIzm;
	static String picasNos;
	static String picasNos2;
	static int skaits=0;
	
	public static void apturet() {
		JOptionPane.showMessageDialog(null, "Pasutijums atcelts", null, JOptionPane.WARNING_MESSAGE);
	}
	public static void kluda() {
		JOptionPane.showMessageDialog(null, "Darbiba nepastav");
	}
	
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
			picasNos = JOptionPane.showInputDialog(null, "Kadu picu vçlies pasûtit? \n[1]Studentu \n[2]Asa \n[3]Salami \n[4]Siera \n[x]Atcelt");
		
		switch(picasNos) {
		case "1":
			picasNos2 = "Studentu";
			break;
		case "2":
			picasNos2 = "Asa";
			break;
		case "3":
			picasNos2 = "Salami";
			break;
		case "4":
			picasNos2 = "Siera";
			break;
		case "x":
			apturet();
			break;
		default:
			kluda();
		}
			
		
		return rekins;
	}
	
	public static void apskatitPasutijumu() {
		JOptionPane.showMessageDialog(null, "Pica "+picasNos2);
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
			apskatitPasutijumu();
			break;
		case "3":
			//skatitRekinu();
			break;
		case "x":
			apturet();
			break;
		default:
			kluda();
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
