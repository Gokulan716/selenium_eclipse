package Practice_Questions;


import java.util.ArrayList;
import java.util.List;


// Input: {4,5,6,-8,0,-6,7,-3,0,9,-5}
//Output: {0,0,4,5,6,-8,-6,7,-3,9,-5}

public class Array_sort {

	public static void main(String[] args) {
		

		List<Integer> list = new ArrayList<>(List.of(4, 5, 6, -8, 0, -6, 7, -3, 0, 9, -5));

        List<Integer> zeros = new ArrayList<>();
        List<Integer> nonZeros = new ArrayList<>();

        for (int num : list) {
            if (num == 0) {
                zeros.add(num);
            } else {
                nonZeros.add(num);
            }
        }


        list.clear(); 
        list.addAll(zeros);
        list.addAll(nonZeros);

        System.out.println(list);
        
	}
	

	}


