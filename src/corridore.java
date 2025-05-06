public class corridore  extends Thread{
    
    private String nome;

    public corridore(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "corridore [nome=" + nome + "]";
    }


        public void run(){
            for(int i=0; i<=100; i++){
                System.out.println(nome + "->" + i + " metri ");
            }
            System.out.println("Il corridore" + nome + "è arrivato!");
        }

}
