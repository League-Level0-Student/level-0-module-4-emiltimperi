import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String Score = JOptionPane.showInputDialog("What did u get on your latest test?");
	double testScore = Double.parseDouble(Score);
	if (testScore >= 90.0) {
		JOptionPane.showMessageDialog(null, "Good Job!");
	} else {
		JOptionPane.showMessageDialog(null, "Maybe you should study more.");
	}
}
}
