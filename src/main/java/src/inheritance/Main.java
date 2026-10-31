//package src.inheritance;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Task t1 = new Task("Task 1", "Description 1");
//        Task t2 = new Task("Task 2", "Description 2");
//        Task t3 = new Task("Task 3", "Description 3");
//
//        GardenTask gt1 = new GardenTask("Garden Task 1", "Garden Description 1", "Garden Location 1");
//        GardenTask gt2 = new GardenTask("Garden Task 2", "Garden Description 2", "Garden Location 2");
//        GardenTask gt3 = new GardenTask("Garden Task 3", "Garden Description 3", "Garden Location 3");
//
//        TaskList<Task> taskList = new TaskList<>();
//        taskList.add(t1);
//        taskList.add(t2);
//        taskList.add(t3);
//        taskList.add(gt1);
//
//        System.out.println("Get Index: " + taskList.getIndex());
//        System.out.println("Get Size: " + taskList.getSize());
//
//        taskList.iterator().forEachRemaining(System.out::println);
//
//    }
//}
