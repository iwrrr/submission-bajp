package com.dicoding.bfaa.submission.utils

import com.dicoding.bfaa.submission.R
import com.dicoding.bfaa.submission.data.Movie
import com.dicoding.bfaa.submission.data.TvShow

object DataDummy {

    fun generateDummyMovies(): List<Movie> {
        val movies = ArrayList<Movie>()

        movies.add(
            Movie(
                id = "m1",
                title = "Alita: Battle Angel",
                releaseDate = "14/02/2019",
                genre = "Aksi, Cerita Fiksi, Petualangan",
                score = "7.2",
                duration = "2h 2m",
                overview = "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                poster = R.drawable.poster_alita,
            )
        )

        movies.add(
            Movie(
                id = "m2",
                title = "Aquaman",
                releaseDate = "21/12/2018",
                genre = "Aksi, Petualangan, Fantasi",
                score = "6.9",
                duration = "2h 23m",
                overview = "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                poster = R.drawable.poster_aquaman,
            )
        )

        movies.add(
            Movie(
                id = "m3",
                title = "How to Train Your Dragon",
                releaseDate = "26/03/2010",
                genre = "Fantasi, Petualangan, Animasi, Keluarga",
                score = "7.8",
                duration = "1h 38m",
                overview = "As the son of a Viking leader on the cusp of manhood, shy Hiccup Horrendous Haddock III faces a rite of passage: he must kill a dragon to prove his warrior mettle. But after downing a feared dragon, he realizes that he no longer wants to destroy it, and instead befriends the beast – which he names Toothless – much to the chagrin of his warrior father",
                poster = R.drawable.poster_how_to_train,
            )
        )

        movies.add(
            Movie(
                id = "m4",
                title = "Avengers: Infinity War",
                releaseDate = "27/04/2018",
                genre = "Petualangan, Aksi, Cerita Fiksi",
                score = "8.3",
                duration = "2h 29m",
                overview = "Karena Avengers dan sekutunya terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh seorang pahlawan, bahaya baru telah muncul dari bayangan kosmik: Thanos. Seorang lalim penghujatan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan yang tak terbayangkan, dan menggunakannya untuk menimbulkan kehendak memutar pada semua realitas. Segala sesuatu yang telah diperjuangkan oleh Avengers telah berkembang hingga saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti.",
                poster = R.drawable.poster_infinity_war,
            )
        )

        movies.add(
            Movie(
                id = "m5",
                title = "Master Z: Ip Man Legacy",
                releaseDate = "26/12/2018",
                genre = "Aksi",
                score = "6.2",
                duration = "1h 47m",
                overview = "Following his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to expats. But it's not long before the mix of foreigners, money, and triad leaders draw him once again to the fight.",
                poster = R.drawable.poster_master_z,
            )
        )

        movies.add(
            Movie(
                id = "m6",
                title = "Mortal Engines",
                releaseDate = "14/12/2018",
                genre = "Petualangan, Cerita Fiksi",
                score = "6.2",
                duration = "2h 9m",
                overview = "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                poster = R.drawable.poster_mortal_engines,
            )
        )

        movies.add(
            Movie(
                id = "m7",
                title = "Overlord",
                releaseDate = "09/11/2018",
                genre = "Kengerian, Kejahatan, Cerita Fiksi",
                score = "6.7",
                duration = "1h 50m",
                overview = "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.",
                poster = R.drawable.poster_overlord,
            )
        )

        movies.add(
            Movie(
                id = "m8",
                title = "Ralph Breaks the Internet",
                releaseDate = "21/11/2018",
                genre = "Keluarga, Animasi, Komedi, Petualangan",
                score = "7.2",
                duration = "1h 52m",
                overview = "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, Sugar Rush. In way over their heads, Ralph and Vanellope rely on the citizens of the internet — the netizens — to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube.",
                poster = R.drawable.poster_ralph,
            )
        )

        movies.add(
            Movie(
                id = "m9",
                title = "Robin Hood",
                releaseDate = "21/11/2018",
                genre = "Petualangan, Aksi, Cerita Seru",
                score = "5.9",
                duration = "1h 56m",
                overview = "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
                poster = R.drawable.poster_robin_hood,
            )
        )

        movies.add(
            Movie(
                id = "m10",
                title = "Spider-Man: Into the Spider-Verse",
                releaseDate = "14/12/2018",
                genre = "Aksi, Petualangan, Animasi, Cerita Fiksi, Komedi",
                score = "8.4",
                duration = "1h 57m",
                overview = "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                poster = R.drawable.poster_spiderman,
            )
        )

        return movies
    }

