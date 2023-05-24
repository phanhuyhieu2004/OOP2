package bai6;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSong {

    public static void main(String[] args) {
        try {
            // Tạo đối tượng URL để truy cập trang web
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            // Mở stream và đưa nó vào InputStreamReader để đọc nội dung của trang web
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
//            Phương thức useDelimiter được sử dùng để chỉ định ký tự phân tách giữa các token là \\Z, tức là kết thúc file.
            scanner.useDelimiter("\\Z");
            // Đọc toàn bộ nội dung của trang web và lưu vào biến content
            String content = scanner.next();
            // Đóng scanner
            scanner.close();
            // Xóa tất cả các ký tự xuống dòng
            content = content.replaceAll("\\n+", "");
            // Tạo biểu thức chính quy để tìm kiếm tên bài hát. Biểu thức chính quy này sử dụng name_song"> để tìm kiếm các dòng chứa tên bài hát, và </a> để ngăn cách giữa tên bài hát và phần còn lại của thẻ HTML.
            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
//            Sử dụng phương thức matcher của đối tượng Pattern để tìm kiếm các chuỗi khớp với biểu thức chính quy trong content.
            Matcher m = p.matcher(content);
            // Duyệt qua tất cả các kết quả khớp với biểu thức chính quy và in ra tên bài hát
            while (m.find()) {
                System.out.println(m.group(1));
            }
//            Duyệt qua tất cả các kết quả khớp với biểu thức chính quy và in ra tên bài hát bằng cách sử dụng phương thức find và group của đối tượng Matcher. Phương thức find sẽ tìm kiếm và trả về true nếu có kết quả khớp với biểu thức chính quy, và phương thức group sẽ trả về chuỗi con khớp với biểu thức chính quy đó.
        } catch (MalformedURLException e) {
            e.printStackTrace();
//            Ngoại lệ này được ném ra khi URL được tạo không hợp lệ. Trong trường hợp này, mã nguồn sẽ in ra stack trace của ngoại lệ để giúp người dùng xác định nguyên nhân của lỗi.
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
//            Ngoại lệ này được ném ra khi không hỗ trợ mã hóa ký tự được sử dụng để đọc nội dung của trang web
        } catch (IOException e) {
            e.printStackTrace();
        }
//        Ngoại lệ này được ném ra khi có vấn đề xảy ra trong quá trình đọc nội dung của trang web, chẳng hạn như khi trang web không phản hồi hoặc khi có lỗi mạng.
    }
//    Nếu xảy ra lỗi, các ngoại lệ sẽ được in ra màn hình thông qua phương thức printStackTrace().
}