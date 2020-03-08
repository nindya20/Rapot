
package rapot;

import java.util.Scanner;

class Guru extends Rapot{
    @Override
   void buka(){
   System.out.println("\t \t Pengisian Nilai");
   }
   void sis(){
   Scanner baca = new Scanner(System.in);
   System.out.print("Jumlah Data: ");
   int dat = baca.nextInt();
   int [] runtut = new int[dat];
   int [] har1 = new int[dat];
   int [] har2 = new int[dat];
   int [] nilai = new int[dat];
   String [] hasil = new String[dat];
   String [] nama = new String[dat];
   String [] kelas = new String[dat];
   String [] map = new String[dat];
   
   for(int i=0; i<dat; i++){
   System.out.print("Masukkan Nama: ");
   nama[i] = baca.next();
   System.out.print("Kelas: ");
   kelas[i] = baca.nextLine();
   kelas[i] = baca.nextLine();
   System.out.print("Jenis Mata Pelajaran: ");
   map[i] = baca.next();
   System.out.print("Masukkan Nilai Harian 1: ");
   har1[i] = baca.nextInt();
   System.out.print("Masukkan Nilai Harian 2: ");
   har2[i] = baca.nextInt();
   
   nilai[i] = (har1[i] + har2[i])/2;
   if (nilai[i] >=75 && nilai[i] <=100){
       hasil[i] = "Lulus dong";
   }else if (nilai[i] >=0 && nilai[i] <=74){
       hasil[i] = "Tidak Lulus iloo";
   }
   System.out.println("________________________________________________________________________________________________________________________________________________________________");
   System.out.println("|\t Nama Siswa \t|\tKelas \t     |\t    Mata Pelajaran \t|   \t Nilai Harian 1 \t|\t Nilai Harian 2 \t|            \t Hasil \t          |");
   for (int j=0; j<dat; j++){
       System.out.println("|\t"+nama[j]+"\t        |\t"+kelas[j]+"\t     |      \t"+map[j]+"\t        |         \t"+har1[j]+"\t        |        \t"+har2[j]+"\t        |\t"+hasil[j]+"\t|");
   }
   }
   }
   }