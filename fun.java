public class fun {
    public int top;//Empty array
    public int maxSize;
    public double[] array;//define array
    void stackDefine(String s) {
        maxSize =Integer.valueOf(s);
        array = new double[maxSize];
        top = -1;
    }
boolean valid(String verify) {
        int checkIsInt=0;


    for (int k=0;k<verify.length();k++){
        if(Character.isDigit(verify.charAt(k))){
            checkIsInt++;
            if(checkIsInt==verify.length()){
                return true;
            }else continue;
        }else break;
    }
return false;
    }


    void checkArray() {
        System.out.print("Values is : [");
        for (int i = 0; i < maxSize; i++) {
            System.out.print(array[i]);
            if (!(i == maxSize - 1)) {
                System.out.print(" ,");
            } else break;
        }
        System.out.println("]");
    }
    void push(double pNum) {
        array[++top] = pNum;
        System.out.println("Successfully added " + pNum + " to array\n");
        checkArray();
    }
    void pop() {
        if (!(top == -1)) {
            double lastSaveInPop = array[top];
            array[top] = 0.0;
            --top;
            checkArray();
            System.out.println("Successfully removed data in stack ");
        } else System.out.println("This is empty stack can't remove data\n");
    }

    void peek() {
        if (!(top == -1)) {
            System.out.println("Peek is[Most top element ] "+array[top]);
        } else System.out.println("This is empty stack nothing to show\n");
    }
}
