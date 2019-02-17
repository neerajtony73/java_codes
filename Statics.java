public  class Statics{
 static int numinstances=0;
	
	public static int Static(){
	return	numinstances;  
}

public static void  addinstsances(){
	numinstances++;
}
public Statics(){
Statics.addinstsances();
}
public static void main(String[] args){
	int i;
	for (i=0;i<500;i++){
		new Statics();
	}
	System.out.println("number of instances are " + Statics.Static());
}
} 	
