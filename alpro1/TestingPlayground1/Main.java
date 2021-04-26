package def;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main implements ActionListener {

  private static JTextField inputBox;

  Main() {
    // Intentionally empty
  }

  public static void main(String args[]) {
    createWindow();
  }

  private static void createWindow() {
    JFrame f = new JFrame("Kalkulator");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    userInterface(f);
    f.setSize(200, 200);
    f.setLocationRelativeTo(null);
    f.setVisible(true);
  }

  private static void userInterface(JFrame f) {
    JPanel p = new JPanel();
    Main calc = new Main();
    GridBagLayout gbl = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();
    p.setLayout(gbl);

    inputBox = new JTextField(10);
    inputBox.setEditable(false);

    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");

    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    JButton kali = new JButton("x");
    JButton bagi = new JButton(":");
    JButton koma = new JButton(".");
    JButton hapus = new JButton("C");
    JButton samaDengan = new JButton("=");

    button0.addActionListener(calc);
    button1.addActionListener(calc);
    button2.addActionListener(calc);
    button3.addActionListener(calc);
    button4.addActionListener(calc);
    button5.addActionListener(calc);
    button6.addActionListener(calc);
    button7.addActionListener(calc);
    button8.addActionListener(calc);
    button9.addActionListener(calc);

    plus.addActionListener(calc);
    minus.addActionListener(calc);
    kali.addActionListener(calc);
    bagi.addActionListener(calc);
    koma.addActionListener(calc);
    hapus.addActionListener(calc);
    samaDengan.addActionListener(calc);

    gbc.fill = GridBagConstraints.HORIZONTAL;

    gbc.gridx = 0;
    gbc.gridy = 0;
    p.add(button1, gbc);

    gbc.gridx = 1;
    gbc.gridy = 0;
    p.add(button2, gbc);

    gbc.gridx = 2;
    gbc.gridy = 0;
    p.add(button3, gbc);

    gbc.gridx = 3;
    gbc.gridy = 0;
    p.add(plus, gbc);

    gbc.gridx = 0;
    gbc.gridy = 1;
    p.add(button4, gbc);

    gbc.gridx = 1;
    gbc.gridy = 1;
    p.add(button5, gbc);

    gbc.gridx = 2;
    gbc.gridy = 1;
    p.add(button6, gbc);

    gbc.gridx = 3;
    gbc.gridy = 1;
    p.add(minus, gbc);

    gbc.gridx = 0;
    gbc.gridy = 2;
    p.add(button7, gbc);

    gbc.gridx = 1;
    gbc.gridy = 2;
    p.add(button8, gbc);

    gbc.gridx = 2;
    gbc.gridy = 2;
    p.add(button9, gbc);

    gbc.gridx = 3;
    gbc.gridy = 2;
    p.add(kali, gbc);

    gbc.gridx = 0;
    gbc.gridy = 3;
    p.add(hapus, gbc);

    gbc.gridx = 1;
    gbc.gridy = 3;
    p.add(button0, gbc);

    gbc.gridx = 2;
    gbc.gridy = 3;
    p.add(koma, gbc);

    gbc.gridx = 3;
    gbc.gridy = 3;
    p.add(kali, gbc);

    gbc.gridx = 0;
    gbc.gridy = 4;
    p.add(inputBox, gbc);

    gbc.gridx = 3;
    gbc.gridy = 4;
    p.add(samaDengan, gbc);

    f.getContentPane().add(p, BorderLayout.CENTER);
  }

  public void actionPerformed(ActionEvent e) {
    String command = e.getActionCommand();

    if (command.charAt(0) == 'C') {
      inputBox.setText("");
    } else if (command.charAt(0) == '=') {
      inputBox.setText(penyelesaian(inputBox.getText()));
    } else {
      inputBox.setText(inputBox.getText() + command);
    }
  }
}
