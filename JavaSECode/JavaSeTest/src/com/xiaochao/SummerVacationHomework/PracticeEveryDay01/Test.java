package com.xiaochao.SummerVacationHomework.PracticeEveryDay01;
import java.util.Scanner;
/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.summerVacationHomework.PracticeEveryDay01
 * @Author: 锦猪好有味
 * @CreateTime: 2023-06-30  12:00
 * @Description: TODO
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        SolutionTest1 st = new SolutionTest1();
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(st.sqrt(x));
    }
}
