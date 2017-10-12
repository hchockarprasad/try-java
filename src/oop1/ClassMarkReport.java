package oop1;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.Group;

import java.util.Scanner;

public class ClassMarkReport extends Application {

    @Override public void start(Stage stage) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of students: ");

        Integer total = sc.nextInt();

        int[] marks = new int[total];

        for (int i = 0; i < total; i++) {

            marks[i] = get_mark(i, marks, sc);
        }

        MarkRange mr = new MarkRange();


        for (int i = 0; i < total; i++) {

            if (marks[i] < 40) {
                mr.rangeFour += 1;
            }

            else if(marks[i] > 40 && marks[i] < 60) {
                mr.rangeThree += 1;
            }

            else if(marks[i] > 60 && marks[i] < 80) {
                mr.rangeTwo += 1;
            }

            if (marks[i] > 40) {
                mr.rangeOne += 1;
            }
        }

        Scene scene = new Scene(new Group());
        stage.setTitle("Marks scored by students");
        stage.setWidth(500);
        stage.setHeight(500);


        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("0-40", mr.rangeFour),
                        new PieChart.Data("40-60", mr.rangeThree),
                        new PieChart.Data("60-80", mr.rangeTwo),
                        new PieChart.Data("80-100", mr.rangeOne)
                );

        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Marks scored by students");

        ((Group) scene.getRoot()).getChildren().add(chart);
        stage.setScene(scene);
        stage.show();
    }

    private static int get_mark(int i, int[] marks, Scanner sc) {

        System.out.println("Enter marks scored by student " + String.valueOf(i+1) + " (0 - 100)");

        marks[i] = sc.nextInt();

        if (marks[i] < 0 || marks[i] > 100) {

            System.out.println("Invalid Mark..Try again.");

            get_mark(i, marks, sc);

        }

        return marks[i];

    }

    public static void main(String[] args) {
        launch(args);
    }
}

 class MarkRange {
    int rangeOne = 0;
    int rangeTwo = 0;
    int rangeThree = 0;
    int rangeFour = 0;
}