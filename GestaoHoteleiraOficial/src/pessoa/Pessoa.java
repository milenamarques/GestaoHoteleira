package pessoa;

import endereco.Endereco;
import java.util.ArrayList;

public class Pessoa extends Endereco{
  
    String nome;
    String data_nasc;
    String sexo;
    String rg;
    String cpf;
    String telefone;
    String email;
    ArrayList<Papel>  listaPapel = new ArrayList<>();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Papel> getListaPapel() {
        return listaPapel;
    }

    public void setListaPapeis(ArrayList<Papel> listaPapel) {
        this.listaPapel = listaPapel;
    }
    
   public void setListaPapel(Papel p){
      this.listaPapel.add(p);
   }

}
