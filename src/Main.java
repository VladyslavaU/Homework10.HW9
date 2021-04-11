public class Main {
    public static void main(String[] args) {


        NewCollection collOne = new NewCollection();

        System.out.println("boolean add(String str);");
        collOne.add("One");
        collOne.add("Two");
        collOne.add("Three");
        collOne.add("Four");
        collOne.add("Five");
        collOne.printAll();
        System.out.println("-----------------------------------");

        System.out.println("boolean addAll(String[] strArr)");
        String[] arrayToAdd = {"Six", "Seven", "Eight"};
        collOne.addAll(arrayToAdd);
        collOne.printAll();
        System.out.println("--------------------------------------");

        System.out.println("boolean addAll(NewCollection strColl)");
        NewCollection collTwo = new NewCollection();
        collTwo.add("Nine");
        collTwo.add("Ten");
        collTwo.add("Eleven");

        collOne.addAll(collTwo);
        collOne.printAll();
        System.out.println("---------------------------------------");


        System.out.println("boolean delete(String str): deleting One");
        collOne.delete("One");
        collOne.printAll();
        System.out.println("----------------------------------------");


        System.out.println("String get(int index)");
        System.out.println("Index 0: " + collOne.get(0));
        System.out.println("Index 5: " + collOne.get(5));
        System.out.println("Index does not exist: " + collOne.get(15));
        System.out.println("------------------------------------------");

        System.out.println("boolean contains(String str)");
        System.out.println("contains Nine: " + collOne.contains("Nine"));
        System.out.println("does not contain twenty: " + collOne.contains("twenty"));
        System.out.println("-----------------------------------------");


        System.out.println("boolean clear()");
        collTwo.clear();
        collTwo.printAll();
        System.out.println("cleared size: " + collTwo.size());
        System.out.println("------------------------------------------");


        System.out.println("int size()");
        System.out.println("collOne size: " + collOne.size());
        System.out.println("--------------------------------------------");


        System.out.println("boolean trim()");
        collOne.trim();
        System.out.println("--------------------------------------------");


        System.out.println("boolean compare(NewCollection coll)");

        NewCollection collDifferent = new NewCollection();
        collDifferent.add("One");
        collDifferent.addAll(collOne);
        collDifferent.delete("Three");
        NewCollection collEquals = new NewCollection();
        collEquals.addAll(collOne);

        System.out.println("Different collections: " + collOne.compare(collDifferent));
        System.out.println("Same Collections: " + collEquals.compare(collOne));
        System.out.println("--------------------");

    }

}
