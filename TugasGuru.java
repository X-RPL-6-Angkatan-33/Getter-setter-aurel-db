
//Driver Class
import java.util.Scanner;

public class TugasGuru {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ID : ");
        int id = in.nextInt();
        System.out.println("Nama : ");
        String nama = in.nextLine();
        System.out.println("mapel :");
        String mapel =in.nextLine();
        System.out.println("alamat : ");
        String alamat =in.nextLine();

        
        //membuat obyek
        Guru aulia = new Guru();
        Guru munif = new Guru(6,"munif", "pai", "malang");
        Guru feni = new Guru(7, "Feni", "Matematika", "malang");
        Guru pasha = new Guru();
        Guru andre = new Guru();
        Guru diaur = new Guru();
        Guru ayat = new Guru();
        
        aulia.id = 1;
        aulia.nama = "Aulia";
        aulia.mapel ="Produktif RPL";
        aulia.alamat ="Malang";

        pasha.id = 2;
        pasha.nama = "Pasha";
        pasha.mapel ="Produktif RPL";
        pasha.alamat ="Malang";

        andre.id = 3;
        andre.nama = "Andre";
        andre.mapel ="Bahasa Inggris";
        andre.alamat ="Malang";

        diaur.id = 4;
        diaur.nama = "Diaur";
        diaur.mapel ="Penjas Dan Ipas";
        diaur.alamat ="Malang";

        ayat.id = 5;
        ayat.nama = "Ayat";
        ayat.mapel ="Informatika Ui/Ux";
        ayat.alamat ="Malang";

        System.out.println("Ini data bu aul");
        System.out.println(aulia.id);
        System.out.println(aulia.nama);
        System.out.println(aulia.mapel);
        System.out.println(aulia.alamat);
        System.out.println("Ini data bu pasha");
        System.out.println(pasha.id);
        System.out.println(pasha.nama);
        System.out.println(pasha.mapel);
        System.out.println(pasha.alamat);
        System.out.println("Ini data pak Andre");
        System.out.println(andre.id);
        System.out.println(andre.nama);
        System.out.println(andre.mapel);
        System.out.println(andre.alamat);
        System.out.println("Ini data pak diaur");
        System.out.println(diaur.id);
        System.out.println(diaur.nama);
        System.out.println(diaur.mapel);
        System.out.println(diaur.alamat);
        System.out.println("Ini data pak ayat");
        System.out.println(ayat.id);
        System.out.println(ayat.nama);
        System.out.println(ayat.mapel);
        System.out.println(ayat.alamat);

        munif.print();
        feni.print();

        
    }
    
}
