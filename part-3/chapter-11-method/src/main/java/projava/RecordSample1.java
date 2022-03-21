package projava;

/**
 * プロになるJava
 * 11章「メソッド」のサンプルです
 * @author naoki
 */
public class RecordSample1 {

    record Student(String name, int englishScore, int mathScore){}

    public static void main(String[] args) {
        var kis = new Student("きしだ", 60, 80);
        var a = average(kis);
        System.out.println("平均点は%d点です".formatted(a));
    }

    static int average(Student s) {
        return (s.englishScore() + s.mathScore()) / 2;
    }
}
