package utils;
import java.lang.StackOverflowError;
import java.lang.NullPointerException;

public class Pilha {
	
    char [] vect;
    int topo; 
    
    public Pilha(int tamanho){
        this.vect = new char [tamanho];
        topo = -1;
    }
    
    public boolean isFull(){
       return (topo == this.vect.length - 1);        
    }
    
    public void push (char elemento){
        if(!isFull()){
            this.topo++;
            this.vect[topo] = elemento;
        }else{
            System.out.println("A pilha está cheia!!!");
            throw new StackOverflowError();
        } 
    }
    
    public boolean isEmpty(){
        return (this.topo == -1);
    }
 
    public char pop (){
        char elemento = ' ';
        if(!isEmpty()){
            elemento = this.vect[topo];
            topo--;
        }else{
            System.out.println("Está vazia");
            throw new NullPointerException();
        }
        return elemento;
    }
  
    public int size(){
        return this.topo + 1;
    }
}
