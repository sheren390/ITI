import java.util.stream;

class Country {
private String code;
private String name; 
private String continent;
private double surfaceArea;
private int population;
private double gnp;
private int capital;
private List<City> cities;

public Country (String code,String name,String continent,double surfaceArea,int population,double gnp,int capital,List<City> cities){
this.code= code;
this.name= name;
this.continent= continent;
this.surfaceArea= surfaceArea;
this.population= population;
this.gnp= gnp;
this.capital= capital;
this.cities= cities;
}
}

class City {
private int id;
private String name;
private int population;
private String countrycode;

public City(int id,String name,int population,String countrycode){
}

}
public class CountryStreams {
public static void main (String args[]) {

