import java.io.*;
interface Intf{
	void display();
}
class Interface implements Intf{
public void display(){
                        System.out.println("Hello Interface");}
	public static void main(String[] args){
			Interface intf=new Interface();
			intf.display();
 		}
	}



	
