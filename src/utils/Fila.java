package utils;

public class Fila {
	  
	No inicio;
    No fim;
    int size;
    
    public Fila(){
        this.inicio = null;
        this.fim = null;
        this.size = 0;
    }

    public void enqueue(No aux){ 
        if(inicio!=null){
	        this.fim.setProx(aux);
	        aux.setProx(null);
	        this.fim = aux;
	    } else{
            this.inicio = aux;
            this.fim = aux;
        }
        this.size++;
    }
    
    public No dequeue(){
		if(inicio == null) { 
			System.out.println("Fila esta vazia");
			return null;
		}
		No aux = this.inicio;
		this.inicio = aux.getProx();
		size--;
		return aux;
    }
    
    public int count(){  
        No aux = this.inicio;
        int count = 0;
        do{
            count++;
            aux = aux.getProx();
        }while(aux!=null);
        
        return count;    
    }
    
    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }
}
