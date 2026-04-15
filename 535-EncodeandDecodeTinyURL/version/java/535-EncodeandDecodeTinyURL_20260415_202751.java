// Last updated: 15/04/2026, 20:27:51
1import java.util.*;
2import java.util.concurrent.ThreadLocalRandom;
3
4public class Codec {
5
6    Map<String, String> codeDB = new HashMap<>();
7    Map<String, String> urlDB = new HashMap<>();
8
9    static final String BASE_URL = "http://tinyurl.com/";
10    static final String CHARS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
11
12    private String getCode() {
13        char[] code = new char[6];
14        for (int i = 0; i < 6; i++) {
15            code[i] = CHARS.charAt(ThreadLocalRandom.current().nextInt(62));
16        }
17        return new String(code);
18    }
19
20    public String encode(String longUrl) {
21        if (urlDB.containsKey(longUrl)) {
22            return BASE_URL + urlDB.get(longUrl);
23        }
24
25        String code = getCode();
26        while (codeDB.containsKey(code)) {
27            code = getCode();
28        }
29
30        codeDB.put(code, longUrl);
31        urlDB.put(longUrl, code);
32
33        return BASE_URL + code;
34    }
35
36    public String decode(String shortUrl) {
37        String code = shortUrl.replace(BASE_URL, "");
38        return codeDB.getOrDefault(code, "Not found");
39    }
40}