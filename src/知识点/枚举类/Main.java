package 知识点.枚举类;

import org.junit.Test;

import static 知识点.枚举类.Month.JANUARY;

/**
 * @author XYSIMJ
 * @create 2020-09-11-下午2:42
 */
public class Main {
    @Test
    public void test() {
        WeekDay weekDay = WeekDay.FRIDAY;
        WeekDay weekDay1 = WeekDay.MONDAY;
        System.out.println(weekDay.compare(weekDay1, weekDay));
        System.out.println(weekDay.getName());
        
    }


}
