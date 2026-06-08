# LAPORAN PRAKTIKUM

## Object Oriented Programming (OOP)

---

### Identitas Mahasiswa

- **Nama** : Malikul Mulki
- **NIM** : 2024573010079
- **Mata Kuliah** : Design Pattern

---

## BAB I
## PENDAHULUAN

### 1.1 Latar Belakang

Pemrograman berorientasi objek atau *Object Oriented Programming (OOP)* merupakan salah satu paradigma pemrograman yang banyak digunakan dalam pengembangan perangkat lunak modern. OOP memungkinkan pengembang untuk menyusun program berdasarkan konsep objek yang memiliki atribut dan metode, sehingga kode menjadi lebih terstruktur, modular, dan mudah untuk dikembangkan.

Dalam kaitannya dengan mata kuliah Design Pattern, pemahaman terhadap konsep dasar OOP menjadi sangat penting. Design pattern merupakan solusi umum terhadap permasalahan yang sering muncul dalam perancangan perangkat lunak, yang sebagian besar dibangun di atas prinsip-prinsip OOP seperti encapsulation, inheritance, dan polymorphism.

Melalui praktikum ini, mahasiswa diharapkan dapat memahami konsep dasar OOP serta mampu mengimplementasikannya dalam pembuatan program sederhana sebagai dasar untuk mempelajari design pattern lebih lanjut.

---

### 1.2 Tujuan

Adapun tujuan dari praktikum ini adalah:

1. Memahami konsep dasar Object Oriented Programming (OOP)
2. Mengetahui prinsip-prinsip utama dalam OOP
3. Mampu mengimplementasikan konsep OOP dalam program
4. Menjadi dasar dalam memahami dan menerapkan design pattern

---

### 1.3 Manfaat

Manfaat yang diperoleh dari praktikum ini antara lain:

- Meningkatkan pemahaman tentang struktur pemrograman berbasis objek
- Membantu dalam penulisan kode yang lebih rapi dan terorganisir
- Menjadi bekal dalam pengembangan aplikasi yang lebih kompleks
- Mendukung pemahaman terhadap konsep design pattern  # LAPORAN PRAKTIKUM

## Object Oriented Programming (OOP)

---

### Identitas Mahasiswa

- **Nama** : Malikul Mulki
- **NIM** : 2024573010079
- **Mata Kuliah** : Design Pattern

---

## BAB I
## PENDAHULUAN

### 1.1 Latar Belakang

Pemrograman berorientasi objek atau *Object Oriented Programming (OOP)* merupakan salah satu paradigma pemrograman yang banyak digunakan dalam pengembangan perangkat lunak modern. OOP memungkinkan pengembang untuk menyusun program berdasarkan konsep objek yang memiliki atribut dan metode, sehingga kode menjadi lebih terstruktur, modular, dan mudah untuk dikembangkan.

Dalam kaitannya dengan mata kuliah Design Pattern, pemahaman terhadap konsep dasar OOP menjadi sangat penting. Design pattern merupakan solusi umum terhadap permasalahan yang sering muncul dalam perancangan perangkat lunak, yang sebagian besar dibangun di atas prinsip-prinsip OOP seperti encapsulation, inheritance, dan polymorphism.

Melalui praktikum ini, mahasiswa diharapkan dapat memahami konsep dasar OOP serta mampu mengimplementasikannya dalam pembuatan program sederhana sebagai dasar untuk mempelajari design pattern lebih lanjut.

---

### 1.2 Tujuan

Adapun tujuan dari praktikum ini adalah:

1. Memahami konsep dasar Object Oriented Programming (OOP)
2. Mengetahui prinsip-prinsip utama dalam OOP
3. Mampu mengimplementasikan konsep OOP dalam program
4. Menjadi dasar dalam memahami dan menerapkan design pattern

---

### 1.3 Manfaat

Manfaat yang diperoleh dari praktikum ini antara lain:

- Meningkatkan pemahaman tentang struktur pemrograman berbasis objek
- Membantu dalam penulisan kode yang lebih rapi dan terorganisir
- Menjadi bekal dalam pengembangan aplikasi yang lebih kompleks
- Mendukung pemahaman terhadap konsep design pattern

## BAB II
## LANGKAH PRAKTIKUM

Pada praktikum ini, dilakukan beberapa percobaan untuk memahami konsep dasar Object Oriented Programming (OOP) yang dibagi menjadi beberapa bagian.

---

## 2.1 Bagian 1 – Class dan Object

### Penjelasan
Pada bagian ini dibuat class **Mahasiswa** dengan atribut dan method sederhana.

### Kode Program

```java
class Mahasiswa {
    String nama;
    String nim;

    void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Malikul Mulki";
        mhs.nim = "2024573010079";

        mhs.tampil();
    }
}
```

---

## 2.2 Bagian 2 – Method dan Operasi

### Penjelasan
Membuat class **Kalkulator** untuk melakukan operasi matematika.

### Kode Program

