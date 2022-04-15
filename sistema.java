import java.util.Scanner;

public class sistema {
    static String[] nome = new String[12];
    static String[] cpf = new String[12];
    static String[] telefone = new String[12];
    static String[] email = new String[12];
    static String[] status = new String[12];
    static String[] endereco = new String[12];
    static String[] rua = new String[12];
    static String[] numero_da_casa = new String[12];
    static String[] Quadra = new String[12];
    static String[] lote = new String[12];
    static String[] sobrenome = new String[12];

    public static void imprimir(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("--------------------------------");
            System.out.println("nome :" + nome[i]);
            System.out.println("Sobrenome :" + sobrenome[i]);
            System.out.println("Cpf ou Cnpj :" + cpf[i]);
            System.out.println("email :" + email[i]);
            System.out.println("telefone :" + telefone[i]);
            System.out.println("status :" + status[i]);
            System.out.println("bairro :" + endereco[i]);
            System.out.println("rua:" + rua[i]);
            System.out.println("numero-da-casa:" + numero_da_casa[i]);
            System.out.println("Quadra:" + Quadra[i]);
            System.out.println("lote:" + lote[i]);
            ValidaCPF(cpf[i]);
            validaEmail(email[i]);
            Validatelefone(telefone[i]);
        }
        System.out.println("-------------------------------");
    }

    public static void ValidaCPF(String cpf) {
        int digits = 0;
        for (int i = 0; i < cpf.length(); i++) {
            if (cpf.charAt(i) >= 48 && cpf.charAt(i) <= 57)
                digits++;
        }
        if (digits == 11 || digits == 14) {
            System.out.println("cpf/Cnpj:  valido");
        } else {
            System.out.println("cpf/Cnpj :e invalido");
            return;
        }

    }

    public static void validaEmail(String email) {
        boolean emailOK = email.matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+");
        if (emailOK == true) {
            System.out.println("email :  valido");

        } else {
            System.out.println("email : e invalido");
            return;
        }

    }

    public static void Validatelefone(String telefone) {
        int digits = 0;
        for (int i = 0; i < telefone.length(); i++) {

            if (telefone.charAt(i) >= 48 && telefone.charAt(i) <= 57)
                digits++;
        }
        if (digits == 13 || digits == 9 || digits == 11) {
            System.out.println("telefone : valido");
        } else {
            System.out.println("telefone : nao e valido");
            return;

        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("entre com a quantidade de vezes,para finalizar click em 0");
        int n = ler.nextInt();
        System.out.println("-------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("nome: ");
            nome[i] = ler.next();
            System.out.printf("Sobrenome com mais de um nome usar (-): ");
            sobrenome[i] = ler.next();
            System.out.printf("Cpf ou Cnpj: ");
            cpf[i] = ler.next();
            System.out.printf("email: ");
            email[i] = ler.next();
            System.out.printf("telefone: ");
            telefone[i] = ler.next();
            System.out.printf("status: ");
            status[i] = ler.next();
            System.out.printf("bairro com 2 nomes usar (-) entre os nomes: ");
            endereco[i] = ler.next();
            System.out.printf("rua com mais de um nome usar (-): ");
            rua[i] = ler.next();
            System.out.printf("numero-da-casa: ");
            numero_da_casa[i] = ler.next();
            System.out.printf("Quadra: ");
            Quadra[i] = ler.next();
            System.out.printf("lote: ");
            lote[i] = ler.next();

            System.out.println("-------------------------------");
        }
        imprimir(n);
    }
}