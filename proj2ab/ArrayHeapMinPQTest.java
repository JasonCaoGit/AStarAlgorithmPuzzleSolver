package bearmaps.proj2ab;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Random;

public class ArrayHeapMinPQTest {

    //make a random test on two options, add, change priority, remove smallest
    //see if the remove smallest is equal
    @Test
    public void test() {
        //loop 1000 times ,each time decide which action to take based on the random number
        Random rand = new Random();
        ArrayHeapMinPQ<Integer> pq1 = new ArrayHeapMinPQ<>();
        DoubleMapPQ<Integer> pq2 = new DoubleMapPQ<>();
        for (int i = 0; i < 1000; i++) {
            int random = rand.nextInt(3);
            if (random == 0) {
                //add a random number and priority to both queue
                int item = rand.nextInt(3000);
                int priority = rand.nextInt(200);
                pq1.add(item, priority);
                pq2.add(item, priority);


            } else {
                if (pq1.size() > 0) {
                    int item = pq1.removeSmallest();
                    int item2 = pq2.removeSmallest();
                    assertEquals(item, item2);


                }
            }

        }

    }

}

