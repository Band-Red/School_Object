public class School{
    String name;
    String address;
    int number_Students;
    public School(){
        this.name=name;
        this.address=address;
        this.number_Students=200;
    }
    public School(String name,String address){
        this.name=name;
        this.address=address;
    } 
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public int getNumber_Students(){
        return this.number_Students;
    }
    public void setName(){
        this.name=name;
    }
    public void setAddress(){
        this.address=address;
    }
    public void setNumber_Students(){
        this.number_Students=200;
    }
    public String printInfo(){
        return this.name+this.address+this.number_Students;
    }
}