
public class Country {

    private String name;
    private int population;
    
    public Country() {}
    
    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return this.name;
    }
    
    public int getCountry () {
        return this.population;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int pop) {
        this.population = pop;
    }
    
    @Override
    public String toString() {
        return name + " , " + population +"\n";
    }
    
    
}
