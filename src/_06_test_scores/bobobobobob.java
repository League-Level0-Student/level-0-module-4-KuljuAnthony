package _06_test_scores;

import javax.swing.JOptionPane;

public class bobobobobob {
	public static void main(String[] args) {
		
    String bob =JOptionPane.showInputDialog("whats your test score?");
    
   
	double  score = Double.parseDouble(bob);
	
	if(score >= 64) {
		JOptionPane.showMessageDialog(null, "you studied a little perhaps");
		
	}else {
		
		JOptionPane.showMessageDialog(null, "lazy fool get your butt out of here!");
	}
	

	
	
	
	
	}	
}


