package com.company.zadanie5_3;

import java.util.*;
class Graf {
    private int n;
    private LinkedList[] tab;
    public Graf(String lan) {
        StringTokenizer st = new StringTokenizer(lan, "() ,");
        n = Integer.parseInt(st.nextToken());
        tab = new LinkedList[n];
        for (int i=0; i<n; ++i)
            tab[i] = new LinkedList();
        while (st.hasMoreTokens()) {
            tab[Integer.parseInt(st.nextToken())].add(
                    new Integer(st.nextToken()));
        }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i).append(": ");
            LinkedList<Integer> connections = tab[i];
            if (!connections.isEmpty()) {
                Iterator<Integer> iterator = connections.iterator();
                sb.append(iterator.next());
                while (iterator.hasNext()) {
                    sb.append(" ").append(iterator.next());
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
