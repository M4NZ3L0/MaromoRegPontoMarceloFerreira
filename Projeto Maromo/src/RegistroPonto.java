import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroPonto {
    private long idRegPonto;
    private Funcionário func;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    //functions

    public void apresentarRegistroPonto() throws InterruptedException {

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println(this.func.getNome());
        System.out.println("Data de Registro: " + DateTimeFormatter.ofPattern("dd/MM/YY").format(LocalDate.now()));
        System.out.println("Horário Entrada: " + DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").format(LocalDateTime.now()));
        Thread.sleep(1000);
        System.out.println("Horario Saida: " + DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").format(LocalDateTime.now()));

    }


    //getters

    public Funcionário getFunc() {
        return func;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public long getIdRegPonto() {
        return idRegPonto;
    }

    //setters


    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public void setFunc(Funcionário func) {
        this.func = func;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public void setIdRegPonto(long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }
}
