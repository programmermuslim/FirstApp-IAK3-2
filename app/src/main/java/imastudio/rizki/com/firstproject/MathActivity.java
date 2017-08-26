package imastudio.rizki.com.firstproject;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MathActivity extends AppCompatActivity {

    //deklarasi widget
    EditText etPanjang, etLebar;
    Button btnHitung;
    TextView txtLuas, txtKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        //memanggil method setupview
        setUpView();
        hitungLuasKeliling();

    }

    public void setUpView(){

        etPanjang = (EditText)findViewById(R.id.etPanjang);
        etLebar = (EditText)findViewById(R.id.etLebar);
        btnHitung = (Button)findViewById(R.id.btnHitung);
        txtLuas = (TextView)findViewById(R.id.txtLuas);
        txtKeliling = (TextView)findViewById(R.id.txtKeliling);

    }

    public void hitungLuasKeliling(){

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //mengambil nilai dari inputan
                String nilaiPanjang = etPanjang.getText().toString();
                String nilaiLebar = etLebar.getText().toString();

                //cek nilai kosong
                if (nilaiPanjang.isEmpty()){
                    etPanjang.setError("Panjang tidak boleh kosong");
                }else if(nilaiLebar.isEmpty()){
                    etLebar.setError("Lebar tidak boleh kosong");
                }else{

                    //convert nilai string ke int
                    Integer aPanjang = Integer.parseInt(nilaiPanjang);
                    Integer aLebar = Integer.parseInt(nilaiLebar);
                    //hitung keliling

                    Integer keliling = (2 * aPanjang) + (2 * aLebar);
                    Integer luas = aPanjang * aLebar;

                    //menampilkan nilai keliling dan luas
                    txtLuas.setText("Luas = " + luas);
                    txtKeliling.setText("Keliling = " + keliling);

                }

            }
        });



    }
}
