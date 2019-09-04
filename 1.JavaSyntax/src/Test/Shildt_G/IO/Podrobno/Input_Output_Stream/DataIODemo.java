package Test.Shildt_G.IO.Podrobno.Input_Output_Stream;

/**
 * Created by Антон on 13.06.2017.
 */
import java.io.*;

public class DataIODemo {
    public static void main(String[] args) {

        //сначала вывести данные в файл
        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("Test/test.dat"))) {
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);
        }
        catch (FileNotFoundException e) {
            System.out.println("Нельзя открыть файл вывода");
            return;
        }
        catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }

        //а теперь ввести данные из файла
        try (DataInputStream din = new DataInputStream(new FileInputStream("Test/test.dat"))) {
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();

            System.out.println("Получаемые значения: " + d + " " + i + " " + b);
        }
        catch (FileNotFoundException e) {
            System.out.println("Нельзя открыть файл ввода ");
            return;
        }
        catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
