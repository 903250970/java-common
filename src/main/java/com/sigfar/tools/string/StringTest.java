package com.sigfar.tools.string;

public class StringTest {

    public static void main(String[] args) {

        //jdk8       private final char value[];
        //jdk14      private final byte[] value;

        //equals()
        //equalsIgnoreCase()


        //contains("ll")
        //"Hello".indexOf("l"); // 2
        //"Hello".lastIndexOf("l"); // 3
        //"Hello".startsWith("He"); // true
        //"Hello".endsWith("lo"); // true



        //"Hello".substring(2); // "llo"
        //"Hello".substring(2, 4); "ll"



        //"  \tHello\r\n ".trim(); // "Hello"
        //"\u3000Hello\u3000".strip(); // "Hello"


        //"".isEmpty(); // true，因为字符串长度为0
        //"  ".isEmpty(); // false，因为字符串长度不为0
        //"  \n".isBlank(); // true，因为只包含空白字符
        //" Hello ".isBlank(); // false，因为包含非空白字符




        //s.replace('l', 'w'); // "hewwo"，所有字符'l'被替换为'w'
        //s.replaceAll("[\\,\\;\\s]+", ","); // "A,B,C,D"



        //String[] ss = s.split("\\,"); // {"A", "B", "C", "D"}



        //String s = String.join("***", arr); // "A***B***C"


        //System.out.println(s.formatted("Alice", 80));



        //char[] cs = "Hello".toCharArray(); // String -> char[]
        //String s = new String(cs); // char[] -> String


        String str="sigfar";
        System.out.println(str.hashCode());

        System.out.println("=================比较=======================");
        System.out.println("Hello".equals("hello")); // false
        System.out.println("Hello".equalsIgnoreCase("hello")); // true


        System.out.println("==================包含======================");
        System.out.println("Hello".contains("ll"));  // true
        System.out.println("Hello".indexOf("l"));// 2
        System.out.println("Hello".lastIndexOf("l"));// 3
        System.out.println("Hello".startsWith("He")); // true
        System.out.println("Hello".endsWith("lo")); // true


        System.out.println("===================截取=====================");
        System.out.println("Hello".substring(2));
        System.out.println("Hello".substring(2, 4));


        System.out.println("===================空格=====================");
        System.out.println("  \tHello\r\n ".trim());


        System.out.println("===================判断是否为空=====================");
        System.out.println("".isEmpty());
        System.out.println("  ".isEmpty());
        System.out.println("  \n".isBlank());
        System.out.println(" Hello ".isBlank());


        System.out.println("===================判断是否为空=====================");
        String html = """
              #abcDEF
              abcDEF
              """;
        System.out.println(readLine(html));

    }


    public static String readLine(String markdown) {
        StringBuilder buffer = new StringBuilder();
        markdown.lines().forEach(line -> {
            if (line.startsWith("#")) {
                buffer.append(line.toUpperCase()).append('\n');
            }  else {
                buffer.append(line.toLowerCase()).append('\n');
            }
        });
        return buffer.toString();
    }
}
