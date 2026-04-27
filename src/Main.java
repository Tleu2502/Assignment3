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

        int[] array100 = sorter.generateRandomArray(100);
        System.out.println("Random array 100:");
        sorter.printArray(array100);
        sorter.basicSort(array100);
        System.out.println("Sorted array 100:");
        sorter.printArray(array100);


        System.out.println();
        experiment.runAllExperiments();
    }
}
