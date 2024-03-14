public class Person {
    //Instance fields
    private String lastName;
    private String firstName;
    private int age;
    public Person(String last, String first, int a) { // constructor
        lastName = last;
        firstName = first;
        age = a;
    }
    public String getLast() // get last name 1
    {
        return lastName;
    }

    //toString method ...2
    @Override
    public String toString() {
        return "Person [lastName=" + lastName + "\n FirstName=" + firstName +
                "\nAge=" + age + "]";
    }

    //add method ... 3
    public void add(String s) {
        if (s == null) return;
        lastName = lastName + " " + s;
    }

    //isEmpty method ... 4
    public boolean isEmpty() {
        return (lastName == null || lastName.length() == 0);
    }

    //find method ... 5
    public boolean find(char s) {
        for (int i = 0; i < lastName.length(); i++) {
            if (lastName.charAt(i) == s) return true;
        }
        return false;
    }

    //insert method to insert an element by index ... 6
    public void insert(char s, int pos) {
        String temp = "";
        for (int i = 0; i < lastName.length(); i++) {
            if (pos == i) break;
            temp += lastName.charAt(i);
        }
        temp += s;
        for (int i = pos; i < lastName.length(); i++) {
            temp += lastName.charAt(i);
        }
        lastName = temp;
    }

    //remove method ... 7
    public boolean remove(char s) {
        String temp = "";
        int count = 0;
        for (int i = 0; i < lastName.length(); i++) {
            if (lastName.charAt(i) != s) {
                temp += lastName.charAt(i);
            } else {
                count++;
            }
        }
        lastName = temp;
        return (count > 0 ? true : false);
    }

    //size of the array ... 8
    public int size() {
        return lastName.length();
    }

    ////clone method ... 9
    public Object clone() {
        String lastNameClone = new String(lastName);
        return lastNameClone;
    }

    //main method
    public static void main(String[] args) {
        Person person = new Person("Hintsa", "Asmina", 30);

        //toString method
        String strReprsentation = person.toString();
        System.out.println(strReprsentation);

        //add method
        person.add("Tekle");

        //getLast method
        System.out.println(person.getLast());

        //isEmpty method
        System.out.println(person.isEmpty());

        //find method
        System.out.println(person.find('a'));

        //insert method
        person.insert('m', 6);
        System.out.println(person.getLast());

        //remove method
        System.out.println(person.remove('m'));
        System.out.println(person.getLast());

        //size method
        System.out.println(person.size());

        //clone method
        System.out.println(person.clone());
    }
}
