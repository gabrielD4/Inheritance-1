public class Cat extends Animal {

    private String noise;

    public Cat (String noise) {
        this.noise = noise;
    }

    public String getNoise() {
        return this.noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    @Override
    public void makeNoise() {
        System.out.println("The noise of the the cat is = " + noise);
    }
}