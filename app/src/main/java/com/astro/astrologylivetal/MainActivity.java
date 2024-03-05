//package com.astro.astrologylivetal;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.cardview.widget.CardView;
//
//import android.annotation.SuppressLint;
//import android.content.Intent;
//import android.content.pm.PackageManager;
//import android.net.Uri;
//import android.os.Bundle;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import java.io.UnsupportedEncodingException;
//import java.net.URLEncoder;
//
//public class MainActivity extends AppCompatActivity {
//    CardView wa, policy, fee, work, share;
//    String wa_url;
//    String url = "https://sites.google.com/view/astrologylivetalk";
//    TextView btn;
//
//    @SuppressLint("IntentReset")
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        wa = findViewById(R.id.wa);
//        policy = findViewById(R.id.policy);
//        work = findViewById(R.id.work);
//        share = findViewById(R.id.share);
//        fee = findViewById(R.id.fee);
//        btn = findViewById(R.id.button);
//
//        try {
//            wa_url = "https://api.whatsapp.com/send?phone=" + "+918247625696" + "&text=" + URLEncoder.encode("Hi, I'm here from Astrology Live Talk", "UTF-8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//
//        btn.setOnClickListener(view -> {
//            // Check if WhatsApp is installed
//            if (isWhatsAppInstalled()) {
//                Intent i = new Intent(Intent.ACTION_VIEW);
//                i.setType("text/plain");
//                i.setData(Uri.parse(wa_url));
//                i.setPackage("com.whatsapp");
//                startActivity(i);
//            } else {
//                // WhatsApp is not installed, handle this scenario gracefully (e.g., show a message)
//                Toast.makeText(MainActivity.this, "WhatsApp is not installed", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        wa.setOnClickListener(view -> {
//            // Check if WhatsApp is installed
//            if (isWhatsAppInstalled()) {
//                Intent i = new Intent(Intent.ACTION_VIEW);
//                i.setType("text/plain");
//                i.setData(Uri.parse(wa_url));
//                i.setPackage("com.whatsapp");
//                startActivity(i);
//            } else {
//                // WhatsApp is not installed, handle this scenario gracefully (e.g., show a message)
//                Toast.makeText(MainActivity.this, "WhatsApp is not installed", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        fee.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, MainActivity2.class).putExtra("activity", "fee")));
//
//        work.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, MainActivity2.class).putExtra("activity", "work")));
//
//        policy.setOnClickListener(view -> {
//            Intent i = new Intent(Intent.ACTION_VIEW).setData(Uri.parse(url));
//            startActivity(i);
//        });
//
//        share.setOnClickListener(view -> {
//            Intent i = new Intent(Intent.ACTION_SEND);
//            i.setType("text/plain");
//            i.putExtra(Intent.EXTRA_TEXT, "Download this amazing app : \n" + "https://play.google.com/store/apps/details?id=" + "com.astro.astrologylivetal");
//            startActivity(i);
//        });
//    }
//
//    // Helper method to check if WhatsApp is installed
//    private boolean isWhatsAppInstalled() {
//        PackageManager pm = getPackageManager();
//        try {
//            pm.getPackageInfo("com.whatsapp", PackageManager.GET_ACTIVITIES);
//            return true;
//        } catch (PackageManager.NameNotFoundException e) {
//            return false;
//        }
//    }
//}


package com.astro.astrologylivetal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
//import android.view.View;
import android.widget.TextView;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class MainActivity extends AppCompatActivity {
    CardView wa, policy, fee, work, share;
    String wa_url;
    String url = "https://sites.google.com/view/astrologylivetalk";
    TextView btn;
    @SuppressLint("IntentReset")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wa = findViewById(R.id.wa);
        policy = findViewById(R.id.policy);
        work = findViewById(R.id.work);
        share = findViewById(R.id.share);
        fee = findViewById(R.id.fee);
        btn = findViewById(R.id.button);

        try {
            wa_url = "https://api.whatsapp.com/send?phone="+ "+918247625696" +"&text=" + URLEncoder.encode("Hi, I'm here from Astrology Live Talk", "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        btn.setOnClickListener(view -> {

            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setType("text/plain");
            i.setData(Uri.parse(wa_url)) ;

            i.setPackage("com.whatsapp");

            startActivity(i);
        });

        wa.setOnClickListener(view -> {

            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setType("text/plain");
            i.setData(Uri.parse(wa_url)) ;

            i.setPackage("com.whatsapp");

            startActivity(i);
        });

        fee.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, MainActivity2.class).putExtra("activity","fee")));

        work.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, MainActivity2.class).putExtra("activity","work")));

        policy.setOnClickListener(view -> {
            Intent i = new Intent(Intent.ACTION_VIEW).setData(Uri.parse(url));
            startActivity(i);
        });

        share.setOnClickListener(view -> {
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain") ;
            i.putExtra(Intent.EXTRA_TEXT, "Download this amazing app : \n" + "https://play.google.com/store/apps/details?id=" + "com.astro.astrologylivetal");
            startActivity(i);
        });


    }
}