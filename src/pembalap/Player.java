package pembalap;

public class Player {
     // Definisi class Player
     String nama;
     int speed;
     int healthpoint;

     // method untuk class Player
     void run(){
         System.out.println(nama + " ngengggg....");
     }
     
          //definisi method mengecheck status kesehatan player
     boolean isDeath(){
         if(healthpoint <=0) return true;
         return false;
     }
}
