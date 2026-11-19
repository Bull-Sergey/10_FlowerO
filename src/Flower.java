import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class Flower {
    public static void main(String[] args) throws IOException {
        String inputFName = "INPUT.txt";
        Scanner scan = new Scanner(new File(inputFName));
        int p = scan.nextInt();
        String[] flower = {"G", "C", "V"};
        for (int i = 1; i <= p; i++) {
            String empty;
            //Маша
            empty = flower[1];
            flower[1] = flower[2];
            flower[2] = empty;
            ///Таня
            empty = flower[0];
            flower[0] = flower[1];
            flower[1] = empty;
            System.out.println(Arrays.toString(flower));
        }
        String outputFName = "OUTPUT.TXT";
        String s = Arrays.toString(flower);

        Files.writeString(Path.of(outputFName), s);
    }
}

//В рождественский вечер на окошке стояло три цветочка, слева направо:
//герань, крокус и фиалка. Каждое утро Маша вытирала окошко и меняла
// местами стоящий справа цветок с центральным цветком.
// А Таня каждый вечер поливала цветочки и меняла местами левый
// и центральный цветок. Требуется определить порядок цветов ночью
// по прошествии K дней.
//Входные данные
//Во входном файле INPUT.TXT содержится натуральное число K – число дней (K ≤ 1000).
//Выходные данные
//В выходной файл OUTPUT.TXT требуется вывести три английских буквы: «G», «C» и «V» (заглавные буквы без пробелов),
// описывающие порядок цветов на окошке по истечении K дней (слева направо). Обозначения: G – герань, C – крокус, V – фиалка.