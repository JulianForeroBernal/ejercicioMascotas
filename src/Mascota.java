public class Mascota {
    private String name;
    private String specie;
    private byte age;
    private float weight;
    private boolean vaccinated;

    public Mascota(String name, String specie, byte age, float weight){
        this.name = name;
        this.specie = specie;
        this.age = age;
        this.weight = weight;
        this.vaccinated = false;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSpecie() {
        return specie;
    }
    public void setSpecie(String specie) {
        this.specie = specie;
    }
    public short getAge() {
        return age;
    }
    public void setAge(byte age) {
        this.age = age;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public boolean isVaccinated() {
        return vaccinated;
    }
    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
    public void vaccinate(){
        this.vaccinated = true;
    }
    public String feed(float amout){
        if(amout<0){
            return "no puede ser una cantidad negativa";
        }else {
            this.weight += amout;
            return "ha aumentado el peso de tu mascota!";
        }

    }
    public void birthday(){
        this.age += 1;
    }
    public String showInfo() {
        return "Mascota: " +
                "name: " + name + "\n" +
                "specie: " + specie + "\n" +
                "age: " + age + "\n" +
                "weight: " + weight + "\n" +
                "vaccinated: " + vaccinated;
    }
}
