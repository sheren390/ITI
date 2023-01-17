

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;




public class Exercise1 {

   public static void main(String[] args) {
      CountryDao countryDao= InMemoryWorldDao.getInstance();
      List<Optional> MostPopul = countryDao.findAllCountries().stream()
			     .map(Country -> Country.getCities().stream().max(Comparator.comparing(City::getPopulation))).collect(Collectors.toList());
	MostPopul.forEach(City -> System.out.println(City));
   }
}