package pembalap;

public class Main {
    public static void main(String[] args) {
        
        // Membuat Objek Player
        Player raha = new Player();

        //Mengisi Atribut
        raha.nama = "R4ha";
        raha.speed = 100;
        raha.healthpoint = 100;

        raha.run();
        
        if(raha.speed<=40){
            System.out.println("SPEED KOK " + raha.speed +  " ANJAY MODE AMAN BOS" );
        }else{
            System.out.println("NGABRET BANGET BOS SPEEDNYA " + raha.speed + " MO KEMANA ATU");
        }
        
        if(raha.isDeath()){
            System.out.println("R4ha kehabisan point ihh");
            System.out.println("Game Over!");
        }

    }
}
