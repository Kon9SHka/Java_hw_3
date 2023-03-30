// Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.ArrayList;
import java.util.Random;

public class task_1 {

    public static void main(String[] args) {
        ArrayList list_of_numbers = new ArrayList<Integer>();
        Random rdm = new Random();
        for (int i = 0;i <15;i++)
        {
            list_of_numbers.add(rdm.nextInt(0,17));
        }
        System.out.println(list_of_numbers);

        for (int i = 0; i < list_of_numbers.size();)
        {   int tmp_number = (Integer) list_of_numbers.get(i);
            if (tmp_number % 2 ==0) 
            {
                list_of_numbers.remove(i);
            }
            else i++;
        }
        System.out.println(list_of_numbers);
    }
}