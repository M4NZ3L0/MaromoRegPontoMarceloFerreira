public class Funcionário {
    private int idFunc;
    private String nome;
    private String email;
    private String documento;

    //getters


    public int getIdFunc() {
        return idFunc;
    }

    public String getDocumento() {
        return documento;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    //setters

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
