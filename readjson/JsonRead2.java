package readjson;

import com.alibaba.fastjson.JSONReader;

import java.io.*;

public class JsonRead2 {
    public static void main(String[] args) throws FileNotFoundException {
        String jsonString = "{\n" +
                "    \"RECORDS\": [\n" +
                "        {\n" +
                "            \"query\": \"播放刘德华歌曲\",\n" +
                "            \"parameters\": \"{\\\"artist\\\": \\\"刘德华\\\"}\",\n" +
                "            \"domain\": \"music\",\n" +
                "            \"merchant_id\": \"2609509842712408242\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"query\": \"暂停一下我还就不能笑着怎么翻译\",\n" +
                "            \"parameters\": \"{\\\"q\\\": \\\"暂停一下我还就不能笑着\\\", \\\"from\\\": \\\"zh\\\", \\\"to\\\": \\\"en\\\"}\",\n" +
                "            \"domain\": \"translation\",\n" +
                "            \"merchant_id\": \"2609509842712408242\"\n" +
                "        }" +
                "]" +
                "}";
        // 如果json数据以形式保存在文件中，用FileReader进行流读取！！
        // path为json数据文件路径！！
        // JSONReader reader = new JSONReader(new FileReader(path));

        // 为了直观，方便运行，就用StringReader做示例！
        JSONReader reader = new JSONReader(new StringReader(jsonString));
        reader.startObject();
        System.out.println("start fastjson");
        File file = new File("D:/AAA/result.txt");
        PrintStream ps = new PrintStream(new FileOutputStream(file));
        while (reader.hasNext()) {
            String key = reader.readString();
            System.out.println("key " + key);
            if (key.equals("RECORDS")) {
                reader.startArray();
                System.out.println("start " + key);
                while (reader.hasNext()) {
                    reader.startObject();
                    System.out.println("start records item");
                    OneQuery oneQuery = new OneQuery();
                    while (reader.hasNext())
                    {
                        String arrayListItemKey = reader.readString().trim();
                        String arrayListItemValue = reader.readObject().toString().trim();
                        System.out.print("key " + arrayListItemKey);
                        System.out.println(":value " + arrayListItemValue);
                        if (arrayListItemKey.equals("query")){
                            oneQuery.setQuery(arrayListItemValue);
                        }else if (arrayListItemKey.equals("domain")){
                            oneQuery.setDomain(arrayListItemValue);
                        }
                    }
                    StringBuffer sb = new StringBuffer();
                    sb.append(oneQuery.getQuery());
                    sb.append('\t');
                    sb.append(oneQuery.getDomain());
                    ps.println(sb.toString());
                    reader.endObject();
                    System.out.println("end arraylist item");
                }
                reader.endArray();
                System.out.print("end " + key);
            }
        }
        ps.close();
    }
}
