# LAPORAN PRAKTIKUM DESIGN PATTERN
## STRATEGY PATTERN

**Program Studi**: Teknik Informatika  
**Jurusan**: Teknologi Informasi dan Komputer  
**Politeknik Negeri Lhokseumawe**  
**Lab**: 101
**Nama**: Malikul Mulki  
**NIM**: 2024573010079 
**Kelas**: .TI 2A 
**Mata Kuliah**: Design Pattern  
**Dosen Pengampu**: Muhammad Reza Zulman

---

# BAB I
# PENDAHULUAN

## 1.1 Latar Belakang

Design pattern merupakan pola rancangan perangkat lunak yang digunakan untuk menyelesaikan permasalahan desain yang sering muncul dalam pengembangan aplikasi. Dalam pemrograman berorientasi objek, design pattern membantu pengembang membuat kode yang lebih terstruktur, fleksibel, mudah dikembangkan, dan mudah dipelihara.

Salah satu design pattern yang termasuk ke dalam behavioral design pattern adalah **Strategy Pattern**. Strategy Pattern digunakan untuk memisahkan beberapa algoritma atau perilaku ke dalam class yang berbeda, sehingga algoritma tersebut dapat dipilih dan diganti pada saat program berjalan. Dengan pola ini, class utama tidak perlu mengetahui detail implementasi dari setiap strategi yang digunakan.

Pada praktikum ini, Strategy Pattern diterapkan ke dalam beberapa studi kasus, yaitu program navigasi sederhana, program filter foto sederhana, dan program notifikasi. Selain itu, terdapat latihan tambahan berupa program pembayaran e-commerce yang menggunakan beberapa metode pembayaran sebagai strategi yang berbeda. Praktikum ini bertujuan untuk memperlihatkan bagaimana penggunaan interface, concrete strategy, dan context class dapat membuat program menjadi lebih modular serta mudah diperluas.

## 1.2 Rumusan Masalah

1. Apa yang dimaksud dengan Strategy Pattern?
2. Bagaimana struktur umum dari Strategy Pattern?
3. Bagaimana implementasi Strategy Pattern pada program navigasi, filter foto, notifikasi, dan pembayaran?
4. Apa manfaat Strategy Pattern dalam pengembangan perangkat lunak berbasis Java?

## 1.3 Tujuan Praktikum

1. Memahami konsep Strategy Pattern dan manfaatnya dalam desain perangkat lunak.
2. Mengimplementasikan Strategy Pattern dalam bahasa pemrograman Java.
3. Mengidentifikasi situasi yang cocok untuk penggunaan Strategy Pattern.
4. Membuat program yang dapat mengganti strategi atau algoritma secara dinamis.

## 1.4 Manfaat Praktikum

1. Mahasiswa dapat memahami penggunaan behavioral design pattern dalam pemrograman Java.
2. Mahasiswa dapat membuat kode yang lebih fleksibel dan modular.
3. Mahasiswa dapat mengurangi penggunaan percabangan berlebihan seperti `if-else` atau `switch`.
4. Mahasiswa dapat menerapkan prinsip Open/Closed Principle, yaitu menambahkan fitur baru tanpa mengubah class utama.

---

# BAB II
# LANDASAN TEORI

## 2.1 Design Pattern

Design pattern adalah pola solusi umum yang digunakan dalam pengembangan perangkat lunak. Design pattern tidak selalu berupa kode siap pakai, tetapi berupa rancangan atau pendekatan yang dapat diterapkan untuk menyelesaikan masalah tertentu dalam desain program.

Dalam Object Oriented Programming, design pattern membantu mengatur hubungan antar class dan object agar program lebih mudah dibaca, diuji, dikembangkan, dan dirawat.

## 2.2 Strategy Pattern

Strategy Pattern adalah design pattern yang memungkinkan beberapa algoritma atau perilaku didefinisikan secara terpisah, kemudian dipilih sesuai kebutuhan saat program berjalan. Setiap algoritma dibuat dalam class tersendiri dan mengikuti kontrak yang sama melalui interface.

Dengan Strategy Pattern, class utama hanya bergantung pada interface, bukan pada implementasi konkret. Hal ini membuat program lebih fleksibel karena strategi dapat diganti tanpa mengubah kode context class.

