package homework;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class MinMutation {
    public int minMutation(String start, String end, String[] b) {
        char[] AGCT = {'A', 'G', 'C', 'T'};
        Set<String> closed = new HashSet<>();
        Set<String> bank = new HashSet<>();
        for (String s : b) bank.add(s);
        Queue<String> open = new LinkedList<>();
        open.offer(start);
        int depth = 0;

        while (!open.isEmpty()) {
            Queue<String> layer = open;
            open = new LinkedList<>();
            while (!layer.isEmpty()) {
                String next = layer.poll();
                closed.add(next);
                char[] chars = next.toCharArray();
                for (int i=0; i<chars.length; i++) {
                    char c = chars[i];
                    for (char n : AGCT) {
                        if (c != n) {
                            chars[i] = n;
                            String s = new String(chars);
                            if (!closed.contains(s) && bank.contains(s)) {
                                if (s.equals(end)) {
                                    return depth+1;
                                }
                                open.offer(s);
                            }
                        }
                    }
                    chars[i] = c;
                }
            }
            depth++;
        }
        return -1;
    }
}
