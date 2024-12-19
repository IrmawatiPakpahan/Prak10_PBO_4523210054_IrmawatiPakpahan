public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25, "Jakarta");
        person1.displayInfo();

        // ubah nilai attribut menggunakan setter
        person1.setName("irma");
        person1.setAge(18);
        person1.setAddress("Jakarta");
        System.out.println(person1.getName());

        //Tampilkan kembali informasi
        System.out.println("Update Informasi:");
        person1.displayInfo();
    }
}