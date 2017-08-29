package aula07;

public class Lutador {
    private String nome,nacionalidade,categoria;
    private int idade,vitorias,derrotas,empates;
    private float altura,peso;
    
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
       this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.getPeso()<52.2){
            this.categoria = "Inválido";
        }else if(this.getPeso()<=70.3){
            this.categoria = "Leve";
        }else if(this.getPeso()<=83.9){
            this.categoria = "Médio";
        }else if(this.getPeso()<=120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    
    public void Apresentar(){
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura() + "M");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.print(this.getVitorias() + " vitórias, ");
        System.out.print(this.getDerrotas() + " derrotas e ");
        System.out.print(this.getEmpates() + " empates.");
    }
    public void Status(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("W/L/D " + this.getVitorias() +"/"+ this.getDerrotas() + "/" + this.getEmpates() );
    }
    public void GanharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void PerderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void EmpatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
}
