package lotto;

import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Lotto {
    private static final int LOTTO_NUMBER_COUNT = 6;

    private final List<LottoNumber> numbers;

    Lotto() {
        Collections.shuffle(LottoNumber.ALL_LOTTO_NUMBERS);
        List<LottoNumber> numbers = LottoNumber.ALL_LOTTO_NUMBERS.stream()
                .limit(LOTTO_NUMBER_COUNT)
                .collect(toList());
        Collections.sort(numbers);
        this.numbers = numbers;
    }

    int getNumberSize() {
        return numbers.size();
    }
}
