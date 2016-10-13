package edu.self.symtable;

/**
 * Created by Hubert on 2016/10/8.
 */
public class IdToken {

    public enum Type {
        INT, FLOAT
    }

    Type type;
    String name;

    public IdToken(Type type, String name) {
        this.type = type;
        this.name = name;
    }

    public IdToken(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        return ((IdToken)obj).getName().equals(name);
    }

    @Override
    public int hashCode() {
        //arbitrary initial result 31 (could be any non-zero integer)
        int result = 31;

        //only Id's name is under consideration
        result = 37 * result + name.hashCode();

        return result;
    }
}
