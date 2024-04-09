package com.mycompany.diario_notas;

import javax.swing.JOptionPane;

public class Diario_notas {

    public static void main(String[] args) {

        String usuario = JOptionPane.showInputDialog("Digite 'professor' se for um professor ou escreva 'aluno' se for um aluno");
        if (usuario.equals("professor")) {
            Professor a2 = new Professor();
            a2.entrar_Profe();
        } else if (usuario.equals("aluno")) {
            Aluno a1;
            a1 = new Aluno();
            a1.entrar_Aluno();
        }
    }
}
