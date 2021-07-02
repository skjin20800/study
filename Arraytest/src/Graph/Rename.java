package Graph;

public class Rename {
    public static int rename(String name){ // String To int
        if(name.equals(SubwayEnum.사당.toString())) {
            return 1;
        } else if (name.equals(SubwayEnum.교대.toString())) {
            return 2;
        } else if (name.equals(SubwayEnum.강남.toString())) {
            return 3;
        } else if (name.equals(SubwayEnum.역삼.toString())) {
            return 4;
        } else if (name.equals(SubwayEnum.선릉.toString())) {
            return 5;
        } else if (name.equals(SubwayEnum.삼성.toString())) {
            return 6;
        } else if (name.equals(SubwayEnum.양재.toString())) {
            return 7;
        } else if (name.equals(SubwayEnum.약수.toString())) {
            return 8;
        } else if (name.equals(SubwayEnum.옥수.toString())) {
            return 9;
        } else if (name.equals(SubwayEnum.남부.toString())) {
            return 10;
        } else if (name.equals(SubwayEnum.시민.toString())) {
            return 11;
        } else if (name.equals(SubwayEnum.청계.toString())) {
            return 12;
        } else if (name.equals(SubwayEnum.판교.toString())) {
            return 13;
        } else {
            System.out.println(name);
            return -9999;
        }
    }
}
