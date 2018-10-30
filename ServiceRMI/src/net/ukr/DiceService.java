package net.ukr;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DiceService implements Service {

	JLabel label;
	JComboBox numOfDice;

	@Override
	public JPanel getGuiPanel() {
		JPanel panel = new JPanel();
		JButton button = new JButton("Roll 'em!");
		String[] choices = { "1", "2", "3", "4", "5" };
		numOfDice = new JComboBox(choices);
		label = new JLabel("dice values here ");
		button.addActionListener(new RollEmListener());
		panel.add(numOfDice);
		panel.add(button);
		panel.add(label);
		return panel;
	}

	public class RollEmListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// Бросаем кости
			String diceOut = "";
			String selection = (String) numOfDice.getSelectedItem();
			int numOfDiceRoll = Integer.parseInt(selection);
			for (int i = 0; i < numOfDiceRoll; i++) {
				int r = (int) ((Math.random() * 6) + 1);
				diceOut += (" " + r);
				
			}
			label.setText(diceOut);
			
		}
		
	}

}
