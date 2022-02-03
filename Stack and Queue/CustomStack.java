
public class CustomStack{
    int []data;
    int top=-1;
    private final static int DEFAULT_SIZE=10;
    public CustomStack(int size){
       this.data= new int[size];    
    }
    public boolean push(int item){
        if(isFull())
           return true;
        top++;   
        data[top]=item;
        return false;
    }
    private boolean isFull() {
        if(top==DEFAULT_SIZE-1)
          return true;  
        return false;
    }
    public int pop(){
        if(isEmpty())
           return -1;
        int deleted= data[top];
        top--;
        return deleted;
    }
    private boolean isEmpty() {
        if(top==-1)
          return true; 
        return false;  
    }
    public int peek(){
        int item=data[top];
        return item;
    }
}