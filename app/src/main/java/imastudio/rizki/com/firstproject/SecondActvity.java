package imastudio.rizki.com.firstproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActvity extends AppCompatActivity {


    TextView txtUsername, txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_actvity);

        txtUsername = (TextView)findViewById(R.id.txtUsername);
        txtPassword = (TextView)findViewById(R.id.txtPassword);

        //mengambil nilai dari activity sebelumnya
        Intent a1 = getIntent();

      String nilaiUser =   a1.getStringExtra("username");
      String nilaiPass =   a1.getStringExtra("password");

        //menampilkan ke textview
        txtUsername.setText("Username : " + nilaiUser);
        txtPassword.setText("Password : " + nilaiPass);

    }
}
