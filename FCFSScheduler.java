import java.util.Arrays;
class Process {
String name;
int arrivalTime;
int burstTime;
public Process(String name, int arrivalTime, int burstTime) {
this.name = name;
this.arrivalTime = arrivalTime;
this.burstTime = burstTime;
}
}
public class FCFSScheduler {
public static void main(String[] args) {
Process[] processes = {
new Process("P1", 0, 5),
new Process("P2", 2, 3),
new Process("P3", 4, 6),
new Process("P4", 6, 2)
};
fcfsScheduling(processes);
}
public static void fcfsScheduling(Process[] processes) {
int currentTime = 0;
int totalProcesses = processes.length;
int[] completionTimes = new int[totalProcesses];
int[] waitingTimes = new int[totalProcesses];
int[] turnaroundTimes = new int[totalProcesses];
Arrays.sort(processes, (p1, p2) -> p1.arrivalTime - p2.arrivalTime);
for (int i = 0; i < totalProcesses; i++) {
Process currentProcess = processes[i];
waitingTimes[i] = currentTime - currentProcess.arrivalTime;
completionTimes[i] = currentTime + currentProcess.burstTime;
turnaroundTimes[i] = completionTimes[i] - currentProcess.arrivalTime;
currentTime += currentProcess.burstTime;
}
System.out.println("Process\tArrival Time\tBurst Time\tCompletion Time\tWaiting Time\tTurnaround Time");
for (int i = 0; i < totalProcesses; i++) {
Process currentProcess = processes[i];
System.out.println(currentProcess.name + "\t\t" +
currentProcess.arrivalTime + "\t\t" +
currentProcess.burstTime + "\t\t" +
completionTimes[i] + "\t\t" +
waitingTimes[i] + "\t\t" +
turnaroundTimes[i]);
}
}
}
