package 知识点.枚举类;

import java.util.Comparator;

/**
 * @author XYSIMJ
 * @create 2020-09-11-下午2:56
 */
public enum WeekDay implements Comparator {
    SUNDAY("星期天",0),
    MONDAY("星期一",1),
    TUESDAY("星期二",2),
    WEDNESDAY("星期三",3),
    THURSDAY("星期四",4),
    FRIDAY("星期五",5),
    SATURDAY("星期六",6);

    private String name;
    private  int id;

    private WeekDay(String name,int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }



    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof WeekDay && o2 instanceof WeekDay){
            WeekDay d1 = (WeekDay) o1;
            WeekDay d2 = (WeekDay) o2;
            return d1.id-d2.id;
        }
        else return 0;

    }
}
