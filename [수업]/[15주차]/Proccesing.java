public class Proccesing {
    public void pay_stepProcess(String[][] person, int[][] data) {
        for (int i = 0; i < person.length; i++) {
            int pay_step = Integer.parseInt(person[i][3]);
            int house = Integer.parseInt(person[i][2]);
            if (house == 1) {
                if (pay_step <= 100) {
                    data[i][0] = 1370;
                } else if (100 < pay_step && pay_step <= 200) {
                    data[i][0] = 1820;
                } else if (200 < pay_step && pay_step <= 300) {
                    data[i][0] = 2430;
                } else if (300 < pay_step && pay_step <= 400) {
                    data[i][0] = 4420;
                } else if (400 < pay_step && pay_step <= 500) {
                    data[i][0] = 7410;
                } else {
                    data[i][0] = 12750;
                }
            } else {
                if (pay_step <= 100) {
                    data[i][0] = 1370 * house;
                } else if (100 < pay_step && pay_step <= 200) {
                    data[i][0] = 1820 * house;
                } else if (200 < pay_step && pay_step <= 300) {
                    data[i][0] = 2430 * house;
                } else if (300 < pay_step && pay_step <= 400) {
                    data[i][0] = 4420 * house;
                } else if (400 < pay_step && pay_step <= 500) {
                    data[i][0] = 7410 * house;
                } else {
                    data[i][0] = 12750 * house;
                }
            }

        }
    }

    public void useProcess(String[][] person, int[][] data) {
        for (int i = 0; i < person.length; i++) {
            int house = Integer.parseInt(person[i][2]);
            int Kw = Integer.parseInt(person[i][3]);
            if (house == 1) {
                if (Kw < 100) {
                    data[i][1] = (int) (Kw * 55.1);
                } else if (100 <= Kw && Kw < 200) {
                    data[i][1] = (int) ((100 * 55.1) + ((Kw - 100) * 113.8));
                } else if (200 <= Kw && Kw < 300) {
                    data[i][1] = (int) ((100 * 55.1) + ((Kw - 100) * 113.8) + (((Kw - 100) - 100) * 168.3));
                } else if (300 <= Kw && Kw < 400) {
                    data[i][1] = (int) ((100 * 55.1) + ((Kw - 100) * 113.8) + (((Kw - 100) - 100) * 168.3) + ((((Kw - 100) - 100) - 100) * 248.6));
                } else if (400 <= Kw && Kw < 500) {
                    data[i][1] = (int) ((100 * 55.1) + ((Kw - 100) * 113.8) + (((Kw - 100) - 100) * 168.3) + ((((Kw - 100) - 100) - 100) * 248.6) + (((((Kw - 100) - 100) - 100) - 100) * 366.4));
                } else {
                    data[i][1] = (int) ((100 * 55.1) + ((Kw - 100) * 113.8) + (((Kw - 100) - 100) * 168.3) + ((((Kw - 100) - 100) - 100) * 248.6) + (((((Kw - 100) - 100) - 100) - 100) * 366.4) + ((((((Kw - 100) - 100) - 100) - 100) - 100) * 643.9));
                }
            } else if (Kw < 100) {
                data[i][1] = (int) ((Kw * 55.1) / house);
            } else if (100 <= Kw && Kw < 200) {
                data[i][1] = (int) (((100 * 55.1) + ((Kw - 100) * 113.8)) / house);
            } else if (200 <= Kw && Kw < 300) {
                data[i][1] = (int) (((100 * 55.1) + ((Kw - 100) * 113.8) + (((Kw - 100) - 100) * 168.3)) / house);
            } else if (300 <= Kw && Kw < 400) {
                data[i][1] = (int) (((100 * 55.1) + ((Kw - 100) * 113.8) + (((Kw - 100) - 100) * 168.3) + ((((Kw - 100) - 100) - 100) * 248.6)) / house);
            } else if (400 <= Kw && Kw < 500) {
                data[i][1] = (int) (((100 * 55.1) + ((Kw - 100) * 113.8) + (((Kw - 100) - 100) * 168.3) + ((((Kw - 100) - 100) - 100) * 248.6) + (((((Kw - 100) - 100) - 100) - 100) * 366.4)) / house);
            } else {
                data[i][1] = (int) (((100 * 55.1) + ((Kw - 100) * 113.8) + (((Kw - 100) - 100) * 168.3) + ((((Kw - 100) - 100) - 100) * 248.6) + (((((Kw - 100) - 100) - 100) - 100) * 366.4) + ((((((Kw - 100) - 100) - 100) - 100) - 100) * 643.9)) / house);
            }
        }
    }

    public void plusProcess(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            data[i][2] = (int) ((data[i][0] + data[i][1]) * 0.1);
        }
    }

    public void electronicProcess(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            data[i][3] = (int) (data[i][1] * (3.7/100));
        }
    }

    public void payProcess(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            int temp;
            temp = (data[i][0] + data[i][1] + data[i][2] + data[i][3]) / 10;
            data[i][4] = temp * 10;
        }
    }
}
