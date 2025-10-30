# PBOPertemuan11
Dalam pengembangan aplikasi modern, kebutuhan untuk menyimpan dan mengelola data menjadi hal yang sangat penting. Data tidak hanya digunakan selama program berjalan, tetapi juga harus dapat disimpan secara permanen agar dapat diakses kembali ketika aplikasi dijalankan ulang. Proses penyimpanan data secara permanen inilah yang disebut persistence.

Di dalam bahasa pemrograman Java, pengelolaan data yang terhubung ke database dapat dilakukan menggunakan JPA (Java Persistence API). Dengan JPA, pengembang tidak perlu menulis banyak perintah SQL secara manual, melainkan cukup menggunakan konsep ORM (Object Relational Mapping) yang secara otomatis menghubungkan antara objek di Java dengan tabel di database.

Melalui praktikum ini, mahasiswa diharapkan memahami bagaimana cara kerja persistence pada Java, cara menghubungkannya dengan database MySQL, serta bagaimana memanfaatkan Entity dan Persistence Unit untuk melakukan proses penyimpanan data.

1.	Pengertian Persistence
Persistence adalah kemampuan suatu program untuk menyimpan data secara permanen ke dalam media penyimpanan seperti database, file, atau sistem eksternal lainnya. Dalam konteks Java, persistence memungkinkan objek Java untuk tetap tersimpan meskipun program sudah berhenti dijalankan.
program.
2.	Java Persistence (JPA)
JPA merupakan spesifikasi dari Java yang menyediakan standar untuk Object Relational Mapping (ORM), yaitu proses memetakan objek Java ke tabel dalam database relasional. JPA memudahkan pengembang dalam mengelola data tanpa harus menulis banyak kode SQL.
3.	Komponen Utama dalam JPA
a.	Entity
Kelas Java yang mewakili tabel dalam database. Setiap atribut dalam kelas ini merepresentasikan kolom tabel.
b.	Persistence Unit
Merupakan konfigurasi utama JPA yang berisi informasi tentang nama database, driver, user, password, dan nama provider. File konfigurasi ini terdapat di folder META-INF/persistence.xml.

# Langkah - Langkah Project 
1.	Buka project yang ingin dibuat persistence
2.	Kemudian klik kanan pada package – new – entity classes from database 
 <img width="753" height="344" alt="image" src="https://github.com/user-attachments/assets/8b5a95ac-9678-44e4-b9c0-a7a2c9709c3c" />

3.	Pada bagian data source pilih conection database yang terhubung ke table database postgre jika masih belum ada maka pilih new database conection
 <img width="834" height="601" alt="image" src="https://github.com/user-attachments/assets/42455f25-6979-4728-943b-4e8f31b35313" />

4.	Pindahkan table yang diperlukan, dari available tables ke selected tables dengan cara klik add>, jika sudah klik next
 <img width="856" height="614" alt="image" src="https://github.com/user-attachments/assets/64dbce72-c9b5-49c0-8cd4-a223ea085e27" />

5.	Klik next
 <img width="870" height="581" alt="image" src="https://github.com/user-attachments/assets/2176b831-752d-4cbc-8a00-863fe33cecdc" />

6.	Klik finish 
 <img width="859" height="576" alt="image" src="https://github.com/user-attachments/assets/2f768302-2a76-47f1-a6ec-d1fdf504b477" />

7.	Jika sudah maka pada project akan secara otomatis muncul pacakage META-INF dan class java baru (Dataminuman_1.java)
 <img width="544" height="471" alt="image" src="https://github.com/user-attachments/assets/873b3330-0f46-41a5-bd11-2703d6afef5b" />

8.	Kemudian masuk ke design jform dan tambahkan source code berikut pada setiap button 
Button Insert :
 <img width="871" height="547" alt="image" src="https://github.com/user-attachments/assets/4d45f73c-7933-4099-99a1-b9ac9506a4ed" />  
 <img width="753" height="191" alt="image" src="https://github.com/user-attachments/assets/54a4ea84-5caa-49c3-88d5-68c53d87c461" />

Button Update :
 <img width="766" height="516" alt="image" src="https://github.com/user-attachments/assets/20191765-fab7-4734-81ad-5d259229050f" />  
 <img width="670" height="75" alt="image" src="https://github.com/user-attachments/assets/ed477a19-5133-42e6-8001-3a68d0df4a82" />

Button Delete :
 <img width="855" height="598" alt="image" src="https://github.com/user-attachments/assets/50d0e300-8395-43fc-b850-a9fae2200420" />

Button Upload :
 <img width="856" height="544" alt="image" src="https://github.com/user-attachments/assets/d572fb78-f302-43bd-a801-171736dda663" />  
 <img width="844" height="564" alt="image" src="https://github.com/user-attachments/assets/a0f9e959-174c-4591-8b45-71f5286d3cf5" />  
 <img width="927" height="119" alt="image" src="https://github.com/user-attachments/assets/a3d6b873-4ef3-4e92-9d77-5a52db8a925b" />

tampilData() untuk menampilkan data ke table :
 <img width="906" height="510" alt="image" src="https://github.com/user-attachments/assets/b7ef2135-4148-4f85-bbf7-0955f4bc9cc4" />  
 <img width="884" height="109" alt="image" src="https://github.com/user-attachments/assets/48f21898-2ac8-4320-a5d3-570e9bbbdc79" />

9.	Kemudian run program dan coba masing masing button yang tadi telah di buat
 <img width="803" height="608" alt="image" src="https://github.com/user-attachments/assets/6d24fdb0-6cc9-4ffc-a6f7-1e72968e799d" />

 
