interface GreetInterface{
    public String greet();
}

class Formal implements GreetInterface{
    @Override
    public String greet() {
        return "Good evening, sir.";
    }
}

class Casual implements GreetInterface{
    @Override
    public String greet() {
        return "Sup bro?";
    }
}

class Intimate implements GreetInterface{
    @Override
    public String greet() {
        return "Hello Darling!";
    }
}

class Mz implements GreetInterface{
    @Override
    public String greet() {
        return "안녕";
    }
}

class Others implements GreetInterface{
    @Override
    public String greet() {
        return "Hello";
    }
}


public class Greeter {
    String formality;
    //새로운 인사방식 추가
    //MZ 인사방식 추가 됐을 경우
    GreetInterface greet;
    Greeter(GreetInterface g){
        this.greet = g;
    }
    public String greet() {
        return  greet.greet();
    }
}