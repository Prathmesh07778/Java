class Parent{

    Parent(){
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent{

    Child(){
        System.out.println("Child Constructor");
    }
}


class Client {
    
    public static void main(String[] args){

        Parent p = new Parent();
        //Parent -> Object();

        Child c = new Child();
        //Child -> Parent -> Object();

    }
}