## 2.3 Struktur Strategy Pattern

Struktur umum Strategy Pattern terdiri dari:

1. **Strategy Interface**  
   Interface yang berisi method umum yang wajib diimplementasikan oleh semua strategi.

2. **Concrete Strategy**  
   Class yang mengimplementasikan Strategy Interface dan berisi perilaku atau algoritma spesifik.

3. **Context Class**  
   Class yang menggunakan strategy untuk menjalankan suatu perilaku. Context dapat mengganti strategy sesuai kebutuhan program.

## 2.4 Kelebihan Strategy Pattern

1. Kode lebih fleksibel karena strategi dapat diganti secara dinamis.
2. Algoritma dipisahkan ke dalam class masing-masing.
3. Program lebih mudah dikembangkan jika ingin menambahkan strategi baru.
4. Mengurangi penggunaan percabangan yang panjang.
5. Mendukung prinsip Open/Closed Principle.

## 2.5 Kekurangan Strategy Pattern

1. Jumlah class menjadi lebih banyak.
2. Membutuhkan pemahaman OOP yang baik.
3. Untuk program yang sangat sederhana, struktur Strategy Pattern dapat terlihat lebih kompleks.

---

# BAB III
# ALAT DAN BAHAN

## 3.1 Alat

1. Laptop atau komputer.
2. Sistem operasi Windows.
3. Java Development Kit (JDK).
4. IntelliJ IDEA.
5. Terminal atau fitur Run pada IDE.

## 3.2 Bahan

1. Modul praktikum Design Pattern.
2. Source code program Java.
3. Screenshot struktur folder project.
4. Screenshot hasil output program.

---

# BAB IV
# LANGKAH PRAKTIKUM DAN HASIL PERCOBAAN

## 4.1 Struktur Project

Pada praktikum ini, project Java dibuat menggunakan struktur package. Berdasarkan project yang dikerjakan, terdapat dua bagian utama, yaitu `modul_6` untuk praktikum Liskov Substitution Principle dan `modul_7` untuk praktikum Strategy Pattern. Fokus laporan ini adalah `modul_7`, karena bagian tersebut berisi implementasi Strategy Pattern.

Struktur project yang digunakan adalah sebagai berikut:

```text
src
├── modul_6
│   ├── Latihan
│   ├── praktikum_1
│   │   └── dengan_lsp
│   │       ├── Main.java
│   │       ├── Rectangle.java
│   │       ├── Shape.java
│   │       └── Square.java
│   └── praktikum_2
│       ├── dengan_lsp
│       │   ├── BlogPost.java
│       │   ├── Main.java
│       │   ├── Publishable.java
│       │   ├── SocialPost.java
│       │   └── TwitterPost.java
│       └── tanpa_lsp
│           ├── BlogPost.java
│           ├── Main.java
│           ├── SocialMediaPost.java
│           └── TwitterPost.java
│
└── modul_7
    ├── praktikum_1
    │   ├── DrivingRoute.java
    │   ├── Main.java
    │   ├── Navigator.java
    │   ├── PublicTransportRoute.java
    │   ├── RouteStrategy.java
    │   └── WalkingRoute.java
    │
    ├── praktikum_2
    │   ├── BlackWhiteFilter.java
    │   ├── BrightFilter.java
    │   ├── FilterStrategy.java
    │   ├── Main.java
    │   ├── PhotoEditor.java
    │   └── SepiaFilter.java
    │
    └── praktikum_3
        ├── EmailNotification.java
        ├── Main.java
        ├── NotificationService.java
        ├── NotificationStrategy.java
        ├── PushNotification.java
        └── SMSNotification.java
```

---

## 4.2 Praktikum 1: Program Navigasi Sederhana

### 4.2.1 Deskripsi Program

Program navigasi sederhana dibuat untuk menunjukkan penggunaan beberapa strategi rute, yaitu berjalan kaki, berkendara, dan transportasi umum. Pada program ini, `RouteStrategy` berperan sebagai interface strategy, sedangkan `WalkingRoute`, `DrivingRoute`, dan `PublicTransportRoute` berperan sebagai concrete strategy. Class `Navigator` berperan sebagai context yang menggunakan strategi rute.

