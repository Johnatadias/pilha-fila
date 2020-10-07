package utils;

public class No {
	
    private int dado;
    private No prox;
    
    public No(int dado){
        this.dado = dado;
        this.prox = null;
    }
    
    public int getDado(){
        return this.dado;
    }
    
    public No getProx(){
        return this.prox;
    }
    
    public void setDado(int info){
        this.dado = info;
    }
    
    public void setProx(No aux){
        this.prox = aux;
    }
}
