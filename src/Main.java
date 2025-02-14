public class Main {
    public static void main(String[] args) {
        //Задание 1
        int a = 338848;
        byte b = 100;
        short c = 22556;
        long d  = 654545456656654L;
        float e = 55.55556f;
        double f = 625.55522255;

        //Задание 2
        float num1 = 27.12f;
        long num2 = 987678965549L;
        float num3 = 2.786f;
        short num4 = 569;
        short num5 = -159;
        short num6 = 27897;
        byte num7 = 67;

        //Задание 3
        byte students1 = 23;
        byte students2 = 27;
        byte students3 = 30;
        int totalNumberStudents = students1 + students2 + students3;//при попытке поставить шорт дает ошибку??
        short totalSheets = 480;
        int sheetsOfPerStudents = totalSheets/totalNumberStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsOfPerStudents + " листов бумаги");

        //Задание 4
        byte bottles = 16;
        byte timeToMakeSixteenBottles = 2;
        int inAMinute = bottles/timeToMakeSixteenBottles;
        byte hoursInAOneDay = 24;
        byte minutesInAOneHour = 60;
        int minutesInAOneDay = hoursInAOneDay * minutesInAOneHour;

        byte timeTwentyMinutes = 20;
        int bottlesInATwentyMinutes = inAMinute * timeTwentyMinutes;
        System.out.println("За " + timeTwentyMinutes + " минут машина произвела " + bottlesInATwentyMinutes + " штук бытулок");

        byte oneDay = 1;
        int bottlesInAOneDay = inAMinute * minutesInAOneDay;
        System.out.println("За " + oneDay + " день машина произвела " + bottlesInAOneDay + " штук бытулок");

        byte threeDays = 3;
        int minutesAThreeDays = threeDays * hoursInAOneDay * minutesInAOneHour;
        int bottlesInAThreeDays = minutesAThreeDays * inAMinute;
        System.out.println("За " + threeDays + " дня машина произвела " + bottlesInAThreeDays + " штук бытулок");

        byte oneMonth = 1;
        byte daysInAMonth = 30;
        int minutesAMonth = daysInAMonth * hoursInAOneDay * minutesInAOneHour;
        int bottlesInAMonth = minutesAMonth * inAMinute;
        System.out.println("За " + oneMonth + " месяц машина произвела " + bottlesInAMonth + " штук бытулок");

        //Задание 5
        byte totalCansOfPaint = 120;
        byte perClassCansWhitePaint = 2;
        byte perClassCansOfBrownPaint = 4;

        int totalCansPerClass = perClassCansOfBrownPaint + perClassCansWhitePaint;
        int numberOfAllClasses = totalCansOfPaint / totalCansPerClass;
        int totalOfWhitePaint = numberOfAllClasses * perClassCansWhitePaint;
        int totalOfBrownPaint = numberOfAllClasses * perClassCansOfBrownPaint;
        System.out.println("В школе, где " + numberOfAllClasses + " классов, нужно " + totalOfWhitePaint + " банок белой краски и " + totalOfBrownPaint + " банок корчиневой краски");

        //Задание 6
        byte numberOfBananas = 5;
        byte weightOfOneBanana = 80;
        int totalWeightOfBananas = numberOfBananas * weightOfOneBanana;

        short amountOfMilk = 200;
        byte weightOfOneHundredMilliliters = 105;
        int totalWeightOfMilk = weightOfOneHundredMilliliters * 2;

        byte numberOfIceCream = 2;
        byte weightOfOneIceCream = 100;
        int totalWeightOfIceCream = numberOfIceCream * weightOfOneIceCream;

        byte numberOfRawEggs = 4;
        byte weightOfOneEgg = 70;
        int totalWeightOfEggs = numberOfRawEggs * weightOfOneEgg;

        float totalWeight = totalWeightOfBananas + totalWeightOfMilk + totalWeightOfIceCream + totalWeightOfEggs;
        System.out.println("Общий все спортивного завтрака составит: " + totalWeight + " грамм");

        short gramsInKilograms = 1000;
        float fromGramsToKilograms = totalWeight / (float)gramsInKilograms;
        System.out.println("Вес спортивного завтрака составит: " + fromGramsToKilograms + " кг");

        //Задание 7
        byte totalWeightToLose = 7;
        int fromKilogramToGram = totalWeightToLose * gramsInKilograms;
        short gramsPerDay1 = 250;
        short gramsPerDay2 = 500;
        int averageWeight = (gramsPerDay2 + gramsPerDay1)/2;

        int dayForWeightLoss1 = fromKilogramToGram / gramsPerDay1;
        System.out.println("Спортсмену потребуется " + dayForWeightLoss1 + " дней, если он будет сбрасывать по " + gramsPerDay1 + " грамм в день");

        int dayForWeightLoss2 = fromKilogramToGram / gramsPerDay2;
        System.out.println("Спортсмену потребуется " + dayForWeightLoss2 + " дней, если он будет сбрасывать по " + gramsPerDay2 + " грамм в день");

        float dayForAverageWeightLoss = (float)fromKilogramToGram / averageWeight;
        System.out.println("В среднем спортсменам потребуется " + dayForAverageWeightLoss + " дней чтобы сбросить " + totalWeightToLose + " кг");

        //Задание 8
        int mashaSalaryInMonth = 67760;
        int denisSalaryInMonth = 83690;
        int kristinaSalaryInMonth = 76230;
        byte monthInYear = 12;
        float percentInYear = 1.1f;

        int mashaSalaryInYear = mashaSalaryInMonth * monthInYear;
        int denisSalaryInYear = denisSalaryInMonth * monthInYear;
        int kristinaSalaryInYear = kristinaSalaryInMonth * monthInYear;

        float mashaWageGrowthForYear = mashaSalaryInYear * percentInYear;
        float denisWageGrowthForYear = denisSalaryInYear * percentInYear;
        float kristinaWageGrowthForYear = kristinaSalaryInYear * percentInYear;

        float diffMashaSalary = mashaWageGrowthForYear - mashaSalaryInYear;
        System.out.println("Маша теперь получает " + mashaWageGrowthForYear + " рублей. Годовой доход вырос на " + diffMashaSalary + " рублей");

        float diffDenisSalary = denisWageGrowthForYear - denisSalaryInYear;
        System.out.println("Денис теперь получает " + denisWageGrowthForYear + " рублей. Годовой доход вырос на " + diffDenisSalary + " рублей");

        float diffKristinaSalary = kristinaWageGrowthForYear - kristinaSalaryInYear;
        System.out.println("Кристина теперь получает " + kristinaWageGrowthForYear + " рублей. Годовой доход вырос на " + diffKristinaSalary + " рублей");
    }
}