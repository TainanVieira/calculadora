import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
<<<<<<< HEAD
import java.util.Scanner;
=======
>>>>>>> origin/main

public class calculadora {
    private JPanel panelMain;

<<<<<<< HEAD
=======

    private JTextField txtPrimeiroValor;

    private JTextField txtSegundoValor;

    private JButton btnSomar;

>>>>>>> origin/main
    private JTextField txtResultado;

    private JButton btnLimpar;
    private JPanel getPanelMain;
<<<<<<< HEAD
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
    private JButton btnSomar;
    private JButton btnIgual;

    public calculadora(){
        btn01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                resultado.setText(resultado.getText() + "1");
=======

    public calculadora(){
        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Integer primeiro = Integer.valueOf(txtPrimeiroValor.getText());
                Integer segundo = Integer.valueOf(txtSegundoValor.getText());

                //processo
                Integer soma = primeiro + segundo;

                //Mandei para tela o resutado
                txtResultado.setText(soma.toString());
>>>>>>> origin/main



            }
        });
<<<<<<< HEAD
       // btn02.addActionListener(new ActionListener() {

      //  })
=======
>>>>>>> origin/main
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("Minha Calculadora");
        frame.setContentPane(new calculadora().getPanelMain);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
