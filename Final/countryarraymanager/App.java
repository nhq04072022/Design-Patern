package com.countryarraymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();

        /* TODO: write code to test program */
        testOriginalData();
        testSortIncreasingByPopulation();
        testSortDecreasingByPopulation();
        testSortDecreasingByArea();
        testSortIncreasingByArea();
        testSortDecreasingByGdp();
        testSortIncreasingByGdp();

        System.out.println("By continent:");
        testFilterAfricaCountry();
        testFilterAsiaCountry();
        testFilterEuropeCountry();
        testFilterNorthAmericaCountry();
        testFilterSouthAmericaCountry();
        testFilterOceaniaCountry();

        System.out.println("By pop, area and gdp");
        testFilterMostPopulousCountries();
        testFilterLeastPopulousCountries();
        testFilterLargestAreaCountries();
        testFilterSmallestAreaCountries();
        testFilterHighestGdpCountries();
        testFilterLowestGdpCountries();
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }

                /*
                 * TODO: create Country and append countries into
                 * CountryArrayManager here.
                 */
                String code = dataList.get(0);
                String name = dataList.get(1);
                int population = Integer.parseInt(dataList.get(2));
                double area = Double.parseDouble(dataList.get(3));
                double gdp = Double.parseDouble(dataList.get(4));
                Country country = new Country("null", "null");

                switch (dataList.get(5)) {
                    case "Asia":
                        country = new AsiaCountry(code, name, population, area, gdp);
                        break;
                    case "Africa":
                        country = new AfricaCountry(code, name, population, area, gdp);
                        break;
                    case "Europe":
                        country = new EuropeCountry(code, name, population, area, gdp);
                        break;
                    case "Oceania":
                        country = new OceaniaCountry(code, name, population, area, gdp);
                        break;
                    case "North America":
                        country = new NorthAmericaCountry(code, name, population, area, gdp);
                        break;
                    case "South America":
                        country = new SouthAmericaCountry(code, name, population, area, gdp);
                        break;
                }

                if (!country.getCode().equals("null")) {
                    countryManager.append(country);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }

        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath = "data/countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.println(codesString);
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testSortDecreasingByPopulation() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testSortIncreasingByArea() {
        /* TODO */
        Country[] countries = countryManager.sortByIncreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testSortDecreasingByArea() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testSortIncreasingByGdp() {
        /* TODO */
        Country[] countries = countryManager.sortByIncreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testSortDecreasingByGdp() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterAfricaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterAfricaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterAsiaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterAsiaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterEuropeCountry() {
        /* TODO */
        Country[] countries = countryManager.filterEuropeCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterNorthAmericaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterNorthAmericaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterOceaniaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterOceaniaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterSouthAmericaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterSouthAmericaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterMostPopulousCountries() {
        /* TODO */
        Country[] countries = countryManager.filterMostPopulousCountries(5);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterLeastPopulousCountries() {
        /* TODO */
        Country[] countries = countryManager.filterLeastPopulousCountries(5);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterLargestAreaCountries() {
        /* TODO */
        Country[] countries = countryManager.filterLargestAreaCountries(5);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterSmallestAreaCountries() {
        /* TODO */
        Country[] countries = countryManager.filterSmallestAreaCountries(5);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterHighestGdpCountries() {
        /* TODO */
        Country[] countries = countryManager.filterHighestGdpCountries(5);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterLowestGdpCountries() {
        /* TODO */
        Country[] countries = countryManager.filterLowestGdpCountries(5);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }
}
