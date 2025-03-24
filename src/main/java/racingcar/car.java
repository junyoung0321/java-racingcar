package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class car {
    private final String name;
    private int position;

    public car(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("차 이름은 5자 이하만 가능합니다.");
        }
        this.name = name;
        this.position = 0;
    }


    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
