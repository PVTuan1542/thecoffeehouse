package com.example.thecoffeehouse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.thecoffeehouse.Models.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rengwuxian.materialedittext.MaterialEditText;

public class Login extends AppCompatActivity {

    EditText edtPhone250,edtPassword250;
    Button btnSignIn250;
    TextView regis250;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtPhone250=(MaterialEditText)findViewById(R.id.edtPassword);
        edtPhone250=(MaterialEditText)findViewById(R.id.edtPhone);
        btnSignIn250=(Button)findViewById(R.id.SignIn);
        regis250=(TextView)findViewById(R.id.regis);


        final FirebaseDatabase database=FirebaseDatabase.getInstance();
        final DatabaseReference table_user=database.getReference("User");

        regis250.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rg=new Intent(Login.this,Register.class);
                startActivity(rg);
            }
        });

        btnSignIn250.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                final ProgressDialog mDialog = new ProgressDialog(Login.this);
                mDialog.setMessage("Please Waiting!");
                mDialog.show();

                table_user.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        //Check
                        if (snapshot.child(edtPhone250.getText().toString()).exists()) {

                            //Get User information
                            mDialog.dismiss();
                            User user = snapshot.child(edtPhone250.getText().toString()).getValue(User.class);
                            //PArt 5:
                            user.setPhone(edtPhone250.getText().toString());//set Phone

                            if (user.getPassword().equals(edtPassword250.getText().toString())) {
                                Toast.makeText(Login.this, "Đăng Nhập Thành Công !", Toast.LENGTH_SHORT).show();
                                Intent homeIntent=new Intent(Login.this,Home.class);
                                
                                startActivity(homeIntent);
                                finish();

                            } else {
                                Toast.makeText(Login.this, "Sai Mật Khẩu !", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            mDialog.dismiss();
                            Toast.makeText(Login.this, "Không tồn tại trong Database !", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });


            }
}