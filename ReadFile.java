import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {
    public void readFile(String path) throws FileNotFoundException {

        try {
            File file = new File(path);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            FileReader fileStream = new FileReader(file);
            BufferedReader bf = new BufferedReader(fileStream);
            String result = "";
            int sum = 0;
            while ((result = bf.readLine())!= null){
                System.out.println(result);
                sum += Integer.parseInt(result);
            }
            bf.close();
            System.out.println("tong la: "+sum);

        } catch (Exception e){
            System.err.println("file k ton tai hoac noi dung co loi");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap file: ");
        String path = sc.nextLine();

        ReadFile re = new ReadFile();
        re.readFile(path);
    }
}
