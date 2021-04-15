import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so khách trọ");
        int n=scanner.nextInt();
        MotelRoom[]motelRooms=new MotelRoom[n];
        for (int i =0;i<n;i++){
            motelRooms[i] = new MotelRoom();
            motelRooms[i].inputInfoRoom();

        }
        for (MotelRoom room:motelRooms){
            room.showInpuInfoRoom();
        }





    }
}
