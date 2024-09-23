package com.example.helpik2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Item> data = new ArrayList<>();
        data.add(new Item("Корея", R.drawable.f1, "Сеул, столица Южной Кореи, – это гигантский мегаполис, где современные небоскребы, высокотехнологичное метро и поп-культура соседствуют с буддийскими храмами, дворцами и уличными рынками. К основным достопримечательностям города относятся футуристический комплекс \"Тондэмун Дизайн Плаза\" с парком на крыше, древний дворец Кёнбок, в котором раньше было семь тысяч комнат, и храм Чогеса, перед которым растут вековые сосны и софоры."));
        data.add(new Item("Швейцария", R.drawable.f2, "Берн – столица Швейцарии, расположенная в излучине реки Аре. Город был основан в XII веке. В Альтштадте (Старом городе) с тех времен сохранились средневековые постройки. К ним относятся возведенные в XIII веке Французская церковь (Französische Kirche) и башня Цитглогге (Zytglogge). В Федеральном дворце (Bundeshaus), выполненном в стиле неоренессанс, заседает швейцарский парламент."));
        data.add(new Item("Тайланд", R.drawable.f3, "Бангкок – столица Таиланда, огромный город, известный своими богато украшенными храмами и насыщенной ночной жизнью. Через город протекает судоходная река Чаупхрая, которая питает своими водами многочисленные каналы. На берегу одного из каналов лежит королевский район Раттанакосин, где расположены роскошный Большой дворец, священный храм Пхракэу и ват Пхо с гигантской статуей Отдыхающего Будды. На противоположном берегу находится ват Арун с крутыми ступенями и шпилем в кхмерском стиле."));
        data.add(new Item("Англия", R.drawable.f4, "Лондон – столица Англии и Соединенного Королевства. История этого современного города уходит во времена римлян. В самом центре Лондона находится здание парламента – Вестминстерский дворец, а также знаменитая часовая башня Биг-Бен и Вестминстерское аббатство. Эта церковь является местом коронации британских монархов. На противоположном берегу Темзы расположено колесо обозрения \"Лондонский глаз\", с которого открывается панорамный вид не только на южный берег, но и на весь город."));

        MyAdapter adapter = new MyAdapter(data, this);
        recyclerView.setAdapter(adapter);
    }
}