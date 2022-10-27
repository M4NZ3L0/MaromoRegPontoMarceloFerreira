public class GerenciarControlePonto {

    public static void main(String[] args) throws InterruptedException {

        Gerente Pedro = new Gerente();
        Pedro.setNome("Gerente Pedro");
        RegistroPonto teste = new RegistroPonto();
        teste.setFunc(Pedro);
        teste.apresentarRegistroPonto();
        Thread.sleep(1000);

        Secretaria Felipe = new Secretaria();
        Felipe.setNome("Secretario Felipe");
        RegistroPonto S1 = new RegistroPonto();
        S1.setFunc(Felipe);
        S1.apresentarRegistroPonto();
        Thread.sleep(1000);

        Operador Luana = new Operador();
        Luana.setNome("Operadora Luana");
        RegistroPonto O1 = new RegistroPonto();
        O1.setFunc(Luana);
        O1.apresentarRegistroPonto();
        Thread.sleep(1000);
    }

}
