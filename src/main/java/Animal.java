public class Animal {

    private String name;
    private int age;
    private String animalLoud;
    private String species;

    public Animal(String name, int age, String animalLoud, String species) {
        this.name = name;
        this.age = age;
        this.animalLoud = animalLoud;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAnimalLoud() {
        return animalLoud;
    }

    public void setAnimalLoud(String animalLoud) {
        this.animalLoud = animalLoud;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String giveAnimalLoud(){
        return animalLoud;
    }

    public String getNameAndAge(){
        String nameAge = "Name: " + name + " Alter: " + age + "!";
        return nameAge;
    }

    public String ageCategory(){
        String babyName = "";
        if(getAge() <= 2){
            babyName =  "baby animal";
        }
        else if(getAge() > 2 && getAge()<= 4){
            babyName = "young animal";
        }
        else if(getAge() > 4){
            babyName = "old animal";
        }
        return babyName;
    }
}
