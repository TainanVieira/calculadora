import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Scanner;


public class calculadora{
    private JPanel panelMain;



    private JTextField txtPrimeiroValor;

    private JTextField txtSegundoValor;

    private JButton btnSomar;


    private JTextField txtResultado;

    private JButton btnLimpar;
    private JPanel getPanelMain;

    private JButton btn01;
    private JButton btn02;
    private JButton btn03;
    private JButton btn04;
    private JButton btn05;
    private JButton btn06;
    private JButton btn07;
    private JButton btn08;
    private JButton btn09;
    private JButton btn0;
    private JTextField resultado;
    private JButton btnsubtracao;
    private JButton btndivisao;
    private JButton btnmultiplicacao;
    private JButton btnsomar;
    private JButton btnIgual;

    public calculadora(){
        btn01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                resultado.setText(resultado.getText() + "1");

            }
        });
        btn02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                resultado.setText(resultado.getText()+"2");

            }
        });
        btn03.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(resultado.getText()+"3");
            }
        });
        btn04.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(resultado.getText()+"4");
            }
        });
        btn05.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(resultado.getText()+"5");
            }
        });
        btn06.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(resultado.getText()+"6");
            }
        });
        btn07.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(resultado.getText()+"8");
            }
        });
        btn09.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(resultado.getText()+"9");
            }
        });
        btn0.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(resultado.getText()+"0");
            }
        });


    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("Minha Calculadora");
        frame.setContentPane(new calculadora().getPanelMain);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
