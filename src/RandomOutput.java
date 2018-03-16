/**
 * 需求随机生成26的英文字母，5个一输出
 * Created by 平凡的世界 on 2018/3/16.
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RandomOutput {
    public static void main(String[] args) {
        randomOutput(97, 123);
    }
            private static void randomOutput(int min, int max){
                List<Character> list = new LinkedList<>();
                for (int i = min; i < max; i++) {
                    list.add((char)i);
                }
                int size = list.size();

                for (int i = 0; i < max - min; i++) {
                    int index = new Random().nextInt(size);
                    System.out.println("第" + (i + 1) + "个字母 " + list.remove(index));
                    size--;
                }
            }

    }
