package com.mycompany.diario_notas;

import javax.swing.JOptionPane;

public class Aluno {

    String nome, RA, email, telefone;
    int idade;

    public void entrar_Aluno() {
        nome = JOptionPane.showInputDialog("Qual seu nome? ");
        RA = JOptionPane.showInputDialog("Qual seu RA? ");
        email = JOptionPane.showInputDialog("Qual seu email? ");
        telefone = JOptionPane.showInputDialog("Qual seu telefone? ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade? "));

        JOptionPane.showMessageDialog(null, "Bem vindo aluno " + nome);
        JOptionPane.showMessageDialog(null, "RA: " + RA);
        JOptionPane.showMessageDialog(null, "email: " + email);
        JOptionPane.showMessageDialog(null, "número de contato: " + telefone);
        JOptionPane.showMessageDialog(null, "idade: " + idade);
    }

}
