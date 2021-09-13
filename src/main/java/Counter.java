public class Counter {

    //recursion the process of a function / method calling itself.
    //Create a method that counts from a start number to a finish number.

    void countTo(int start ,int stop) {
        if (start > stop) {
            System.out.println("Start value must be less than final value. Please try again! ");
            return;
        }

        System.out.println(start);

        start++;

        if (start <=stop){
            countTo(start,stop);
        }
        return;
    }

    void countDown(int start ,int stop) {
        if (stop > start) {
            System.out.println("Start value must be higher than final value. Please try again! ");
            return;
        }

        System.out.println(start);

        start--;
        if (start >= stop){
            countDown(start,stop);
        }
        return;
    }


}
