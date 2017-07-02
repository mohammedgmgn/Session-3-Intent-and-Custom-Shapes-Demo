package android.support.session5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etName, etProfession;
    private TextView txvName, txvProfession;
    String Name,Profession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText) findViewById(R.id.etName);
        etProfession = (EditText) findViewById(R.id.etProfession);
        txvName = (TextView) findViewById(R.id.txvName);
        txvProfession = (TextView) findViewById(R.id.txvProfession);


    }

    public void showData(View view) {
        //Check for empty fields
        Name = etName.getText().toString();
        Profession = etProfession.getText().toString();


        if (Name.length()>0 &&Profession.length()>0) {
            txvName.setText(Name);
            txvProfession.setText(Profession);

        } else {
            Toast.makeText(MainActivity.this, "Complete Your Data Please ", Toast.LENGTH_SHORT).show();

        }

    }


    public void openSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("name", Name);
        intent.putExtra("profession", Profession);
        startActivity(intent);

        startActivity(intent);
    }

}
