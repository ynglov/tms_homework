public class User {
    private String name;
    private int experience;
    private Profession profession;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public void salary(){
        int i = 0;
        switch (profession){
            case HR: i = 1;
            break;
            case WORKER: i = 2;
            break;
            case DIRECTOR: i = 3;
            break;
        }
        System.out.println("salary " + profession + ", " + name + ": " + 1000 * experience * i + "$");
    }

    public void addCharges(int add){
        int i = 0;
        switch (profession){
            case HR: i = 1;
                break;
            case WORKER: i = 2;
                break;
            case DIRECTOR: i = 3;
                break;
        }
        System.out.println("salary with bonus " + profession + ", " + name + ": " + ((1000 * experience * i) + add) + "$");
    }
}
