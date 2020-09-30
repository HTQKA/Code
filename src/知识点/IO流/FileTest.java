package 知识点.IO流;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author XYSIMJ
 * @create 2020-09-21-下午7:41
 */
public class FileTest {

    @Test
    public void testFile() {
        File file = new File("a");
        System.out.println(file.getAbsolutePath());//获取绝对路径
        System.out.println(file.getPath());//获取相对路径
//        Fileile file1 = new File("xys");
//        file.renameTo(file1);
        System.out.println(file.getName());
    }

    //创建文件夹
    @Test
    public void test() {
        File dir = new File("xys.txt");
        if (!dir.exists()){
            dir.mkdir();
        }
    //以dir为父目录,创建子目录dir2的File对象
        File dir2 = new File("xys.txt","dir2");
        if (!dir2.exists()) {
            dir2.mkdirs();
        }

        //
        File dir4 = new File(dir,"dir3/dir4");
        if (!dir4.exists()) {
            dir4.mkdirs();
        }
        //创建dir2问父目录的,名为test.txt的File对象
        File file = new File(dir2,"test.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
