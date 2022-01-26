import javax.swing.JOptionPane;

public class picerija {

	Pica pica;
	
	public void pasutitPicu() {
		
	}
	
	
	public static void main(String[] args) {
		String izvele;
		double cena, rekins;
		
		try {
		do {
			izvele = JOptionPane.showInputDialog("[1]Pasûtît picu | [2] Apskatît pasûtîjumu | [3] Sagatavot rçíinu");
		switch(izvele) {
		case "1":
			//pasutitPicu();
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

}
