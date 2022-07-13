package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Luca";
        } else if (query.contains("plus")) {
            String[] liste = query.split("\\s+");
            int ergebnis = Integer.parseInt(liste[3]) + Integer.parseInt(liste[5]);
            return String.valueOf(ergebnis);
        } else if (query.contains("largest")) {
            return "";
        }
        else {
            return "";
        }
    }
}
