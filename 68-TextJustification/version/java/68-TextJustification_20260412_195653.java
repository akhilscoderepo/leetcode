// Last updated: 12/04/2026, 19:56:53
1class Solution {
2    public List<String> fullJustify(String[] words, int maxWidth) {
3
4        List<String> result = new ArrayList();
5        List<String> wordsperLine = new ArrayList();
6        StringBuilder line  = new StringBuilder();
7        int wordCount = 0;
8
9        for(String word : words){
10            if(word.length() + line.length() > maxWidth){
11                line = new StringBuilder(line.toString().trim());
12                
13                int diff = maxWidth - line.length();
14                int gaps = wordsperLine.size()-1;
15                gaps = (gaps ==0)?1:gaps;
16                int extraSpace = diff%gaps;
17                int spaceperGaps = diff/gaps;
18                int index = 0;
19                int lastWordIndex = 0;
20                while(gaps >0){
21                    int spaceIndex = lastWordIndex+wordsperLine.get(index).length();
22                    if(extraSpace>0){
23                         line = addSpaces(line, spaceIndex, spaceperGaps+1);
24                         lastWordIndex += wordsperLine.get(index).length()+spaceperGaps+2;
25                        extraSpace--;
26                    }else{
27                        line = addSpaces(line, spaceIndex, spaceperGaps);
28                        lastWordIndex += wordsperLine.get(index).length()+spaceperGaps+1;
29                    }
30                    
31                    index++;
32                    gaps--;
33                }
34                result.add(line.toString());
35                line = new StringBuilder();
36                wordsperLine = new ArrayList();
37                line.append(word + " ");
38                wordsperLine.add(word);
39            }
40            else{
41                line.append(word + " ");
42                wordsperLine.add(word);
43
44            }
45            wordCount++;
46        }
47
48        //hanlding last line
49        line = new StringBuilder(line.toString().trim());
50         int diff = maxWidth - line.length();
51         line = addSpaces(line, line.length(), maxWidth-line.length());
52         result.add(line.toString());
53
54return result;
55
56    }
57
58    private StringBuilder addSpaces(StringBuilder input, int index, int spaceCount){
59        while(spaceCount >0){
60            input.insert(index, " ");
61            spaceCount--;
62        }
63        return input;
64    }
65}