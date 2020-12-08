package com.example.android.kopiinaja;

import java.util.ArrayList;

public class KopiData {
    public static String[][] data = new String[][]{
            {"Coffee Espresso", "espresso adalah minuman kopi paling dasar yang biasanya disajikan dalam cangkir khusus espresso yang berukuran 30ml – 118ml dengan rasa pahit yang sangat pekat . Espresso sendiri bertekstur pekat dan pahit dengan penampilan buih-buih coklat muda diatasnya yang muncul karena tekanan minyak yang ada didalam biji kopi.", "https://globalsportmatters.com/wp-content/uploads/2018/08/Coffee-copy.jpg"},
            {"Americano", "Dari namanya tentu olahan kopi yang satu ini berasal dari Amerika. Racikan Americano terdiri dari 1 shot espresso yang dituangkan dalam cangkir berukuran 178 ml yang dicampur dengan air panas hingga memenuhi gelas. Americano biasanya nyaris tak ada krema di permukaan cangkir. Hal ini dikarenakan espresso yang ditambahkan air panas sehingga memecah krema yang ada pada espresso. Minuman ini bisa disediakan dalam panas maupun dingin yang disebut es americano.", "https://coffeemakered.com/wp-content/uploads/2017/05/What-is-Americano-Coffee-1.jpg"},
            {"Cappucino", "Cappucino adalah olahan espresso yang paling banyak digemari terutama bagi penikmat kopi dengan rasa lebih milk. Minuman ini terdiri dari espresso dan cream milk dengan perbandingan 1:1 namun ada juga yang memakai perbandingan 1/3 espresso, 1/3 steamed milk, dan 1/3 milk froth. kita akan mersakan foam yang agak tebal saat tegukan pertama, setelah itu diikuti kopi dengan rasa milky yang kuat. Dalam secangkir cappucino tidak ada art dipermukaan cangkir seperti latte. Biasanya hanya taburan choco granule atau butiran halus berwarna coklat yang dicetak menggunaka papan stainless berpola", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c8/Cappuccino_at_Sightglass_Coffee.jpg/1280px-Cappuccino_at_Sightglass_Coffee.jpg"},
            {"Macchiato", "Macchiato harus disajikan di dalam cangkir espresso karena ukurannya memang harus kecil. Dengan menu espresso dan susu dalam ukuran kecil namun tak terlalu besar seperti cappucino tetapi tetap memiliki sentuhan susu yang yahut dan tak membosankan. Biasanya semua olahan kopi di coffee shop otentik tidak menambahkan pemanis, tapi kamu bisa meminta barista untuk menyertakan gula bersama pesananmu.", "https://upload.wikimedia.org/wikipedia/commons/e/e3/Macchiato_FourBarrel.jpg"},
            {"Latte", "latte adalah kopi yang cenderung milky. Kunci yang sangat mendasar dalam pembuatan latte adalah proses steaming susunya (susu yang dipanaskan dengan semprotan uap panas). Latte biasanya menggunakan perbandingan espresso dan susu 2:1 selain rasanya yang nikmat, latte biasanya disajikan dalam cangkir dengan pola indah diatasnya atau biasanya banyak disebut latte art.", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/Caffe-Latte-Prague.JPG/1280px-Caffe-Latte-Prague.JPG"},
            {"Flat White", "Flat White terdiri dari textured milk dan espresso dan ada beberapa barista yang menggunakan takaran susu lebih sedikit dibandingkan dengan latte. Flat white biasanya terdiri 60 ml textured milk alias gelembung saat susu dipanaskan, kemudian 2 shot espresso dituang diatasnya dan dicampur menjadi satu. Agar kita mudah mengenali Flat white yaitu ketika meminumnya, kita akan merasakan kopi yang cenderung kuat namun ada sedikit rasa lembut halus yang menyertai", "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Flat_white_coffee_with_pretty_feather_pattern.jpg/1200px-Flat_white_coffee_with_pretty_feather_pattern.jpg"},
    };

    public static ArrayList<Kopi> getListData() {
        ArrayList<Kopi> list = new ArrayList<>();
        for (String[] aData : data) {
            Kopi hero = new Kopi();
            hero.setName(aData[0]);
            hero.setFrom(aData[1]);
            hero.setPhoto(aData[2]);

            list.add(hero);
        }
        return list;
    }
}
