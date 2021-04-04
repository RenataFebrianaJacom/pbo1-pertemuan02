import java.util.scanner;

public class InputOutput{
 public static void main(String [] args){
  Scanner scanner = new Scanner(System.in);
  String nama;
  System.out.print("Masukan nama anda: ");
  nama = scanner.nextLine();
  System.out.println("Haiii, "+nama);

 }
}