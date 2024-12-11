 import java.util.*;
 public class mouni {
    String name;
    mouni(String name){
        this.name=name;
    }
    void dis1(){
        System.out.println(name);
    }
    void agt(){
        teacher s=new teacher();
        s.teach(this);
    }
    public static void main(String[] args){
      mouni o=new mouni("harshith");
      o.agt();
    }class teacher{
        public void teach(mouni s)
        {
            s.dis1();
        }
    }
    
}
