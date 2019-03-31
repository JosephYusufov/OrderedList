public class UserOfOrderedList {
    public static void main(String[] commandLine){
        // Create an OrderedList
        OrderedList terry = new OrderedList();
        bulkTest(terry, 500);
    }

    public static void bulkTest(OrderedList list, int amount){
        for(int counter = 0; counter < amount; counter ++){
            list.add((int) (Math.random() * 1000));
        }
        System.out.println(list);
    }
}
