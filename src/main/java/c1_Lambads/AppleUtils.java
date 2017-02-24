package c1_Lambads;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jack.Ren on 2/24/2017.
 */
public class AppleUtils {

    public static List<Apple> filter(List<Apple> inventory, ApplePredicate p){
        List<Apple> result = new ArrayList<Apple>();
        for(Apple apple : inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
