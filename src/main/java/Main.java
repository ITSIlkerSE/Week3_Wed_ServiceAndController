public class Main {

    public static void main(String[] args) {


        StudentService mathService = new MathStudentService();
        StudentService biologyService = new BiologyStudentService();


        StudentController studentController = new StudentController(biologyService);

        String hello = studentController.getHello();

        System.out.println(hello);
    }
}


class StudentController {


    private StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }


    public String getHello() {
        return service.sayHello();
    }
}


class MathStudentService implements StudentService {

    @Override
    public String sayHello() {
        return "Hallo, ich liebe Mathe!";
    }
}


class BiologyStudentService implements StudentService {

    @Override
    public String sayHello() {
        return "Hallo, ich liebe Biologie!";
    }
}


interface StudentService {
    String sayHello();
}

//public class Main {
//
//    public static void main(String[] args) {
//
//        // Aufgabe:
//        // Erstelle im StudentController einen Konstruktor der einen StudentService übernimmt
//        // Probiere das getHello zu verändern indem du verschiedene Services nutzt
//        StudentController studentController
//                = new StudentController();
//
//        String hello = studentController.getHello();
//
//        System.out.println(hello);
//    }
//}
//
//class StudentController {
//
//    // Wir haben ein Objekt erstellt
//    // final = nicht mehr veränderbar
//    private final StudentService service = new MathStudentService();
//
//    // Ein Getter
//    public String getHello() {
//        return service.sayHello();
//    }
//}
//
//class MathStudentService implements StudentService {
//
//    @Override
//    public String sayHello() {
//        return "Hallo, ich liebe Mathe!";
//    }
//}
//
//class BiologyStudentService implements StudentService {
//
//    @Override
//    public String sayHello() {
//        return "Hallo, ich liebe Biologie!";
//    }
//}
//
//// Vom Interface kann kein Objekt erstellt werden
//interface StudentService {
//    // Muss implementiert werden vom Kind
//    String sayHello();
//}
//
