class Student{
    int rollNo;
    String name;
    String dept;
    String section;
    int year;
    
    Student(int rollNo,String name,String dept,String section,int year)
    {
        this.rollNo=rollNo;
         this.name=name;
          this.dept=dept;
           this.section=section;
            this.year=year;
    }
    
    void display(){
        System.out.println("rollNo:"+rollNo);
          System.out.println("name:"+name);
            System.out.println("dept:"+dept);
              System.out.println("section:"+section);
                System.out.println("year:"+year);
                System.out.println();
    }
}
public class Main{
    public static void main(String[] args){
        Student[]Students=new Student[3];
        Student s1=new Student(101,"Alice","CSE","A",2);
        Students [0]=s1;
        Student s2=new Student(102,"bob","ECE","B",3);
        Students [1]=s2;
        Student s3=new Student(103,"Charlie","IT","A",4);
        Students [2]=s3;
        
        for(int i=0;i<Students.length;i++){
            Students[i].display();
        }
    }
}