### 4.2.2 Kode Program

#### RouteStrategy.java

```java
package modul_7.praktikum_1;

public interface RouteStrategy {
    void buildRoute(String start, String end);
}
```

#### WalkingRoute.java

```java
package modul_7.praktikum_1;

public class WalkingRoute implements RouteStrategy {
    @Override
    public void buildRoute(String start, String end) {
        System.out.println("Membuat rute jalan kaki dari " + start + " ke " + end);
    }
}
```

#### DrivingRoute.java

```java
package modul_7.praktikum_1;

public class DrivingRoute implements RouteStrategy {
    @Override
    public void buildRoute(String start, String end) {
        System.out.println("Membuat rute berkendara dari " + start + " ke " + end);
    }
}
```

#### PublicTransportRoute.java

```java
package modul_7.praktikum_1;

public class PublicTransportRoute implements RouteStrategy {
    @Override
    public void buildRoute(String start, String end) {
        System.out.println("Membuat rute transportasi umum dari " + start + " ke " + end);
    }
}
```

#### Navigator.java

```java
package modul_7.praktikum_1;

public class Navigator {
    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void navigate(String start, String end) {
        if (strategy == null) {
            System.out.println("Strategi rute belum dipilih.");
            return;
        }

        strategy.buildRoute(start, end);
    }
}
```

#### Main.java

```java
package modul_7.praktikum_1;

public class Main {
    public static void main(String[] args){
        Navigator nav = new Navigator();

        nav.setStrategy(new WalkingRoute());
        nav.navigate("Kampus", "Mall");

        nav.setStrategy(new PublicTransportRoute());
        nav.navigate("kampus", "Stadium");
    }
}
```

### 4.2.3 Penjelasan Kode

Pada program ini, `Navigator` tidak menentukan sendiri jenis rute yang digunakan. `Navigator` hanya menyimpan object dari interface `RouteStrategy`. Ketika method `navigate()` dijalankan, proses pembuatan rute akan mengikuti strategi yang sedang dipilih. Strategi dapat diganti menggunakan method `setStrategy()`.

### 4.2.4 Hasil Percobaan

**Letakkan Screenshot 2 di sini: Output Program Navigasi Sederhana.**

![Screenshot Output Praktikum 1](screenshot/output-praktikum-1.png)

### 4.2.5 Analisa Praktikum 1

Berdasarkan hasil percobaan, program dapat menjalankan strategi navigasi yang berbeda tanpa mengubah class `Navigator`. Hal ini menunjukkan bahwa Strategy Pattern memisahkan algoritma rute dari class utama. Jika ingin menambahkan strategi baru, misalnya rute sepeda, maka cukup membuat class baru yang mengimplementasikan `RouteStrategy`.

---

## 4.3 Praktikum 2: Program Filter Foto Sederhana

### 4.3.1 Deskripsi Program

Program filter foto sederhana digunakan untuk menerapkan beberapa jenis filter pada gambar. Filter yang digunakan adalah hitam putih, sepia, dan cerah. Pada program ini, `FilterStrategy` berperan sebagai interface strategy, sedangkan `BlackWhiteFilter`, `SepiaFilter`, dan `BrightFilter` berperan sebagai concrete strategy. Class `PhotoEditor` berperan sebagai context.

### 4.3.2 Kode Program

#### FilterStrategy.java

```java
package modul_7.praktikum_2;

public interface FilterStrategy {
    void apply(String fileName);
}
```

#### BlackWhiteFilter.java

```java
package modul_7.praktikum_2;

public class BlackWhiteFilter implements FilterStrategy {
    @Override
    public void apply(String fileName) {
        System.out.println("Menerapkan filter hitam putih pada " + fileName);
    }
}
```

#### SepiaFilter.java

```java
package modul_7.praktikum_2;

public class SepiaFilter implements FilterStrategy {
    @Override
    public void apply(String fileName) {
        System.out.println("Menerapkan filter sepia pada " + fileName);
    }
}
```

#### BrightFilter.java

```java
package modul_7.praktikum_2;

public class BrightFilter implements FilterStrategy {
    @Override
    public void apply(String fileName) {
        System.out.println("Menerapkan filter cerah pada " + fileName);
    }
}
```

