package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) { // метод считает сумму всех продаж
        long totalSum = 0;
        for (long sale : sales) {
            totalSum = totalSum + sale;
            //      totalSum += sale;     -= *= /= %=
        }
        return totalSum;
    }

    public long averageSales(long[] sales) { // метод считает среднюю сумму продаж в месяц
        long averageSale = sum(sales) / sales.length;
        return averageSale;
    }

    public int maxSales(long[] sales) { // метод считает номер месяца максимальных продаж
        int monthMax = 0; // переменная для обозначения максимальной продажи (значение месяца)
        long saleMax = sales[0]; // переменная для обозначения максимальной продажи (индекс месяца)
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMax) {
                saleMax = sales[i];
                monthMax = i;
            }
        }
        return monthMax + 1;
    }

    public int minSales(long[] sales) { // метод считает номер месяца минимальных продаж
        int monthMin = 0;
        long saleMin = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= saleMin) {
                saleMin = sales[i];
                monthMin = i;
            }
        }
        return monthMin + 1;
    }

    public int salesMonthBelowAverage(long[] sales) { // метод считает кол-во месяцев, в кот. продажи ниже среднего
        long average = averageSales(sales);
        int quantity = 0; // счетчик месяца

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                quantity++;
            }
        }
        return quantity;
    }

    public int salesMonthAboveAverage(long[] sales) { // метод считает кол-во месяцев, в кот. продажи выше среднего
        long average = averageSales(sales);
        int quantity = 0; // счетчик месяца

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                quantity++;
            }
        }
        return quantity;
    }
}