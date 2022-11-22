public class Programmer extends Person{
    public Programmer(int id, String fullName, byte age, char gender, String email, long phoneNumber, double governmentsSalary) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
    }
    public Programmer(){

    }
    @Override
    public void favoriteSport() {
        System.out.println("favoriteSport: volleyball");
    }

    @Override
    public void favoriteLanguage() {
        System.out.println("favoriteLanguage: arabic");
    }

    @Override
    public void favoriteMouth() {
        System.out.println("favoriteMonth: april");
    }

    @Override
    public void getLastName() {
        System.out.println("LastName: imanbekov");
    }

    @Override
    public void getDateOfBrith() {
        System.out.println("DateOfBrith: 01");
    }

    @Override
    public void getPhoneNumberAndEmail() {
        System.out.println("imanbekov@gmail.com");
    }

    @Override
    public long[] getPeopleOfAllAges(Person[] people) {
        return new long[0];
    }


}