#### PhotoEditor.java

```java
package modul_7.praktikum_2;

public class PhotoEditor {
    private FilterStrategy filter;

    public void setFilter(FilterStrategy filter) {
        this.filter = filter;
    }

    public void applyFilter(String fileName) {
        if (filter == null) {
            System.out.println("Filter belum dipilih.");
            return;
        }

        filter.apply(fileName);
    }
}
```

#### Main.java

```java
package modul_7.praktikum_2;

public class Main {
    public static void main(String[] args) {
        PhotoEditor editor = new PhotoEditor();

        editor.setFilter(new BlackWhiteFilter());
        editor.applyFilter("foto1.jpg");

        editor.setFilter(new SepiaFilter());
        editor.applyFilter("foto2.jpg");

        editor.setFilter(new BrightFilter());
        editor.applyFilter("foto3.jpg");
    }
}
```

### 4.3.3 Penjelasan Kode

Pada program ini, class `PhotoEditor` hanya bertugas menjalankan filter yang sedang dipilih. Detail proses filter diserahkan kepada class strategy masing-masing. Dengan demikian, `PhotoEditor` tidak perlu menggunakan banyak percabangan untuk menentukan filter apa yang harus dijalankan.

### 4.3.4 Hasil Percobaan

**Letakkan Screenshot 3 di sini: Output Program Filter Foto.**

![Screenshot Output Praktikum 2](screenshot/output-praktikum-2.png)

### 4.3.5 Analisa Praktikum 2

Hasil percobaan menunjukkan bahwa setiap filter dapat diterapkan sesuai strategi yang dipilih. Struktur program menjadi lebih modular karena setiap filter dibuat dalam class terpisah. Jika ingin menambahkan filter baru, misalnya `BlurFilter`, maka cukup membuat class baru yang mengimplementasikan `FilterStrategy`.

---

## 4.4 Praktikum 3: Program Notifikasi

### 4.4.1 Deskripsi Program

Program notifikasi digunakan untuk mengirim pesan menggunakan beberapa metode, yaitu email, SMS, dan push notification. Pada program ini, `NotificationStrategy` berperan sebagai interface strategy, sedangkan `EmailNotification`, `SMSNotification`, dan `PushNotification` berperan sebagai concrete strategy. Class `NotificationService` berperan sebagai context.

### 4.4.2 Kode Program

#### NotificationStrategy.java

```java
package modul_7.praktikum_3;

public interface NotificationStrategy {
    void send(String message);
}
```

#### EmailNotification.java

```java
package modul_7.praktikum_3;

public class EmailNotification implements NotificationStrategy {
    @Override
    public void send(String message) {
        System.out.println("Mengirim email: " + message);
    }
}
```

#### SMSNotification.java

```java
package modul_7.praktikum_3;

public class SMSNotification implements NotificationStrategy {
    @Override
    public void send(String message) {
        System.out.println("Mengirim SMS: " + message);
    }
}
```

#### PushNotification.java

```java
package modul_7.praktikum_3;

public class PushNotification implements NotificationStrategy {
    @Override
    public void send(String message) {
        System.out.println("Mengirim push notification: " + message);
    }
}
```

#### NotificationService.java

```java
package modul_7.praktikum_3;

public class NotificationService {
    private NotificationStrategy strategy;

    public NotificationService() {
    }

    public void setStrategy(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public void notifyUser(String message) {
        if (strategy == null) {
            System.out.println("Strategi notifikasi belum dipilih.");
            return;
        }

        strategy.send(message);
    }
}
```

#### Main.java

```java
package modul_7.praktikum_3;

public class Main {
    public static void main(String[] args) {
        NotificationService notif = new NotificationService();

        notif.setStrategy(new EmailNotification());
        notif.notifyUser("Selamat, akun Anda berhasil dibuat!");

        notif.setStrategy(new SMSNotification());
        notif.notifyUser("Kode OTP Anda: 123456");

        notif.setStrategy(new PushNotification());
        notif.notifyUser("Ada promo baru menanti Anda!");
    }
}
```

### 4.4.3 Penjelasan Kode

