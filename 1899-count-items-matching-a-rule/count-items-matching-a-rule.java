import java.util.List;

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int attrIndex;
        if ("type".equals(ruleKey)) {
            attrIndex = 0;
        } else if ("color".equals(ruleKey)) {
            attrIndex = 1;
        } else {
            attrIndex = 2;
        }

        int matches = 0;
        for (List<String> item : items) {
            if (item.get(attrIndex).equals(ruleValue)) {
                matches++;
            }
        }

        return matches;
    }
}