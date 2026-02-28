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
    public String vaccinate(){
        this.vaccinated = true;
        return "tu mascota ha sido vacunada";
    }
    public String feed(float amount){
        if(amount<0){
            return "no puede ser una cantidad negativa";
        }else {
            this.weight += amount;
            return "ha aumentado el peso de tu mascota!";
        }

    }
    public String birthday(){
        this.age += 1;
        return "tu mascota ha cumplido un año";
    }
    public String showInfo() {
        return "Mascota: " +
                "name: " + name + "\n" +
                "specie: " + specie + "\n" +
                "age: " + age + "\n" +
                "weight: " + weight + "\n" +
                "vaccinated: " + vaccinated;
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

    public byte getAge() {
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
}
