package DailyCodes.Inheritance.Program_1;

class Company {

    String cmpName = "Microsoft";
    String cmpLoc = "Pune";

    void cmpInfo(){

        System.out.println(cmpName);
        System.out.println(cmpLoc);
    }
    
}

class Emplyoee extends Company{

    String empName = "Ashish";
    double empSal = 2.5;

    void empInfo(){

        System.out.println(empName);
        System.out.println(empSal);
    }
}

class Client{

    public static void main(String[] args){

        Company cmp = new Company();
        cmp.cmpInfo();


        Emplyoee emp = new Emplyoee();
        emp.empInfo();

    }
}