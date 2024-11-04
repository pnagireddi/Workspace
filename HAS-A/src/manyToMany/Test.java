package manyToMany;

public class Test {

	public static void main(String[] args) {
            Cources cource1=new Cources(111,"java",10000);
            Cources cource2=new Cources(222,"Spring",5000);
            Cources cource3=new Cources(333,"Microservices",3000);
             
            Cources cources[]=new Cources[3];
            cources[0]=cource1;
            cources[1]=cource2;
            cources[2]=cource3;
            
            Students s=new Students(1,"ram",cources);
            Students s2=new Students(2,"laxman",cources);
            Students s3=new Students(3,"bharath",cources);
            
            s.display();
            s2.display();
            s3.display();
            
	}

}
