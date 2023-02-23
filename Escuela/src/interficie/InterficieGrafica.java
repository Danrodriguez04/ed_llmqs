package interficie;

import model.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterficieGrafica implements UserInterface {
    JFrame f;
    String data[][];

    public InterficieGrafica() {
        this.f = new JFrame();//creating instance of JFrame
        this.data = new String[0][3];
    }

    @Override
    public void pintaMenu() {
        JButton b = new JButton("Afegir usuari");//creating instance of JButton
        b.setBounds(130, 100, 100, 40);//x axis, y axis, width, height
        b.addActionListener(this.actionForm());

        JButton c = new JButton("Llistar usuaris");//creating instance of JButton
        c.setBounds(130, 200, 100, 40);//x axis, y axis, width, height
        c.addActionListener(this.actionLlistatUsuaris());

        this.f.add(b); //adding button in JFrame
        this.f.add(c); //adding button in JFrame

        this.f.setSize(400, 500);//400 width and 500 height
        this.f.setLayout(null);//using no layout managers
        this.f.setVisible(true);//making the frame visible
    }


    @Override
    public void llistarUsuaris() {
        JFrame f = new JFrame();

        String column[] = {"Nom", "Cognom1", "Cognom2"};
        JTable jt = new JTable(data, column);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 400);
        f.setVisible(true);
    }

    @Override
    public void afegirUsuari() {
        JFrame f = new JFrame("Alta usuaris");
        JTextField t1, t2;
        t1 = new JTextField("Nom");
        t1.setBounds(50, 100, 200, 30);
        t2 = new JTextField("Cognom 1");
        t2.setBounds(50, 150, 200, 30);

        JButton b = new JButton("Afegir usuari");//creating instance of JButton
        b.setBounds(50, 200, 100, 40);//x axis, y axis, width, height
        b.addActionListener(saveUsuari(t1, t2));

        f.add(t1);
        f.add(t2);
        f.add(b);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    private ActionListener actionForm() {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                afegirUsuari();
            }
        };
        return actionListener;
    }

    private ActionListener saveUsuari(JTextField nom, JTextField cognom1) {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[][] usuariaux = new String[data.length + 1][3];
                for (int i = 0; i < data.length; i++) {
                    usuariaux[i] = data[i];
                }
                usuariaux[data.length] = new String[]{nom.getText(),cognom1.getText(),""};
                data = new String[usuariaux.length][3];
                for(int i=0; i<usuariaux.length; i++){
                    data[i] = usuariaux[i];
                }
            }
        };
        return actionListener;
    }

    private ActionListener actionLlistatUsuaris() {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                llistarUsuaris();
            }
        };
        return actionListener;
    }
}