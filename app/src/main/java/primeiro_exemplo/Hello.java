package primeiro_exemplo;

import primeiro_exemplo.modelos.Pessoa;

public class Hello {
    public static void main(String[] args) {
        int cont = 10;
        String nome = "Juan";
        System.out.println("Olá Mundo!!!");

        System.out.println(cont + " : " + nome);

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Camille";
        pessoa1.idade = 17;

        System.out.println("Meu nome é " + pessoa1.nome + " e eu tenho " + pessoa1.idade + " anos e sou apaixonada pelo meu lindo namorado juan");

        Pessoa pessoa2 = pessoa1;
        pessoa2.nome = "Juan";

        System.out.println(pessoa2.nome);
        System.out.println(pessoa1.nome);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.nome = "Bernarda";
        pessoa3.idade = 19;

        System.out.println(pessoa1.verificarMaioridade());
        System.out.println(pessoa3.verificarMaioridade());
    }
}