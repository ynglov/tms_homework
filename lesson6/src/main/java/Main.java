public class Main {
    public static void main(String[] args) {

        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        user1.setName("Misha");
        user1.setProfession(Profession.DIRECTOR);
        user1.setExperience(20);
        user2.setName("Kirill");
        user2.setProfession(Profession.WORKER);
        user2.setExperience(3);
        user3.setName("Ylya");
        user3.setProfession(Profession.HR);
        user3.setExperience(10);
        user1.salary();
        user2.salary();
        user3.salary();
        user1.addCharges(1000);
        user2.addCharges(500);
        user3.addCharges(3000);
    }
}
