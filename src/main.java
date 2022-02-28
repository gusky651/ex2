
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

class main
{
    public static void main(String[] args)
    {
        String filePath = "input.txt";

        String content = null;
        try {
            content = Files.lines(Paths.get(filePath))
                    .collect(Collectors.joining(System.lineSeparator()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String procesare = content.replaceAll("\\p{P}", ""); //eliminare semne de punctuatie

        System.out.println(procesare);

        procesare = content.replaceAll("\\s+","");  //eliminare spatii

        System.out.println(procesare);
    }
}