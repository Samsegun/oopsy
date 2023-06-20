package Pojo;

public class Main {

    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("592300" + i,
                                    switch (i) {
                                        case 1 -> "Mary";
                                        case 2 -> "Damian";
                                        case 3 -> "Adonis";
                                        case 4 -> "James";
                                        case 5 -> "Scott";
                                        default -> "Unknown student";
                                    },
                                    "05/11/1985", "Java Masterclass");

            System.out.println(s);
        }

        Student pojoStudent = new Student("592306", "Ann",
                "05/11/1985", "Python Masterclass");

        LPAStudent recordStudent = new LPAStudent("592307", "Bill",
                "05/11/1985", "Python Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//        recordStudent.setClassList(recordStudent.getClassList() + ", Java OCP Exam 829"); error

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}