```java
class Kalkulator {
    int tambah(int a, int b) {
        return a + b;
    }

    int kurang(int a, int b) {
        return a - b;
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();

        System.out.println("Hasil tambah: " + k.tambah(5, 3));
        System.out.println("Hasil kurang: " + k.kurang(5, 3));
    }
}
```

---

## 2.3 Bagian 3 – Access Modifier

### Penjelasan
Menggunakan access modifier untuk mengatur akses data.

### Kode Program

```java
class AksesModifier {
    private String nama;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        AksesModifier obj = new AksesModifier();

        obj.setNama("Malikul Mulki");
        System.out.println("Nama: " + obj.getNama());
    }
}
```

---

## 2.4 Bagian 4 – Class dan Objek (Mobil)

### Penjelasan
Membuat class **Mobil** dengan atribut dan method.

### Kode Program

```java
class Mobil {
    String merk;
    int tahun;

    void tampil() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahun);
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();

        mobil.merk = "Toyota";
        mobil.tahun = 2022;

        mobil.tampil();
    }
}
```

---

## 2.5 Bagian 5 – Constructor

### Penjelasan
Menggunakan constructor pada class **Person**.

### Kode Program

```java
class Person {
    String nama;

    Person(String nama) {
        this.nama = nama;
    }

    void tampil() {
        System.out.println("Nama: " + nama);
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Person p = new Person("Malikul Mulki");
        p.tampil();
    }
}
```

---

## 2.6 Bagian 6 – Relasi Class

### Penjelasan
Membuat relasi antara class **Buku** dan **Perpustakaan**.

### Kode Program

```java
class Buku {
    String judul;

    Buku(String judul) {
        this.judul = judul;
    }
}
```

```java
class Perpustakaan {
    Buku buku;

    Perpustakaan(Buku buku) {
        this.buku = buku;
    }

    void tampil() {
        System.out.println("Judul Buku: " + buku.judul);
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Buku buku = new Buku("Pemrograman Java");
        Perpustakaan p = new Perpustakaan(buku);

        p.tampil();
    }
}
```

---

## BAB III
## KESIMPULAN

Dari praktikum yang telah dilakukan, dapat disimpulkan bahwa:

1. Object Oriented Programming (OOP) memudahkan dalam pengelolaan kode program
2. Konsep seperti class, object, method, dan constructor sangat penting dalam OOP
3. Access modifier membantu menjaga keamanan data
4. Relasi antar class memungkinkan program menjadi lebih terstruktur
5. OOP menjadi dasar penting dalam memahami design pattern

---
---

## BAB IV
## PRAKTIKUM LANJUTAN (MODUL 3 – PEWARISAN)

Pada praktikum lanjutan ini, dipelajari konsep **inheritance (pewarisan)** dalam Object Oriented Programming. Pewarisan memungkinkan sebuah class mewarisi atribut dan method dari class lain, sehingga mengurangi duplikasi kode dan meningkatkan efisiensi.

---

## 4.1 Bagian 1 – Class Dasar Mahasiswa

### Penjelasan
Pada bagian ini dibuat class dasar **Mahasiswa** yang memiliki atribut dasar seperti nama dan NIM.

### Kode Program

```java
class Mahasiswa {
    String nama;
    String nim;

    void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Malikul Mulki";
        mhs.nim = "2024573010079";

        mhs.tampil();
    }
}
```

---

## 4.2 Bagian 2 – Pengembangan Class

### Penjelasan
Pada bagian ini dilakukan pengembangan dari class sebelumnya dengan penambahan atribut atau method.

### Kode Program

```java
class Mahasiswa {
    String nama;
    String nim;

    void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();

        mhs.nama = "Malikul Mulki";
        mhs.nim = "2024573010079";

        mhs.tampil();
    }
}
```

---

## 4.3 Bagian 3 – Pewarisan (Inheritance)

### Penjelasan
Pada bagian ini dibuat class **Kendaraan** sebagai parent class, dan class **Mobil** sebagai child class yang mewarisi atribut dari class Kendaraan.

---

### Class Kendaraan (Parent Class)

```java
class Kendaraan {
    String merk;
    int tahun;

    void displayInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahun);
    }
}
```

---

### Class Mobil (Child Class)

```java
class Mobil extends Kendaraan {
    int jumlahPintu;

    void displayInfoMobil() {
        displayInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
```

---

### Class Main

```java
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();

        mobil1.merk = "Toyota";
        mobil1.tahun = 2012;
        mobil1.jumlahPintu = 4;

        mobil1.displayInfoMobil();
    }
}
```

---

## BAB V
## KESIMPULAN

Dari praktikum lanjutan yang telah dilakukan, dapat disimpulkan bahwa:

1. Pewarisan (inheritance) memungkinkan class turunan menggunakan atribut dan method dari class induk
2. Penggunaan keyword `extends` digunakan untuk membuat hubungan pewarisan
3. Konsep inheritance membantu mengurangi duplikasi kode
4. Struktur program menjadi lebih rapi dan mudah dikembangkan
5. Inheritance merupakan salah satu konsep penting dalam Object Oriented Programming dan dasar dalam penerapan design pattern

---