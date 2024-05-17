public class Cliente {

    private String nome;
    private String requestedType;
    private String preferenceMotor;

    public Cliente(String nome, String requestedType, String preferenceMotor) {
        this.nome = nome;
        this.requestedType = requestedType;
        this.preferenceMotor = preferenceMotor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRequestedType() {
        return requestedType;
    }

    public void setRequestedType(String requestedType) {
        this.requestedType = requestedType;
    }

    public String getPreferenceMotor() {
        return preferenceMotor;
    }

    public void setPreferenceMotor(String preferenceMotor) {
        this.preferenceMotor = preferenceMotor;
    }
}
