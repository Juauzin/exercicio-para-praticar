/*
 * Crie um programa que calcule a média de salários d3e uma empresa,
 * pedindo ao usuário a grade de funcionários e os sálarios e devolvendo
 * a media salarial.
 */


public class MediaSalario {
    public static void main(String[] args) {
     //declaração de variaveis
        double n1, n2, n3, n4, media;

        n1 = 3453.21;
        n2 = 3498.43;
        n3 = 7902.09;
        n4 = 12932.00;

        media = (n1 + n2 + n3 + n4) / 4;
        //resulatado da media 
        System.out.println("A média salarial da empresa é de R$ " + media);
    }
}