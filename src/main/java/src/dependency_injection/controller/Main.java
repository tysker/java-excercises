package src.dependency_injection.controller;

public class Main {



    public static void main(String[] args) {
        ControllerAgent<Guest, Integer> guestControllerAgent = new ControllerAgent<>(new TestController1<>());
        ControllerAgent<Employee, Integer> empControllerAgent2 = new ControllerAgent<>(new TestController2<>());

        guestControllerAgent.create(new Guest("John"));
        empControllerAgent2.create(new Employee("Jane"));
    }



}
