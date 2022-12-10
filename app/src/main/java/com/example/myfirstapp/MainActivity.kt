package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val univList = listOf<Univ>(
            Univ(
                name = "Universitas Gadjah Mada (UGM)",
                detail =
                        "Universitas Gadjah Mada lahir dari kancah perjuangan revolusi kemerdekaan bangsa Indonesia. Didirikan pada periode awal kemerdekaan, UGM didaulat sebagai Balai Nasional Ilmu Pengetahuan dan Kebudayaan bagi penyelenggaraan pendidikan tinggi nasional.\n\n" +
                        "Nama Gadjah Mada juga memiliki makna tersendiri, mengandung semangat serta teladan Mahapatih Gadjah Mada yang berhasil mempersatukan nusantara. Teladan ini diterjemahkan ke dalam rumusan jati diri UGM sebagai universitas nasional, universitas perjuangan, universitas Pancasila, universitas kerakyatan dan universitas pusat kebudayaan.\n\n" +
                        "Pada awal pendiriannya, UGM memiliki 6 fakultas, yaitu Fakultas Kedokteran, Fakultas Hukum, Fakultas Teknik, Fakultas Sastra dan Filsafat, Fakultas Pertanian, Fakultas Kedokteran Hewan. Kegiatan perkuliahan masa itu dilakukan di Sitinggil dan Pagelaran, dengan memanfaatkan ruangan-ruangan kamar dan fasilitas di lingkungan Kraton Yogyakarta.\n\n" +
                        "Baru pada tahun 1951 pembangunan fisik kampus bulaksumur dimulai, dan memasuki decade 1960-an UGM sudah memiliki berbagai fasilitas seperti rumah sakit, pemancar radio, serta sarana lain yang mendukung proses pembelajaran bagi mahasiswa juga untuk melayani kepentingan masyarakat. Kini, UGM memiliki 18 Fakultas, satu Sekolah Pascasarjana, serta satu Sekolah Vokasi dengan puluhan program studi.",
                R.drawable.logo_ugm
            ),
            Univ(
                name = "Institut Teknologi Bandung (ITB)",
                detail =
                        "Sejarah Pendidikan Tinggi Teknik di Indonesia berawal pada abad ke-20, ketika pemerintah kolonial Belanda mendirikan de Techniche Hoogeschool te Bandung (TH) pada 3 Juli 1920 di lahan seluas 30 hektar di Bandung. Saat itu hanya terdapat satu fakultas yaitu de Faculteit van Technische Wetenschap dan hanya satu jurusan yaitu de afdeeling der We gen Waterbouw. Pendirian perguruan tinggi ini dimaksudkan untuk memenuhi kebutuhan tenaga teknik yang semakin terbatas pada masa kolonial Belanda akibat pecahnya Perang Dunia pertama\n\n" +
                        "Pada 3 Juli 2020, ITB secara de facto berusia 100 tahun di mana telah menghasilkan lebih dari 120.000 alumni yang berperan penting dalam pembangunan bangsa, memiliki 12 fakultas/sekolah, 128 program studi, dan 111 Kelompok Keahlian, memiliki 25 Pusat, 7 Pusat Penelitian, dan 6 Pusat Unggulan Iptek (PUI), memiliki lebih dari 26 ribu mahasiswa program sarjana, master, dan doktor, memiliki 1.510 dosen dengan 195 Guru Besar, dan berlokasi di dua tempat lain selain kampus Ganesa Bandung yaitu Jatinangor dan Cirebon. ITB juga menjadi perguruan tinggi terbaik nasional dan pelopor kemajuan sains, teknologi, dan seni di Indonesia.",
                R.drawable.logo_itb
            ),
            Univ(
                name = "Universitas Indonesia (UI)",
                detail =
                        "Sebelum kampus Universitas Indonesia di Depok dibangun pada 1987, Universitas Indonesia memiliki tiga lokasi kampus yaitu di Salemba, Pegangsaan Timur dan Rawamangun. Setelah kampus baru didirikan di lahan seluas 320 hektare di Depok, kampus Rawamangun yang mencakup beberapa fakultas dipindah, sementara kampus Salemba masih dipertahankan untuk Fakultas Kedokteran, Fakultas Kedokteran Gigi dan Program Pascasarjana.\n\n" +
                        "Saat ini UI terdiri dari 14 Fakultas, 1 Program Vokasi, dan 2 Sekolah (SKSG dan SIL). 14 Fakultas tersebut adalah Fakultas Kedokteran, Kedokteran Gigi, Fakultas Ilmu Keperawatan, Fakulta Farmasi, Fakultas Matematika dan Ilmu Pengetahuan Alam, Fakultas Teknik, Fakultas Psikologi, Fakultas Ilmu Sosial dan Ilmu Politik, Fakultas Hukum, Fakultas Ekonomi dan Bisnis, Fakultas Ilmu Administrasi, Fakultas Kesehatan Masyarakat, Fakultas Ilmu Pengetahuan Budaya, dan Fakultas Ilmu Komputer.",
                R.drawable.logo_ui
            ),
            Univ(
                name = "Universitas Airlangga (UNAIR)",
                detail =
                        "Universitas Airlangga diresmikan pada 1 November 1954. Fakultas Kedokteran dan Lembaga Ilmu Kedokteran Gigi di Surabaya dipisahkan dari “induknya” yaitu Universitas Indonesia.\n\n" +
                        "Pada 10 November 1954, Presiden RI DR. Ir. Soekarno meresmikan berdirinya Universitas Airlangga sebagai Perguruan Tinggi Negeri (PTN) ketiga di Indonesia setelah Universitas Indonesia dan Universitas Gadjah Mada. Terdiri atas lima Fakultas :\n" +
                        "1. Fakultas Kedokteran\n" +
                        "2. Fakultas Kedokteran Gigi\n" +
                        "3. Fakultas Hukum\n" +
                        "4. Fakultas Keguruan dan Ilmu Pendidikan\n" +
                        "5. Fakultas Sastra \n",
                R.drawable.logo_unair
            ),
            Univ(
                name = "Institut Pertanian Bogor (IPB)",
                detail =
                        "Sebelum diresmikan pada tahun 1963, IPB adalah sebuah fakultas pertanian pada Universitas Indonesia. Pada tanggal 1 September 1963. Presiden Pertama Indonesia, Ir. Soekarno, melakukan peletakkan batu pertama pembangunan kampus sekaligus menandai peresmian Institut Pertanian Bogor sebagai sebuah perguruan tinggi mandiri.\n\n" +
                        "IPB University merupakan institusi pendidikan tinggi yang menghasilkan inovasi dengan kualitas yang diakui secara nasional dan internasional. Selama sepuluh tahun berturut-turut (2008-2018), IPB memiliki inovasi paling banyak dibandingkan dengan universitas lain di Indonesia berdasarkan penilaian dari Business Innovation Center – Kementerian Riset, Teknologi, dan Pendidikan Tinggi Indonesia dalam Inovasi Paling Prospektif di Indonesia (39,71% ).",
                R.drawable.logo_ipb
            ),
            Univ(
                name = "Institut Teknologi Sepuluh Nopember (ITS)",
                detail =
                        "Sejarah didirikannya Institut Teknologi Sepuluh Nopember berawal dari pengusulan pendirian Yayasan Perguruan Tinggi Teknik (YPTT) di Surabaya oleh dr. Angka pada Lustrum I PII Jawa Timur 10 November 1957. Pada tahun 1960, namanya berubah menjadi Institut Teknologi Sepuluh Nopember (ITS), dan satu tahun kemudian, resmi menjadi Perguruan Tinggi. Perubahan status ini juga disertai penambahan menjadi lima fakultas, yaitu Teknik Sipil, Teknik Mesin, Teknik Kimia, Teknik Elektro, dan Teknik Perkapalan.\n\n" +
                        "Di tahun 2002, ITS terdiri dari lima fakultas dan dua politeknik. Pada 2014, ITS ditetapkan sebagai Perguruan Tinggi Negeri Berbadan Hukum (PTNBH) berdasar Peraturan Pemerintah No. 83 Tahun 2014. ITS mengemban amanah baru yaitu mampu melakukan pengelolaan secara otonom di bidang akademik, norma dan kebijaksanaan operasional serta pelaksanaan organisasi, keuangan, kemahasiswaan, ketenagaan, serta sarana prasarana. Berdasarkan peraturan Rektor ITS No, 25 Tahun 2019 Tentang Organisasi dan Tata Kerja Fakultas di Lingkungan ITS, ITS saat ini memiliki 7 fakultas, 39 departemen, dan 82 program studi.",
                R.drawable.logo_its
            ),
            Univ(
                name = "Universitas Padjajaran (UNPAD)",
                detail =
                        "Universitas Padjadjaran atau dikenal dengan singkatan Unpad merupakan salah satu perguruan tinggi negeri yang ada di Indonesia. Unpad berdiri pada 11 September 1957, dengan lokasi kampus di Bandung. Saat ini, Unpad berstatus sebagai Perguruan Tinggi Negeri Badan Hukum. Peraturan Pemerintah Nomor 80 Tahun 2014 tentang Penetapan Unpad sebagai Perguruan Tinggi Negeri Badan Hukum ditandatangani Presiden RI, Susilo Bambang Yudhoyono, pada 17 Oktober 2014. Setelah itu, Peraturan Pemerintah Nomor 51 Tahun 2015 tentang Statuta Universitas Padjadjaran ditandatangani Presiden RI, Joko Widodo, pada 22 Juli 2015.\n\n" +
                        "Adapun nama “Padjadjaran” diambil dari nama Kerajaan Sunda, yaitu Kerajaan Padjadjaran yang dipimpin oleh Prabu Siliwangi atau Prabu Dewantaprana Sri Baduga Maharaja di Pakuan Padjadjaran (1473-1513 M). Nama ini adalah nama yang paling terkenal dan dikenang oleh rakyat Jawa Barat, karena kemashuran sosoknya di antara raja-raja yang ada di tatar Sunda ketika itu.\n\n" + "Pada saat berdirinya, Unpad terdiri dari 4 fakultas: Fakultas Hukum dan Pengetahuan Masyarakat, Fakultas Ekonomi (keduanya berawal dari Yayasan Universitas Merdeka di Bandung), Fakultas Keguruan & Ilmu Pendidikan (FKIP, penjelmaan dari PTPG di Bandung), dan Fakultas Kedokteran.\n\n" +
                        "Pada 18 September 1960, dibuka Fakultas Pendidikan Jasmani (FPJ) sebagai perubahan dari Akademi Pendidikan Jasmani. Pada tahun 1963-1964, FPJ dan FKIP melepaskan diri dari Unpad dan masing-masing menjadi Sekolah Tinggi Olah Raga dan Institut Keguruan & Ilmu Pendidikan (IKIP, sekarang Universitas Pendidikan Indonesia).\n\n" +
                        "Dalam kurun waktu 6 tahun, di lingkungan Unpad bertambah 8 fakultas yakni: Fakultas Sosial Politik (13 Oktober 1958, sekarang FISIP), Fakultas Matematika & Ilmu Pengetahuan Alam (FMIPA, 1 November 1958), Fakultas Sastra (1 November 1958, kini menjadi Fakultas Ilmu Budaya), Fakultas Pertanian (Faperta, 1 September 1959), Fakultas Kedokteran Gigi (FKG, 1 September 1959), Fakultas Publisistik (18 September 1960, sekarang menjadi Fikom), Fakultas Psikologi (FPsi, 1 September 1961), dan Fakultas Peternakan (Fapet, 27 Juli 1963).\n\n" +
                        "Tahun 2005, Unpad membuka 3 fakultas baru Fakultas Ilmu Keperawatan (FIK, 8 Juni 2005), Fakultas Perikanan & Ilmu Kelautan (FPIK, 7 Juli 2005), dan Fakultas Teknologi Industri Pertanian (FTIP, 13 September 2005).\n\n" +
                        "Selama 2 tahun kemudian, Unpad meningkatkan status 2 jurusan di FMIPA, yaitu Jurusan Farmasi menjadi Fakultas Farmasi (17 Oktober 2006), serta Jurusan Geologi menjadi Fakultas Teknik Geologi (FTG, 12 Desember 2007).\n\n" +
                        "Dalam rangka meningkatkan performa universitas, pada 7 September 1982, Unpad membuka Fakultas Pascasarjana. Fakultas ini menyelenggarakan pendidikan jenjang S-2 (Program Magister) dan S-3 (program Doktor). Pada perkembangan selanjutnya, Fakultas Pascasarjana statusnya berubah menjadi Program Pascasarjana. Sebagai upaya memenuhi tenaga-tenaga terampil ahli madya, maka Unpad juga menyelenggarakan pendidikan Program Diploma (S-0) untuk beberapa bidang ilmu.",
                R.drawable.logo_unpad
            ),
            Univ(
                name = "Universitas Diponegoro (UNDIP)",
                detail =
                        "Sekitar awal tahun 1950-an masyarakat Jawa Tengah pada umumnya dan masyarakat Semarang khususnya, membutuhkan kehadiran sebuah universitas sebagai pelaksana pendidikan dan pengajaran tinggi. Tujuannya untuk membantu pemerintah dalam menangani dan melaksanakan pembangunan di segala bidang khususnya bidang pendidikan. Pada waktu itu di Provinsi Jawa Tengah dan Yogyakarta hanya memiliki Universitas Gadjah Mada yang berstatus sebagai universitas negeri.\n\n" +
                        "Sementara jumlah lulusan sekolah menengah atas di Jawa Tengah bagian utara yang akan melanjutkan pendidikan tinggi di universitas makin meningkat, namun karena masih sangat terbatasnya universitas yang ada, maka tidak semua lulusan dapat tertampung. Menyadari akan kebutuhan pendidikan tinggi yang semakin mendesak, kemudian dibentuk Yayasan Universitas Semarang dengan Akte Notaris R.M. Soeprapto No. 59 tanggal 4 Desember 1956 sebagai langkah awal didirikannya universitas di Semarang dengan nama Universitas Semarang yang secara resmi dibuka pada tanggal 9 Januari 1957, dengan Presiden Universitas yang pertama adalah Mr. Imam Bardjo.\n\n" +
                        "Tahun 1957 ditetapkan sebagai tahun berdirinya Undip, dengan memperhatikan realitas sejarah bahwa Universitas Semarang sebagai universitas swasta – yang berdiri tahun 1957 merupakan embrio Universitas Diponegoro. Penetapan Dies Natalis Undip tanggal 15 Oktober 1957 telah dinyatakan dalam laporan Rektor pada Dies Natalis Undip yang ke 13.",
                R.drawable.logo_undip
            ),
            Univ(
                name = "Universitas Brawijaya (UB)",
                detail =
                        "Universitas Brawijaya berkedudukan di Kota Malang, Jawa Timur, didirikan pada tanggal 5 Januari 1963 dengan Surat Keputusan Menteri Perguruan Tinggi dan Ilmu Pengetahuan (PTIP) Nomor 1 Tahun 1963, dan kemudian dikukuhkan dengan Keputusan Presiden Republik Indonesia Nomor 196 Tahun 1963 tertanggal 23 September 1963.\n\n" +
                        "Atas dasar penggabungan ini Universitas Brawijaya memiliki 4 fakultas, yakni Fakultas Hukum dan Pengetahuan Masyarakat (FHPM) yang semula PTHPM, Fakultas Ekonomi (FE) yang semula bernama PTEM, Fakultas Administrasi Niaga (FAN) dan Fakultas Pertanian (FP). Penggabungan tersebut adalah salah satu usaha yang harus ditempuh untuk memperoleh status negeri bagi Universitas Brawijaya, karena sebelum itu walaupun diakui sebagai milik Kotapraja Malang, semua pembiayaan universitas masih menjadi tanggung jawab yayasan. Guna memenuhi syarat penegerian, maka pada tanggal26 Oktober 1961 Universitas Brawijaya mendirikan sebuah fakultas baru yakni Fakultas Kedokteran Hewan dan Peternakan (FKHP).",
                R.drawable.logo_ub
            ),
            Univ(
                name = "Universitas Bina Nusantara (BINUS)",
                detail =
                        "Universitas Bina Nusantara, atau juga dikenal dengan Binus University, merupakan salah satu universitas swasta yang berlokasi di Jakarta, Indonesia. Berawal dari sebuah institusi pelatihan komputer Modern Computer Course pada 21 Oktober 1974, dan berkembang dan akhirnya berubah menjadi Universitas pada 8 Agustus 1996, Universitas Bina Nusantara.\n" +
                        "\n" +
                        "Program kuliah, Fakultas dan program studi Universitas Bina Nusantara – Binus University: fakultas Ekonomi dan Komunikasi: Akuntansi, Keuangan, Manajemen Hotel (D4) serta Komunikasi Pemasaran. Fakultas Teknik: Teknik Industri, Arsitektur, Teknik Sipil serta Teknik Komputer. Sekolah Desain: Desain Komunikasi Visual Media Baru, Desain Interior, Desain Komunikasi Visual Animasi dan Desain Komunikasi Visual Periklanan Kreatif. Sekolah Ilmu Komputer: Teknik Informatika, Teknologi dan Aplikasi Bergerak (Mobile Application and Technology) serta Teknologi dan Aplikasi Permainan (Game Application and Technology).\n" +
                        "\n" +
                        "Sekolah Bisnis dan Manajemen: Manajemen, Bisnis & Manajemen Internasional serta Pemasaran Internasional. Sekolah Sistem Informasi: Sistem Informasi Audit, Sistem Informasi dan Komputerisasi Akuntansi. Fakultas Humaniora: Sastra Inggris, Sastra Jepang, Hukum Bisnis, Hubungan Internasional, Psikologi serta Sastra Cina.\n" +
                        "\n" +
                        "Program kuliah ganda Binus University: Manajemen dan Teknik Industri, Manajemen dan Sistem Informasi, Teknik Informatika dan Matematika, Teknik Informatika dan Statistika serta Akuntansi dan Sistem Informasi.",
                R.drawable.logo_binus
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_univ)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ListUnivAdapter(this, univList){
            val intent = Intent (this, DetailUnivActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.about_me -> {
                val moveIntent = Intent(this, AboutMeActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}