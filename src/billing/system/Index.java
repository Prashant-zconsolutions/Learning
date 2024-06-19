package billing.system;

import java.util.*;
import java.util.stream.Collectors;

public class Index {
    public static int unit =100;


    public static List<Rate> getList() {
        Rate rate = new Rate(1, "home", 4, 0, 100);
        Rate rate1 = new Rate(2, "home", 6, 100, 300);
        Rate rate2 = new Rate(3, "home", 10, 300, 500);
        Rate rate3 = new Rate(4, "home", 15, 500, 0);

        return Arrays.asList(rate, rate3, rate2, rate1);
    }

    public static void main(String[] args) {

        List<Rate> rateList = getList();


        rateList.sort((o1, o2) -> o1.getMin().compareTo(o2.getMin()));

        int billPrice = 0;

        for(int i=0 ; i<rateList.size() ;i++)
        {

            Rate rate = rateList.get(i);

            // get max units from rate
            int maxUnit = i==rateList.size()-1 ?
                    unit :
                    rate.getMax() - rate.getMin();


            if(unit > maxUnit)
            {
                billPrice += rate.getPrice() * maxUnit;
                unit = unit - maxUnit;
            }
            else {
                billPrice += unit * rate.getPrice();
                break;
            }

        }

//        int price = getpriceByUnit(rateList);
        System.out.println("Bill Price :"+billPrice);




    }

//    private static Integer getpriceByUnit(List<Rate> rateList) {
//
//
//        for (Rate rate : rateList) {
////            int min = rate.getMin();
////            int max = rate.getMax();
////
////            System.out.println(min + " -- " + max);
//
//            if (rate.getMin() <= unit && rate.getMax() >= unit) {
//                price = rate.getPrice();
//                break;
//
//            }
//
//            if (rate.getMin() <= unit && rate.getMax() == 0) {
//                price = rate.getPrice();
//                break;
//            }
//
//        }
//
//        return price;
//
//
//    }
}

