public class Stack {
    public static void main(String[] args) {
        StackManager s1 = new StackManager();

        s1.add("Item 1");
        s1.add("Item 2");
        s1.add("Item 3");
        s1.add("Item 4");
        s1.add("Item 5");
        s1.add("Item 6");

        s1.display();
        System.out.println(s1.count());

        // Remove the last item as follows :
        s1.remove();

        s1.display();
        System.out.println(s1.count());

    }

}

class StackManager {
    private String items[];
    private int top;

    public StackManager() {
        this.items = new String[10];
        this.top = -1; // Stack is empty initially
    }

    // Add an Item to the stack when requested
    public void add(String item) {
        if (top == items.length - 1) {
            System.out.println("Stack is full. Cannot add more items.");
            return;
        }
        items[++top] = item;
    }

    // Remove an Item from the stack when processed
    public String remove() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot remove item.");
            return null;
        }
        return items[top--];
    }

    // Display the current stack of items
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(items[i]);
        }
    }

    // Provide the count of items in the stack
    public int count() {
        return top + 1;
    }
}