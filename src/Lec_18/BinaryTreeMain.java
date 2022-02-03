package Lec_18;

public class BinaryTreeMain {
    public static void main(String[] args) {
        Binary_Tree obj = new Binary_Tree();
        obj.display();
        System.out.println(obj.find(70));
        System.out.println(obj.min());
        System.out.println(obj.count());
        System.out.println(obj.height());

        obj.preOrder();
    }
}
