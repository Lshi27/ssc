public interface Animal extends Biology {
 void move();
 void eat();
}


public interface Biology {
 void breath();
}
public interface Mankind extends Animal{
 int MaxAge=150;//public static final 
 void study();
 void think();
}

public class Man implements Mankind{
 String name;
 String sex;
 int age;
 Man(){}
 Man(String name,int age){
  this.name=name;
  this.age=age;
  if(this.age>MaxAge) {
   System.out.println("年龄输入错误，更改为默认年龄");
   this.age=3;
  }
 }
 
 
 @Override
 public void move() {
  // TODO 自动生成的方法存根
  
 }

 @Override
 public void eat() {
  // TODO 自动生成的方法存根
  
 }

 @Override
 public void breath() {
  // TODO 自动生成的方法存根
  
 }

 @Override
 public void study() {
  // TODO 自动生成的方法存根
  System.out.println("子类执行study方法");
 }

 @Override
 public void think() {
  // TODO 自动生成的方法存根
  System.out.println("子类执行think方法");
 }

}

public class cai {

 public static void main(String[] args) {
  // TODO 自动生成的方法存根
  Mankind man=new Man();
  man.study();
 }

}
