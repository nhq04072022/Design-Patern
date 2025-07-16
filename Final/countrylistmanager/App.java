package com.countrylistmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 6) {
                    continue;
                }

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                CountryData newCountryData = new CountryData.CountryDataBuilder(dataList.get(0))
                        .setName(dataList.get(1))
                        .setPopulation(Integer.parseInt(dataList.get(2)))
                        .setArea(Double.parseDouble(dataList.get(3)))
                        .setGdp(Double.parseDouble(dataList.get(4)))
                        .build();

                /* TODO
                * Từ dữ liệu nhận được, tạo các đối tượng Country và đưa và CountryListManager để quản lý. 
                */
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
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

    public static void main(String[] args) {
        testOriginalData();
        /* TODO */
    }

    public static void init() {
        String filePath = "data/countries2.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        init();
        String codes = CountryListManager.getInstance().codeOfCountriesToString(CountryListManager.getInstance().getCountryList());
        System.out.print(codes);
    }

    public static void testSortPopulationIncreasing() {
        /* TODO */
    }

    public static void testSortPopulationDecreasing() {
        /* TODO */
    }

    public static void testSortAreaIncreasing() {
        /* TODO */
    }

    public static void testSortAreaDecreasing() {
        /* TODO */
    }

    public static void testSortGdpIncreasing() {
        /* TODO */
    }

    public static void testSortGdpDecreasing() {
        /* TODO */
    }

    public static void testFilterContinent() {
        /* TODO */
    }

    public static void testFilterCountriesMostPopulous() {
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortPopulationDecreasing();
        List<AbstractCountry> nMostPopulousCountries = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nMostPopulousCountries.add(countries.get(i));
        }
        String codeString = CountryListManager.getInstance().codeOfCountriesToString(nMostPopulousCountries);
        System.out.print(codeString);
    }

    public static void testFilterCountriesLeastPopulous() {
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortPopulationIncreasing();
        List<AbstractCountry> nLeastPopulousCountries = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nLeastPopulousCountries.add(countries.get(i));
        }

        String codeString = CountryListManager.getInstance().codeOfCountriesToString(nLeastPopulousCountries);
        System.out.print(codeString);
    }

    public static void testFilterCountriesLargestArea() {
        /* TODO */
    }

    public static void testFilterCountriesSmallestArea() {
        /* TODO */
    }

    public static void testFilterCountriesHighestGdp() {
        /* TODO */
    }

    public static void testFilterCountriesLowestGdp() {
        /* TODO */
    }

}
