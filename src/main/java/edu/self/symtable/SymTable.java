package edu.self.symtable;

import java.util.HashMap;

/**
 * Created by Hubert on 2016/10/8.
 */
public class SymTable {

    //Singleton
    public static final SymTable symTable = new SymTable();

    private HashMap<IdToken, Double> map = new HashMap<>();

    private SymTable() {}

    public static SymTable getInstance() {
        return symTable;
    }

    public void put(IdToken token, Double value) {
        map.put(token, value);
    }

    public Double get(IdToken idToken) {
        return map.get(idToken);
    }

    public IdToken getToken(IdToken token) {
        for (IdToken t : map.keySet()) {
            if (t.getName().equals(token.getName())) {
                return t;
            }
        }
        return null;
    }

}