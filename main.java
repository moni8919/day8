public class main {
    String name;
    main()
    {
        name="rajesh";
    }
    main(String name)
    {
        this.name=name;

    }
    void display()
    {
        System.out.println(name);
    }
    public static void main(String[] args){
        main o=new main();
        o.display();
        main o1=new main("punitha");
        o1.display();
    }
}
