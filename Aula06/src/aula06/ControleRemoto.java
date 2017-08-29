package aula06;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado,tocando;

    public ControleRemoto() {
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void Desligar() {
        this.setLigado(false);
    }

    @Override
    public void AbrirMenu() {
        System.out.println("Ligado: " + ((this.isLigado())?"Sim":"Não"));
        System.out.print("Volume: " + this.getVolume());
        for(int i = 0; i< this.getVolume();i+=10){
            System.out.print("[]");
        }
        System.out.println("\nTocando: " + ((this.isTocando())?"Sim":"Não"));
    }

    @Override
    public void FecharMenu() {
        System.out.println("Fechando menu");
    }

    @Override
    public void MaisVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume()+5);
        }
    }

    @Override
    public void MenosVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume()-5);
        }
    }

    @Override
    public void LigarMudo() {
        if(this.isLigado() && this.getVolume()>0){
            this.setVolume(0);
        }
    }

    @Override
    public void DesligarMudo() {
        if(this.isLigado() && this.getVolume()==0){
            this.setVolume(50);
        }
    }

    @Override
    public void Play() {
        if(this.isLigado() && !this.isTocando()){
            this.setTocando(true);
        }
    }

    @Override
    public void Pause() {
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }
    }
        
}
