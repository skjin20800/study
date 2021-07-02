package arrayList;

public class ArrayListMain {
    public static void main(String[] args) {

        ArrayList data = new ArrayList();

        System.out.println("");
        System.out.println("");
        System.out.println("ADD 메소드");
        for(int i = 0 ; i <= 30; i++){
            data.add(i);
            System.out.println("인덱스 : "+i+" 값 : "+ data.get(i) +" 배열 크기 : "+data.size()+" 배열 전체 크기 : "+ data.arraySize() +" 배열이 비어있니? " + data.isEmpty());
        }

        System.out.println("");
        System.out.println("");
        System.out.println("REMOVE 메소드");
        for(int i = 0 ; i <= 30; i++){
            data.remove(0);
            System.out.println("인덱스 : 0 값 : "+ data.get(0) +" 배열 크기 : "+data.size()+" 배열 전체 크기 : "+ data.arraySize() +" 배열이 비어있니? " + data.isEmpty());
        }

        System.out.println("");
        System.out.println("");
        System.out.println("SET 메소드");

        System.out.println("add : data 0,1,2 주입");
        data.add(0);
        data.add(1);
        data.add(2);

        System.out.println("set : data 3,4,5 변경");
        data.set(0,3);
        data.set(1,4);
        data.set(2,5);
        System.out.println("인덱스 : 0 값 : "+ data.get(0) +" 배열 크기 : "+data.size()+" 배열 전체 크기 : "+ data.arraySize() +" 배열이 비어있니? " + data.isEmpty());
        System.out.println("인덱스 : 1 값 : "+ data.get(1) +" 배열 크기 : "+data.size()+" 배열 전체 크기 : "+ data.arraySize() +" 배열이 비어있니? " + data.isEmpty());
        System.out.println("인덱스 : 2 값 : "+ data.get(2) +" 배열 크기 : "+data.size()+" 배열 전체 크기 : "+ data.arraySize() +" 배열이 비어있니? " + data.isEmpty());
        data.remove(0);
        data.remove(0);
        data.remove(0);




        System.out.println("");
        System.out.println("");
        System.out.println("CLEAR 메소드, 배열 1~30 주입");
        for(int i = 0 ; i <= 30; i++){
            data.add(i);
        }
        System.out.println("인덱스 : "+30+" 값 : "+ data.get(30) +" 배열 크기 : "+data.size()+" 배열 전체 크기 : "+ data.arraySize() +" 배열이 비어있니? " + data.isEmpty());


        System.out.println("");
        System.out.println("Clear 실행");
        data.clear();

        for(int i = 0 ; i <= data.size(); i++){
            System.out.println("인덱스 : "+i+" 값 : "+ data.get(i) +" 배열 크기 : "+data.size()+" 배열 전체 크기 : "+ data.arraySize() +" 배열이 비어있니? " + data.isEmpty());
        }



    }
}
