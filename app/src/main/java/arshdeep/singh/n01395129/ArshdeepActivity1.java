package arshdeep.singh.n01395129;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ArshdeepActivity1 extends AppCompatActivity {

    EditText uNameEdt, passEdt;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uNameEdt = findViewById(R.id.edtUname);
        passEdt = findViewById(R.id.edtUpass);

        button = findViewById(R.id.btn1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uName = uNameEdt.getText().toString();
                String firstName = getResources().getString(R.string.firstName);


                if(uName.equalsIgnoreCase(firstName)){
                    // to second act
                    Toast.makeText(ArshdeepActivity1.this, "working", Toast.LENGTH_SHORT).show();
                }else{
                    createAlertDialog();
                }
                String pass = getResources().getString(R.string.stdId);
                if(passEdt.getText().toString() != pass){
                    passEdt.setError(getResources().getString(R.string.passEdtError));
                }
            }
        });


        uNameEdt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(count >= 1){
                    button.setEnabled(true);

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    private void createAlertDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.fox);
        builder.setTitle(getResources().getString(R.string.app_name));
        builder.setMessage(getResources().getString(R.string.dialogMsg));
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        builder.show();
    }
}