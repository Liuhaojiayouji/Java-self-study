package _20201129;

public class StringBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb);
        sb.append("abcjavaabc");
        System.out.println(sb);
        sb.insert(2, "小明");
        System.out.println(sb);
        sb.delete(2, 4);
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.replace(2, 4, "陈小狗");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.setCharAt(3, '红');
        System.out.println(sb);
        String substring = sb.substring(2, 4);
        System.out.println("子串内容为" +
                substring);
        int index = sb.indexOf("abc", 3);
        System.out.println("索引值为" +
                index);
        sb.append("javajava");
        System.out.println("查看字符数组的长度：" +
                sb.capacity());
        System.out.println("存储的字符个数：" +
                sb.length());
        System.out.println("索引指定的索引值查找字符：" +
                sb.charAt(2));
        System.out.println("字符串缓冲类的内容为：" +
                sb);
    }
}
