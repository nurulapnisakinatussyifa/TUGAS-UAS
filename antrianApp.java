
package tugasUAS;
public class antrianApp {
    public static void main(String[] args){
        antrian antrian = new antrian (10);
        antrian.enqueue(50);
        antrian.display();
        antrian.enqueue(60);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek ());
        System.out.println("nama saya adalah nurul apni sakinatus syifa");
        antrian.enqueue(70);
        antrian.display();
        System.out.println("yang diambil antrian = " + antrian.dequeue());
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek ());
        
    }
    
}
