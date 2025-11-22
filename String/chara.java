package String;

public class chara {

    static void character(String str){
        int n = str.length();
        for(int i=0;i<=n;i++){
            for(int j=i+1;j<=n+1;j++){
                System.out.println(str.substring(i, j));
            }
        }
    }
    public static void main(String[] args) {
        String str="abcd";
        character(str);
        
    }
    
}
