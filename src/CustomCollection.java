public interface CustomCollection {
    boolean add(String str);

    boolean addAll(String[] strArr);

    boolean addAll(NewCollection strColl);

    boolean delete(String str);

    String get(int index);

    boolean contains(String str);

    boolean clear();

    int size();

    boolean trim();

    boolean compare(NewCollection coll);


}
