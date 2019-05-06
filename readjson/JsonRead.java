package readjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonRead {
    public static void main(String[] args) {
        String str = "{\n" +
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
                "        }," +
                "]" +
                "}";
//        JSONReader reader = new JSONReader(new FileReader(path));
        JSONObject object = JSON.parseObject(str);
        System.out.println(object.get("RECORDS").getClass());
        List<OneQuery> querys = new ArrayList<OneQuery>(JSONArray.parseArray(object.get("RECORDS").toString(),OneQuery.class));
        for (OneQuery query : querys) {
            System.out.println(query.getQuery());
        }
    }
}
