import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String[][] person = new String[][]{                                                                             // 사용자번호(bunho) | 이름(name) | 세대수(house) | 전기사용량(used)
                {"1", "김광호", "1", "121"}, {"2", "김선민", "3", "212"},
                {"3", "김익주", "2", "353"}, {"4", "김진용", "4", "412"},
                {"5", "김진형", "1", "500"}, {"6", "이순주", "2", "60"},
                {"7", "오정민", "5", "340"}, {"8", "이규빈", "2", "98"},
                {"9", "김환용", "1", "20"}, {"0", "김가희", "3", "112"}
        };
        int[][] data = new int[person.length][5];                                                                       // 기본요금 | 사용요금 | 부가가치세 | 전력기금 | 사용금액

        Input input = new Input();
        input.dataRead(person, data);                                                                                   // 사용자 정보 입력(수동)

        Proccesing proccesing = new Proccesing();
        proccesing.pay_stepProcess(person, data);                                                                       // 기본요금 계산
        proccesing.useProcess(person, data);                                                                            // 사용요금 계산
        proccesing.plusProcess(data);                                                                                   // 부가가치세 계산
        proccesing.electronicProcess(data);                                                                             // 전력기금 계산
        proccesing.payProcess(data);                                                                                    // 사용금액 계산

        Output output = new Output();
        output.sort(person, data);                                                                                      // 정렬
        output.display(person, data);
    }
}