package com.example.sharedpreferences;

public class DataModel {
    private String[] names = {
            "Ram","Hari","Prakash","Gita","Uma","Sara",
            "Ram","Hari","Prakash","Gita","Uma","Sara",
            "Ram","Hari","Prakash","Gita","Uma","Sara",
            "Ram","Hari","Prakash","Gita","Uma","Sara",
            "Ram","Hari","Prakash","Gita","Uma","Sara",
            "Ram","Hari","Prakash","Gita","Uma","Sara"
    };
    private String[] address = {
            "nepal", "japan", "usa", "india", "german",
            "nepal", "japan", "usa", "india", "german",
            "nepal", "japan", "usa", "india", "german",
            "nepal", "japan", "usa", "india", "german",
            "nepal", "japan", "usa", "india", "german",
            "nepal", "japan", "usa", "india", "german"
    };

    public String[] getNames(){
        return names;
    }

    public String[] getAddress() {
        return address;
    }
}
