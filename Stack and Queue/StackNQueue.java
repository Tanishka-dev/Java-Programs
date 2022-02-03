public class StackNQueue{
    public static void main(String[] args) {
        CustomStack stack= new CustomStack(5);
        stack.push(9);
        stack.push(5);
        stack.push(4);
        stack.push(1);
        stack.push(2);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}