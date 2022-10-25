class Start{
    public static void main(String[] data){
        Student s = new Student();
        s.name = "Hermione G";
        s.gender = Gender.FEMALE;
        System.out.println(s.gender);
    }
}

class Student {
    String name;
    Gender gender;
}

enum Direction { North, East, South, West }
enum Gender { MALE, FEMALE }

enum Suit { HEART, SPADE, DIAMOND, CLUB }
enum Workday { Monday, Tuesday, Wednesday, Thursday, Friday }