Pada program ini, `NotificationService` tidak langsung menentukan cara pengiriman pesan. Class tersebut hanya menggunakan object dari interface `NotificationStrategy`. Cara pengiriman pesan ditentukan oleh strategy yang dipilih, yaitu `EmailNotification`, `SMSNotification`, atau `PushNotification`.

### 4.4.4 Hasil Percobaan

**Letakkan Screenshot 4 di sini: Output Program Notifikasi.**

![Screenshot Output Praktikum 3](screenshot/output-praktikum-3.png)

### 4.4.5 Analisa Praktikum 3

Berdasarkan hasil percobaan, program dapat mengirim pesan menggunakan strategi yang berbeda. Strategy Pattern cocok digunakan pada kasus ini karena sistem notifikasi dapat memiliki banyak metode pengiriman, tetapi semua metode tersebut memiliki tujuan yang sama, yaitu mengirim pesan kepada pengguna.

---

## 4.5 Latihan: Program Pembayaran E-Commerce

### 4.5.1 Deskripsi Program

Pada latihan ini dibuat program pembayaran e-commerce sederhana. Program mendukung beberapa metode pembayaran, yaitu kartu kredit, e-wallet, dan transfer bank. Setiap metode pembayaran dibuat sebagai concrete strategy yang mengimplementasikan interface `PaymentStrategy`.

### 4.5.2 Struktur Package Latihan

Struktur package latihan yang disarankan adalah sebagai berikut:

```text
modul_7
└── latihan
    ├── praktikum
    │   ├── BankTransferPayment.java
    │   ├── Checkout.java
    │   ├── CreditCardPayment.java
    │   ├── EWalletPayment.java
    │   ├── Main.java
    │   └── PaymentStrategy.java
    └── analisis
        └── jawaban.md
```

### 4.5.3 Kode Program Latihan

#### PaymentStrategy.java

```java
package modul_7.latihan.praktikum;

public interface PaymentStrategy {
    void pay(double amount);
}
```

#### CreditCardPayment.java

```java
package modul_7.latihan.praktikum;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pembayaran sebesar Rp" + amount + " menggunakan Kartu Kredit.");
    }
}
```

#### EWalletPayment.java

```java
package modul_7.latihan.praktikum;

public class EWalletPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pembayaran sebesar Rp" + amount + " menggunakan E-Wallet.");
    }
}
```

#### BankTransferPayment.java

```java
package modul_7.latihan.praktikum;

public class BankTransferPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pembayaran sebesar Rp" + amount + " menggunakan Transfer Bank.");
    }
}
```

#### Checkout.java

```java
package modul_7.latihan.praktikum;

public class Checkout {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Metode pembayaran belum dipilih.");
            return;
        }

        paymentStrategy.pay(amount);
    }
}
```

#### Main.java

```java
package modul_7.latihan.praktikum;

public class Main {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();

        checkout.setPaymentStrategy(new CreditCardPayment());
        checkout.processPayment(150000);

        checkout.setPaymentStrategy(new EWalletPayment());
        checkout.processPayment(75000);

        checkout.setPaymentStrategy(new BankTransferPayment());
        checkout.processPayment(250000);
    }
}
```

### 4.5.4 Jawaban Analisis Latihan

#### jawaban.md

```md
# Jawaban Analisis

## 1. Jelaskan mengapa Strategy Pattern cocok digunakan dalam kasus pembayaran e-commerce.

Strategy Pattern cocok digunakan dalam kasus pembayaran e-commerce karena sistem pembayaran memiliki beberapa metode yang berbeda, seperti kartu kredit, e-wallet, dan transfer bank. Setiap metode pembayaran memiliki proses yang berbeda, tetapi memiliki tujuan yang sama, yaitu melakukan pembayaran. Dengan Strategy Pattern, setiap metode pembayaran dapat dipisahkan ke dalam class strategi masing-masing, sehingga kode menjadi lebih rapi, modular, dan mudah dikembangkan.

## 2. Bagaimana jika suatu hari ingin menambahkan metode pembayaran baru seperti QRIS? Apakah Anda perlu mengubah class Checkout?

Jika ingin menambahkan metode pembayaran baru seperti QRIS, maka tidak perlu mengubah class Checkout. Pengembang cukup membuat class baru, misalnya QRISPayment, yang mengimplementasikan interface PaymentStrategy. Setelah itu, class baru tersebut dapat digunakan sebagai strategi pembayaran baru. Hal ini menunjukkan bahwa program sudah menerapkan prinsip Open/Closed Principle, yaitu terbuka untuk penambahan fitur baru tetapi tertutup untuk perubahan kode utama.
```

