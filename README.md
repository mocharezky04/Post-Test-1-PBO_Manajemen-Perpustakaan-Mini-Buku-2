# Post Test 2 - PBO
# Manajemen Perpustakaan Mini (Buku)

# Data diri
Nama : Mochammad Rezky Ramadhan 
NIM : 2409116029 Kelas : A 

# Deskripsi singkat
Program ini adalah implementasi **CRUD (Create, Read, Update, Delete)** menggunakan bahasa pemrograman **Java**.  
Tema yang digunakan adalah **Manajemen Perpustakaan Mini (Buku)**, di mana pengguna dapat:
- Menambahkan buku baru  
- Melihat daftar buku  
- Memperbarui data buku  
- Menghapus buku  
- Mencari buku berdasarkan judul atau penulis

Program ini sudah menerapkan:  
- **ArrayList** untuk menyimpan data buku.  
- **Packages** untuk memisahkan fungsi program:  
  - `main` → entry point & menu utama.  
  - `model` → struktur data buku.  
  - `service` → logika CRUD & fitur tambahan.  
- **Minimal 3 class** (`Main`, `Buku`, `PerpustakaanService`).  
- **Constructor** pada class `Buku`.  
- **Access modifier** (`private`, `public`).  
- **Validasi input angka** agar program tidak error saat salah input.  
- **Fitur search** untuk mencari buku berdasarkan judul atau penulis.

Program ini juga sudah menerapkan MVC (Model-View-Controller):
- Model (Model.Buku)
  - Menyimpan struktur data buku (judul, penulis, tahun terbit) serta menyediakan constructor, getter, dan setter.
- Controller (Service.PerpustakaanService)  
  - Menangani logika CRUD (Create, Read, Update, Delete), validasi input, serta fitur pencarian.  
- View (Main.Main)
  - Berperan sebagai entry point program, menampilkan menu ke pengguna, menerima input, dan memanggil method dari PerpustakaanService. 

# Alur program
## 1. Saat dijalankan, program menampilkan menu utama:
      1. Tambah buku
      2. Lihat daftar buku
      3. Update buku
      4. Hapus buku
      5. Cari buku
      6. Keluar
## 2. Penjelasan Menu
1. **Tambah buku**  
   - Input judul, penulis, dan tahun terbit.  
   - Data tersimpan dalam `ArrayList<Buku>`.  

2. **Lihat daftar buku**  
   - Menampilkan semua buku yang sudah tersimpan.  
   - Jika kosong, muncul pesan `"Belum ada buku yang tersimpan."`  

3. **Update buku**  
   - Pilih nomor buku → masukkan data baru (judul, penulis, tahun).  
   - Jika daftar kosong atau nomor tidak valid, muncul pesan error.  

4. **Hapus buku**  
   - Pilih nomor buku yang ingin dihapus.  
   - Jika kosong atau nomor tidak valid, muncul pesan error.  

5. **Cari buku**  
   - Input keyword (judul/penulis).  
   - Program mencari dan menampilkan buku yang sesuai.  
   - Jika tidak ada, muncul pesan `"Buku tidak ditemukan."`  

6. **Keluar**  
   - Program berhenti dengan pesan:  
     ```
     Terima kasih sudah menggunakan sistem perpus ini.
     ```

---

Contoh output:

<img width="559" height="406" alt="{B274D82D-5633-46AF-89F5-341ECE52C9F8}" src="https://github.com/user-attachments/assets/3b467d89-b7c2-4aff-8c74-97c861badd7a" />

## Struktur Package

<img width="497" height="188" alt="{AF913FD6-E72A-4B06-806A-A7A64738B312}" src="https://github.com/user-attachments/assets/d7ef2862-7add-4e95-87f4-40c1c9495af9" />

---

## Contoh Output
### 1. Tambah Buku

<img width="402" height="267" alt="{1BFC276A-35C5-437B-918D-AE0A4ED937D1}" src="https://github.com/user-attachments/assets/3b1a0a64-41cc-4d46-aace-fa2ba1abcd83" />

### 2. Lihat Buku

<img width="538" height="304" alt="{88ABCB08-2C16-4D2B-A2D2-109D8A2A577E}" src="https://github.com/user-attachments/assets/c55ab3aa-08a5-44f3-938d-45f3a37e1bd9" />

### 3. Cari Buku

<img width="566" height="274" alt="{F0A1A709-D156-4A8E-A23D-CAAC4B0A332E}" src="https://github.com/user-attachments/assets/83220a53-cb68-45ee-8e77-fae25d0efaa2" />

### 4. Hapus Buku

<img width="465" height="314" alt="{365389A2-16B7-40DE-89E9-490F865898DA}" src="https://github.com/user-attachments/assets/f561b49f-1974-471c-ac46-1b3ba135713b" />

### 5. Update Buku

<img width="547" height="626" alt="{53E919A4-1330-4C95-9B1E-92E80108B265}" src="https://github.com/user-attachments/assets/008bdc92-25a9-4617-93a8-80197c9d7996" />
