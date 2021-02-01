//버클리 자료구조 문제! 미드텀 1이라 객체 지향 내용도 좀 들어있어서 가져와봤습니다 ㅎㅎ

public class Box {
    char[] name; int value; Box box;
    public Box(char[] n, int v, Box b) {
        name = n;
        value = v;
        box = b;
    }
    void update0(int value) {
        this.value = value + 1;
    }
    void update1(int value) {
        value = this.value + 2;
    }
    void update2(int value) {
        value = value + 4;
    }
    void update3(char[] boxName) {
        name[2] = 'T';
        boxName = new char[]{'U', 'P', 'D', 'A', 'T', 'E', 'D'};
    }
    int update4(int value) {
        return value + 8;
    }
    void update5(Box box) {
        box.value = box.value + 16;
    }
    Box update6(Box box) {
        box = new Box(box.name, box.value, box.box);
        return box;
    }
    public static void main(String[] args) {
        Box box = new Box(new char[]{'B', 'O', 'X'}, 0, null);
        int a = 0; int b = 0; int c = 0;
        box.update0(a);
        box.update1(b);
        box.update2(c);
        System.out.println(a + b + c); // 0
        Box other = new Box(new char[]{'O', 'T', 'H', 'E', 'R'}, 2, box);
        System.out.println(other.name); // this println outputs: OTHER
        box.update3(other.name);
        System.out.println(box.name); // BOT
        System.out.println(other.name); // OTHER
        other.update4(box.value);
        other.update5(box);
        System.out.println(box.value); // 17
        System.out.println(other.value); // 2
// Write either true or false in the blanks below; do not abbreviate.
        Box result = box.update6(box);
        System.out.println(result == box); // false
        System.out.println(result.name == box.name); // true
        System.out.println(result.value == box.value); // true
        System.out.println(result.box == box.box); // true
        System.out.println(box == other.box); // true
    }
}