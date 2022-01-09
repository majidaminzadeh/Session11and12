package com.tosan.example1;

public class Example {
    public static void main(String[] args) {
        showForm();
    }

    private static void pressKeys() {
    }

    private static Event clickOnButton() {
        return new Event();
    }

    private static void showForm() {
        Button button = new Button();
        Event event = clickOnButton();
        button.setEvent(event);
        button.clicked(new Action() {
            @Override
            public void doAction(Event e) {
                System.out.println("I am callback fucntion");
            }
        });
        pressKeys();
    }
}
