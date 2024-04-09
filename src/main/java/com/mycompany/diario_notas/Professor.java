package com.mycompany.diario_notas;

import javax.swing.JOptionPane;

public class Professor {

    String nome, email;
    int idade;

    public void entrar_Profe() {
        nome = JOptionPane.showInputDialog("Qual seu nome? ");
        email = JOptionPane.showInputDialog("Qual seu email? ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade? "));

        JOptionPane.showMessageDialog(null, "Bem vindo professor " + nome);
        JOptionPane.showMessageDialog(null, "email: " + email);
        JOptionPane.showMessageDialog(null, "idade: " + idade);
    }

}