### 4.5.5 Hasil Percobaan

**Letakkan Screenshot 5 di sini: Output Program Pembayaran E-Commerce.**

![Screenshot Output Latihan](screenshot/output-latihan-payment.png)

### 4.5.6 Analisa Latihan

Pada latihan pembayaran e-commerce, setiap metode pembayaran dibuat dalam class yang berbeda. Class `Checkout` tidak perlu mengetahui detail pembayaran kartu kredit, e-wallet, atau transfer bank. Class tersebut hanya menggunakan interface `PaymentStrategy`. Dengan demikian, program menjadi fleksibel dan mudah dikembangkan jika metode pembayaran baru ditambahkan.

---

# BAB V
# PEMBAHASAN DAN ANALISA HASIL

Berdasarkan praktikum yang telah dilakukan, Strategy Pattern berhasil diterapkan pada program navigasi, filter foto, notifikasi, dan pembayaran e-commerce. Setiap program memiliki struktur yang sama, yaitu interface strategy, concrete strategy, dan context class. Interface strategy digunakan sebagai kontrak umum, concrete strategy berisi implementasi perilaku tertentu, dan context class bertugas menjalankan strategy yang sedang digunakan. Hasil percobaan menunjukkan bahwa perilaku program dapat diganti secara dinamis tanpa mengubah class utama. Hal ini membuat program menjadi lebih fleksibel, modular, dan mudah dikembangkan.

Penerapan Strategy Pattern juga membantu menghindari penggunaan percabangan yang terlalu banyak. Misalnya pada program notifikasi, pengiriman email, SMS, dan push notification tidak dibuat dalam satu class dengan banyak `if-else`, tetapi dipisahkan ke dalam class masing-masing. Begitu juga pada program pembayaran, setiap metode pembayaran dibuat sebagai strategi yang berbeda. Dengan pendekatan ini, penambahan fitur baru dapat dilakukan dengan membuat class baru tanpa memodifikasi context class.

---

# BAB VI
# KESIMPULAN DAN SARAN

## 6.1 Kesimpulan

Strategy Pattern adalah design pattern yang digunakan untuk memisahkan algoritma atau perilaku ke dalam beberapa class strategi. Pola ini memungkinkan strategi diganti secara dinamis saat program berjalan. Berdasarkan hasil praktikum, Strategy Pattern dapat diterapkan pada berbagai kasus seperti navigasi, filter foto, notifikasi, dan pembayaran e-commerce. Penggunaan pola ini membuat program menjadi lebih fleksibel, modular, mudah diuji, dan mudah dikembangkan.

## 6.2 Saran

Dalam penerapan Strategy Pattern, sebaiknya setiap strategy diberi nama class yang jelas sesuai fungsinya. Selain itu, interface strategy harus dirancang dengan method yang sederhana dan sesuai kebutuhan. Strategy Pattern sebaiknya digunakan pada program yang memiliki beberapa variasi algoritma atau perilaku, bukan pada program yang terlalu sederhana agar struktur kode tidak menjadi terlalu kompleks.

---

# DAFTAR PUSTAKA

1. Gamma, E., Helm, R., Johnson, R., & Vlissides, J. (1994). *Design Patterns: Elements of Reusable Object-Oriented Software*. Addison-Wesley.
2. Freeman, E., Robson, E., Bates, B., & Sierra, K. (2004). *Head First Design Patterns*. O'Reilly Media.
3. Oracle. (n.d.). *The Java Tutorials: Object-Oriented Programming Concepts*. Oracle Documentation.
4. Refactoring Guru. (n.d.). *Strategy Design Pattern*. Refactoring Guru.
5. Politeknik Negeri Lhokseumawe. (2026). *Modul Praktikum Design Pattern: Strategy Pattern*. Jurusan Teknologi Informasi dan Komputer.