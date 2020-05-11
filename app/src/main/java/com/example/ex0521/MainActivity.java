package com.example.ex0521;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double a;
    double b;
    double c;
    boolean flag;
    WebView wV;
    EditText etA;
    EditText etB;
    EditText etC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wV = (WebView) findViewById(R.id.wV);
        etA = (EditText) findViewById(R.id.etA);
        etB = (EditText) findViewById(R.id.etB);
        etC = (EditText) findViewById(R.id.etC);

    }

    public void Start_Page(View view) {
        if (flag)//כאשר הדגל שווה לא הוא שקר יבצע את הפקודות אחרי התנאי ואם הדגל שווה אמת הוא כן יבצע את הפקודות
        {
            String stringUrl = "";
            String miniUrl = a + "x%5E2" ;
            if (b>0){
                miniUrl = miniUrl +  "%2B" + b + "x";
            }
            else if(b<0){
                miniUrl = miniUrl + b + "x";
            }
            if (c>0){
                miniUrl = miniUrl + "%2B" + c;
            }
            else if (c<0){
                miniUrl = miniUrl + c;
            }

            stringUrl= "https://www.google.com/search?rlz=1C1AVFC" +
                    "_enIL875IL875&ei="+
                   // "30i1XurlDYLjsAfBpo_wCA&"+
                    //"cH25XqHCE6qLmwXT2Y-gCA"
                    //PIK5XuDlHNb9gAakqZSIDQ
                    "&q=" +
                    miniUrl + "&oq=" + miniUrl;
                    //"-2x%5E2%2B-6x-7&oq=-2x%5E2%2B-6x-7"
                    //"2*x%5E2%2B56x%2B4&oq=2*x%5E2%2B56x%2B4" + // מה שצריך לשנות
                    //"2*x%5E2%2B56x%2B4
                    // x%5E2%2B ^2
                    //%2B +

            //https://www.google.com/search?rlz=1C1AVFC_enIL875IL875&ei
            // =cH25XqHCE6qLmwXT2Y-gCA&q=x%5E2%2B3x%2B5&oq=x%5E2%2B3x%2B5
            // &gs_lcp=CgZwc3ktYWIQAzICCAAyBAgAEB4yBAgAEB4yBAgAEB4yBAgAEB
            // 4yBAgAEB4yBAgAEB4yBAgAEB4yBAgAEB4yBAgAEB46BAgAEEM6BQgAEIMBUO
            // eeF1iX5hdgoOoXaABwAHgAgAG1AYgByQqSAQMwLjiYAQCgAQGqAQdnd3Mtd2
            // l6&sclient=psy-ab&ved=0ahUKEwihuqzSnazpAhWqxaYKHdPsA4QQ4dUDCAw&uact=5


            wV.getSettings().setJavaScriptEnabled(true);

            wV.loadUrl(stringUrl);
        }

    }

    public void Graph_Equation(View view) {
        a = Double.parseDouble(etA.getText().toString());
        b = Double.parseDouble(etB.getText().toString());
        c = Double.parseDouble(etC.getText().toString());
        if (a==0){
            flag = false;
            Toast.makeText(this, "wrong input: a can be 0", Toast.LENGTH_SHORT).show();
        }
        else {
            flag = true;
        }


    }
}
