package cat.institutmvm.entities;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLOutput;

import cat.institutmvm.entities.Person;

public class Worker extends JFrame {
    private JButton jbtOk;
    private JButton jbtClear;
    private JLabel jlFname;
    private JLabel jlLname;
    private JLabel jlPosition;
    private JTextField jtfFname;
    private JTextField jtfLname;
    private JTextField jtfPosition;
    private JTextArea jtfOut;
    private Object objTextField;

    public Worker() {
        this.setSize(500, 500);
        this.setTitle("Name and Position");
        this.setLocation(500, 150);
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    private void initComponents(){
        jlFname = new JLabel();
        jlLname = new JLabel();
        jlPosition = new JLabel();
        jtfFname = new JTextField();
        jtfLname = new JTextField();
        jtfPosition = new JTextField();
        jtfOut = new JTextArea();
        jbtOk = new JButton();
        jbtClear = new JButton();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                exitForm(e);
            }

        });

        getContentPane().setLayout(null);

        //definicio label
        jlFname.setText("First Name");
        getContentPane().add(jlFname);
        jlFname.setBounds(12, 28, 116, 14);

        //definicio textfield Fname
        jtfFname.setHorizontalAlignment(JTextField.LEFT);
        jtfFname.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jtfFnameFocusGained(e);
            }
        });
        jtfFname.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                jtfGradosKeyTyped(e);
            }
        });

        getContentPane().add(jtfFname);
        jtfFname.setBounds(132, 28, 250, 20);



        //definicio label farenheit
        jlLname.setText("Last Name");
        getContentPane().add(jlLname);
        jlLname.setBounds(12, 68, 104, 24);

        //definicio textfield farenheit
        jtfLname.setHorizontalAlignment(JTextField.LEFT);
        jtfLname.setText("");
        jtfLname.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jtfFnameFocusGained(e);
            }
        });
        jtfLname.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                jtfGradosKeyTyped(e);
            }
        });
        getContentPane().add(jtfLname);
        jtfLname.setBounds(132, 72, 250, 20);

        //definicio label
        jlPosition.setText("Position");
        getContentPane().add(jlPosition);
        jlPosition.setBounds(12, 116, 116, 14);

        //definicio textfield Fname
        jtfPosition.setHorizontalAlignment(JTextField.LEFT);
        jtfPosition.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jtfFnameFocusGained(e);
            }
        });
        jtfPosition.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                jtfGradosKeyTyped(e);
            }
        });

        getContentPane().add(jtfPosition);
        jtfPosition.setBounds(132, 116, 250, 20);

        //definicio textfield Out buit

        jtfOut.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jtfFnameFocusGained(e);
            }
        });
        jtfOut.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                jtfGradosKeyTyped(e);
            }
        });

        getContentPane().add(jtfOut);
        jtfOut.setBounds(20, 190, 450, 220);

        //definicio boto
        jbtOk.setText("Ok");
        jbtOk.setMnemonic('O');  //tecla de teclat que al pulsar executara el boto
        getRootPane().setDefaultButton(jbtOk);
        jbtOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jbtOkActionPerformed(e);
            }
        });
        getContentPane().add(jbtOk);
        jbtOk.setBounds(280, 150, 100, 24);


        //definicio boto
        jbtClear.setText("Clear");
        jbtClear.setMnemonic('C');  //tecla de teclat que al pulsar executara el boto
        getRootPane().setDefaultButton(jbtOk);
        jbtClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jbtClearActionPerformed();
            }
        });
        getContentPane().add(jbtClear);
        jbtClear.setBounds(370, 420, 100, 24);

    }

    private void jbtOkActionPerformed(ActionEvent evt){

        String Fname = jtfFname.getText();
        String Lname = jtfLname.getText();
        String Pos = jtfPosition.getText();
        var Person1 = new Person(Fname, Lname, Pos);
        String texto = String.format("%s \n %s \n %s", Fname, Lname, Pos);
        jtfOut.setText(texto);
        System.out.print(Person1);

    }

    private void jtfGradosKeyTyped(KeyEvent evt){
        objTextField = evt.getSource();
    }

    private void jtfFnameFocusGained(FocusEvent evt){
        JTextField objEnfocado = (JTextField) evt.getSource();  //conversio de tipus del getsource de evt per donarli a objenfocado
        objEnfocado.selectAll();
    }

    private void exitForm(WindowEvent e){
        // System.exit(0);  per aturar el programa al tancar la finestra
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void jbtClearActionPerformed(){
        jtfOut.setText(null);
    }




}
