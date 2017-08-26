package imastudio.rizki.com.firstproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //deklarasi widget
    EditText etUsername, etPassword;
    Button btnSubmit;
    TextView etHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = (EditText)findViewById(R.id.etUsername);
        etPassword = (EditText)findViewById(R.id.etPassword);
        btnSubmit = (Button)findViewById(R.id.btnSubmit);
        etHasil = (TextView)findViewById(R.id.etHasil);
        
        //aksi ketika di klik
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilaiNama = etUsername.getText().toString();
                String nilaiPassword = etPassword.getText().toString();

                //pengecekan nilai kosong
                if(nilaiNama.isEmpty()){
                    etUsername.setError("Nama harus di isi");

                }else if (nilaiPassword.isEmpty()){
                    etPassword.setError("Password harus di isi");
                }else{

                    //pindah activity baru
                    Intent a1 = new Intent(getApplicationContext(), SecondActvity.class);

                    //mengirim value ke activity selanjutnya
                    a1.putExtra("username", nilaiNama);
                    a1.putExtra("password", nilaiPassword);

                    startActivity(a1);

//                    //menampilkan nama dan password yang di input
//                    etHasil.setText("Username : " + nilaiNama + "  Password : " + nilaiPassword);

//                Toast.makeText(getApplicationContext(), "Username : " + nilaiNama + "pass : " + nilaiPassword,
//                        Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}
