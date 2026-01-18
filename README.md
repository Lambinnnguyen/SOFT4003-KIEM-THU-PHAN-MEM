# 🧪 SOFT4003 - Kiểm Thử Phần Mềm

Chào mừng đến với repository lưu trữ bài tập và tài liệu thực hành môn **Kiểm thử phần mềm**.

## 📋 Thông Tin Sinh Viên
| Thông Tin | Chi Tiết |
| :--- | :--- |
| **Họ và tên** | Nguyễn Tùng Lâm |
| **Mã sinh viên** | BCS230050 |
| **Lớp** | 23CS1 |
| **Giảng viên hướng dẫn** | Trương Anh Hoàng |

---

## 📚 Nội Dung Môn Học

### 🎨 Chương 1: Kiểm thử giao diện (UI Testing)
Mục tiêu: Rèn luyện kỹ năng kiểm thử giao diện người dùng và phát hiện các lỗi trong thiết kế UI/UX.

- **Bài tập thực hành**: [Can't Unsee](https://cantunsee.space/)
- **Kết quả đạt được**: 4850 điểm

#### Minh họa kết quả:
![Kết quả bài tập Chương 1](BT_Chuong_1.png)

### ⚙️ Chương 2: Kiểm thử đơn vị (Unit Testing)
Mục tiêu: Rèn luyện kỹ năng kiểm thử đơn vị bằng JUnit để đảm bảo tính chính xác của mã nguồn.

#### Giới thiệu bài toán
Bài tập này triển khai lớp `StudentAnalyzer` để phân tích danh sách điểm số của sinh viên. Lớp này bao gồm hai phương thức chính:
- `countExcellentStudents(List<Double> scores)`: Đếm số lượng sinh viên có điểm xuất sắc (>= 8.0 trong khoảng 0-10).
- `calculateValidAverage(List<Double> scores)`: Tính trung bình điểm hợp lệ (loại bỏ điểm null, âm, hoặc >10).

#### Cấu trúc
```
Unit-test/
├── src/
│   └── StudentAnalyzer.java    # Lớp chính chứa logic phân tích
├── test/
│   └── StudentAnalyzerTest.java # Lớp kiểm thử với 7 test case
└── junit-platform-console-standalone-1.10.2.jar  # Thư viện JUnit để chạy test
```

#### Luồng hoạt động kiểm thử
1. **Chuẩn bị môi trường**: Cài đặt JDK 17 và tải thư viện JUnit.
2. **Biên dịch mã nguồn**: Sử dụng `javac` để biên dịch `StudentAnalyzer.java` và `StudentAnalyzerTest.java`.
3. **Chạy kiểm thử**: Sử dụng JUnit Console Launcher để thực thi các test case.
4. **Xem kết quả**: Kiểm tra output để xác nhận tất cả test đều pass.

#### Hướng dẫn kiểm thử
Để chạy kiểm thử:
1. Đảm bảo JDK 17 đã được cài đặt và thêm vào PATH.
2. Tải JUnit JAR từ Maven Central nếu chưa có.
3. Mở terminal và điều hướng đến thư mục `Unit-test/`.
4. Biên dịch mã nguồn:
   ```
   javac -cp "junit-platform-console-standalone-1.10.2.jar" src/StudentAnalyzer.java
   javac -cp "junit-platform-console-standalone-1.10.2.jar;src" test/StudentAnalyzerTest.java
   ```
5. Chạy test:
   ```
   java -jar junit-platform-console-standalone-1.10.2.jar --class-path "src;test" --scan-classpath
   ```



