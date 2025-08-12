
class Array{
    void demoArray(){
        int []ages = {4 , 6 , 56 , 45};

        // for loop
        for(int i =0 ; i < ages.length ; i++){
            System.out.println(ages[i]);
            
        }

        // For each loop
        for(int age : ages){
            System.out.println(age);
        }

        // while loop
        int i=0;
        while(i <ages.length){
            System.out.println(ages[i]);
            i = i + 1;
        }
    }
}

public class loop {
    public static void main(String[] args) {
        Array obj = new Array();
        obj.demoArray();
    }
    
}
