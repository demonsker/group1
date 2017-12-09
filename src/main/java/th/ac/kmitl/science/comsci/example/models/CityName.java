package th.ac.kmitl.science.comsci.example.models;

import java.util.ArrayList;

public class CityName implements Mapping {
    
    private ArrayList<String> name; 

    public CityName(){
        name = new ArrayList<String>(); 

        name.add("Phra Nakhon");
        name.add("Dusit");
        name.add("Nong Chok");
        name.add("Bang Ruk");
        name.add("Bang Khen");
        name.add("Bang Kapi");
        name.add("Pathum Wan");
        name.add("Pom Prap Sattru Phai");
        name.add("Phra Khanong");
        name.add("Min Buri");
        name.add("Lat Krabang");
        name.add("Yan Nawa");
        name.add("Samphanthawong");
        name.add("Phaya Thai");
        name.add("Thon Buri");
        name.add("Bangkok Yai");
        name.add("Huai Khwang");
        name.add("Khlong San");
        name.add("Taling Chan");
        name.add("Bangkok Noi");
        name.add("Bang Khun Thian");
        name.add("Phasi Charoen");
        name.add("Nong Khaem");
        name.add("Rat Burana");
        name.add("Bang Phlat");
        name.add("Din Daeng");
        name.add("Bueng Kum");
        name.add("Sathon");
        name.add("Bang Sue");
        name.add("Chatuchak");
        name.add("Bang Kho Laem");
        name.add("Prawet");
        name.add("Khlong Toei");
        name.add("Suan Luang");
        name.add("Chom Thong");
        name.add("Don Mueang");
        name.add("Ratchathewi");
        name.add("Lat Phrao");
        name.add("Watthana");
        name.add("Bang Khae");
        name.add("Lak Si");
        name.add("Sai Mai");
        name.add("Khan Na Yao");
        name.add("Saphan Sung");
        name.add("Wang Thonglang");
        name.add("Khlong Sam Wa");
        name.add("Bang Na");
        name.add("Thawi Watthana");
        name.add("Thung Khru");
        name.add("Bang Bon");
    }

    public ArrayList<String> getCityList(){
        return this.name;
    }

    @Override
    public int mapper(String name){
        switch(name){
            case "Phra Nakhon"          : return 1;
            case "Dusit"                : return 2;
            case "Nong Chok"            : return 3;
            case "Bang Ruk"             : return 4;
            case "Bang Khen"            : return 5;
            case "Bang Kapi"            : return 6;
            case "Pathum Wan"           : return 7;
            case "Pom Prap Sattru Phai" : return 8;
            case "Phra Khanong"         : return 9;
            case "Min Buri"             : return 10;
            case "Lat Krabang"          : return 11;
            case "Yan Nawa"             : return 12;
            case "Samphanthawong"       : return 13;
            case "Phaya Thai"           : return 14;
            case "Thon Buri"            : return 15;
            case "Bangkok Yai"          : return 16;
            case "Huai Khwang"          : return 17;
            case "Khlong San"           : return 18;
            case "Taling Chan"          : return 19;
            case "Bangkok Noi"          : return 20;
            case "Bang Khun Thian"      : return 21;
            case "Phasi Charoen"        : return 22;
            case "Nong Khaem"           : return 23;
            case "Rat Burana"           : return 24;
            case "Bang Phlat"           : return 25;
            case "Din Daeng"            : return 26;
            case "Bueng Kum"            : return 27;
            case "Sathon"               : return 28;
            case "Bang Sue"             : return 29;
            case "Chatuchak"            : return 30;
            case "Bang Kho Laem"        : return 31;
            case "Prawet"               : return 32;
            case "Khlong Toei"          : return 33;
            case "Suan Luang"           : return 34;
            case "Chom Thong"           : return 35;
            case "Don Mueang"           : return 36;
            case "Ratchathewi"          : return 37;
            case "Lat Phrao"            : return 38;
            case "Watthana"             : return 39;
            case "Bang Khae"            : return 40;
            case "Lak Si"               : return 41;
            case "Sai Mai"              : return 42;
            case "Khan Na Yao"          : return 43;
            case "Saphan Sung"          : return 44;
            case "Wang Thonglang"       : return 45;
            case "Khlong Sam Wa"        : return 46;
            case "Bang Na"              : return 47;
            case "Thawi Watthana"       : return 48;
            case "Thung Khru"           : return 49;
            case "Bang Bon"             : return 50;
            default : return 0;
        }
    }
    
}
