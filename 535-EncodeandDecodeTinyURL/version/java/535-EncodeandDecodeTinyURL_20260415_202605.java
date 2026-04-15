// Last updated: 15/04/2026, 20:26:05
1public class Codec {
2 Map<String, String> codeDB = new HashMap<>(), urlDB = new HashMap<>();
3    static final String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
4
5    private String getCode() {
6        char[] code = new char[6];
7        for (int i = 0; i < 6; i++) 
8            code[i] = chars.charAt((int)(Math.random() * 62));
9        return "http://tinyurl.com/" + String.valueOf(code);
10    }
11    
12    public String encode(String longUrl) {
13        if (urlDB.containsKey(longUrl)) return urlDB.get(longUrl);
14        String code = getCode();
15        while (codeDB.containsKey(code)) code = getCode();
16        codeDB.put(code, longUrl);
17        urlDB.put(longUrl, code);
18        return code;
19    }
20
21    public String decode(String shortUrl) {
22        return codeDB.get(shortUrl);
23    }
24}
25
26// Your Codec object will be instantiated and called as such:
27// Codec codec = new Codec();
28// codec.decode(codec.encode(url));