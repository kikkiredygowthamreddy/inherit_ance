class calx{
    public int add(int n1,int n2){
        return n1 + n2;
    }
}
class claxe extends calx{
    public int add(int n1,int n2){
        return n1 + n2 + 1;
    }
}
 
public class good{
    public static void main(String args[]){

claxe obj = new claxe();
int r1 = obj.add(3, 7);
System.out.println(r1);
    }
}