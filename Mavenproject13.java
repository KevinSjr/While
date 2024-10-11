/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject13;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Mavenproject13 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double nota = 0;
        double nota2 = 0;
      System.out.println("Digite quantos alunos tem na sua turma");
      int alunos = leia.nextInt();
      int alunos2 = alunos;
      while
      (alunos > 0)
      {System.out.println("Digite a nota do aluno");
        nota = leia.nextDouble();
        nota2 += nota;
        alunos--;
         }
      double meta = nota2/alunos2;
      System.out.println("A media da turma é"+meta);
      leia.close();
    }
}
