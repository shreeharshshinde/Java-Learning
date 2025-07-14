package com.kunal.CollectionFramework.ArrayList;

public class StudentMarks implements Comparable<StudentMarks> {
    private int physicsMarks;
    private int mathsMarks;

    @Override
    public String toString() {
        return "StudentMarks {" +
                "physicsMarks=" + physicsMarks +
                ", mathsMarks=" + mathsMarks +
                '}';
    }

    public int getPhysicsMarks() {
        return physicsMarks;
    }

    public int getMathsMarks() {
        return mathsMarks;
    }

    public StudentMarks(int physicsMarks, int mathsMarks) {
        this.physicsMarks = physicsMarks;
        this.mathsMarks = mathsMarks;
    }


    @Override
    public int compareTo(StudentMarks o) {
        return this.mathsMarks - o.mathsMarks;
    }
}
