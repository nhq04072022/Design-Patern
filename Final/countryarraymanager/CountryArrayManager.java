package com.countryarraymanager;

import java.util.ArrayList;
import java.util.Arrays;

public class CountryArrayManager {

    private Country[] countries;
    private int length;
    private final int increment;

    public CountryArrayManager() {
        this.increment = 10;
        countries = new Country[this.increment];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        this.increment = 10;
        countries = new Country[maxLength];
        this.length = 0;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[this.countries.length + this.increment];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i - 1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < newArray.length;
                 j++) { // Check all elements after the current element
                if (newArray[j].getPopulation()
                        < newArray[minIndex].getPopulation()) { // Compare with the second element
                    minIndex = j; // Update the index of the smallest element
                }
            }

            // Swap array[i] and array[min]
            Country temp = newArray[minIndex];
            newArray[minIndex] = newArray[i];
            newArray[i] = temp;

        }
        return newArray;
    }

    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < newArray.length;
                 j++) { // Check all elements after the current element
                if (newArray[j].getPopulation()
                        >= newArray[minIndex].getPopulation()) { // Compare with the second element
                    minIndex = j;
                }
            }

            // Swap array[i] and array[min]
            Country temp = newArray[minIndex];
            newArray[minIndex] = newArray[i];
            newArray[i] = temp;

        }
        return newArray;
    }

    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];

        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {

            for (int j = 0; j < newArray.length - 1 - i;
                 j++) { // Check all elements after the current element
                if (newArray[j].getArea()
                        > newArray[j + 1].getArea()) { // Compare with the second element
                    // Swap array[i] and array[min]
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }
        return newArray;
    }

    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {

            for (int j = 0; j < newArray.length - i - 1;
                 j++) { // Check all elements after the current element
                if (newArray[j].getArea()
                        <= newArray[j + 1].getArea()) { // Compare with the second element
                    // Swap array[i] and array[min]
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }
        return newArray;
    }

    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 1; i < newArray.length; i++) {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && key.getGdp() < newArray[j].getGdp()) {
                newArray[j + 1] = newArray[j]; //Move elements to the right
                j--;
            }
            newArray[j + 1] = key;
        }
        return newArray;
    }

    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 1; i < newArray.length; i++) {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && key.getGdp() > newArray[j].getGdp()) {
                newArray[j + 1] = newArray[j]; //Move elements to the right
                j--;
            }
            newArray[j + 1] = key;
        }
        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        ArrayList<AfricaCountry> result = new ArrayList<AfricaCountry>();
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof AfricaCountry) {
                result.add((AfricaCountry) countries[i]);
            }
        }
        AfricaCountry[] arr = result.toArray(new AfricaCountry[0]);
        return arr;
    }

    public AsiaCountry[] filterAsiaCountry() {
        ArrayList<AsiaCountry> result = new ArrayList<AsiaCountry>();
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof AsiaCountry) {
                result.add((AsiaCountry) countries[i]);
            }
        }
        AsiaCountry[] arr = result.toArray(new AsiaCountry[0]);
        return arr;
    }

    public EuropeCountry[] filterEuropeCountry() {
        ArrayList<EuropeCountry> result = new ArrayList<EuropeCountry>();
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof EuropeCountry) {
                result.add((EuropeCountry) countries[i]);
            }
        }
        EuropeCountry[] arr = result.toArray(new EuropeCountry[0]);
        return arr;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        ArrayList<NorthAmericaCountry> result = new ArrayList<NorthAmericaCountry>();
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof NorthAmericaCountry) {
                result.add((NorthAmericaCountry) countries[i]);
            }
        }
        NorthAmericaCountry[] arr = result.toArray(new NorthAmericaCountry[0]);
        return arr;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        ArrayList<SouthAmericaCountry> result = new ArrayList<SouthAmericaCountry>();
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof SouthAmericaCountry) {
                result.add((SouthAmericaCountry) countries[i]);
            }
        }
        SouthAmericaCountry[] arr = result.toArray(new SouthAmericaCountry[0]);
        return arr;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        ArrayList<OceaniaCountry> result = new ArrayList<OceaniaCountry>();
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof OceaniaCountry) {
                result.add((OceaniaCountry) countries[i]);
            }
        }
        OceaniaCountry[] arr = result.toArray(new OceaniaCountry[0]);
        return arr;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        Country[] result = Arrays.copyOfRange(sortByDecreasingPopulation(),0, howMany);
        return result;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] result = Arrays.copyOfRange(sortByIncreasingPopulation(),0, howMany);
        return result;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] result = Arrays.copyOfRange(sortByIncreasingPopulation(),0, howMany);
        return result;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] result = Arrays.copyOfRange(sortByIncreasingArea(),0, howMany);
        return result;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        Country[] result = Arrays.copyOfRange(sortByDecreasingGdp(),0, howMany);
        return result;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        Country[] result = Arrays.copyOfRange(sortByIncreasingGdp(),0, howMany);
        return result;
    }


}