public class searchanelement {
    public static void main(String[] args) {
        int[] marks = {50, 60, 70, 80};
        int num = 70;
        boolean isInMarks = false;
        for (int element : marks) {   //FOR - EACH LOOP
            if (num == element) {
                isInMarks = true;
                break;
            }
        }
        if (isInMarks) {
            System.out.println("element is present is the array ");
        } else {
            System.out.println("element is not present in the array ");
        }
    }
}
