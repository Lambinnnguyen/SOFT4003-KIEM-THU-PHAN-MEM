#  SOFT4003 - Kiểm Thử Phần Mềm

Chào mừng đến với repository lưu trữ bài tập và tài liệu thực hành môn **Kiểm thử phần mềm**.

## Thông Tin Sinh Viên
| Thông Tin | Chi Tiết |
| :--- | :--- |
| **Họ và tên** | Nguyễn Tùng Lâm |
| **Mã sinh viên** | BCS230050 |
| **Lớp** | 23CS1 |
| **Giảng viên hướng dẫn** | Trương Anh Hoàng |

---

## Nội Dung Môn Học

### Chương 1: Kiểm thử giao diện (UI Testing)
Mục tiêu: Rèn luyện kỹ năng kiểm thử giao diện người dùng và phát hiện các lỗi trong thiết kế UI/UX.

- **Bài tập thực hành**: [Can't Unsee](https://cantunsee.space/)
- **Kết quả đạt được**: 7100 điểm

#### Minh họa kết quả:
![Kết quả bài tập Chương 1]<img width="1905" height="954" alt="BT_CantUnsee" src="https://github.com/user-attachments/assets/7e13fe6b-c336-423e-b2bb-86feef0252db" />


### Chương 2: Kiểm thử đơn vị (Unit Testing)
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

###  Chương 3: Kiểm Thử Cypress End-to-End
Mục tiêu: Rèn luyện kỹ năng kiểm thử end-to-end bằng Cypress để đảm bảo luồng hoạt động của ứng dụng web.

#### Giới thiệu
Bài tập này sử dụng Cypress để kiểm thử các chức năng chính của trang web SauceDemo, bao gồm đăng nhập, thêm sản phẩm vào giỏ hàng và sắp xếp sản phẩm.

#### Cài đặt môi trường
1. Cài đặt Node.js (phiên bản 14 trở lên).
2. Khởi tạo dự án Node.js: `npm init -y`.
3. Cài đặt Cypress: `npm install cypress --save-dev`.
4. Khởi tạo cấu trúc Cypress: `npx cypress install`.

#### Kịch bản kiểm thử
- **Login Test** (`login_spec.cy.js`):
  - Đăng nhập thành công với credentials hợp lệ.
  - Hiển thị thông báo lỗi với credentials không hợp lệ.
- **Cart Test** (`cart_spec.cy.js`):
  - Thêm sản phẩm vào giỏ hàng.
  - Sắp xếp sản phẩm theo giá từ thấp đến cao.
  - Xóa sản phẩm khỏi giỏ hàng.
- **Checkout Test** (`checkout_spec.cy.js`):
  - Quy trình thanh toán đầy đủ: đăng nhập, thêm sản phẩm, điền thông tin thanh toán và xác nhận chuyển đến trang xác nhận.

#### Kết quả
Tất cả test case đều pass, xác nhận các chức năng hoạt động đúng trên trình duyệt.

#### Minh họa kết quả
- **Cart Test** (`cart_spec.cy.js`):
<img width="1915" height="912" alt="image" src="https://github.com/user-attachments/assets/a7a04111-7aa9-4883-9ef1-56d29f2851d5" />
<img width="1910" height="908" alt="{A8BAFFD0-2082-4FCA-A58C-A0D6C7D6D2E2}" src="https://github.com/user-attachments/assets/182d0122-952b-4898-bfba-29dadbd47126" />
- **Login Test** (`login_spec.cy.js`):
<img width="1913" height="911" alt="image" src="https://github.com/user-attachments/assets/6f0d936b-0482-4746-8835-5a9c227efed9" />
- **Checkout Test** (`checkout_spec.cy.js`):
<img width="1917" height="901" alt="{7463148E-6FCE-4A9D-9F20-08FFAD848873}" src="https://github.com/user-attachments/assets/aace0b46-768f-4399-8f78-51c0e72411e9" />


#### Hướng dẫn chạy
1. Điều hướng đến thư mục `Cypress_End-to-end/`.
2. Chạy test cụ thể: `npx cypress run --spec cypress/e2e/login_spec.cy.js`.
3. Hoặc chạy tất cả: `npx cypress run`.
4. Để chạy tương tác: `npx cypress open`.



### Chương 4: Kiểm Thử Hiệu Suất với JMeter
Mục tiêu: Rèn luyện kỹ năng kiểm thử hiệu suất bằng JMeter để đánh giá khả năng chịu tải và hiệu suất của ứng dụng web.

#### Giới thiệu
Bài tập này triển khai kiểm thử hiệu suất cho một trang web bằng JMeter, bao gồm các kịch bản tải với nhiều thread group để mô phỏng người dùng đồng thời.

#### Cấu trúc
```
Jmeter_performance_test/
├── website_test.jmx    # Test plan JMeter chính
├── csv/
│   ├── Tg1_summary.csv
│   ├── Tg2_summary.csv
│   └── Tg3_summary.csv  # Dữ liệu kết quả từ các thread group
└── results/             # Thư mục chứa kết quả xuất ra từ JMeter
```

#### Hướng dẫn chạy
1. Cài đặt Apache JMeter (phiên bản 5.0 trở lên) từ trang chủ chính thức.
2. Mở JMeter GUI bằng cách chạy `jmeter.bat` (trên Windows) hoặc `jmeter` (trên Linux/Mac).
3. Mở file test plan: File > Open > Chọn `website_test.jmx`.
4. Chạy test: Run > Start.
5. Xem kết quả trong các Listener (View Results Tree, Summary Report).
6. Xuất kết quả vào thư mục `results/` nếu cần.

#### Kết quả
Các file CSV trong thư mục `csv/` chứa dữ liệu hiệu suất chi tiết từ các thread group khác nhau, bao gồm thời gian phản hồi, số lượng request thành công/thất bại, throughput, v.v. Điều này giúp phân tích và tối ưu hóa hiệu suất của trang web.




