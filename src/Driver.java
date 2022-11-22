public class Driver extends Person{
    public Driver(int id, String fullName, byte age, char gender, String email, long phoneNumber, double governmentsSalary) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
    }
    public Driver(){

    }


    @Override
    public void favoriteSport() {
        System.out.println("favoriteSport: basketball");
    }
    @Override
    public void favoriteLanguage() {
        System.out.println("favoriteLanguage: english");
    }
    @Override
    public void favoriteMouth() {
        System.out.println("favoriteMonth: february");
    }
    @Override
    public void getLastName() {
        System.out.println("getLastName: Kabylov");
    }
    @Override
    public void getDateOfBrith() {
        System.out.println("getDateOfBrith: 10");
    }

    @Override
    public void getPhoneNumberAndEmail() {
        System.out.println("PhoneNumberAndEmail: Kabylov@mail.com");
    }

    @Override
    public long[] getPeopleOfAllAges(Person[] people) {
        return new long[0];
    }
}

