package patternAndMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher {
    private static final String PATH_DATE_PART = "[=-]*\\$\\{(([MDH]=(\\*|([+-]?\\d+)))|=*([Y]=[+-]?\\d+))\\}";
    private static final Pattern PATH_DATE_PART_PATTERN = Pattern.compile(PATH_DATE_PART);

    public static String parseCompletePath(String path) {
        String parsedPath = "";
        Matcher matcher = PATH_DATE_PART_PATTERN.matcher(path);

        if (matcher.find()) {
            System.out.println("-----");
            System.out.println(matcher.group());
            System.out.println(matcher.start());
            System.out.println(matcher.end());
            parsedPath = matcher.replaceAll("");
        } else {
            parsedPath = path;
        }

        //parsedPath = parsedPath.replaceAll("[//]+", "/");

        return parsedPath;
    }

    public static void main(String[] args) {
        String s = "/user/dwd_middle_manual_oracle_merge/${Y=0}/${M=0}/${D=-1}";
        String  ss= PatternAndMatcher.parseCompletePath(s);
        System.out.println("==");
        System.out.println(ss);
    }
}
