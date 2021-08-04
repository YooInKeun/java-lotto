package lotto.view;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.toList;

public class InputView {
    private static final String PURCHASE_PRICE_INPUT_MESSAGE = "구매금액을 입력해 주세요.";
    private static final String WINNING_NUMBERS_INPUT_MESSAGE = "지난 주 당첨 번호를 입력해 주세요.";
    private static final String WINNING_NUMBERS_DELIMITER = ",";

    private final Scanner scanner;
    private final PrintStream printStream;

    public InputView() {
        scanner = new Scanner(System.in);
        printStream = System.out;
    }

    public void printPurchasePriceInputMessage() {
        printStream.println(PURCHASE_PRICE_INPUT_MESSAGE);
    }

    public int inputPurchasePrice() {
        return scanner.nextInt();
    }

    public void printWinningNumbersInputMessage() {
        printStream.println(WINNING_NUMBERS_INPUT_MESSAGE);
    }

    public List<Integer> inputWinningNumbers() {
        String[] split = scanner.nextLine().split(WINNING_NUMBERS_DELIMITER);
        return Arrays.stream(split)
                .map(number -> Integer.parseInt(number.trim()))
                .collect(toList());
    }
}
