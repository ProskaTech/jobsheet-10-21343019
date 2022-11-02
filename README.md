## Created_by_21343019_Arafil Azmi

Pada JS 10 ini kita mempelajari tentang class, object, property, method, constructor dan visibility. Secara singkat sebagai berikut :
  1. Class = Merupakan blueprint atau cetakan untuk menciptakan suatu instant dari object.
  2. Object = Hasil cetak dari class, atau turunan dari class, atau hasil konkrit dari class. 
  3. Property = Property bisa disebut juga sebagai atribut yang merupakan data yang terdapat pada sebuah class.
  4. Method = Tindakan yang bisa dilakukan di dalam class atau pada suatu objek.
  5. Constructor = Merupakan method khusus yang digunakan untuk menginisialisasi objek dan tiap class boleh memiliki lebih dari satu constructor.
  6. Visibility = Sebuah aturan tentang siapa yang dapat mengakses suatu data / atribut serta fungsi / method yang dibuat. Tindakan ini juga bisa disebut sebagai 
                  modifiers yang dimana secara umum dapat dibagi menjadi 3 yaitu public, private dan protected yang masing - masing mempunyai ketentuan - ketentuan
                  dalam mengaksesnya.
                  
  
  Berikut penjelasan dari program latihan :
  
    1. Pada program latihan 1 kita diminta membuat class dengan nama Mobil dan atributnya yaitu merk, warna dan tahun produksi. Pada class Mobil access modifiernya
       yaitu public yang artinya atribut dan method serta class tersebut dapat diakses dari mana saja. Pada class Mobil kita memberikan atribut merk dan warna bertipe 
       string dan untuk tahun produksi bertipe integer. Serta terdapat method maju dan mundur, method maju dan mundur memiliki variabel yang sama yaitu kec (kecepatan) 
       tetapi nilai atau isi pada variabel tersebut yang berbeda serta perintah cetak yang dimana ketika mobil maju maka mobil maju sejauh (sesuai isi dari variabel 
       kec pada method maju) meter sedangkan ketika mobil mobil mundur maka mobil mundur sejauh (sesuai isi dari variabel kec pada method mundur) meter
       
       Kemudian kita diminta menambahkan class utama dengan nama MobilUtama. Pada class ini kita membuat sebuah objek dengan nama honda pada class Mobil untuk dapat 
       mengakses atribut dan method pada class Mobil. Dalam program kita mengisikan nilai dari masing - masing atribut pada class Mobil dengan menggunakan objek honda 
       kemudian mencetaknya serta memanggil isi dari method - method pada class Mobil.
      
    2. Pada progam latihan 2 kita membuat class dengan nama Manusia dan terdapat beberapa atribut yaitu nama, tempat_lahir, tgl_lahir dengan tipe string dan 
       berat_badan, tinggi_badan bertipe integer. Terdapat method Inputdata yang dimana dalam method tersebut tempat penginputan atau mengisikan nilai dari masing - 
       masing atribut dan disimpan menggunakan class scanner.Kemudian terdapat method Identitas yang dimana isi dari method ini adalah mencetak nilai yang telah 
       diinputkan pada method Inputdata. Kemudian pada method main kita membuat objek turunan dari class Manusia yaitu Object A dan kita memanggil method - method pada 
       class Manusia tadi dengan menggunakan objek atau turunan dari class Manusia dan program ini merupakan contoh dimana object boleh terdapat di class yang sama
       dengan class utama.
       
    3. Pada program latihan 3 kita membuat class dengan nama Mahasiswa yang dimana pada class tersebut hanya terdapat atribut nama, jur, univ dengan tipe string dan
       nim dengan tipe integer tetapi karena access modifiernya public maka atribut tersebut dapat diakses dari mana saja. Kemudian kita membuat class utama dengan 
       nama InformatikaUNP dan didalam class tersebut kita membuat 2 objek yaitu Informatika dan Elektronika dari atau menggunakan class Mahasiswa.
       
       Kemudian kita mengkases atribut pada class Mahasiswa dengan menggunakan masing - masing objek serta mengisikan nilai pada atribut tersebut. Setelah itu kita
       mencetak Data mahasiswa dari masing - masing objek yaitu data mahasiswa informatika dan data mahasiswa elektronika yang dimana atribut yang diambil juga 
       menggunakan objek class Mahasiswa sesuai dengan data yang ingin ditampilkan dan diinputkan tadi.
       
    4. Pada program latihan 4 kita membuat class dengan nama Aktor terdapat 2 atribut yaitu nama bertipe string dan umur bertipe integer. Lalu kita membuat constructor 
       dengan nama Aktor yang dimana constructor ini ciri - cirinya adalah memiliki nama yang sama dengan class. Pada constructor kita membuat parameter String n dan 
       int u yang dimana dalam constructor tersebut nama = n dan umur = u.
       
       Kemudian terdapat method tampilAktor dengan isi atau pernyataannya yaitu mencetak isi dari atribut nama dan umur. Kemudian dalam method main kita membuat objek
       untuk class Aktor dengan nama a dan karena sudah terdapat constructor maka kita bisa mengisikan nilai atribut di dalam objek tersebut pada parameternya dan 
       sesuai dengan ketentuan pada parameter constructor Aktor kemudian memanggil method tampilAktor untuk mencetak isi dari atribut tersebut.
       
  Berikut penjelasan dari program Tugas :     
       
    1. Pada program tugas 1 kita diminta membuat class dengan nama Android dan dimasukan pada package smartphone dan untuk dapat mengaksess method tersebut kita 
       menggunakan access modifier yaitu public yang dimana method tersebut dapat diakses dari mana saja. Pada class tersebut terdapat 4 method yaitu 
       nyala(), panggilan(), sms() dan shutdown() dan isikan method - method tersebut disikan dengan pernyataan mencetak antara lain :
       
       nyala() = Android menyala
       panggilan() = Kring Kring Kring, ada panggilan masuk
       sms() = Tenenoeeett, ada SMS baru
       shutdown() = Android dimatikan
       
       Kemudian kita membuat class utama dengan nama AndroMain dan memanggil method - method tersebut dengan cara membuat objek atau turunan dari class Android, pada 
       program saya membuat objek dengan nama a. Kemudian silahkan panggil method - method tersebut menggunakan objek atau turunan dari class Android sesuai dengan 
       output yang diminta.
      
    2. Pada program tugas 2 kita diminta membuat program dengan menerapkan class dan object dengan ketentuan yang diminta serta memiliki aturan yang telah ditetapkan 
       pada soal. Pada program saya membuat class dengan nama NilaiMahasiswa dan terdapat atribut nama_mhs, smt dengan tipe string, nim dengan tipe int dan ip dengan 
       tipe float. Kemudian pada program saya membuat method dengan nama Inputdatanilai yang dimana isi dari method ini adalah tempat penginputan dari masing - masing 
       atribut dan disimpan menggunakan class scanner.
       
       Kemudian saya membuat method dengan nama infonilai yang dimana isi atau pernyataan dari method ini adalah mencetak isi atau nilai dari masing - masing atribut
       yang sudah di isikan tadi dan pada soal diminta jika nilai ip sekian maka terdapat sebuah keterangan, pada method ini saya membuat aturan tersebut dengan 
       menggunakan perintah if yang diambil dari atribut IP dan memiliki beberapa kondisi dimana jika IP nilainya sekian maka keterangannya sesuai dengan yang diminta.
       
       Kemudian saya membuat method main dan dalam method main saya membuat objek atau turunan dari class NilaiMahasiswa dengan nama A dan melakukan pemanggilan dari 
       method - method pada class NilaiMahasiswa dengan menggunakan objek tersebut. Maka isi atau pernyataan dari masing - masing tersebut akan tampil setelah program 
       dijalankan.
       
       
       
