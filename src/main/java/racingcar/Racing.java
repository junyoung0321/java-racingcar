package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Racing {
    private final List<car>  cars =  new ArrayList<>();
    private int rounds;


    private void inputCars() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String[] names = Console.readLine().split(",");
        for (String name : names) {
            cars.add(new car(name.trim()));
        }
    }

    private void inputRounds() {
        System.out.println("시도할 회수는 몇회인가요?");
        rounds = Integer.parseInt(Console.readLine().trim());
    }




}
