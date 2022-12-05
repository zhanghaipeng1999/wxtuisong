package ydzhao.weixin.tuisong.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @ClassName JiNianRi
 * @Description TODO
 * @Author ydzhao
 * @Date 2022/8/2 17:32
 */
public class JiNianRi {
    /**
     * 恋爱
     */
    static String lianAi = "2022-06-10";
    /**
     * 领证
     */
    static String linZheng = "2023-01-02";
    /**
     * 结婚
     */
    static String jieHun = "2022-08-08";
    /**
     * 生日
     */
    static String shengRi = "2022-12-13";

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * 距离date还有多少天
     * @param date
     * @return
     */
    public static int before(String date) {
        int day = 0;
        try {
            long time = System.currentTimeMillis()-simpleDateFormat.parse(date).getTime() ;
            day = (int) (time / 86400000L);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return day;
    }

    /**
     * 距离date还有多少天
     * @param date
     * @return
     */
    public static int beforee(String date) {
        int day = 0;
        try {
            long time = simpleDateFormat.parse(date).getTime()-System.currentTimeMillis() ;
            day = (int) (time / 86400000L);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return day;
    }

    /**
     * 已经过去date多少天
     * @param date
     * @return
     */
    public static int after(String date) {
        int day = 0;
        try {
            long time = simpleDateFormat.parse(date).getTime()-System.currentTimeMillis() ;
            day = (int) (time / 86400000L);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return day;
    }

    public static int getJieHun() {
        return before(jieHun);
    }

    public static int getLinZhen() {
        return beforee(linZheng);
    }

    public static int getLianAi() {
        return before(lianAi);
    }

    public static int getShengRi(){
        return after(shengRi);
    }

    public static void main(String[] args) {
        System.out.println(getJieHun());
    }


}
