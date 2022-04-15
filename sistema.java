import java.util.Scanner;

public class sistema {
    static String[] nome = new String[12];
    static String[] cpf = new String[12];
    static String[] telefone = new String[12];
    static String[] email = new String[12];
    static String[] status = new String[12];

    public static void imprimir(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("--------------------------------");
            System.out.println("nome :" + nome[i]);
            System.out.println("Cpf ou Cnpj :" + cpf[i]);
            System.out.println("email :" + email[i]);
            System.out.println("telefone :" + telefone[i]);
            System.out.println("status :" + status[i]);
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
            System.out.printf("Cpf ou Cnpj: ");
            cpf[i] = ler.next();
            System.out.printf("email: ");
            email[i] = ler.next();
            System.out.printf("telefone: ");
            telefone[i] = ler.next();
            System.out.printf("status: ");
            status[i] = ler.next();
            System.out.println("-------------------------------");
        }
        imprimir(n);
    }
}