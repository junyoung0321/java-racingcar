package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Racing {
    private final List<car>  cars =  new ArrayList<>();
    private int round;


    private void inputCars() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String[] names = Console.readLine().split(",");
        for (String name : names) {
            cars.add(new car(name.trim()));
        }
    }


}
