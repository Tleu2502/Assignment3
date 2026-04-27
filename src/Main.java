public class Main {

    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        Experiment experiment = new Experiment();

        int[] array = sorter.generateRandomArray(10);

        System.out.println("Random array:");
        sorter.printArray(array);

        sorter.basicSort(array);
        System.out.println("Sorted array:");
        sorter.printArray(array);

        System.out.println();
        experiment.runAllExperiments();
    }
}
