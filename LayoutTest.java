import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * 
 */

/**
 * This is a test of border layouts
 * @author David Herr
 *
 */
public class LayoutTest extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1; 
	private JPanel mainPanel;
	private JPanel buttonPanel;
	private JLabel outputLabel;
	
	/**
	 * @param args
	 */
	public LayoutTest(){
		
		 super( "Layout Test");
		 JButton button;
		 JLabel label;
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setLayout( new BorderLayout());
		 
		 mainPanel = new JPanel();
		 buttonPanel = new JPanel();
		 
		 buttonPanel.setLayout( new GridLayout( 1, 3 ));
		 button = new JButton( "One" );
		 button.setActionCommand("One");
		 button.addActionListener(this);
		 buttonPanel.add(button);
		 
		 button = new JButton( "Two" );
		 button.setActionCommand("Two");
		 button.addActionListener(this);
		 buttonPanel.add(button);
		 
		 button = new JButton( "Three" );
		 button.setActionCommand("Three");
		 button.addActionListener(this);
		 buttonPanel.add(button);
		 
		 add(buttonPanel, BorderLayout.SOUTH);
		 
		 label = new JLabel("Here is what you wanted: " );
		 mainPanel.add(label);
		
		 outputLabel = new JLabel();
		 outputLabel.setPreferredSize( new Dimension(125, 15));
		 mainPanel.add( outputLabel );
		 
		 add( mainPanel, BorderLayout.CENTER);
		 setResizable(false);
		 setSize( getPreferredSize() );
		 pack();
		 setVisible(true);
	}
	// action listener switch statement
	public void actionPerformed( ActionEvent e){
		JButton button = (JButton)e.getSource();
		switch( button.getActionCommand() ){
		case "One":
			outputLabel.setText("You pressed ONE!" );
			break;
		case "Two":
			outputLabel.setText("You pressed TWO!");
			break;
		case "Three":
			outputLabel.setText("You pressed THREE!");
			break;
		default:
			JOptionPane.showMessageDialog( this, "Unknown button pressed!" );
			break;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LayoutTest();
		
	}

}
