public class Experiment {

    Sorter sorter = new Sorter();
    Searcher searcher = new Searcher();

    public long measureSortTime(int[] arr, String type) {
        int[] copy = arr.clone();
        long start = System.nanoTime();
        if (type.equals("basic")) {
            sorter.basicSort(copy);
        } else {
            sorter.advancedSort(copy);
        }
        long end = System.nanoTime();
        return end - start;
    }

    public long measureSearchTime(int[] arr, int target) {
        long start = System.nanoTime();
        searcher.search(arr, target);
        long end = System.nanoTime();
        return end - start;
    }

    public void runAllExperiments() {
        int[] sizes = {10, 100, 1000};

        for (int i = 0; i < sizes.length; i++) {
            int size = sizes[i];

            int[] randomArray = sorter.generateRandomArray(size);

            int[] sortedArray = randomArray.clone();
            sorter.basicSort(sortedArray);

            int target = sortedArray[size / 2];

            System.out.println("Size: " + size);
            System.out.println("Bubble Sort:   " + measureSortTime(randomArray, "basic"));
            System.out.println("Merge Sort:    " + measureSortTime(randomArray, "advanced"));
            System.out.println("Binary Search: " + measureSearchTime(sortedArray, target));
            System.out.println();
        }
    }
}