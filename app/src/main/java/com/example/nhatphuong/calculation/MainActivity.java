package com.example.nhatphuong.calculation;

import android.content.SharedPreferences;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.example.nhatphuong.calculation.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    String toantu;
    float sothu1, sothu2;
    float kw;
    TextView et1;
    private ActivityMainBinding binding;
    private SharedPreferences mPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mPreferences = getSharedPreferences("lastresult",MODE_PRIVATE);
        binding.txtcal.setText(mPreferences.getString("lastvalue",""));
        binding.button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.txtcal.setText(binding.txtcal.getText() + "0");
            }
        });
        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.txtcal.setText(binding.txtcal.getText() + "1");
            }
        });
        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.txtcal.setText(binding.txtcal.getText() + "2");
            }
        });
        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.txtcal.setText(binding.txtcal.getText() + "3");
            }
        });
        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.txtcal.setText(binding.txtcal.getText() + "4");
            }
        });
        binding.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.txtcal.setText(binding.txtcal.getText() + "5");
            }
        });
        binding.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.txtcal.setText(binding.txtcal.getText() + "6");
            }
        });
        binding.button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.txtcal.setText(binding.txtcal.getText() + "7");
            }
        });
        binding.button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.txtcal.setText(binding.txtcal.getText() + "8");
            }
        });
        binding.button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.txtcal.setText(binding.txtcal.getText() + "9");
            }
        });
        binding.buttonCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toantu = "+";
                sothu1 = Float.parseFloat(binding.txtcal.getText().toString());
                binding.txtcal.setText("");
            }
        });
        binding.buttonCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toantu = "+";
                sothu1 = Float.parseFloat(binding.txtcal.getText().toString());
                binding.txtcal.setText("");
            }
        });
        binding.buttonTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toantu = "-";
                sothu1 = Float.parseFloat(binding.txtcal.getText().toString());
                binding.txtcal.setText("");
            }
        });
        binding.buttonNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toantu = "*";
                sothu1 = Float.parseFloat(binding.txtcal.getText().toString());
                binding.txtcal.setText("");
            }
        });
        binding.buttonChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toantu = "/";
                sothu1 = Float.parseFloat(binding.txtcal.getText().toString());
                binding.txtcal.setText("");
            }
        });
        binding.buttonCham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.txtcal.setText(binding.txtcal.getText() + ".");
            }
        });
        binding.buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.txtcal.setText("");
            }
        });

        binding.buttonBang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toantu == "+") {
                    sothu2 = Float.parseFloat(binding.txtcal.getText().toString());
                    binding.txtcal.setText("");
                    kw = sothu1 + sothu2;
                    binding.txtcal.setText(String.valueOf(kw));
                    sothu1 = 0.0f;
                    sothu2 = 0.0f;


                } else if (toantu == "-") {
                    sothu2 = Float.parseFloat(binding.txtcal.getText().toString());
                    binding.txtcal.setText("");
                    kw = sothu1 - sothu2;
                    binding.txtcal.setText(String.valueOf(kw));

                    sothu1 = 0.0f;
                    sothu2 = 0.0f;

                } else if (toantu == "*") {
                    sothu2 = Float.parseFloat(binding.txtcal.getText().toString());
                    binding.txtcal.setText("");
                    kw = sothu1 * sothu2;
                    binding.txtcal.setText(String.valueOf(kw));
                    sothu1 = 0.0f;
                    sothu2 = 0.0f;
                } else if (toantu == "/") {
                    sothu2 = Float.parseFloat(binding.txtcal.getText().toString());
                    binding.txtcal.setText("");
                    kw = sothu1 / sothu2;
                    binding.txtcal.setText(String.valueOf(kw));
                    sothu1 = 0.0f;
                    sothu2 = 0.0f;
                }


            }
        });
        binding.buttonBinhphuong.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                sothu1 = Float.parseFloat(binding.txtcal.getText().toString());
                kw = sothu1 * sothu1;
                binding.txtcal.setText(String.valueOf(kw));
            }
        });
        binding.buttonLapphuong.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                sothu1 = Float.parseFloat(binding.txtcal.getText().toString());
                kw = sothu1 * sothu1 * sothu1;
                binding.txtcal.setText(String.valueOf(kw));

            }
        });
        binding.buttonCanbac2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                kw = (float) Math.sqrt(Double.parseDouble(binding.txtcal.getText().toString()));
                binding.txtcal.setText(String.valueOf(kw));

            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.my_menu, menu);
        return true;
    }

    public void save(MenuItem item) {
 savelasst();
    }
    public  void savelasst(){
        SharedPreferences.Editor editor =mPreferences.edit();
        editor.putString("lastvalue",binding.txtcal.getText().toString());
        editor.commit();
    }

//    public void save(View view) {
//        SharedPreferences sharedPreferences= getSharedPreferences("lastresult",MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putString("lastvalue",binding.txtcal.getText().toString());
//        editor.commit();
//    }
}
