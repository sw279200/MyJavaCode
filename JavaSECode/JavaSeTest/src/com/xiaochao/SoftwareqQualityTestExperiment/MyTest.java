package com.xiaochao.SoftwareqQualityTestExperiment;

/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.SoftwareqQualityTestExperiment
 * @Author: 锦猪好有味
 * @CreateTime: 2023-10-28  17:47
 * @Description: TODO
 * @Version: 1.0
 */
public class MyTest {
    public int work(int x,int y,int z)
    {
        int k = 0;
        int j = 0;
        if(x>3&&z<10){
            k = x*y-1;
            j = k-z;
        }
        if((x==4)||(y<5)){
            j = x*y+10;
            j =j%3;
        }
        return j;
    }
}
