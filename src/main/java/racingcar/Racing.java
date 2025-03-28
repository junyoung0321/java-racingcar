package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;



public class Racing {
    private final List<Car>  cars =  new ArrayList<>();
    private int rounds;


    public void start() {
        inputCars();
        inputRounds();
        play();
        printWinners();
    }

    private void inputCars() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String[] names = Console.readLine().split(",");
        for (String name : names) {
            cars.add(new Car(name.trim()));
        }
    }

    private void inputRounds() {
        System.out.println("시도할 회수는 몇회인가요?");
        rounds = Integer.parseInt(Console.readLine().trim());
    }

    private void play() {

        for (int i = 0; i < rounds; i++) {
            raceRound();
            printRaceStatus();
        }
    }

    private void raceRound() {
        for (Car car : cars) {
            car.move();
        }
    }

    private void printRaceStatus() {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
        }
        System.out.println();
    }

    private void printWinners() {
        int maxPosition = 0;
        List<String> winners = new ArrayList<>();

        for (Car car : cars) {
            if (car.getPosition() > maxPosition) {
                maxPosition = car.getPosition();
                winners.clear();
                winners.add(car.getName());
            } else if (car.getPosition() == maxPosition) {
                winners.add(car.getName());
            }
        }

        System.out.println("최종 우승자: " + String.join(", ", winners));
    }
}
