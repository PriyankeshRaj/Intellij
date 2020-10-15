package com.priyankesh;
class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}
class Jaws extends Movie{
    public Jaws() {
        super("Jaws");
    }
    @Override
    public String plot(){
        return "A shark eats lots of people";
    }
}
class Independence_day extends Movie{
    public Independence_day() {
        super("Independence day");
    }

    @Override
    public String plot() {
        return "Aliens attack earth";
    }
}
class Mazerunner extends Movie{

    public Mazerunner() {
        super("mazeRunner");
    }
    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}
class StarWars extends Movie{
    public StarWars() {
        super("StarWars");
    }
    @Override
    public String plot() {
        return "Imperial Forces tru to take on Universe";
    }
}
class Forgettable extends Movie{
    public Forgettable() {
        super("Forgettable");
    }
}



public class Main {

    public static void main(String[] args) {
        for (int i=1;i<11;i++){
	Movie movie=randomMovie();
            System.out.println("Movie #"+i+" "+movie.getName()+"\n"+"Plot: "+movie.plot()+"\n");
        }

    }
    public static Movie randomMovie(){
        int randomnumber=(int)(Math.random()*5)+1;
        System.out.println("Random Number generated was "+randomnumber);
        switch(randomnumber){
            case 1:return new Jaws();
            case 2:return new Independence_day();
            case 3:return new Mazerunner();
            case 4:return new StarWars();
            case 5:return new Forgettable();
        }
        return null;
    }
}
