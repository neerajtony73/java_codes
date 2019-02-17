public class Dept{
	private String name;
	private int num;
	private Teacher[] tlist;
	private Studentinh[] slist;

    //constructors
       
	public Dept(){
	}
	
	public Dept(String n,int nu,Teacher[] t,Studentinh[] s){
		this.name=n;
		this.num=nu;
		tlist=new Teacher[t.length];
		
		for(int i=0;i<tlist.length;i++){
			this.tlist[i]=new Teacher(t[i]);
		}
		slist=new Studentinh[s.length];
		for(int i=0;i<slist.length;i++){
			this.slist[i]=new Studentinh(s[i]);
		}
	}
	
	//tostring method
	
	public String tostring(){
		String output="";
		output+= "name of department :" + name+ "\nnumber of majors:"+num+"\n\n\nteachers list:\n\n";
		for(int i=0;i<tlist.length;i++){
			output+=tlist[i].tostring()+"\n";
		}
		output+="\n\n\nlist of students:\n\n";
			for(int i=0;i<slist.length;i++){
				output+=slist[i].tostring()+"\n";
			}
		return output;
	}
}
