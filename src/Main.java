import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Driver driver1=new Driver();
        Driver driver=new Driver(20103201,"Yryskeldi", (byte) 32,'M',"Yryskeldi@gmail.com",0706000006L,40000);
        System.out.println(driver);
        driver1.favoriteSport();
        driver1.favoriteLanguage();
        driver1.favoriteMouth();
        driver1.getLastName();
        System.out.println(" ");
        Doctor doctors=new Doctor();
        Doctor doctor=new Doctor(30900934,"Altynbek",(byte) 34,'M',"altyn@gmail.com",0701343405L,60000);
        System.out.println(doctor);
        doctors.favoriteSport();
        doctors.favoriteLanguage();
        doctors.favoriteMouth();
        doctors.getLastName();
        System.out.println(" ");
        Programmer programmers=new Programmer();
        Programmer programmer=new Programmer(24256789,"Aman",(byte)28,'M',"Aman@gmail.com",0500004506,90000 );
        System.out.println(programmer);
        programmers.favoriteSport();
        programmers.favoriteLanguage();
        programmers.favoriteMouth();
        programmers.getLastName();
        sortoo();
    }
    public static void sortoo(){
        Driver driver=new Driver(20103201,"Yryskeldi", (byte) 32,'M',"Yryskeldi@gmail.com",0706000006L,40000);
        Doctor doctor=new Doctor(30900934,"Altynbek",(byte) 34,'M',"altyn@gmail.com",0703343405L,60000);
        Programmer programmer=new Programmer(24256789,"Aman",(byte)28,'M',"Aman@gmail.com",0500004506,90000 );
        Scanner scanner=new Scanner(System.in);
        while (true){
            String s= scanner.next();
            switch (s){
                case "driver":
                    System.out.println(driver);
                    break;
                case "doctor":
                    System.out.println(doctor);
                    break;
                case "programmer":
                    System.out.println(programmer);
                    break;
                default:
                    System.out.println("What is This");
            }
        }
    }
}