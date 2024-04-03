package PBL5;
public class Usuario {
    private String nome;
    private String email;
    private String dataNascimento;
    private String genero;
    private boolean premium;
    private String country;


    public Usuario() {
        this.nome = "Nome";
        this.email = "Email";
        this.dataNascimento = "Data de nascimento";
        this.genero = "Gênero";
        this.premium = false;
        this.country = "País";
    }


    public Usuario(String nome, String email, String dataNascimento,
                   String genero, String country){
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.premium = false;
        this.country = country;
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }

    public boolean isPremium() {
        return premium;
    }
    public void premiar(){
        if (!premium){
            System.out.println("Você é premium!");
            premium = true;
        } else {
            System.out.println("Você não é premium.");
            premium = false;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}

