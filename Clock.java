class Tclock {
    int hours;
    int minutes;
    int seconds;

    Tclock(int s) {
        seconds = s;
        setminutes();
        sethours();
    }

    void setminutes(){
    minutes = seconds/60;
    if(seconds%60==0){
	seconds=0;
    }   
    else{
        seconds = seconds%60; 
    }
    }

    void sethours(){
    hours = minutes/60;
    if(minutes%60==0){
	minutes=0;
    }   
    else{
        minutes =  minutes%60; 
    }
    }

    void display(){
        System.out.println("Hours:" +hours);
        System.out.println("Minutes:" +minutes);
        System.out.println("Seconds:" +seconds);
    }
}

class Clock {
    public static void main(String[] args) {
        Tclock C1 = new Tclock(86400);

        C1.display();
        
        
    }
}