package triepackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        //Aceh
        trie.insert("11000001", "Rahmatullah Pratama", "Banda Aceh", "1990-01-10");
        trie.insert("11000002", "Siti Nurlela", "Sabang", "1985-05-05");
        trie.insert("11000003", "Budi Santoso", "Lhokseumawe", "1993-07-15");
        trie.insert("11000004", "Putri Wulandari", "Langsa", "1988-03-20");
        trie.insert("11000005", "Andi Setiawan", "Meulaboh", "1997-10-12");
        trie.insert("11000006", "Dewi Susanti", "Sigli", "1992-02-08");
        trie.insert("11000007", "Rizky Ramadhan", "Takengon", "1980-12-18");
        trie.insert("11000008", "Dian Anggraini", "Bireuen", "1995-08-21");
        trie.insert("11000009", "Fajar Nugroho", "Kutacane", "1984-04-03");
        trie.insert("11000010", "Maya Sari", "Tapaktuan", "1998-11-27");
        trie.insert("11000011", "Agus Suprianto", "Calang", "1983-06-09");
        trie.insert("11000012", "Fitriani Septiani", "Idi Rayeuk", "1991-09-14");
        trie.insert("11000013", "Joko Santoso", "Singkil", "1986-07-07");
        trie.insert("11000014", "Intan Permata", "Blangpidie", "1994-05-23");
        trie.insert("11000015", "Eko Prasetyo", "Lhoksukon", "1982-08-30");
        trie.insert("11000016", "Nurul Hidayati", "Banda Aceh", "1987-03-14");
        trie.insert("11000017", "Ahmad Fauzi", "Sabang", "1989-06-25");
        trie.insert("11000018", "Taufik Hidayat", "Lhokseumawe", "1992-11-30");
        trie.insert("11000019", "Sri Rahayu", "Langsa", "1990-04-18");
        trie.insert("11000020", "Hendra Saputra", "Meulaboh", "1985-09-09");
        trie.insert("11000021", "Rina Astuti", "Sigli", "1996-07-07");
        trie.insert("11000022", "Bambang Irawan", "Takengon", "1994-12-12");
        trie.insert("11000023", "Lisa Marlina", "Bireuen", "1983-01-20");
        trie.insert("11000024", "Yudi Kurniawan", "Kutacane", "1991-05-19");
        trie.insert("11000025", "Ratna Sari", "Tapaktuan", "1998-06-30");
        trie.insert("11000026", "Faisal Akbar", "Calang", "1988-02-25");
        trie.insert("11000027", "Nina Kurnia", "Idi Rayeuk", "1986-08-14");
        trie.insert("11000028", "Hery Setiawan", "Singkil", "1990-11-01");
        trie.insert("11000029", "Yuni Lestari", "Blangpidie", "1984-12-22");
        trie.insert("11000030", "Dedi Supriadi", "Lhoksukon", "1995-09-09");
        trie.insert("11000031", "Irwan Saputra", "Banda Aceh", "1983-10-17");
        trie.insert("11000032", "Lina Marlina", "Sabang", "1997-01-03");
        trie.insert("11000033", "Kurniawan", "Lhokseumawe", "1993-12-12");
        trie.insert("11000034", "Mira Sari", "Langsa", "1982-06-15");
        trie.insert("11000035", "Arif Budiman", "Meulaboh", "1996-03-29");
        
        
        // Sumatera Utara
        trie.insert("12000001", "Binsar Lubis", "Binjai", "1992-01-14");
        trie.insert("12000002", "Siti Zubaidah", "Medan", "1985-08-15");
        trie.insert("12000003", "Marsius Manurung", "Binjai", "1994-07-08");
        trie.insert("12000004", "Tigor Simanjuntak", "Rantau Prapat", "1988-09-20");
        trie.insert("12000005", "Khadijah Sinaga", "Tebing Tinggi", "1987-11-12");
        trie.insert("12000006", "Raja Siregar", "Tanjung Balai", "1992-02-08");
        trie.insert("12000007", "Tiurma Pasaribu", "Medan", "1981-11-11");
        trie.insert("12000008", "Saut Sitompul", "Pematangsiantar", "1995-03-28");
        trie.insert("12000009", "Fatimah Hutasoit", "Gunungsitoli", "1988-07-23");
        trie.insert("12000010", "Rohani Simbolon", "Binjai", "1999-01-27");
        trie.insert("12000011", "Togar Sihombing", "Binjai", "1987-03-09");
        trie.insert("12000012", "Nursiah Harahap", "Tebing Tinggi", "1991-09-14");
        trie.insert("12000013", "Mangaraja Ginting", "Medan", "1988-09-07");
        trie.insert("12000014", "Kevin Hutabarat", "Medan", "1996-05-13");
        trie.insert("12000015", "Marlina Saragih", "Sibolga", "1989-05-30");
        trie.insert("12000016", "Dewi Lubis", "Binjai", "1986-06-18");
        trie.insert("12000017", "Rizal Sitorus", "Rantau Prapat", "1990-12-25");
        trie.insert("12000018", "Lina Gultom", "Tanjung Balai", "1993-04-14");
        trie.insert("12000019", "Andi Hasibuan", "Medan", "1985-11-01");
        trie.insert("12000020", "Farida Harahap", "Pematangsiantar", "1994-08-17");
        trie.insert("12000021", "Hendra Siahaan", "Gunungsitoli", "1991-02-09");
        trie.insert("12000022", "Rina Silitonga", "Binjai", "1989-09-30");
        trie.insert("12000023", "Dedi Tampubolon", "Tebing Tinggi", "1987-04-21");
        trie.insert("12000024", "Sri Simanjuntak", "Medan", "1996-03-11");
        trie.insert("12000025", "Yanti Hutapea", "Tanjung Balai", "1995-10-16");
        trie.insert("12000026", "Irwan Hutagalung", "Binjai", "1990-06-05");
        trie.insert("12000027", "Lisbet Napitupulu", "Medan", "1983-07-12");
        trie.insert("12000028", "Robert Simatupang", "Pematangsiantar", "1992-09-21");
        trie.insert("12000029", "Marini Sitohang", "Gunungsitoli", "1994-12-04");
        trie.insert("12000030", "Benny Sitorus", "Rantau Prapat", "1988-03-27");
        trie.insert("12000031", "Elisabeth Hutabarat", "Medan", "1993-11-19");
        trie.insert("12000032", "Erick Saragih", "Sibolga", "1982-02-18");
        trie.insert("12000033", "Dahlia Tambunan", "Binjai", "1987-05-14");
        trie.insert("12000034", "Junaidi Sitompul", "Medan", "1991-08-22");
        trie.insert("12000035", "Yuliana Simbolon", "Gunungsitoli", "1995-07-25");


        // Riau
        trie.insert("14000001", "Alya Rachman", "Pekanbaru", "1976-10-20");
        trie.insert("14000002", "Budi Syahputra", "Dumai", "1992-05-29");
        trie.insert("14000003", "Citra Hutapea", "Siak", "1985-09-14");
        trie.insert("14000004", "Doni Simanjuntak", "Bengkalis", "1980-06-12");
        trie.insert("14000005", "Eka Siregar", "Rengat", "1978-12-28");
        trie.insert("14000006", "Faisal Harahap", "Pekanbaru", "1999-01-04");
        trie.insert("14000007", "Gita Nasution", "Dumai", "1983-04-05");
        trie.insert("14000008", "Hendra Lubis", "Siak", "1987-02-23");
        trie.insert("14000009", "Indri Hasibuan", "Bengkalis", "1989-08-30");
        trie.insert("14000010", "Joko Siregar", "Rengat", "1974-07-15");
        trie.insert("14000011", "Koko Simanjuntak", "Pekanbaru", "1995-03-02");
        trie.insert("14000012", "Linda Harahap", "Dumai", "1998-11-09");
        trie.insert("14000013", "Mirana Nasusari", "Siak", "1972-02-21");
        trie.insert("14000014", "Lina Hutapea", "Bengkalis", "1982-09-27");
        trie.insert("14000015", "Dono Siregar", "Rengat", "1993-08-18");
        trie.insert("14000016", "Putu Wirawan", "Pekanbaru", "1988-07-17");
        trie.insert("14000017", "Rini Suhendar", "Dumai", "1991-06-10");
        trie.insert("14000018", "Sari Lubis", "Siak", "1994-03-14");
        trie.insert("14000019", "Tio Syahputra", "Bengkalis", "1985-12-25");
        trie.insert("14000020", "Umar Zulkarnain", "Rengat", "1977-10-08");
        trie.insert("14000021", "Vina Sari", "Pekanbaru", "1986-01-15");
        trie.insert("14000022", "Wawan Setiawan", "Dumai", "1987-04-18");
        trie.insert("14000023", "Xenia Putri", "Siak", "1995-11-21");
        trie.insert("14000024", "Yogi Saputra", "Bengkalis", "1990-09-30");
        trie.insert("14000025", "Zara Ramadhani", "Rengat", "1983-05-12");
        trie.insert("14000026", "Andi Rahman", "Pekanbaru", "1984-02-03");
        trie.insert("14000027", "Beni Haryanto", "Dumai", "1979-06-11");
        trie.insert("14000028", "Cici Siregar", "Siak", "1992-12-22");
        trie.insert("14000029", "Dede Nasution", "Bengkalis", "1981-08-14");
        trie.insert("14000030", "Edo Syahputra", "Rengat", "1989-01-26");
        trie.insert("14000031", "Farida Lubis", "Pekanbaru", "1997-07-08");
        trie.insert("14000032", "Gilang Siregar", "Dumai", "1986-03-04");
        trie.insert("14000033", "Hanafi Lubis", "Siak", "1991-11-15");
        trie.insert("14000034", "Irma Hasibuan", "Bengkalis", "1988-09-18");
        trie.insert("14000035", "Johan Siregar", "Rengat", "1995-05-20");

        // Jambi
        trie.insert("15000001", "Aulia Putri", "Jambi", "1984-06-30");
        trie.insert("15000002", "Beni Saputra", "Muara Bungo", "1990-09-21");
        trie.insert("15000003", "Cici Handayani", "Sarolangun", "1992-10-09");
        trie.insert("15000004", "Dodi Santoso", "Sungai Penuh", "1987-08-22");
        trie.insert("15000005", "Raka Manatama", "Tebo", "1993-12-03");
        trie.insert("15000006", "Fauzi Ramadhan", "Merangin", "1998-05-28");
        trie.insert("15000007", "Gita Puspita", "Batanghari", "1995-03-17");
        trie.insert("15000008", "Hendra Saputra", "Muaro Jambi", "1996-01-01");
        trie.insert("15000009", "Indriani Sari", "Tanjung Jabung Timur", "1986-04-10");
        trie.insert("15000010", "Jaka Pranowo", "Tanjung Jabung Barat", "1997-11-25");
        trie.insert("15000011", "Kartini Dewi", "Jambi", "2001-07-05");
        trie.insert("15000012", "Lina Syafitri", "Muara Bungo", "1999-02-11");
        trie.insert("15000013", "Mira Handayani", "Sarolangun", "2003-09-29");
        trie.insert("15000014", "Kirana Dewi", "Sungai Penuh", "2002-12-17");
        trie.insert("15000015", "Tono Pramuja", "Tebo", "1985-08-18");
        trie.insert("15000016", "Andi Wijaya", "Jambi", "1991-11-03");
        trie.insert("15000017", "Bayu Kolomani", "Muara Bungo", "1990-10-12");
        trie.insert("15000018", "Citra Dewi", "Sarolangun", "1994-06-07");
        trie.insert("15000019", "Dharma Cahyadi", "Sungai Penuh", "1989-04-20");
        trie.insert("15000020", "Ekamari Putri", "Tebo", "1993-02-25");
        trie.insert("15000021", "Firaun Setiawan", "Merangin", "1996-05-01");
        trie.insert("15000022", "Galih Saputra", "Batanghari", "1997-09-12");
        trie.insert("15000023", "Hesti Rahayu", "Muaro Jambi", "1995-08-22");
        trie.insert("15000024", "Indra Nugraha", "Tanjung Jabung Timur", "1992-07-19");
        trie.insert("15000025", "Jihan Pratiwi", "Tanjung Jabung Barat", "1998-12-08");
        trie.insert("15000026", "Kurnia Ramadhani", "Jambi", "2001-03-15");
        trie.insert("15000027", "Laras Utami", "Muara Bungo", "2002-01-10");
        trie.insert("15000028", "Mira Putri", "Sarolangun", "2003-07-28");
        trie.insert("15000029", "Nico Ramadhan", "Sungai Penuh", "2000-09-19");
        trie.insert("15000030", "Reyhan Suryadi", "Tebo", "1999-11-06");
        trie.insert("15000031", "Andini Ramadhani", "Merangin", "1995-08-22");
        trie.insert("15000032", "Bintang Pratama", "Batanghari", "1997-07-08");
        trie.insert("15000033", "Cindy Ramadhani", "Muaro Jambi", "1990-05-21");
        trie.insert("15000034", "Dewi Sartika", "Tanjung Jabung Timur", "1985-06-30");
        trie.insert("15000035", "Eko Wibowo", "Tanjung Jabung Barat", "1987-11-22");

        // Sumatera Selatan
        trie.insert("16000001", "Ahmad Surya", "Palembang", "1998-03-05");
        trie.insert("16000002", "Bunga Melati", "Lubuklinggau", "1995-01-23");
        trie.insert("16000003", "Candra Pratama", "Prabumulih", "1989-11-10");
        trie.insert("16000004", "Dewi Susanti", "Pagar Alam", "1991-06-06");
        trie.insert("16000005", "Edo Saputra", "Banyuasin", "1992-12-08");
        trie.insert("16000006", "Fitriani Sari", "Ogan Ilir", "1997-10-19");
        trie.insert("16000007", "Gilang Putra", "Musi Rawas", "1998-07-13");
        trie.insert("16000008", "Hani Rahayu", "Musi Banyuasin", "1994-02-01");
        trie.insert("16000009", "Iqbal Nugroho", "Lahat", "1990-05-15");
        trie.insert("16000010", "Joko Salim", "Muara Enim", "1996-09-25");
        trie.insert("16000011", "Kartini Ramadhani", "OKU Selatan", "2000-08-28");
        trie.insert("16000012", "Lia Utami", "OKU Timur", "2001-12-04");
        trie.insert("16000013", "Tirana Putri", "OKU", "1999-06-17");
        trie.insert("16000014", "Nanda Ramadhan", "Musi Rawas Utara", "2002-05-09");
        trie.insert("16000015", "Oscar Suryadi", "Ogan Komering Ilir", "2000-09-20");
        trie.insert("16000016", "Putri Amanda", "Palembang", "1993-07-12");
        trie.insert("16000017", "Rama Saputra", "Lubuklinggau", "1988-10-23");
        trie.insert("16000018", "Santi Pratiwi", "Prabumulih", "1995-02-19");
        trie.insert("16000019", "Tio Nugroho", "Pagar Alam", "1997-12-14");
        trie.insert("16000020", "Umar Ramadhan", "Banyuasin", "1987-03-09");
        trie.insert("16000021", "Vira Pratiwi", "Ogan Ilir", "1996-09-06");
        trie.insert("16000022", "Wulan Sari", "Musi Rawas", "1990-11-28");
        trie.insert("16000023", "Xena Nugroho", "Musi Banyuasin", "1993-04-21");
        trie.insert("16000024", "Yogi Pratama", "Lahat", "1989-02-17");
        trie.insert("16000025", "Zainal Abidin", "Muara Enim", "1991-08-15");
        trie.insert("16000026", "Andi Setiawan", "OKU Selatan", "1997-10-25");
        trie.insert("16000027", "Beni Ramadhan", "OKU Timur", "1985-09-30");
        trie.insert("16000028", "Cindy Pratiwi", "OKU", "1992-06-12");
        trie.insert("16000029", "Doni Nugraha", "Musi Rawas Utara", "1988-05-19");
        trie.insert("16000030", "Eka Sari", "Ogan Komering Ilir", "1997-03-08");
        trie.insert("16000031", "Faisal Syahputra", "Palembang", "1989-11-14");
        trie.insert("16000032", "Gita Ramadhani", "Lubuklinggau", "1990-08-22");
        trie.insert("16000033", "Hendra Setiawan", "Prabumulih", "1994-07-31");
        trie.insert("16000034", "Indri Ramadhani", "Pagar Alam", "1991-04-23");
        trie.insert("16000035", "Joko Ramadhan", "Banyuasin", "1985-12-16");

        // Bengkulu
        trie.insert("17000001", "Andi Wijaya", "Bengkulu", "1991-11-03");
        trie.insert("17000002", "Bayu Kolomani", "Rejang Lebong", "1990-10-12");
        trie.insert("17000003", "Citra Dewi", "Bengkulu Selatan", "1994-06-07");
        trie.insert("17000004", "Dharma Cahyadi", "Bengkulu Utara", "1989-04-20");
        trie.insert("17000005", "Ekamari Putri", "Kaur", "1993-02-25");
        trie.insert("17000006", "Firaun Setiawan", "Lebong", "1996-05-01");
        trie.insert("17000007", "Galih Saputra", "Kepahiang", "1997-09-12");
        trie.insert("17000008", "Hesti Rahayu", "Mukomuko", "1995-08-22");
        trie.insert("17000009", "Indra Nugraha", "Seluma", "1992-07-19");
        trie.insert("17000010", "Jihan Pratiwi", "Bengkulu Tengah", "1998-12-08");
        trie.insert("17000011", "Kurnia Ramadhani", "Bengkulu Barat", "2001-03-15");
        trie.insert("17000012", "Laras Utami", "Bengkulu Utara", "2002-01-10");
        trie.insert("17000013", "Mira Putri", "Kepahiang", "2003-07-28");
        trie.insert("17000014", "Nico Ramadhan", "Lebong", "2000-09-19");
        trie.insert("17000015", "Reyhan Suryadi", "Mukomuko", "1999-11-06");
        trie.insert("17000016", "Alif Pratama", "Bengkulu", "1987-01-20");
        trie.insert("17000017", "Berlian Sari", "Rejang Lebong", "1985-05-09");
        trie.insert("17000018", "Citra Ayu", "Bengkulu Selatan", "1992-11-11");
        trie.insert("17000019", "Dina Ramadhani", "Bengkulu Utara", "1991-03-24");
        trie.insert("17000020", "Edo Surya", "Kaur", "1990-08-06");
        trie.insert("17000021", "Fajar Nugroho", "Lebong", "1988-04-18");
        trie.insert("17000022", "Gilang Ramadhan", "Kepahiang", "1993-09-02");
        trie.insert("17000023", "Hanafi Nugroho", "Mukomuko", "1989-06-30");
        trie.insert("17000024", "Indriani Setiawan", "Seluma", "1994-05-21");
        trie.insert("17000025", "Joko Pranoto", "Bengkulu Tengah", "1996-02-17");
        trie.insert("17000026", "Kartika Putri", "Bengkulu Barat", "1995-10-12");
        trie.insert("17000027", "Lina Pratiwi", "Bengkulu Utara", "1993-07-19");
        trie.insert("17000028", "Mirna Putri", "Kepahiang", "1986-09-16");
        trie.insert("17000029", "Nina Sari", "Lebong", "1997-08-27");
        trie.insert("17000030", "Omar Pratama", "Mukomuko", "1988-12-10");
        trie.insert("17000031", "Putri Ayu", "Bengkulu", "1990-11-05");
        trie.insert("17000032", "Rama Setiawan", "Rejang Lebong", "1991-04-03");
        trie.insert("17000033", "Sari Pratiwi", "Bengkulu Selatan", "1989-02-25");
        trie.insert("17000034", "Tina Ramadhani", "Bengkulu Utara", "1994-07-14");
        trie.insert("17000035", "Umar Pranoto", "Kaur", "1985-11-18");

        // Lampung
        trie.insert("18000001", "Adrian Nursalim", "Bandar Lampung", "1990-09-02");
        trie.insert("18000002", "Bella Sari", "Lampung Selatan", "1991-07-14");
        trie.insert("18000003", "Cyrus Putra", "Lampung Tengah", "1994-05-30");
        trie.insert("18000004", "Dahlia Susanti", "Lampung Utara", "1992-01-20");
        trie.insert("18000005", "Eko Putra", "Lampung Barat", "1989-11-14");
        trie.insert("18000006", "Fitria Dewi", "Way Kanan", "1993-04-26");
        trie.insert("18000007", "Galih Saputra", "Tulang Bawang", "1995-08-19");
        trie.insert("18000008", "Hendra Setiawan", "Pesawaran", "1996-11-23");
        trie.insert("18000009", "Indri Sari", "Pringsewu", "1997-03-14");
        trie.insert("18000010", "Joko Pratama", "Mesuji", "1998-06-02");
        trie.insert("18000011", "Kartini Ramadhani", "Tanggamus", "2001-05-19");
        trie.insert("18000012", "Lina Sari", "Pesisir Barat", "2002-12-27");
        trie.insert("18000013", "Sinta Pratiwi", "Lampung Selatan", "2003-01-30");
        trie.insert("18000014", "Mira Utami", "Lampung Tengah", "2000-10-28");
        trie.insert("18000015", "Nanda Pratama", "Lampung Utara", "1999-02-13");
        trie.insert("18000016", "Omar Susanto", "Lampung Barat", "2000-07-20");
        trie.insert("18000017", "Putri Ramadhani", "Way Kanan", "1998-11-16");
        trie.insert("18000018", "Qori Sari", "Tulang Bawang", "1997-04-29");
        trie.insert("18000019", "Rama Nugraha", "Pesawaran", "1996-08-25");
        trie.insert("18000020", "Sinta Pratiwi", "Pringsewu", "1998-12-22");
        trie.insert("18000021", "Tina Ramadhani", "Mesuji", "1990-06-30");
        trie.insert("18000022", "Umar Setiawan", "Tanggamus", "1991-11-17");
        trie.insert("18000023", "Vira Sari", "Pesisir Barat", "1992-03-10");
        trie.insert("18000024", "Wulan Ramadhani", "Lampung Selatan", "1989-01-18");
        trie.insert("18000025", "Xenia Dewi", "Lampung Tengah", "1994-08-05");
        trie.insert("18000026", "Yogi Pratama", "Lampung Utara", "1985-09-12");
        trie.insert("18000027", "Zainal Nugraha", "Lampung Barat", "1986-05-23");
        trie.insert("18000028", "Aditya Sari", "Way Kanan", "1999-04-21");
        trie.insert("18000029", "Bella Nugraha", "Tulang Bawang", "1998-02-07");
        trie.insert("18000030", "Cinta Ramadhani", "Pesawaran", "1996-07-24");
        trie.insert("18000031", "Dian Pratiwi", "Pringsewu", "1997-03-30");
        trie.insert("18000032", "Eka Sari", "Mesuji", "1995-09-11");
        trie.insert("18000033", "Farid Nugraha", "Tanggamus", "1994-12-25");
        trie.insert("18000034", "Gilang Setiawan", "Pesisir Barat", "1993-11-19");
        trie.insert("18000035", "Hana Ramadhani", "Lampung Selatan", "1992-01-22");


        //Bangka Belitung
        trie.insert("19000001", "Aiden Pratama", "Bandar Lampung", "1992-05-20");
        trie.insert("19000002", "David Suryadi", "Lampung Selatan", "1990-10-12");
        trie.insert("19000003", "Cyril Putri", "Lampung Tengah", "1993-06-25");
        trie.insert("19000004", "Diana Susanti", "Lampung Utara", "1989-12-01");
        trie.insert("19000005", "Ethan Prasetyo", "Tanggamus", "1994-09-17");
        trie.insert("19000006", "Fiona Setiawan", "Tulang Bawang", "1997-07-03");
        trie.insert("19000007", "Gavin Saputra", "Pesawaran", "1998-03-12");
        trie.insert("19000008", "Hannah Rahayu", "Pringsewu", "1995-08-28");
        trie.insert("19000009", "Evan Tugroho", "Mesuji", "1991-04-09");
        trie.insert("19000010", "Jasmine Pradipta", "Lampung Timur", "1996-01-15");
        trie.insert("19000011", "Kai Ramadhan", "Way Kanan", "2000-11-28");
        trie.insert("19000012", "Luna Utami", "Tanggamus", "2002-09-19");
        trie.insert("19000013", "Maya Putri", "Lampung Barat", "2003-08-07");
        trie.insert("19000014", "Nathan Jonathan", "Tulang Bawang Barat", "2001-05-22");
        trie.insert("19000015", "Michael Lim", "Lampung Tengah", "2000-06-13");

        //Kepulauan Riau
        trie.insert("21000001", "Armando Bayu", "Batam", "1990-11-18");
        trie.insert("21000002", "Bella Sutra", "Tanjung Pinang", "1991-07-12");
        trie.insert("21000003", "Cyril Johna", "Bintan", "1994-02-03");
        trie.insert("21000004", "Tariana Susanti", "Karimun", "1990-08-29");
        trie.insert("21000005", "Ethan Prasetyo", "Natuna", "1993-04-17");
        trie.insert("21000006", "Flora Agusari", "Lingga", "1996-10-06");
        trie.insert("21000007", "Calvin Pratma", "Anambas", "1997-11-15");
        trie.insert("21000008", "Hannah Rahayu", "Kepulauan Riau", "1995-05-28");
        trie.insert("21000009", "Ivan Nugroho", "Batam", "1992-09-02");
        trie.insert("21000010", "Jasmine Nursalim", "Tanjung Pinang", "1998-12-01");
        trie.insert("21000011", "Damon Ramadhan", "Bintan", "2001-06-14");
        trie.insert("21000012", "Luna Maria", "Karimun", "2000-03-27");
        trie.insert("21000013", "Tamara Setiawan", "Natuna", "2003-02-22");
        trie.insert("21000014", "Nathalia Salim", "Lingga", "2002-09-19");
        trie.insert("21000015", "Oliver Muliya", "Anambas", "2001-10-10");

        //DKI Jakarta
        trie.insert("31000001", "Mikael Johnason", "Jakarta Pusat", "1995-07-15");
        trie.insert("31000002", "Jule Sarius", "Jakarta Selatan", "2000-12-28");
        trie.insert("31000003", "Padma Purnawa", "Jakarta Barat", "1993-03-31");
        trie.insert("31000004", "Diona Sari", "Jakarta Utara", "1998-06-21");
        trie.insert("31000005", "Natlan Haliman", "Jakarta Timur", "1997-09-08");
        trie.insert("31000006", "Tiona Nursari", "Jakarta Pusat", "2002-11-23");
        trie.insert("31000007", "Gavin Saputra", "Jakarta Selatan", "2003-04-18");
        trie.insert("31000008", "Eka RGustiwana", "Jakarta Barat", "1995-10-25");
        trie.insert("31000009", "Yosef Bendri", "Jakarta Utara", "1996-08-12");
        trie.insert("31000010", "Yasmine Cintaya", "Jakarta Timur", "1999-03-03");
        trie.insert("31000011", "Muhammad Ramadhan", "Jakarta Pusat", "2004-05-20");
        trie.insert("31000012", "Elysia Movic", "Jakarta Selatan", "2001-12-13");
        trie.insert("31000013", "Angel Mahasari", "Jakarta Barat", "2000-03-28");
        trie.insert("31000014", "Nathan Ramadhani", "Jakarta Utara", "2002-08-13");
        trie.insert("31000015", "Olivia Suryadi", "Jakarta Timur", "2002-02-03");

        //Jawa Barat
        trie.insert("32000001", "Ahmad Dhani", "Bandung", "1990-06-12");
        trie.insert("32000002", "Siti Susanti", "Bogor", "1995-11-25");
        trie.insert("32000003", "Rudi Pratama", "Depok", "1988-02-28");
        trie.insert("32000004", "Lina Sari", "Cirebon", "1993-05-21");
        trie.insert("32000005", "Dedi Permana", "Bekasi", "1992-08-08");
        trie.insert("32000006", "Euis Suryani", "Bandung", "1997-10-23");
        trie.insert("32000007", "Hadi Nugraha", "Bogor", "1998-03-18");
        trie.insert("32000008", "Ani Susanti", "Depok", "1991-09-25");
        trie.insert("32000009", "Sugianto Wijaya", "Cirebon", "1994-07-12");
        trie.insert("32000010", "Yanti Fitri", "Bekasi", "1996-01-28");
        trie.insert("32000011", "Joko Hermawan", "Bandung", "1999-04-15");
        trie.insert("32000012", "Rina Anggraeni", "Bogor", "2000-11-30");
        trie.insert("32000013", "Agus Kurniawan", "Depok", "2001-02-15");
        trie.insert("32000014", "Siti Nurhayati", "Cirebon", "2002-07-28");
        trie.insert("32000015", "Rudi Saputra", "Bekasi", "2003-01-20");

        //Jawa Tengah
        trie.insert("33000001", "Adinata Putra", "Semarang", "1990-06-15");
        trie.insert("33000002", "Ardianto Wahayu", "Surakarta", "1995-11-28");
        trie.insert("33000003", "Budiono Pratama", "Tegal", "1984-02-29");
        trie.insert("33000004", "Darsa Sari", "Magelang", "1993-05-22");
        trie.insert("33000005", "Dihyan Daryata", "Pekalongan", "1992-08-09");
        trie.insert("33000006", "Luis Fubento", "Salatiga", "1997-10-24");
        trie.insert("33000007", "Haji Rahamana", "Semarang", "1993-03-12");
        trie.insert("33000008", "Anis Santi", "Surakarta", "1991-07-26");
        trie.insert("33000009", "Yanto Jayaputra", "Tegal", "1994-09-13");
        trie.insert("33000010", "Fusena Fitri", "Magelang", "1996-06-29");
        trie.insert("33000011", "Jarot Dermawan", "Pekalongan", "1993-04-16");
        trie.insert("33000012", "Listu Cahyani", "Salatiga", "2002-12-01");
        trie.insert("33000013", "Padma Kurniawan", "Semarang", "2000-05-16");
        trie.insert("33000014", "Olga Fubento", "Surakarta", "2002-07-29");
        trie.insert("33000015", "Opal Saputra", "Tegal", "2003-04-21");

        //DIY (Daerah Istimewah Yogyakarta)
        trie.insert("34000001", "Argani Elvano", "Yogyakarta", "1990-07-16");
        trie.insert("34000002", "Bagas Santoso", "Sleman", "1995-12-29");
        trie.insert("34000003", "Basuki Mahaprana", "Bantul", "1988-03-02");
        trie.insert("34000004", "Edi Dikara", "Kulon Progo", "1993-05-24");
        trie.insert("34000005", "Haris Alfian", "Gunung Kidul", "1992-08-11");
        trie.insert("34000006", "Jarot Kaivan", "Yogyakarta", "1997-10-26");
        trie.insert("34000007", "Lintang Arnawama", "Sleman", "1998-03-21");
        trie.insert("34000008", "Anis Wijaya", "Bantul", "1991-09-28");
        trie.insert("34000009", "Sugianto Mahardika", "Kulon Progo", "1994-07-15");
        trie.insert("34000010", "Gilang Fabian", "Gunung Kidul", "1996-01-31");
        trie.insert("34000011", "Ruri Pradana", "Yogyakarta", "1999-04-18");
        trie.insert("34000012", "Rina Antasena", "Sleman", "2000-12-03");
        trie.insert("34000013", "Agus Giovanni", "Bantul", "2001-02-18");
        trie.insert("34000014", "Siti Matteo", "Kulon Progo", "2002-07-31");
        trie.insert("34000015", "Rudi  Kumara", "Gunung Kidul", "2003-01-23");

        //Jawa Timur
        trie.insert("35000001", "Casu Graha", "Surabaya", "1990-07-17");
        trie.insert("35000002", "Candra Mulia", "Malang", "1995-12-30");
        trie.insert("35000003", "Asoka Harwman", "Sidoarjo", "1988-03-03");
        trie.insert("35000004", "Citra Lestari", "Mojokerto", "1993-05-25");
        trie.insert("35000005", "Dimas Agung", "Jombang", "1992-08-12");
        trie.insert("35000006", "Dita Mulia", "Blitar", "1997-10-27");
        trie.insert("35000007", "Ethan Setiawan", "Probolinggo", "1998-03-22");
        trie.insert("35000008", "Daiva Lasmana", "Pasuruan", "1991-09-29");
        trie.insert("35000009", "Putra Arjuna", "Madiun", "1994-07-16");
        trie.insert("35000010", "Indra Kumala", "Magetan", "1996-02-01");
        trie.insert("35000011", "Japa Jati", "Nganjuk", "1999-04-19");
        trie.insert("35000012", "Mandala Lingga", "Tuban", "2000-12-04");
        trie.insert("35000013", "Nagata Mirza", "Lamongan", "2001-02-19");
        trie.insert("35000014", "Noval Purwadi", "Pamekasan", "2002-08-01");
        trie.insert("35000015", "Kamile Biddan", "Bondowoso", "2002-01-24");

        //Banten
        trie.insert("36000001", "Windah Prasetyo", "Tangerang", "1989-05-23");
        trie.insert("36000002", "Budi Gemilang", "Serang", "1997-10-18");
        trie.insert("36000003", "Rudy Tabuti", "Cilegon", "1993-03-07");
        trie.insert("36000004", "Jono Mahapuja ", "Tangerang Selatan", "1996-08-25");
        trie.insert("36000005", "Dinda Setia", "Lebak", "1990-12-15");
        trie.insert("36000006", "Luis Wang", "Pandeglang", "1994-06-30");
        trie.insert("36000007", "Noval Haidar", "Serang", "2001-01-12");
        trie.insert("36000008", "Biily Saputra", "Cilegon", "1998-09-02");
        trie.insert("36000009", "Sugiono Pratama", "Tangerang", "1992-11-05");
        trie.insert("36000010", "Selina Salim", "Tangerang Selatan", "1988-07-19");
        trie.insert("36000011", "Felix Hansent", "Lebak", "2000-04-10");
        trie.insert("36000012", "Faris Aditya", "Pandeglang", "1995-02-28");
        trie.insert("36000013", "Leslie Martin", "Tangerang", "2002-03-14");
        trie.insert("36000014", "Hengki Janvier", "Serang", "1999-08-04");
        trie.insert("36000015", "Eko Gunawan", "Cilegon", "1991-09-09");

        //Bali
        trie.insert("51000001", "Alexander Kim", "Denpasar", "1988-04-13");
        trie.insert("51000002", "Joko Budianto", "Ubud", "1995-11-25");
        trie.insert("51000003", "Reyhan Kutan", "Kuta", "1992-07-14");
        trie.insert("51000004", "Yatno Purwarto", "Seminyak", "1996-01-30");
        trie.insert("51000005", "Dandi Apriyanto", "Sanur", "1991-10-21");
        trie.insert("51000006", "Martin Purnawan ", "Nusa Dua", "1993-03-05");
        trie.insert("51000007", "Valen Bristin", "Jimbaran", "2000-05-17");
        trie.insert("51000008", "Vina Kim", "Gianyar", "1998-09-28");
        trie.insert("51000009", "Hendra Agusalim", "Tabanan", "1991-12-03");
        trie.insert("51000010", "Adit Nurhadi", "Lovina", "1987-02-09");
        trie.insert("51000011", "Sopo Jarwo", "Singaraja", "1999-06-15");
        trie.insert("51000012", "Dennis Bertand", "Candidasa", "1994-08-27");
        trie.insert("51000013", "Lamhot Butar", "Amed", "2001-11-19");
        trie.insert("51000014", "Edward Nababan", "Pemuteran", "1998-03-11");
        trie.insert("51000015", "Solihin Muryadi", "Canggu", "1990-07-06");

        //Nusa Tenggara Barat
        trie.insert("52000001", "Bernard Haryadi", "Mataram", "1990-06-15");
        trie.insert("52000002", "Rosalina Hutahean", "Praya", "1993-11-04");
        trie.insert("52000003", "Muhamad Taram", "Selong", "1995-03-22");
        trie.insert("52000004", "Rajin Siahaan", "Sumbawa Besar", "1998-09-12");
        trie.insert("52000005", "Tjuntjun Tjussadena", "Bima", "1991-02-07");
        trie.insert("52000006", "Lis Susanti", "Dompu", "1994-10-29");
        trie.insert("52000007", "Asnita Sidauruk", "Taliwang", "1997-12-18");
        trie.insert("52000008", "Wendy Winarta", "Labuhan Bajo", "1992-04-24");
        trie.insert("52000009", "Willy Gunawan", "Waingapu", "1999-07-30");
        trie.insert("52000010", "Andi Devawanti", "Ruteng", "1996-05-05");
        trie.insert("52000011", "Aspita Ratatuli", "Soe", "1990-09-11");
        trie.insert("52000012", "Liana Theresia", "Bajawa", "1993-01-23");
        trie.insert("52000013", "Rina Rotua", "Maumere", "1995-08-08");
        trie.insert("52000014", "Ernawati Saragih", "Lewoleba", "1998-03-02");
        trie.insert("52000015", "Nurfa Swinda", "Kupang", "1992-11-27");

        //Nusa Tenggara Timur
        trie.insert("53000001", "Nurlela Saratulo", "Mataram", "1989-07-12");
        trie.insert("53000002", "Adi Riswandi", "Praya", "1992-03-19");
        trie.insert("53000003", "Herda Sekarsari", "Selong", "1994-11-05");
        trie.insert("53000004", "Alifah putri", "Sumbawa Besar", "1997-08-23");
        trie.insert("53000005", "Anna Khoirunnisa", "Bima", "1991-02-14");
        trie.insert("53000006", "Dewi Pratiwi", "Dompu", "1993-06-29");
        trie.insert("53000007", "Henggar Saram", "Taliwang", "1998-10-18");
        trie.insert("53000008", "Nova Indah", "Labuhan Bajo", "1995-04-27");
        trie.insert("53000009", "Ria Lestari", "Waingapu", "1999-07-12");
        trie.insert("53000010", "Januwar Mulyo", "Ruteng", "1990-01-21");
        trie.insert("53000011", "Arya Wahyu", "Soe", "1994-09-15");
        trie.insert("53000012", "Aulia Zahra", "Bajawa", "1996-03-05");
        trie.insert("53000013", "Yohanes Widya", "Maumere", "1995-11-11");
        trie.insert("53000014", "Titin Fatimah", "Lewoleba", "1998-05-20");
        trie.insert("53000015", "Gunawan Pria", "Kupang", "1992-12-08");

        //Kalimantan Barat
        trie.insert("61000001", "Eldana Raisaputra", "Pontianak", "1990-07-15");
        trie.insert("61000002", "Nabil Irfanputri", "Singkawang", "1992-03-29");
        trie.insert("61000003", "Hendrawan Wibawa", "Mempawah", "1995-11-10");
        trie.insert("61000004", "Rafhael Sanjaya", "Ketapang", "1997-08-03");
        trie.insert("61000005", "Hafiza Brithera", "Sintang", "1991-02-21");
        trie.insert("61000006", "Najwa Alysa", "Kapuas Hulu", "1993-06-15");
        trie.insert("61000007", "Gita Ginomi", "Sekadau", "1998-10-02");
        trie.insert("61000008", "Gadis Novenka", "Landak", "1995-04-18");
        trie.insert("61000009", "Arvand Cahil", "Bengkayang", "1999-07-25");
        trie.insert("61000010", "Gilang Angger", "Sambas", "1990-01-30");
        trie.insert("61000011", "Aurel Amalia", "Melawi", "1994-09-19");
        trie.insert("61000012", "Ariya Rosandi", "Kayong Utara", "1996-03-22");
        trie.insert("61000013", "Adelina Citra", "Kubu Raya", "1995-11-17");
        trie.insert("61000014", "Kevin Budianto", "Sanggau", "1998-05-11");
        trie.insert("61000015", "Rendy Heri", "Sekadau", "1992-12-05");

        //Kalimantan Tengah
        trie.insert("62000001", "Noor Abinah", "Palangka Raya", "1989-05-21");
        trie.insert("62000002", "Irma Alista", "Sampit", "1993-11-14");
        trie.insert("62000003", "Alan Ardiani", "Pangkalan Bun", "1995-08-30");
        trie.insert("62000004", "Evi Rosalina", "Muara Teweh", "1997-04-05");
        trie.insert("62000005", "Nindia Sari", "Buntok", "1991-10-12");
        trie.insert("62000006", "Apri Nuryani", "Tamiang Layang", "1994-02-27");
        trie.insert("62000007", "Diana Sari", "Kuala Kapuas", "1998-09-14");
        trie.insert("62000008", "Lilis Setianing", "Puruk Cahu", "1992-07-22");
        trie.insert("62000009", "Reza Arap", "Kasongan", "1996-12-18");
        trie.insert("62000010", "Siti Subaidah", "Kuala Pembuang", "1990-03-09");
        trie.insert("62000011", "Lis Hariyanto", "Sampit", "1994-06-20");
        trie.insert("62000012", "Siwi Triyanti", "Buntok", "1996-11-07");
        trie.insert("62000013", "Anissa Nur", "Muara Teweh", "1995-01-26");
        trie.insert("62000014", "Zeira Aldaza", "Kuala Kapuas", "1998-08-03");
        trie.insert("62000015", "Bunga Asyifa", "Palangka Raya", "1992-05-25");

        //Kalimantan Selatan
        trie.insert("63000001", "Arjuna Wicaksono", "Banjarmasin", "1990-03-14");
        trie.insert("63000002", "Inara Mahya", "Banjarbaru", "1992-08-19");
        trie.insert("63000003", "Fernando Ramadhan", "Martapura", "1995-12-03");
        trie.insert("63000004", "Naisilah Putri", "Pelaihari", "1997-05-22");
        trie.insert("63000005", "Dedi Wicaksono", "Marabahan", "1991-09-17");
        trie.insert("63000006", "Dedi Anwar", "Rantau", "1994-11-25");
        trie.insert("63000007", "Gita Tiara", "Amuntai", "1998-01-30");
        trie.insert("63000008", "Ali Yulizar", "Barabai", "1992-06-10");
        trie.insert("63000009", "Ria Kosasi", "Kandangan", "1996-04-14");
        trie.insert("63000010", "Jono Sudarman", "Tanjung", "1990-12-05");
        trie.insert("63000011", "Baiti Komala", "Kotabaru", "1994-03-18");
        trie.insert("63000012", "Mawar Anindya", "Batulicin", "1996-09-11");
        trie.insert("63000013", "Alyana Vanessa", "Paringin", "1995-07-26");
        trie.insert("63000014", "Niko Iskandar", "Binuang", "1998-02-13");
        trie.insert("63000015", "James Oliver", "Marabahan", "1992-05-30");

        //Kalimantan Timur
        trie.insert("64000001", "Rafli Suntara", "Samarinda", "1990-04-20");
        trie.insert("64000002", "Ayu Utari", "Balikpapan", "1992-07-16");
        trie.insert("64000003", "Dian Ramadani", "Bontang", "1995-09-08");
        trie.insert("64000004", "Melisa Panca", "Tenggarong", "1997-12-02");
        trie.insert("64000005", "Sablina Fitriani", "Sangatta", "1991-11-11");
        trie.insert("64000006", "Farah queen", "Penajam", "1994-01-19");
        trie.insert("64000007", "Haikal Rahmat", "Berau", "1998-06-25");
        trie.insert("64000008", "Nayla Indrasti", "Tanjung Redeb", "1992-08-04");
        trie.insert("64000009", "Risma Sari", "Sendawar", "1996-03-27");
        trie.insert("64000010", "Aura Nazwa", "Melak", "1990-10-17");
        trie.insert("64000011", "Kresna Saputra", "Tana Paser", "1994-05-13");
        trie.insert("64000012", "Larasti Ayu", "Penajam", "1996-09-21");
        trie.insert("64000013", "Saskia Cahyani", "Samarinda", "1995-07-09");
        trie.insert("64000014", "Saskia cahyani", "Balikpapan", "1998-02-28");
        trie.insert("64000015", "Agung Rafa", "Bontang", "1992-12-06");

        //Kalimantan Utara
        trie.insert("65000001", "Saskia Tri", "Tanjung Selor", "1990-03-14");
        trie.insert("65000002", "Atsal Alfi", "Tarakan", "1992-08-19");
        trie.insert("65000003", "Daffa Ilham", "Malinau", "1995-12-03");
        trie.insert("65000004", "Laura Adelina", "Nunukan", "1997-05-22");
        trie.insert("65000005", "Novita Sari", "Tideng Pale", "1991-09-17");
        trie.insert("65000006", "Sany Eka", "Sesayap", "1994-11-25");
        trie.insert("65000007", "Dimas Gilang", "Tanjung Redeb", "1998-01-30");
        trie.insert("65000008", "Lola Biola", "Bunyu", "1992-06-10");
        trie.insert("65000009", "Rifat Ahmad", "Pulau Tiga", "1996-04-14");
        trie.insert("65000010", "Salma Halimah", "Bulungan", "1990-12-05");
        trie.insert("65000011", "Cantika Eka", "Long Bawan", "1994-03-18");
        trie.insert("65000012", "Citra Sundasari", "Mentarang", "1996-09-11");
        trie.insert("65000013", "Haikal Rauf", "Tanjung Palas", "1995-07-26");
        trie.insert("65000014", "Niko Riskianto", "Tarakan", "1998-02-13");
        trie.insert("65000015", "Najmah Kamilah", "Sesayap", "1992-05-30");

        //Sulawesi Utara
        trie.insert("71000001", "Joevita Tsalistya", "Manado", "1990-07-15");
        trie.insert("71000002", "Kaila Salwa", "Bitung", "1992-03-29");
        trie.insert("71000003", "Lulu Fathiyah", "Tomohon", "1995-11-10");
        trie.insert("71000004", "Naffa Fatwa", "Kotamobagu", "1997-08-03");
        trie.insert("71000005", "Rizki Ramadhan", "Tondano", "1991-10-12");
        trie.insert("71000006", "Abdee Alfarros", "Airmadidi", "1993-06-29");
        trie.insert("71000007", "Aida Adelia", "Langowan", "1998-10-18");
        trie.insert("71000008", "Annisa Amalia", "Lolak", "1992-07-22");
        trie.insert("71000009", "Andi Prasito", "Amurang", "1996-12-18");
        trie.insert("71000010", "Elvina Kirana", "Sonder", "1990-01-30");
        trie.insert("71000011", "Sofia Qolbina", "Melonguane", "1994-06-20");
        trie.insert("71000012", "Zahwa Putri", "Tutuyan", "1996-11-07");
        trie.insert("71000013", "Dimas Permana", "Tombatu", "1995-01-26");
        trie.insert("71000014", "Jeremy William", "Kotamobagu", "1998-08-03");
        trie.insert("71000015", "Naoval Sabrani", "Kawangkoan", "1992-05-25");

        //Sulawesi Tengah
        trie.insert("72000001", "Ananda Jacinta", "Palu", "1990-05-11");
        trie.insert("72000002", "Rofiko Setiawan", "Donggala", "1992-08-27");
        trie.insert("72000003", "Ferdi Chandra", "Poso", "1995-12-15");
        trie.insert("72000004", "Kevin Dwi", "Buol", "1997-06-28");
        trie.insert("72000005", "Nana Puspa", "Toli-Toli", "1991-11-03");
        trie.insert("72000006", "Nesa Dira", "Parigi Moutong", "1994-02-17");
        trie.insert("72000007", "Pian Ahmad", "Banggai", "1998-09-22");
        trie.insert("72000008", "Reffi Ahmad", "Tojo Una-Una", "1992-07-06");
        trie.insert("72000009", "Ahmad Maulana", "Morowali", "1996-04-30");
        trie.insert("72000010", "Angga Saputra", "Banggai Kepulauan", "1990-01-09");
        trie.insert("72000011", "Diana Safitri", "Sigi", "1994-06-10");
        trie.insert("72000012", "Hengki Handonko", "Banggai Laut", "1996-12-27");
        trie.insert("72000013", "Malvin Setiawan", "Buol", "1995-02-14");
        trie.insert("72000014", "Lianti Fauzia", "Poso", "1998-07-19");
        trie.insert("72000015", "Sarah Putri", "Donggala", "1992-09-08");

        //Sulawesi Selatan
        trie.insert("73000001", "Teuku Radjasha", "Makassar", "1990-07-25");
        trie.insert("73000002", "julian Putra", "Makassar", "1992-02-14");
        trie.insert("73000003", "Muhamad Rizki", "Makassar", "1995-11-03");
        trie.insert("73000004", "Rahma Aulia", "Makassar", "1997-04-28");
        trie.insert("73000005", "Tara Kirania", "Parepare", "1991-10-17");
        trie.insert("73000006", "Bagas Alifio ", "Parepare", "1994-03-06");
        trie.insert("73000007", "Bayu Syahputra", "Makassar", "1998-08-09");
        trie.insert("73000008", "Hendri yatanto", "Makassar", "1992-06-30");
        trie.insert("73000009", "Cindy Aulia", "Makassar", "1996-01-21");
        trie.insert("73000010", "Jona Mangasari", "Makassar", "1990-12-15");
        trie.insert("73000011", "Bintang Sukma", "Makassar", "1994-09-04");
        trie.insert("73000012", "Jihan Monika", "Makassar", "1996-07-29");
        trie.insert("73000013", "Zaky Mubarok", "Makassar", "1995-05-18");
        trie.insert("73000014", "Siti Marya", "Parepare", "1998-03-12");
        trie.insert("73000015", "Suci Mukaromah", "Makassar", "1992-12-23");

        //Sulawesi Tenggara
        trie.insert("74000001", "Ana Nabilah", "Kendari", "1994-09-03");
        trie.insert("74000002", "Dea Talia", "Baubau", "1991-04-21");
        trie.insert("74000003", "Haikal Cahyo", "Kendari", "1995-10-12");
        trie.insert("74000004", "Soleh Hilabi", "Baubau", "1995-02-01");
        trie.insert("74000005", "Marta Amelia", "Kolaka", "1991-08-28");
        trie.insert("74000006", "Ayu Nigsih", "Wangi-Wangi", "1994-01-13");
        trie.insert("74000007", "Dini Dewi", "Kendari", "1998-06-07");
        trie.insert("74000008", "Vika Deas", "Baubau", "1997-05-19");
        trie.insert("74000009", "Ismail Setyo", "Kendari", "1998-12-14");
        trie.insert("74000010", "Meilina Rachmayanti", "Baubau", "1990-11-05");
        trie.insert("74000011", "Prio Santoso", "Kendari", "1994-07-30");
        trie.insert("74000012", "Angga Imaningtyas", "Baubau", "1994-03-25");
        trie.insert("74000013", "Fito Hie", "Kendari", "1995-09-15");
        trie.insert("74000014", "karen Kirani", "Baubau", "1999-04-08");
        trie.insert("74000015", "Sarah Pertiwi", "Kendari", "1995-12-29");

        //Gorontalo
        trie.insert("75000001", "Agus Azka", "Gorontalo", "1987-07-11");
        trie.insert("75000002", "Raya Aura", "Gorontalo", "1993-04-25");
        trie.insert("75000003", "Elsa Zafira", "Gorontalo", "1996-09-08");
        trie.insert("75000004", "Ilham Amarrullah", "Gorontalo", "1998-03-20");
        trie.insert("75000005", "Reihan Ilham", "Gorontalo", "1990-11-15");
        trie.insert("75000006", "Selinda Reika", "Gorontalo", "1995-01-28");
        trie.insert("75000007", "Gita Rahayu", "Gorontalo", "1999-06-10");
        trie.insert("75000008", "Wahyu Anastasia", "Gorontalo", "1991-08-22");
        trie.insert("75000009", "Zeki Maikel", "Gorontalo", "1997-12-17");
        trie.insert("75000010", "Lili Percila", "Gorontalo", "1989-10-09");
        trie.insert("75000011", "Alya Fitra", "Gorontalo", "1994-05-04");
        trie.insert("75000012", "Eva Noviar", "Gorontalo", "1992-03-31");
        trie.insert("75000013", "Rezki Restiani", "Gorontalo", "1996-11-23");
        trie.insert("75000014", "Fatma Wati", "Gorontalo", "1997-02-14");
        trie.insert("75000015", "Julianti Derga", "Gorontalo", "1993-09-07");

        //Sulawesi Barat
        trie.insert("76000001", "Dewa Getsumeda", "Mamuju", "1989-03-22");
        trie.insert("76000002", "Bayu Antara", "Mamuju", "1994-12-10");
        trie.insert("76000003", "Maria Silvia", "Mamuju", "1997-08-06");
        trie.insert("76000004", "Komang Gede", "Mamuju", "1995-06-18");
        trie.insert("76000005", "Kristin Rahayu", "Mamuju", "1990-11-01");
        trie.insert("76000006", "Kadek Bagiansa", "Mamuju", "1992-02-14");
        trie.insert("76000007", "Nadya Prabansari", "Mamuju", "1998-10-28");
        trie.insert("76000008", "Eka Suantara", "Mamuju", "1993-04-05");
        trie.insert("76000009", "Bagus Nugrah", "Mamuju", "1991-09-30");
        trie.insert("76000010", "Desi Parmila", "Mamuju", "1996-07-17");
        trie.insert("76000011", "Aryani Saragih", "Mamuju", "1988-05-23");
        trie.insert("76000012", "Johan Tanuwijaya", "Mamuju", "1999-01-11");
        trie.insert("76000013", "Dita Sendita", "Mamuju", "1993-11-03");
        trie.insert("76000014", "Hendrik Tirta", "Mamuju", "1992-08-30");
        trie.insert("76000015", "Novi Nana", "Mamuju", "1995-12-19");

        //Maluku
        trie.insert("81000001", "Laras Amelia", "Ambon", "1991-12-08");
        trie.insert("81000002", "Radhito Utama", "Ternate", "1993-07-24");
        trie.insert("81000003", "Agustinus Macron", "Tual", "1996-04-15");
        trie.insert("81000004", "Helena Primsa", "Ternate", "1997-10-30");
        trie.insert("81000005", "Amni Rahman", "Ambon", "1990-05-17");
        trie.insert("81000006", "Vega Kharsina", "Tual", "1995-03-29");
        trie.insert("81000007", "Rahma Nurul", "Ambon", "1998-09-11");
        trie.insert("81000008", "Harya Safeni", "Ternate", "1992-01-03");
        trie.insert("81000009", "Farina Delvi", "Ambon", "1997-07-21");
        trie.insert("81000010", "Defni Anyar", "Tual", "1990-10-12");
        trie.insert("81000011", "Fitra Dewiarti", "Ambon", "1994-02-25");
        trie.insert("81000012", "Didi Bahri", "Ternate", "1996-08-19");
        trie.insert("81000013", "Johan Albert", "Ambon", "1992-06-05");
        trie.insert("81000014", "Winarsih Ginting", "Tual", "1999-04-27");
        trie.insert("81000015", "Mei Anggreana", "Ambon", "1998-11-14");

        //Maluku Utara
        trie.insert("82000001", "Beatrix Ernestein", "Ternate", "1992-04-27");
        trie.insert("82000002", "Billy Harvy", "Tidore Kepulauan", "1996-08-19");
        trie.insert("82000003", "Clinton Immanuel", "Ternate", "1993-12-03");
        trie.insert("82000004", "Ratu Camulyana", "Ternate", "1997-07-14");
        trie.insert("82000005", "Estine Maresky", "Tidore Kepulauan", "1991-10-28");
        trie.insert("82000006", "Nadia Maria", "Ternate", "1995-05-09");
        trie.insert("82000007", "Gusti Ayu", "Tidore Kepulauan", "1998-09-01");
        trie.insert("82000008", "Saka Aditya", "Ternate", "1994-01-20");
        trie.insert("82000009", "Paulus Laukati", "Tidore Kepulauan", "1990-06-11");
        trie.insert("82000010", "Samuel Mamoto", "Ternate", "1996-03-15");
        trie.insert("82000011", "Kartika Dinianta", "Tidore Kepulauan", "1999-11-02");
        trie.insert("82000012", "Lina Mandei", "Ternate", "1992-08-24");
        trie.insert("82000013", "Mikael Jaya", "Ternate", "1997-12-06");
        trie.insert("82000014", "Rio Aditya", "Tidore Kepulauan", "1993-04-17");
        trie.insert("82000015", "Nicholas Luis", "Ternate", "1998-07-30");

        
        //Papua Barat
        trie.insert("91000001", "Yosep Hermawan", "Sorong", "1992-08-23");
        trie.insert("91000002", "Belle Mulyanfi", "Manokwari", "1994-03-17");
        trie.insert("91000003", "Padma Pratama", "Fakfak", "1998-06-02");
        trie.insert("91000004", "Susi Susanti", "Manokwari", "1996-11-09");
        trie.insert("91000005", "Eka Gemilang", "Sorong", "1990-07-30");
        trie.insert("91000006", "Farhan Maulana", "Manokwari", "1993-05-21");
        trie.insert("91000007", "Nathasa Lestari", "Sorong", "1997-10-11");
        trie.insert("91000008", "Dadang Nugroho", "Fakfak", "1995-02-28");
        trie.insert("91000009", "Indah Wulandari", "Manokwari", "1991-09-06");
        trie.insert("91000010", "Joko Sutrisno", "Sorong", "1999-12-15");
        trie.insert("91000011", "Joshua faith", "Fakfak", "1997-04-05");
        trie.insert("91000012", "Lina Sariwati", "Manokwari", "1990-10-18");
        trie.insert("91000013", "Silvi Lestari", "Sorong", "1996-03-27");
        trie.insert("91000014", "Jenifer Karuras", "Manokwari", "1998-08-14");
        trie.insert("91000015", "Vania Tumbaleka", "Fakfak", "1993-01-31");
        

        //Papua
        trie.insert("92000001", "Tegar Sekawan", "Jayapura", "1996-07-25");
        trie.insert("92000002", "Andi Restu", "Biak", "1992-11-14");
        trie.insert("92000003", "Ivan Saputra", "Merauke", "1998-05-03");
        trie.insert("92000004", "Yudistira Arkaan", "Wamena", "1994-09-28");
        trie.insert("92000005", "Isra Almubarak", "Jayapura", "1990-12-17");
        trie.insert("92000006", "Dea Amanda", "Sorong", "1995-04-06");
        trie.insert("92000007", "Abdul Jafar", "Biak", "1997-08-22");
        trie.insert("92000008", "Echa Adisti", "Jayapura", "1993-01-11");
        trie.insert("92000009", "Mawar Radishti", "Merauke", "1991-06-30");
        trie.insert("92000010", "Aurel Messi", "Wamena", "1999-10-19");
        trie.insert("92000011", "Karina Abimayu", "Jayapura", "1993-03-08");
        trie.insert("92000012", "Raihan Estain", "Sorong", "1997-12-15");
        trie.insert("92000013", "Zaky Rochman", "Biak", "1995-02-24");
        trie.insert("92000014", "Adelina Citra", "Jayapura", "1998-11-13");
        trie.insert("92000015", "Erliza Rahma", "Merauke", "1990-08-04");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan NIK yang akan dicari: ");
        String nikToSearch = scanner.nextLine();

        String[] result = trie.search(nikToSearch);
        if (result != null) {
            System.out.println("Data ditemukan:");
            System.out.println("Nama: " + result[0]);
            System.out.println("Tempat Tanggal Lahir: " + result[1]);
        } else {
            System.out.println("Data tidak ditemukan untuk NIK " + nikToSearch);
        }
    }
}
