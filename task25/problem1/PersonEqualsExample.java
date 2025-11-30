/**
 * Демонстрация переопределения метода equals() класса Object.
 * Переопределение позволяет корректно сравнивать объекты класса Person
 * по значимым полям.
 */
public class PersonEqualsExample {

    /**
     * Класс Person с полями name и age.
     */
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        /**
         * Переопределение метода equals() для сравнения объектов Person.
         * Сравниваются поля name и age.
         *
         * @param obj объект для сравнения
         * @return true, если объекты равны, false в противном случае
         */
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;

            if (obj == null || getClass() != obj.getClass()) return false;

            Person other = (Person) obj;
            return age == other.age && (name != null ? name.equals(other.name) : other.name == null);
        }

        /**
         * Переопределение hashCode() рекомендуется делать вместе с equals()
         */
        @Override
        public int hashCode() {
            int result = (name != null) ? name.hashCode() : 0;
            result = 31 * result + age;
            return result;
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Alice", 25);
        Person p3 = new Person("Bob", 30);

        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.equals(p3)); // false
    }
}
