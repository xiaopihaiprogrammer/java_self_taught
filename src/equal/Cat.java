package equal;

public class Cat {
    public boolean equals(Object other){
        if (this == other){
            return true;
        }
        if (!(other instanceof Cat)){
            return false;
        }
        Cat cat = (Cat)other;
        if (!getClass().getName().equals(cat.getClass().getName())){
            return false;
        }
        return true;
    }
}
