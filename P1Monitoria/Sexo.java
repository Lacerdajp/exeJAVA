package P1Monitoria;

public enum Sexo {
    MASCULINO(10,5),FEMININO(5,10);

    private final int forca;
    private final int inteligencia;
    private Sexo(int forca, int inteligencia) {
        this.forca = forca;
        this.inteligencia = inteligencia;
    }
    public int getForca() {
        return forca;
    }
    public int getInteligencia() {
        return inteligencia;
    }
    
    

}
