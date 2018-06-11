package CoreJavaVolume.Role1.Character3;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.*;

/**
 * Created by melon on 18-6-5.
 * @author melon
 * @version 1.0
 */
public class CodePointBasic {
    /**
     * @return void
     * @param args
     * 使用codePoints方法实际上生成一个int值的流，每个int值对应一个码点
     * 如若要遍历一个字符串，可以先将字符串转化成流数组，再完成遍历
     */
    public static void main(String[] args) {

//        System.out.println("请初始化你的字符串");
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        //代码单元数量即实际长度
//        int strCodePointCount = str.codePointCount(0,str.length());
//        //得到指定i的码点
//        System.out.print("该字符串实际长度:" +strCodePointCount + ",请输入你需要检索的码点:");
//        int i = scanner.nextInt();
//        int index = str.offsetByCodePoints(0,i);
//        int cp = str.codePointAt(index);
//        System.out.println("对应代码单元:" + str.charAt(index));
//        System.out.println("对应码点的流值:" + cp);
//
//        //遍历字符串时将字符串转换为流数组
//        int[] codePoints = str.codePoints().toArray();
//        i = 0;
//        //遍历指定码点的流的int值
//        while(i<str.codePointCount(0,str.length())) {
//            System.out.print(str.charAt(str.offsetByCodePoints(0,i)) + "的是:" + codePoints[i++] + "\t");
//        }
//        //把码点数组转为字符串
//        String string = new String(codePoints,0,codePoints.length);
//        System.out.println("\n" + string);
//        //格式化日期，java.time相关方法
//        System.out.printf("%tc",new Date());

//        BigInteger value = BigInteger.valueOf(130L);
//        BigInteger result = value.mod(BigInteger.valueOf(10L));
//        System.out.printf(result.toString());
//
//        BigDecimal bigDecimal = BigDecimal.valueOf(1296.00);
//        BigDecimal bigDecimal11 = bigDecimal.divide(BigDecimal.valueOf(10), RoundingMode.HALF_UP);
//        System.out.println(bigDecimal11.toString().trim());

//        int[] array = {1,23,5,6,7,8,2};
//        System.out.println(Arrays.toString(array));
//        int[] array = new int[0];
    }
}
