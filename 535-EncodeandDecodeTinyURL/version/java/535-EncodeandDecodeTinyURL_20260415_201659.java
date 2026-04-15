// Last updated: 15/04/2026, 20:16:59
1public class Codec {
2
3    int counter = 1;
4    Map<Integer, String> map = new HashMap();
5
6    // Encodes a URL to a shortened URL.
7    public String encode(String longUrl) {
8        if(map.containsValue(longUrl)){
9            return map.get(longUrl);
10        }else{
11            map.put(counter++, longUrl);
12        }
13        return String.valueOf(counter-1);
14    }
15
16    // Decodes a shortened URL to its original URL.
17    public String decode(String shortUrl) {
18        if(map.containsKey(Integer.valueOf(shortUrl))){
19            return map.get(Integer.valueOf(shortUrl));
20        }
21        return "Not found";
22    }
23}
24
25// Your Codec object will be instantiated and called as such:
26// Codec codec = new Codec();
27// codec.decode(codec.encode(url));