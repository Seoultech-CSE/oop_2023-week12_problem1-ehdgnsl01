import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 필요한 자료형을 넣어주세요
        ArrayList<Number> list = new ArrayList<Number>();
        System.out.print("Enter five integers and five doubles: ");
        for(int i=0;i<5;i++){
            int intValue = input.nextInt();
            list.add(intValue);
        }

        for(int i=0;i<5;i++){
            double doubleValue = input.nextDouble();
            list.add(doubleValue);
        }
        sort(list);

        for(Number number : list){
            System.out.print(number + " ");
        }


         input.close();
    }

    public static void sort(ArrayList<Number> list) {
        int size = list.size();
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                Number a = list.get(i);
                Number b = list.get(j);

                if(a.doubleValue()>b.doubleValue()){
                    list.set(i,b);
                    list.set(j,a);
                }
            }
        }
    }
}
