public class Tema2 {

    public static void main(String[] args) {
       
        Buffer b= new Buffer();
        Consumer c1= new Consumer(b);
        Producer p1= new Producer(b);
       
        p1.start();
        c1.start();
        
       
        // TODO code application logic here
    }
}
