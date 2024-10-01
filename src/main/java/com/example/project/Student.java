package com.example.project;

public class Student {
    // instance variables 
    String firstName;
    String lastName;
    int graduationYear;
    double sumTestScores = 0.0;
    int testScoreCount = 0;
    double highestTestScore = 0.0;
    
    // constructor
    public Student(String firstName, String lastName, int gradYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.graduationYear = gradYear;
    }
 
    // returns firstName
    public String getFirstName() {
        //implement code here!
        return firstName;
    } 
    public String getLastName() {
        //implement code here!
        return lastName;
    }
 
    public double getHighestTestScore() {
        return highestTestScore;
    }

    public int getTestScoreCount(){
        //implement code here!
        return testScoreCount;
    }

    public int getGradYear(){
        //implement code here!
        return graduationYear;
    }
 
    // sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {
        //implement code here!
        graduationYear = newGradYear;
    }
 
    // adds newTestScore to accumulatedTestScores
    // and increments testScoreCount by 1
    // set new highest test score 
    public void addTestScore(double newTestScore) {
        sumTestScores += newTestScore;
        testScoreCount += 1;
        if (newTestScore >= highestTestScore){
            highestTestScore = newTestScore;
        }


    }
 
    // returns true if the student's average test score is greater
    // than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {
        if(sumTestScores/testScoreCount >= 65){
            return true;
        }else{
        return false;}
    }
 
    // returns the Student's average test score as the
    // quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore() {
        return sumTestScores/testScoreCount;
    }
 
    // this method prints all info of a Student object to the console 
    // I AM NOT TESTING YOU ON THIS METHOD. IT'S FOR YOUR TESTING PURPOSES ONLY.. you don't have to use it
    public void printStudentInfo() {
        System.out.println("Student Full Name: " + firstName +" " + lastName);
        System.out.println("Graduation Year: " + graduationYear);
        System.out.println("Number of tests: " + testScoreCount);
        System.out.println("Average Test Score: " + sumTestScores/testScoreCount );
        System.out.println("Highest Test Score: " + highestTestScore);
        System.out.println("Is passing: " + isPassing());
    }
 }
 