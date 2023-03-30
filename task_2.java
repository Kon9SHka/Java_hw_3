//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

import java.util.ArrayList;
import java.util.Random;

public class task_2 {
    public static void main(String[] args) {
        ArrayList list_of_numbers = new ArrayList<Integer>();
        Random rdm = new Random();
        for (int i = 0;i <15;i++)
        {
            list_of_numbers.add(rdm.nextInt(0,17));
        }
        System.out.println(list_of_numbers);
        int max=0;
        int min=0;
        int sum=0;
        for (int i = 0; i < list_of_numbers.size();i++)
        {   
            int tmp_number = (Integer) list_of_numbers.get(i);
            if (tmp_number >=max) 
            {
                max = tmp_number;
            }
            else 
            {
                if (tmp_number <= min)
                {
                    min = tmp_number;
                }
            }
            sum = sum + tmp_number;
        }
        System.out.println(list_of_numbers);
        System.out.println("MAX: "+ max);
        System.out.println("MIN: "+ min);
        System.out.println("AVG: "+ sum/list_of_numbers.size());
    }
    
}
