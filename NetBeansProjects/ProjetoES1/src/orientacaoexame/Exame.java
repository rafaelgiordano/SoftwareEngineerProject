/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacaoexame;

/**
 *
 * @author Giulianno
 */
public class Exame 
{
    /*
     * Atributos da classe Exame
     */
    private String nome;
    private String codigo;
    private String agendamento;
    private String autorizacao;
    private String ativo;
    private String observacoes;
    private String prazoEntrega;

    /*
     * Métodos da classe Exame
     */
    public String getNome() 
    {
        return nome;
    }

    public String getCodigo() 
    {
        return codigo;
    }

    public String getAgendamento() 
    {
        return agendamento;
    }

    public String getAutorizacao() 
    {
        return autorizacao;
    }

    public String getAtivo() 
    {
        return ativo;
    }

    public String getObservacoes() 
    {
        return observacoes;
    }

    public String getPrazoEntrega() 
    {
        return prazoEntrega;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public void setCodigo(String codigo) 
    {
        this.codigo = codigo;
    }

    public void setAgendamento(String agendamento) 
    {
        this.agendamento = agendamento;
    }

    public void setAutorizacao(String autorizacao) 
    {
        this.autorizacao = autorizacao;
    }

    public void setAtivo(String ativo) 
    {
        this.ativo = ativo;
    }

    public void setObservacoes(String observacoes) 
    {
        this.observacoes = observacoes;
    }

    public void setPrazoEntrega(String prazoEntrega) 
    {
        this.prazoEntrega = prazoEntrega;
    }

    /*
     * Método que cria um novo exame
     */
    public boolean criarExame(String nome, String codigo, String agendamento, String autorizacao, String ativo, String observacoes, String prazoEntrega) 
    {
        setNome(nome);
        setCodigo(codigo);
        setAgendamento(agendamento);
        setAutorizacao(autorizacao);
        setAtivo(ativo);
        setObservacoes(observacoes);
        setPrazoEntrega(prazoEntrega);

        return true;
    }
    
    public boolean alterarExame()
    {
        return true;
    }
    
    public boolean removerExame()
    {
        return true;
    }
    
    public boolean consultarExame()
    {
        String n; 
        String cod; 
        String agend;
        String autor;
        String ativ;
        String obs;
        String prazo;
        
        n = getNome();
        cod = getCodigo();
        agend = getAgendamento();
        autor = getAutorizacao();
        ativ = getAtivo();
        obs = getObservacoes();
        prazo = getPrazoEntrega();
        
        return true;
    }
}
