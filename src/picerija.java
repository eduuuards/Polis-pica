import javax.swing.JOptionPane;

public class picerija {
	
	Pica pica;
	double cena;
	static double rekins=0;
	static int picasIzm;
	static int picasIzm2;
	static String picasNos;
	static String picasNos2;
	static int skaits=0;
	static String dzeriens;
	static String dzeriens2;
	static String dzerienaIzm;
	
	public static void apturet() {
		JOptionPane.showMessageDialog(null, "Pasutijums atcelts", null, JOptionPane.WARNING_MESSAGE);
		rekins = 0;
	}
	public static void kluda() {
		JOptionPane.showMessageDialog(null, "Darbiba nepastav");
	}
	
	public static double pasutitPicu1(double rekins) {
		double rekins1 =0;
		
		do {
			picasIzm = Integer.parseInt(JOptionPane.showInputDialog(null, "-=-PASÛTIJUMA VEIKÐANA-=- \nCik lielu picu vçlies pasûtit? \n 20cm $6,59 \n 30cm $7,59 \n 50cm $9,99 \n "));
		switch(picasIzm) {
		case 20:
			picasIzm2 = picasIzm;
			break;
		case 30:
			picasIzm2 = picasIzm;
			break;
		case 50:
			picasIzm2 = picasIzm;
			break;
		default:
			JOptionPane.showMessageDialog(null, "Lielums neatbilst", null, JOptionPane.ERROR_MESSAGE);
		}
		
		}while(picasIzm !=20 && picasIzm !=30 && picasIzm !=50);
			picasNos = JOptionPane.showInputDialog(null, "-=-PASÛTIJUMA VEIKÐANA-=- \nKadu picu vçlies pasûtit? \n[1]Studentu \n[2]Asa \n[3]Salami \n[4]Siera \n[x]Atcelt");
		
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
		
		if(picasIzm2==20) {
			rekins1 += 6.59;
		}else if(picasIzm2==30) {
			rekins1 += 7.59;
		}else if(picasIzm2==50){
			rekins1 += 9.99;
		}
		rekins1 = rekins;
		
		
			dzeriens =JOptionPane.showInputDialog(null, "-=-PASÛTIJUMA VEIKÐANA-=- \nVai vçlaties klât dzçrienu? \n[1]CocaCola \n[2]Fanta \n[3]Sprite \n[x]Bez dzçriena");
		
			switch(dzeriens) {
			case "1":
				dzeriens2 = "CocaCola";
				break;
			case "2":
				dzeriens2 = "Fanta";
				break;
			case "3":
				dzeriens2 = "Sprite";
				break;
			case "x":
				dzeriens2 = "Nav";
				break;
			default:
				kluda();
			}
			
			if(!dzeriens2.equals("Nav")) {
				
			dzerienaIzm = JOptionPane.showInputDialog(null, "-=- PASÛTIJUMA VEIKÐANA -=- \nCik lielu dzçrienu jûs vçlaties? \n[1]0.3l $0.50 \n[2]0.5l $0.70 \n[3]0.7l $0.99 \n[4]1.0l $1,20 \n[x]Atcelt");
			
			switch(dzerienaIzm) {
			case "1":
				dzerienaIzm = "0.3l";
				rekins += 0.50;
				break;
			case "2":
				dzerienaIzm = "0.5l";
				rekins += 0.70;
				break;
			case "3":
				dzerienaIzm = "0.7l";
				rekins += 0.99;
				break;
			case "4":
				dzerienaIzm = "1.0l";
				rekins += 1.20;
				break;
			case "x":
				apturet();
				break;
			default:
				kluda();
			}
			}
			
		return rekins;
	}
	
	public static void apskatitPasutijumu() {
		JOptionPane.showMessageDialog(null, "-=- JÛSU PASÛTIJUMS -=- \nPica: "+picasNos2+" "+picasIzm+" cm \nDzeriens: "+dzeriens2+" "+dzerienaIzm+" \nSumma: "+rekins);
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

}
