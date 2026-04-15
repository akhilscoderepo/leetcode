// Last updated: 15/04/2026, 20:24:24
1public class Codec {
2
3    int counter = 1;
4    Map<String, Integer> urltoid = new HashMap();
5    Map<Integer, String> idtourl = new HashMap();
6
7    // Encodes a URL to a shortened URL.
8    public String encode(String longUrl) {
9        if(urltoid.containsKey(longUrl)){
10            return String.valueOf(urltoid.get(longUrl));
11        }
12
13        urltoid.put(longUrl, counter);
14        idtourl.put(counter, longUrl);
15        return String.valueOf(counter++);
16    }
17
18    // Decodes a shortened URL to its original URL.
19    public String decode(String shortUrl) {
20       return idtourl.getOrDefault(Integer.valueOf(shortUrl), "Not Found");
21    }
22}
23
24// Your Codec object will be instantiated and called as such:
25// Codec codec = new Codec();
26// codec.decode(codec.encode(url));