    fun generateDummyTvShows(): List<TvShow> {
        val tvShows = ArrayList<TvShow>()

        tvShows.add(
            TvShow(
                id = "ts1",
                title = "Doom Patrol",
                releaseDate = "2019",
                genre = "Sci-fi & Fantasy, Drama",
                score = "7.7",
                duration = "49m",
                overview = "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                poster = R.drawable.poster_doom_patrol,
            )
        )

        tvShows.add(
            TvShow(
                id = "ts2",
                title = "Dragon Ball",
                releaseDate = "1986",
                genre = "Animasi, Aksi & Petualangan, Sci-fi & Fantasy",
                score = "8.2",
                duration = "25m",
                overview = "Dahulu kala di pegunungan, seorang master pertempuran yang dikenal sebagai Gohan menemukan seorang bocah aneh yang ia beri nama Goku. Gohan membesarkannya dan melatih Goku dalam seni bela diri sampai dia mati. Bocah muda dan sangat kuat itu sendirian, tetapi mudah dikelola. Kemudian suatu hari, Goku bertemu dengan seorang gadis remaja bernama Bulma, yang pencariannya untuk bola naga membawanya ke rumah Goku. Bersama-sama, mereka berangkat untuk menemukan ketujuh bola naga dalam sebuah petualangan yang akan mengubah hidup Goku selamanya. Lihat bagaimana Goku bertemu teman-teman seumur hidupnya Bulma, Yamcha, Krillin, Master Roshi dan banyak lagi.",
                poster = R.drawable.poster_dragon_ball,
            )
        )

        tvShows.add(
            TvShow(
                id = "ts3",
                title = "Fairy Tail",
                releaseDate = "2009",
                genre = "Aksi & Petualangan, Animasi, Sci-fi & Fantasy, Misteri",
                score = "7.8",
                duration = "25m",
                overview = "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
                poster = R.drawable.poster_fairytail,
            )
        )

        tvShows.add(
            TvShow(
                id = "ts4",
                title = "Family Guy",
                releaseDate = "1999",
                genre = "Animasi, Komedi",
                score = "7.1",
                duration = "22m",
                overview = "Seri animasi animasi Freakin 'Sweet yang sakit, terpelintir, dan salah, menampilkan petualangan keluarga Griffin yang disfungsional. Peter yang kikuk dan Lois yang sudah lama menderita memiliki tiga anak. Stewie (bayi yang brilian tetapi sadis yang bertekad membunuh ibunya dan mengambil alih dunia), Meg (yang tertua, dan merupakan gadis yang paling tidak populer di kota) dan Chris (anak tengah, dia tidak terlalu cerdas tetapi memiliki hasrat untuk film ). Anggota terakhir keluarga itu adalah Brian - anjing yang bisa bicara dan lebih dari sekadar hewan peliharaan, ia menjaga Stewie, sementara menghirup Martinis dan memilah-milah masalah hidupnya sendiri.",
                poster = R.drawable.poster_family_guy,
            )
        )

        tvShows.add(
            TvShow(
                id = "ts5",
                title = "Game of Thrones",
                releaseDate = "2011",
                genre = "Sci-fi & Fantasy, Drama, Aksi & Petualangan",
                score = "8.4",
                duration = "1h",
                overview = "Tujuh keluarga bangsawan berjuang untuk menguasai tanah mitos Westeros. Gesekan antara rumah-rumah mengarah ke perang skala penuh. Semua sementara kejahatan yang sangat kuno terbangun di utara terjauh. Di tengah-tengah perang, perintah militer yang diabaikan, Night's Watch, adalah yang berdiri di antara alam manusia dan kengerian es di luarnya.",
                poster = R.drawable.poster_got,
            )
        )

        tvShows.add(
            TvShow(
                id = "ts6",
                title = "Gotham",
                releaseDate = "2014",
                genre = "Drama, Kejahatan, Sci-fi & Fantasy",
                score = "7.6",
                duration = "43m",
                overview = "Semua orang tahu nama Komisaris Gordon. Dia adalah salah satu musuh terbesar dunia kejahatan, seorang pria yang reputasinya identik dengan hukum dan ketertiban. Tapi apa yang diketahui tentang kisah Gordon dan kenaikannya dari detektif pemula ke Komisaris Polisi? Apa yang diperlukan untuk menavigasi berbagai lapisan korupsi yang diam-diam memerintah Kota Gotham, tempat bertelurnya penjahat paling ikonik di dunia? Dan keadaan apa yang menciptakan mereka - persona yang lebih besar dari kehidupan yang akan menjadi Catwoman, The Penguin, The Riddler, Two-Face dan The Joker?",
                poster = R.drawable.poster_gotham,
            )
        )

        tvShows.add(
            TvShow(
                id = "ts7",
                title = "Naruto Shippuden",
                releaseDate = "2007",
                genre = "Animasi, Aksi & Petualangan, Sci-fi & Fantasy",
                score = "8.6",
                duration = "25m",
                overview = "Naruto Shippuuden adalah kelanjutan dari serial TV animasi asli Naruto. Kisah ini berkisah tentang Uzumaki Naruto yang lebih tua dan sedikit lebih matang dan upayanya untuk menyelamatkan temannya Uchiha Sasuke dari cengkeraman Shinobi seperti ular, Orochimaru. Setelah 2 setengah tahun, Naruto akhirnya kembali ke desanya Konoha, dan mulai mewujudkan ambisinya, meskipun itu tidak akan mudah, karena Ia telah mengumpulkan beberapa musuh (lebih berbahaya), seperti organisasi shinobi. ; Akatsuki.",
                poster = R.drawable.poster_naruto_shipudden,
            )
        )

        tvShows.add(
            TvShow(
                id = "ts8",
                title = "The Arrow",
                releaseDate = "2012",
                genre = "Kejahatan, Drama, Misteri, Aksi & Petualangan",
                score = "6.7",
                duration = "42m",
                overview = "Panah adalah menceritakan kembali petualangan dari legendaris DC pahlawan Green Arrow.",
                poster = R.drawable.poster_arrow,
            )
        )

        tvShows.add(
            TvShow(
                id = "ts9",
                title = "The Flash",
                releaseDate = "2014",
                genre = "Drama, Sci-fi & Fantasy",
                score = "7.8",
                duration = "22m",
                overview = "Setelah akselerator partikel menyebabkan badai aneh, Penyelidik CSI Barry Allen disambar petir dan jatuh koma. Beberapa bulan kemudian dia terbangun dengan kekuatan kecepatan super, memberinya kemampuan untuk bergerak melalui Central City seperti malaikat penjaga yang tak terlihat. Meskipun awalnya senang dengan kekuatan barunya, Barry terkejut menemukan bahwa dia bukan satu-satunya \"manusia meta\" yang diciptakan setelah ledakan akselerator - dan tidak semua orang menggunakan kekuatan baru mereka untuk kebaikan. Barry bermitra dengan S.T.A.R. Lab dan mendedikasikan hidupnya untuk melindungi yang tidak bersalah. Untuk saat ini, hanya beberapa teman dekat dan rekan yang tahu bahwa Barry secara harfiah adalah manusia tercepat, tetapi tidak lama sebelum dunia mengetahui apa yang menjadi Barry Allen ... The Flash.",
                poster = R.drawable.poster_flash,
            )
        )

        tvShows.add(
            TvShow(
                id = "ts10",
                title = "The Simpsons",
                releaseDate = "1989",
                genre = "Keluarga, Animasi, Komedi",
                score = "7.9",
                duration = "22m",
                overview = "Bertempat di Springfield, kota rata-rata di Amerika, pertunjukan ini berfokus pada kejenakaan dan petualangan sehari-hari keluarga Simpson; Homer, Marge, Bart, Lisa dan Maggie, serta ribuan pemain virtual. Sejak awal, serial ini telah menjadi ikon budaya pop, menarik ratusan selebriti menjadi bintang tamu. Acara ini juga menjadi terkenal karena satirnya yang tak kenal takut terhadap kehidupan politik, media, dan Amerika secara umum.",
                poster = R.drawable.poster_the_simpson,
            )
        )

        return tvShows
    }
}