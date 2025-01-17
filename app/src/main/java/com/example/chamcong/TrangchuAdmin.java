package com.example.chamcong;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TrangchuAdmin extends AppCompatActivity {

    Button scanBtn, logoutBtn, historyBtn, infoBtn, manageuserBtn,
                        manageposBtn, managedepBtn, statisticalBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trangchu_admin);
        scanBtn = findViewById(R.id.scanBtn);
        logoutBtn = findViewById(R.id.logoutBtn);
        historyBtn = findViewById(R.id.historyBtn);
        infoBtn = findViewById(R.id.infoBtn);
        managedepBtn = findViewById(R.id.managedepBtn);
        manageposBtn = findViewById(R.id.manageposBtn);
        manageuserBtn = findViewById(R.id.manageuserBtn);
        statisticalBtn = findViewById(R.id.statisticalBtn);

        scanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TrangchuAdmin.this, ScanQR.class);
                startActivity(i);
            }
        });

        historyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TrangchuAdmin.this, Lichsuchamcong.class);
                startActivity(i);
            }
        });

        infoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TrangchuAdmin.this, Thongtinuser.class);
                startActivity(i);
            }
        });

        Intent in = getIntent();
        String string = in.getStringExtra("message");
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(TrangchuAdmin.this);
                builder.setTitle("Xác nhận đăng xuất").
                        setMessage("Bạn muốn đăng xuất?");
                builder.setPositiveButton("Có",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent i = new Intent(getApplicationContext(),
                                        MainActivity.class);
                                startActivity(i);
                            }
                        });
                builder.setNegativeButton("Không",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert11 = builder.create();
                alert11.show();
            }
        });
    }
}