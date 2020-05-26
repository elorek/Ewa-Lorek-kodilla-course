package com.kodilla.patterns2.observer.homework;

public interface Observable {
    void subscribeMentor(Mentor mentor);
    void notifyMentors();
    void removeMentor(Mentor mentor);
}
