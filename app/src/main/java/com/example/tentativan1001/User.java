package com.example.tentativan1001;

public class User {
    private String id;
    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;
    private String cnpj;
    private String cep;
    private String cepRangeInicial;
    private String cepRangeFinal;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String custoPorKw;
    private String senha;
    private String statusUsuario;
    private String acessoUsuario;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCepRangeInicial() {
        return cepRangeInicial;
    }

    public void setCepRangeInicial(String cepRangeInicial) {
        this.cepRangeInicial = cepRangeInicial;
    }

    public String getCepRangeFinal() {
        return cepRangeFinal;
    }

    public void setCepRangeFinal(String cepRangeFinal) {
        this.cepRangeFinal = cepRangeFinal;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCustoPorKw() {
        return custoPorKw;
    }

    public void setCustoPorKw(String custoPorKw) {
        this.custoPorKw = custoPorKw;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getStatusUsuario() {
        return statusUsuario;
    }

    public void setStatusUsuario(String statusUsuario) {
        this.statusUsuario = statusUsuario;
    }

    public String getAcessoUsuario() {
        return acessoUsuario;
    }

    public void setAcessoUsuario(String acessoUsuario) {
        this.acessoUsuario = acessoUsuario;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", cep='" + cep + '\'' +
                ", cepRangeInicial='" + cepRangeInicial + '\'' +
                ", cepRangeFinal='" + cepRangeFinal + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", custoPorKw='" + custoPorKw + '\'' +
                ", senha='" + senha + '\'' +
                ", statusUsuario='" + statusUsuario + '\'' +
                ", acessoUsuario='" + acessoUsuario + '\'' +
                '}';
    }
}
