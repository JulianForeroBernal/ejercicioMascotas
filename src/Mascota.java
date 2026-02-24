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
    public void vaccinate(){
        this.vaccinated = true;
    }
    public String feed(float amount){
        if(amount<0){
            return "no puede ser una cantidad negativa";
        }else {
            this.weight += amount;
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
