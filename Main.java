import java.io.IOException;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    try {
      Service1 s = new Service1();
      s.addStudent(new Student("Krzysztof", 20));
      s.addStudent(new Student("Janusz", 40));
    
      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
        }
      //3
      Scanner wczytaj=new Scanner(System.in);
      int opcja=0;
      do{
        System.out.println("***********MENU***********");
        System.out.println("1. Dodawanie studenta");
        System.out.println("2. Lista studentów");
        
        System.out.println("0. Wyjście z programu");
        
        opcja=wczytaj.nextInt();
        switch (opcja){
          case 1:{
            System.out.println("imie: ");
            String imie=wczytaj.next();
            System.out.println("wiek: ");
            int wiek=wczytaj.nextInt();
            s.addStudent(new Student(imie, wiek));
            break;
          }
          case 2:{
            var lista=s.getStudents();
            for (Student aktualny : lista){
              System.out.println(aktualny.ToString());
            }
            break;
          }
        }
      }while(opcja!=0);
    } catch (IOException e) {

    }
  }
}