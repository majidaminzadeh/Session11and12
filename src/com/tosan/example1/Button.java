package com.tosan.example1;

public class Button {
    Event event;

    public Button(Event event){
        this.event = event;
    }

    public Button(){

    }

    public void clicked(Action action){
        changeColorOfButton();
        showButtonAnimation();
        action.doAction(event);
        showButtonAfterActionAnimation();
    }

    private void showButtonAfterActionAnimation() {
    }

    private void showButtonAnimation() {
    }

    private void changeColorOfButton() {
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Event getEvent() {
        return event;
    }
}
