import java.util.Objects;
import java.util.HashSet;
public class javadz6{
    public static void main(String[] args)
    {
        newcats();
    }

     public static void newcats()
    {
        HashSet<Cat> hashSet = new HashSet<Cat>();
        hashSet.add(new Cat("Whisky", 4, 32));
        hashSet.add(new Cat("Ricky",3,65));
        hashSet.add(new Cat("Ricky",3,65));
        hashSet.add(new Cat("Max",8,32));
        hashSet.add(new Cat("Reddy",6,43));
        hashSet.add(new Cat("Reddy",5,23));
        hashSet.add(new Cat("Reddy",6,43));
        hashSet.add(new Cat("Ricky",3,65));
        hashSet.add(new Cat("Max",8,32));
        hashSet.add(new Cat("Snow",7,45));
        System.out.println(hashSet);
        System.out.println(new Cat("Ricky",3,65).equals(new Cat("Ricky",3,65)));

    }
    public static class Cat{
        public String name;
        public int age;
        public int weight;

        public Cat(String name, Integer age, Integer weight)
        {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
       

        public String toString()
        {
            return "Cat "+this.name+" "+this.age+" "+this.weight;
        }
        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return name == cat.name && age == cat.age && weight == cat.weight;
    }
        public int hashCode(){
            return Objects.hash(name,age,weight);
        }
    }
}
