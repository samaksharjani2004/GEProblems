package AlgorithmPrograms;

import java.util.*;

class Task {
    int deadline;
    int time;

    Task(int d, int t) {
        deadline = d;
        time = t;
    }
}

public class MinimizeLateness {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tasks: ");
        int n = sc.nextInt();

        Task[] tasks = new Task[n];

        for (int i = 0; i < n; i++) {
            int d = sc.nextInt(); // deadline
            int m = sc.nextInt(); // minutes required
            tasks[i] = new Task(d, m);
        }

        // Sort by deadline (EDD Rule)
        Arrays.sort(tasks, Comparator.comparingInt(t -> t.deadline));

        int currentTime = 0;
        int maxLateness = 0;

        for (Task t : tasks) {
            currentTime += t.time;
            int lateness = currentTime - t.deadline;
            maxLateness = Math.max(maxLateness, lateness);
        }

        System.out.println("Maximum deadline overshoot: " + maxLateness);
    }
}

