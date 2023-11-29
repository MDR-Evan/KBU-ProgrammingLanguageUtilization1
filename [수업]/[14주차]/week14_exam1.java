import java.io.IOException;

public class week14_exam1 {
    public static void main(String[] args) throws IOException {
        String[][] person = new String[][]{                                                                             // 이름(name) | 사번(id) | 호봉(class)
                {"김광호", "1111", "1"}, {"김선민", "2222", "2"},
                {"김익주", "3333", "3"}, {"김진용", "4444", "4"},
                {"김진형", "5555", "5"}, {"이순주", "6666", "5"},
                {"오정민", "7777", "4"}, {"이규빈", "8888", "3"},
                {"김환용", "9999", "2"}, {"김가희", "0000", "1"}
        };
        int[][] money = new int[person.length][6];                                                                      // 기본급 | 수당 | 급여액 | 세금 | 연금 | 지급액

        week14_exam1_Input input = new week14_exam1_Input();
//        input.dataRead(person, money);                                                                                  // 수당 입력(수동)
        input.give(money);                                                                                              // 수당 입력(자동)

        week14_exam1_Proccesing proccesing = new week14_exam1_Proccesing();
        proccesing.pay_stepProcess(person, money);                                                                      // 수당 계산
        proccesing.wagesProcess(money);                                                                                 // 급여액 계산
        proccesing.taxProcess(money);                                                                                   // 세금 계산
        proccesing.pensionProcess(money);                                                                               // 연금 계산
        proccesing.salaryProcess(money);                                                                                // 지급액 계산
        
        week14_exam1_Output output = new week14_exam1_Output();                                                         // 생성자
        output.sort(person, money);                                                                                     // 정렬
        output.display(person, money);                                                                                  // Call By Reference

//        output.line();
//        System.out.println("\t  이름\t  사번\t호봉");
//        output.line();
//        for (int i = 0; i < person.length; i++) {
//            output.display(person[i]);                                                                                  // Call By Reference (부분 1차원 배열)
//        }
//        output.line();
    }
}
