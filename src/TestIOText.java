import java.io.*;

public class TestIOText {
    public static void main(String[] args) {
        String fileName="list_song.txt";
        String []arraySong={"Hello califonia","We don’t talk any more","Nắng ấm xa dần"," Em của ngày hôm qua ","Thất tình"};

        try {
            File file=new File("src/list_song.txt");
            if (file.createNewFile()) {
                System.out.println("Tạo file thành công"+file.getName());
            }
            else
                System.out.println("File đã tồn tại");
        } catch (IOException e) {
            System.out.println("Lỗi");
            e.printStackTrace();
        }
        writeDataToFileWithBufferWriter(fileName,arraySong);
        readDataToFileWithBufferReader(fileName,arraySong);
        readDataToFileWithFileReader(fileName,arraySong);
        writeDataToFileWithFileWriter(fileName,arraySong);
    }

    public static void writeDataToFileWithFileWriter(String fileName,String[] arraySong) {

        try {
            FileWriter writer = new FileWriter(fileName);
            for (String s : arraySong) {
                writer.write(s + "\n");
            }
            writer.close();
            System.out.println("Ghi dữ liệu vào file thành công");
        } catch (IOException e) {
            System.out.println("Lỗi.");
            e.printStackTrace();
        }
    }
    public static void readDataToFileWithFileReader(String fileName,String[] arraySong){
        try {
            FileReader reader = new FileReader(fileName);
            int kytu;
            while ((kytu = reader.read()) != -1) {
                System.out.print((char) kytu);
//                ép kiểu
            }
//            read()  đọc một ký tự của tệp và gán vào biến kytu.   biến kytu bằng -1 đã đọc hết nội dung của tệp
            reader.close();
        } catch (IOException e) {
            System.out.println("Lỗi");
            e.printStackTrace();
        }
    }
    public static void writeDataToFileWithBufferWriter(String fileName,String[] arraySong){
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter(fileName));
            for (String s : arraySong) {
                writer.write(s + "\n");
            }
            writer.close();
            System.out.println("Ghi dữ liệu vào file thành công");
       } catch (IOException e) {
           System.out.println("Lỗi");
           e.printStackTrace();
       }
    }
    public static void readDataToFileWithBufferReader(String fileName,String[] arraySong){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine())!=null ) {
                System.out.println(line);
//                Nếu biến line bằng null, tức là đã đọc hết nội dung  vòng lặp sẽ dừng lại
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Lỗi");
            e.printStackTrace();
        }
    }
    }

