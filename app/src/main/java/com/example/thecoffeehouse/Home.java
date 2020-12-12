package com.example.thecoffeehouse;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {
    RecyclerView recycleuudai, recyclecapnhat,recycle_lover;
    com.example.thecoffeehouse.itemAdapter itemAdapter;
    Button btnSignUp,btnSignIn;
    ImageView imageView,imageView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnSignIn = (Button) findViewById(R.id.si);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent si=new Intent(Home.this,Login.class);
                startActivity(si);
            }
        });


        List<item> uudailist = new ArrayList<>();
        uudailist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Order ngay", R.drawable.tt4));
        uudailist.add(new item("CÂU CHUYỆN SƠ RI THE COFFEE HOUSE ","Chẳng phải tự nhiên The Coffee House chọn Sơ ri Gò Công - Tiền Giang chứ không phải Sơ ri ở những vùng đất khác để tạo nên bộ đôi Trà Sơ ri Thanh long & Yakult Sơ ri Thanh long trứ danh. Vậy lý do tại sao?...","Order ngay", R.drawable.tt6));
        uudailist.add(new item("The Coffee House đồng hành cùng bạn \"Go Green\"!","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Order ngay", R.drawable.item_1));
        uudailist.add(new item("Top 10 cửa hàng The Coffee House bạn nên trải nghiệm tại Hà Nội","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Order ngay", R.drawable.item_2));
        uudailist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Order ngay", R.drawable.item_3));

        List<item> capnhatlist = new ArrayList<>();
        capnhatlist.add(new item("BỘ ĐÔI \"CRUSH QUỐC DÂN\" TRỞ LẠI","Bộ đôi “Crush quốc dân\" năm ấy chúng ta từng yêu thích đã quay trở lại tại The Coffee House: Trà Sơ Ri Thanh Long và Yakult Sơ Ri Thanh Long -...","Chi tiết", R.drawable.tt7));
        capnhatlist.add(new item("THỬ VỊ TRUNG THU CÙNG BỘ SƯU TẬP \"TRĂNG NHÀ SUNG TÚC\"","Sáng tạo là niềm đam mê Barista tại The Coffee House luôn theo đuổi. Mùa trăng tròn này, Nhà gửi đến bạn bộ sưu tập thức uống sáng tạo -...","Chi tiết", R.drawable.tt8));
        capnhatlist.add(new item("KHÁM PHÁ \"CUỘC PHIÊU LƯU\" BÊN TRONG HỘP BÁNH TRUNG THU THE COFFEE HOUSE","Không khí Trung Thu đã tràn ngập không gian Nhà. Hãy cùng Nhà khám phá cuộc phiêu lưu của chú Cuội phiên bản \"xịn sò\", đắm chìm trong sắc màu...","Chi tiết", R.drawable.tt9));
        capnhatlist.add(new item("GÓI TIẾT KIỆM DÀNH CHO NGƯỜI YÊU TRÀ VÀ CÀ PHÊ - TIẾT KIỆM ĐẾN 160K","Cùng Nhà khám phá Gói Tiết Kiệm \"phiên bản nâng cấp\" tại app The Coffee House để thưởng thức món yêu thích và tiết kiệm đến 160.000đ nha!Nhà hiểu rằng, một ngày...","Chi tiết", R.drawable.tt10));
        capnhatlist.add(new item("NẠP C 100% TỰ NHIÊN CÙNG CAM VÀNG VÀ PHÚC BỒN TỬ TƯƠI","Tháng 2 này, The Coffee House mang đến bộ sưu tập Vitamin C tự nhiên từ Cam Vàng tươi 100% và Phúc bồn tử tự nhiên, để bạn thoả sức nạp C, lên đề kháng!... ","Chi tiết", R.drawable.tt11));

        List<item>  loverlist = new ArrayList<>();
        loverlist.add(new item("Bộ sưu tập sản phẩm \"Yêu môi trường\" - Bạn đồng hành cùng bạn \"Go Green\"!","Với The Coffee House, Go Green không chỉ là một xu hướng, đó là trách nhiệm và lối sống tích cực mà chúng tôi mong muốn lan toả, truyền cảm...","Chi tiết", R.drawable.tt12));
        loverlist.add(new item("GỬI CHÂN THÀNH, TRAO YÊU THƯƠNG CÙNG THE COFFEE HOUSE","Noel này, The Coffee House sẽ mang 300 món quà yêu thương sẻ chia với người vô gia cư trên các cung đường của Sài Gòn... ","Chi tiết", R.drawable.tt13));
        loverlist.add(new item("Khám phá không gian ảnh \bSài Gòn Vẫn Thế tại The Coffee House Signature","Triển lãm Sài Gòn Vẫn Thế tại The Coffee House Signature...","Chi tiết", R.drawable.tt14));
        loverlist.add(new item("BÁNH TRUNG THU THE COFFEE HOUSE: THỨC QUÀ MÙA TRĂNG MANG HỒN VỊ XƯA","Mùa trăng tháng 8 đang về mang theo bao nao nức mong chờ cùng kỉ niệm gợi nhớ kí ức xa xăm của từng người. Tết của con nít đấy,...","Chi tiết", R.drawable.tt15));
        loverlist.add(new item("7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI","Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào 7 ngày Free Upsize - Yêu bạn nữ...","Chi tiết", R.drawable.item_5));

        setRecycle_uudai(uudailist);
        setRecyclecapnhat(capnhatlist);
        setRecycle_lover(loverlist);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.news);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.news:
//                        startActivity(new Intent(getApplicationContext(),Home.class));
//                        overridePendingTransition(0,0);
                        return true;
                    case R.id.delivery:
                        startActivity(new Intent(getApplicationContext(),orderScreen.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.store:
                        startActivity(new Intent(getApplicationContext(),store_screen.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.account:
                        startActivity(new Intent(getApplicationContext(),account_screen.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

        //Thông báo
        thongbao();
        //thông  tin cá nhân
        thongtincanhan();
    }

    public void setRecycle_uudai(List<item> itemList ){
        recycleuudai=findViewById(R.id.recycle_uudai);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        recycleuudai.setLayoutManager(layoutManager);
        itemAdapter = new itemAdapter(this,itemList);
        recycleuudai.setAdapter(itemAdapter);
    }
    public void setRecyclecapnhat(List<item> itemList ){
        recyclecapnhat=findViewById(R.id.recycle_capnhat);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        recyclecapnhat.setLayoutManager(layoutManager);
        itemAdapter = new itemAdapter(this,itemList);
        recyclecapnhat.setAdapter(itemAdapter);
    }
    public void setRecycle_lover(List<item> itemList ){
        recycle_lover=findViewById(R.id.recycle_lover);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        recycle_lover.setLayoutManager(layoutManager);
        itemAdapter = new itemAdapter(this,itemList);
        recycle_lover.setAdapter(itemAdapter);
    }
    private void thongtincanhan(){
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, thongtincanhan.class);
                startActivity(intent);
            }
        });
    }
    private void thongbao(){
        imageView = (ImageView) findViewById(R.id.imageView3);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, thongbao.class);
                startActivity(intent);
            }
        });
    }


}