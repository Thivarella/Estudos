package aula07;

import java.util.Random;

public class Luta{
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;
    
    public void MarcarLuta(Lutador desafiado,Lutador desafiante){
        if(desafiado.getCategoria().equals(desafiante.getCategoria()) && !desafiante.equals(desafiado)){
           this.setAprovado(true);
           this.setDesafiado(desafiado);
           this.setDesafiante(desafiante);
        }else{
           this.setAprovado(false);
           this.setDesafiado(null);
           this.setDesafiante(null);
        }
    }
    public void Lutar(){
        if(this.isAprovado()){
            System.out.println("\n##### DESAFIADO #####");
            this.desafiado.Apresentar();
            System.out.println("\n##### DESAFIANTE #####");
            this.desafiante.Apresentar();
            Random e = new Random();
            int vencedor = e.nextInt(3);
            System.out.println("\n==========================================");
            System.out.println("=========== RESULTADO DA LUTA ============");
            switch(vencedor){
                case 0:
                    System.out.println("\n\tEmpate!\n");
                    this.desafiado.EmpatarLuta();
                    this.desafiante.EmpatarLuta();
                    break;
                case 1:
                    System.out.println("\n\tE o vencedor foi " + this.desafiado.getNome() + "\n");
                    this.desafiado.GanharLuta();
                    this.desafiante.PerderLuta();
                    break;
                case 2:
                    System.out.println("\n\tE o vencedor foi " + this.desafiante.getNome() + "\n");
                    this.desafiante.GanharLuta();
                    this.desafiado.PerderLuta();
                    break;
            }
            System.out.println("==========================================");
        }else{
            System.out.println("\nLuta não irá acontecer!");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
}
