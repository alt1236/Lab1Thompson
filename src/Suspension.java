public class Suspension {
    private String front;
    private String back;

    public Suspension(String front, String back){
        this.front = front;
        this.back = back;
    }

    public void setFront(String front){
        this.front = front;
    }

    public String getFront(){
        return this.front;
    }

    public void setBack(String back){
        this.back = back;
    }

    public String getBack(){
        return this.back;
    }
}
