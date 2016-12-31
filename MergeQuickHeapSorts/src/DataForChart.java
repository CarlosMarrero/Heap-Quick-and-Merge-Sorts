
import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class DataForChart extends JFrame {

    JTable chart;
    // HOLDS AVERAGE AND STAND DEVIATION OF EACH TEST CASE.
    private Object[][] AvAndDev = new Object[15][2];
    private long[][] timeLen = new long[15][10];// HOLDS TIMELENGTH OF EACH TEST

    public void averageAndDev() {
        long sum = 0, temp = 0, stanDev = 0, average = 0;
        // allows looping of the most outer index of the multidimensional array.
        for (int y = 0; y < 15; y++) {
            // allows looping of the most inner index of the multidimensional
            // array.
            for (int i = 0; i < 10; i++) {
                sum += timeLen[y][i];
            }
            average = sum / 10;// final average
            for (int j = 0; j < 10; j++) {
                temp += Math.pow((timeLen[y][j] - average), 2.0);
            }
            temp /= 10;
            stanDev = (long) Math.sqrt(temp);// final stand deviation.
            AvAndDev[y][0] = ("" + average);
            AvAndDev[y][1] = ("" + stanDev);
        }
    }

    public void setTime(int i, int j, long runTime) {
        timeLen[i][j] = (runTime);// sets each run time
    }

    /**
     * Precondition: Makes a chart with the information provide with the arrays
     * made earlier. Postcondition: has to be called last for information to be
     * inputed correctly.
     */
    public void chart() {
        setLayout(new FlowLayout());
        String[] testNumbers = {"QUICKSORT", "RUN 1", "RUN 2", "RUN 3",
            "RUN 4", "RUN 5", "RUN 6", "RUN 7", "RUN 8", "RUN 9", "RUN 10",
            "AVERAGE", "STANDARD DEV."};
        Object[][] testResult = {
            {"Test Case 1", timeLen[0][0], timeLen[0][1], timeLen[0][2],
                timeLen[0][3], timeLen[0][4], timeLen[0][5],
                timeLen[0][6], timeLen[0][7], timeLen[0][8],
                timeLen[0][9], AvAndDev[0][0], AvAndDev[0][1]},
            {"Test Case 2", timeLen[1][0], timeLen[1][1], timeLen[1][2],
                timeLen[1][3], timeLen[1][4], timeLen[1][5],
                timeLen[1][6], timeLen[1][7], timeLen[1][8],
                timeLen[1][9], AvAndDev[1][0], AvAndDev[1][1]},
            {"Test Case 3", timeLen[2][0], timeLen[2][1], timeLen[2][2],
                timeLen[2][3], timeLen[2][4], timeLen[2][5],
                timeLen[2][6], timeLen[2][7], timeLen[2][8],
                timeLen[2][9], AvAndDev[2][0], AvAndDev[2][1]},
            {"QUICKSORT", "", "", "", "", "", "", "", "", "", "", "", ""},
            {"MIDDLE PIVOT", "RUN 1", "RUN 2", "RUN 3", "RUN 4", "RUN 5",
                "RUN 6", "RUN 7", "RUN 8", "RUN 9", "RUN 10",
                "AVERAGE", "STANDARD DEV."},
            {"Test Case 1", timeLen[6][0], timeLen[6][1], timeLen[6][2],
                timeLen[6][3], timeLen[6][4], timeLen[6][5],
                timeLen[6][6], timeLen[6][7], timeLen[6][8],
                timeLen[6][9], AvAndDev[6][0], AvAndDev[6][1]},
            {"Test Case 2", timeLen[7][0], timeLen[7][1], timeLen[7][2],
                timeLen[7][3], timeLen[7][4], timeLen[7][5],
                timeLen[7][6], timeLen[7][7], timeLen[7][8],
                timeLen[7][9], AvAndDev[7][0], AvAndDev[7][1]},
            {"Test Case 3", timeLen[8][0], timeLen[8][1], timeLen[8][2],
                timeLen[8][3], timeLen[8][4], timeLen[8][5],
                timeLen[8][6], timeLen[8][7], timeLen[8][8],
                timeLen[8][9], AvAndDev[8][0], AvAndDev[8][1]},
            {"QUICKSORT", "", "", "", "", "", "", "", "", "", "", "", ""},
            {"RANDOM PIVOT", "RUN 1", "RUN 2", "RUN 3", "RUN 4", "RUN 5",
                "RUN 6", "RUN 7", "RUN 8", "RUN 9", "RUN 10",
                "AVERAGE", "STANDARD DEV."},
            {"Test Case 1", timeLen[12][0], timeLen[12][1],
                timeLen[12][2], timeLen[12][3], timeLen[12][4],
                timeLen[12][5], timeLen[12][6], timeLen[12][7],
                timeLen[12][8], timeLen[12][9], AvAndDev[12][0],
                AvAndDev[12][1]},
            {"Test Case 2", timeLen[13][0], timeLen[13][1],
                timeLen[13][2], timeLen[13][3], timeLen[13][4],
                timeLen[13][5], timeLen[13][6], timeLen[13][7],
                timeLen[13][8], timeLen[13][9], AvAndDev[13][0],
                AvAndDev[13][1]},
            {"Test Case 3", timeLen[14][0], timeLen[14][1],
                timeLen[14][2], timeLen[14][3], timeLen[14][4],
                timeLen[14][5], timeLen[14][6], timeLen[14][7],
                timeLen[14][8], timeLen[14][9], AvAndDev[14][0],
                AvAndDev[14][1]},
            {"", "", "", "", "", "", "", "", "", "", "", "", ""},
            {"MERGESORT", "RUN 1", "RUN 2", "RUN 3", "RUN 4", "RUN 5",
                "RUN 6", "RUN 7", "RUN 8", "RUN 9", "RUN 10",
                "AVERAGE", "STANDARD DEV."},
            {"Test Case 1", timeLen[3][0], timeLen[3][1], timeLen[3][2],
                timeLen[3][3], timeLen[3][4], timeLen[3][5],
                timeLen[3][6], timeLen[3][7], timeLen[3][8],
                timeLen[3][9], AvAndDev[3][0], AvAndDev[3][1]},
            {"Test Case 2", timeLen[4][0], timeLen[4][1], timeLen[4][2],
                timeLen[4][3], timeLen[4][4], timeLen[4][5],
                timeLen[4][6], timeLen[4][7], timeLen[4][8],
                timeLen[4][9], AvAndDev[4][0], AvAndDev[4][1]},
            {"Test Case 3", timeLen[5][0], timeLen[5][1], timeLen[5][2],
                timeLen[5][3], timeLen[5][4], timeLen[5][5],
                timeLen[5][6], timeLen[5][7], timeLen[5][8],
                timeLen[5][9], AvAndDev[5][0], AvAndDev[5][1]},
            {"", "", "", "", "", "", "", "", "", "", "", "", ""},
            {"HEAPSORT", "RUN 1", "RUN 2", "RUN 3", "RUN 4", "RUN 5",
                "RUN 6", "RUN 7", "RUN 8", "RUN 9", "RUN 10",
                "AVERAGE", "STANDARD DEV."},
            {"Test Case 1", timeLen[9][0], timeLen[9][1], timeLen[9][2],
                timeLen[9][3], timeLen[9][4], timeLen[9][5],
                timeLen[9][6], timeLen[9][7], timeLen[9][8],
                timeLen[9][9], AvAndDev[9][0], AvAndDev[9][1]},
            {"Test Case 2", timeLen[10][0], timeLen[10][1],
                timeLen[10][2], timeLen[10][3], timeLen[10][4],
                timeLen[10][5], timeLen[10][6], timeLen[10][7],
                timeLen[10][8], timeLen[10][9], AvAndDev[10][0],
                AvAndDev[10][1]},
            {"Test Case 3", timeLen[11][0], timeLen[11][1],
                timeLen[11][2], timeLen[11][3], timeLen[11][4],
                timeLen[11][5], timeLen[11][6], timeLen[11][7],
                timeLen[11][8], timeLen[11][9], AvAndDev[11][0],
                AvAndDev[11][1]}};
        chart = new JTable(testResult, testNumbers);
        // SETS SIZE OF CHART.
        chart.setPreferredScrollableViewportSize(new Dimension(1400, 400));
        JScrollPane scrollPane = new JScrollPane(chart);
        chart.setFillsViewportHeight(true);
        add(scrollPane);
    }
}
