class Parent{
    
    int x = 10;

    Parent(){
        System.out.println("Parent Constructor");
    }
    void dispParent(){
        System.out.println(x);
    }

}

class Child extends Parent{

    Child(){
        System.out.println("Child constructor");
    }

    void dispChild(){
        System.out.println(x);
    }
}

class Client {
    
    public static void main(String[] args){

        Parent pobj = new Parent();
        pobj.dispParent();

        Child cobj = new Child();
        cobj.dispChild();
        cobj.dispParent();

    }
}
