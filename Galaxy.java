public class Galaxy{
public String name;
public int number;
public double dia;
public Star[] stars;

//constructors

public Galaxy(){
}
public Galaxy(String na,int nu,double di,Star[] st){

     if (! isValidstate(na,nu,di)){
			System.out.print("fatal error");
			System.exit(0);
	 }

    this.setaccessna(na);
    this.setaccessnu(nu);
    this.setaccessdi(di);
    this.stars=new Star[st.length]; 
    for(int i=0;i<st.length;i++){
	   this.stars[i]=st[i];
       } 
}

//invariance checking

public boolean isValidstate(String name,int number,double diameter){
		return name!=null && !name.equals(" ")&& 
        (number!=0)&& (diameter!=0);
	
	}
//accessors and mutators

public void setaccessna(String t){
	this.name=t;
}
public String getaccessna(){
	return this.name;
}
public void setaccessnu(int y){
	this.number=y;
}
public int getaccessnu(){
	return this.number;
}

public void setaccessdi(double u){
	this.dia=u;
}
public double getaccessdi(){
	return this.dia;
}

//toString method

public String toString(){
		String output=" ";
		output += "name:" + name + "\n\n diameter:" +dia +"km"+"\n\n number of stars:" +number +"\n\n list of stars:\n\n";
		for(int i=0;i<stars.length;i++){
			output+=this.stars[i].toString()+"\n\n";
		}
		return output;
	}
	
// main method

public static void main(String[] args){
	Star[]  sta=new Star[3];
	sta[0]=new Star("orion" , 15000 , 6596 , 45468);
	sta[1]=new Star("serium" , 54646 , 45 , 7887);
	sta[2]=new Star("oreo" , 45545 , 498 , 455);
	
	Galaxy ga=new Galaxy("miliky way", 5586,66565.6,sta);
	
	System.out.println(ga.toString());
}
}
