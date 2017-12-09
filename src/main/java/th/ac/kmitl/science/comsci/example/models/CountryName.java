package th.ac.kmitl.science.comsci.example.models;

public class CountryName implements Mapping {
    
    @Override
    public int mapper(String name){
        switch(name){
            case "Thailand"                 : return 1;
            case "USA"                      : return 2;
            case "United States of America" : return 2;
            case "America"                  : return 2;
            case "China"                    : return 3;
            case "Japan"                    : return 4;
            case "England"                  : return 5;
            case "France"                   : return 6;
            case "Spain"                    : return 7;
            case "Brazil"                   : return 8;
            case "Argentina"                : return 9;
            case "Mexico"                   : return 10;
            case "Canada"                   : return 11;
            case "India"                    : return 12;
            default : return 0;
        }
    }
    
}
