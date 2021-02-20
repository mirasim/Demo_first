package ru.netology.stats;

public class StatisticService {


    public long findMax (long[] incomes){
        long current_max_index=0;
        long current_max=incomes[0];
        for (long income:incomes)
            if (current_max<income) // если (current_max меньше< income) то тогда выполни следующую строку
                current_max=income; // присвой значения  current_max к значению income
            return current_max; // вернуть значение current_max

    }

    public String waterStatus (int temp){

        String status = "";

        if (temp > 100)
            status = "steam";
        if ( temp > 0 && temp < 100 )
            status = "water";
        if (temp < 0)
            status = "ice";
        return status;

    }




}
