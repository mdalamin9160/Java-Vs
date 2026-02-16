class Geeks{
    String name;
    int id;
    Geeks(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
    void display(){
        System.out.println("GeekName: " + name
                + " and GeekId: " + id);
    }
    public static void main(String[] args){
        Geeks geek1 = new Geeks("Sweta", 68);
        geek1.display();
    }
}