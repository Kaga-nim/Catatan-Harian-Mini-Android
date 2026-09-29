# 📝 Catatan Harian Mini

Aplikasi Android sederhana **Catatan Harian Mini** yang dibangun menggunakan **Jetpack Compose** dan **Material Design 3**.

> [!IMPORTANT]
> Proyek ini dibuat untuk **coba-coba / latihan praktikum pada Pertemuan 6** dalam mata kuliah **Mobile Programming**.

---

## 📱 Tentang Aplikasi

Aplikasi ini merupakan bentuk latihan dasar pengembangan aplikasi Android modern berbasis Deklaratif UI (Jetpack Compose). Pengguna dapat memasukkan nama dan pesan harian, lalu menekan tombol **Simpan** untuk menampilkan hasil catatan di layar.

### Fitur Utama:
- 🖼️ Tampilan Logo / Gambar Aplikasi.
- ✍️ Form Input Nama dan Pesan Harian (`OutlinedTextField`).
- 🔘 Tombol "Simpan" untuk memproses dan menampilkan pesan.
- ⚡ Pengelolaan *State* responsif menggunakan `remember` dan `mutableStateOf`.

---

## 🚀 Mencoba Aplikasi (File APK Sudah Tersedia)

Bagi pengguna atau rekan yang ingin langsung mencoba aplikasi ini di perangkat Android/emulator tanpa harus melakukan *build* dari source code, file `.apk` **sudah tersedia** di dalam repository ini:

📌 **Lokasi File APK:**
```
app/build/outputs/apk/debug/app-debug.apk
```

### Cara Install File APK:
1. Unduh atau salin file `app-debug.apk` ke HP Android Anda.
2. Buka file APK tersebut dan izinkan *Installation from Unknown Sources* jika diminta.
3. Jalankan aplikasi **Catatan Harian Mini**.

---

## 🛠️ Teknologi & Spesifikasi

- **Bahasa Pemrograman:** Kotlin
- **UI Framework:** Jetpack Compose
- **Design System:** Material Design 3
- **Minimum SDK:** API 24 (Android 7.0 Nougat)
- **Target SDK:** API 36

---

## 💻 Cara Menjalankan dari Android Studio

1. *Clone* atau unduh repository proyek ini.
2. Buka folder proyek di **Android Studio**.
3. Pastikan Gradle Synchronization selesai dengan sukses.
4. Hubungkan perangkat Android (fisik atau emulator).
5. Klik **Run 'app'** (`Shift + F10`) di Android Studio.

---

*Dibuat untuk kebutuhan tugas/latihan Pertemuan 6 - Mata Kuliah Mobile Programming.*
