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
   System.out.println("����������󣬸���ΪĬ������");
   this.age=3;
  }
 }
 
 
 @Override
 public void move() {
  // TODO �Զ����ɵķ������
  
 }

 @Override
 public void eat() {
  // TODO �Զ����ɵķ������
  
 }

 @Override
 public void breath() {
  // TODO �Զ����ɵķ������
  
 }

 @Override
 public void study() {
  // TODO �Զ����ɵķ������
  System.out.println("����ִ��study����");
 }

 @Override
 public void think() {
  // TODO �Զ����ɵķ������
  System.out.println("����ִ��think����");
 }

}

public class cai {

 public static void main(String[] args) {
  // TODO �Զ����ɵķ������
  Mankind man=new Man();
  man.study();
 }

}
