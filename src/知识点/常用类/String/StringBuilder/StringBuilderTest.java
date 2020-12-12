package 知识点.常用类.String.StringBuilder;

import org.junit.Test;

import java.util.StringJoiner;
import java.util.stream.Stream;

/**
 * @author XYSIMJ
 * @create 2020-11-04-上午10:03
 */
public class StringBuilderTest {
    /*
    为了能高效拼接字符串，Java标准库提供了StringBuilder，它是一个可变对象，可以预分配缓冲区，这样，往StringBuilder中新增字符时，不会创建新的临时对象：
     */
    @Test
    public void test() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append(",");
            sb.append(i);

        }
        String s = sb.toString();
        System.out.println(s);
    }
//链式操作
    @Test
    public void test1() {
        var sb = new StringBuilder(1024);
        sb.append("Mr ")
                .append("Bod").append("!").insert(0, "hello,");
        System.out.println(sb.toString());
    }

    //仿照链式操作写一个代码
    //
    @Test
    public void test2() {
        Adder adder = new Adder();
        adder.add(3).inc().add(5).add(10);
        System.out.println(adder.value());
    }

    @Test
    public void test3() {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s);
        System.out.println(s.equals(insert) ? "测试成功" : "测试失败");
    }

    private String buildInsertSql(String table, String[] fields) {
        StringBuilder sb = new StringBuilder(1024);
        sb.append("INSERT ").append("INTO ").append(table+" ").append("(");
        for (int i = 0; i < fields.length; i++) {
            sb.append(fields[i]);

            if (i != 2){
                sb.append(", ");
            }
        }
        sb.append(")").append(" VALUES (?, ?, ?)");

        String select  = sb.toString();
//        System.out.println(select);
        return select;
    }

    @Test
    public void test4() {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String select = buildSelectSql(table, fields);
        System.out.println(select);
        System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "测试成功" : "测试失败");
    }

    private String buildSelectSql(String table, String[] fields) {
        var sj = new StringJoiner(", ", "SELECT ", " FROM employee");
        for (String f : fields) {
            sj.add(f);
        }
        String string = sj.toString();
        return string;
    }

}

class Adder{
    private int sum = 0;

    public Adder add(int n) {
        sum+= n;
        return this;
    }

    public Adder inc() {
        sum++;
        return this;
    }

    public int value() {
        return sum;
    }
}
