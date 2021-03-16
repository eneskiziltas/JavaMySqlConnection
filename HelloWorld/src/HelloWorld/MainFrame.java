package HelloWorld;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends AFrame{

	public MainFrame() {
		initFrame("Müþteri Ekle",initPanel());
	}

	@Override
	public JPanel initPanel() {
		JPanel panel = new JPanel(new GridLayout(3,2));
		
		
		JLabel nameJLabel = new JLabel("Adý:", JLabel.RIGHT);
		panel.add(nameJLabel);
		JTextField nameField = new JTextField(10);
		panel.add(nameField);
		
		JLabel surnameJLabel = new JLabel("Soyadý:",JLabel.RIGHT);
		panel.add(surnameJLabel);
		JTextField surnameField = new JTextField(10);
		panel.add(surnameField);
		
		JLabel idJLabel = new JLabel("id:",JLabel.RIGHT);
		panel.add(idJLabel);
		JTextField idField = new JTextField(10);
		panel.add(idField);
		
		JButton saveButton = new JButton("Kaydet");
		panel.add(saveButton);
		JButton updateButton = new JButton("Düzenle");
		panel.add(updateButton);
		
		
		
		saveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Customer contract = new Customer();
				contract.setId(Integer.parseInt(idField.getText()));
				contract.setName(nameField.getText());
				contract.setSurname(surnameField.getText());
				
				
				new CustomerDal().insert(contract);
				JOptionPane.showMessageDialog(nameField, contract.getName() +" "+contract.getSurname()+" kaydedildi.");
				
				
				
			}
			
		});
		
		
		
		
	
		
		
		
		return panel;
	}

}
