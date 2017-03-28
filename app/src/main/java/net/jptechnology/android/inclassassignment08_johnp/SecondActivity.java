package net.jptechnology.android.inclassassignment08_johnp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SecondActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference usersRef = database.getReference("users");

    private TextView usernameTextView;
    private TextView passwordTextView;
    private CheckBox checkBox;
    private TextView picUrlTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        usernameTextView = (TextView) findViewById(R.id.username);
        passwordTextView = (TextView) findViewById(R.id.password);
        picUrlTextView = (TextView) findViewById(R.id.pic_url_text);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
    }

    public void addFirebase(View view) {
        usersRef.push().setValue(new User(usernameTextView.getText().toString()
                , passwordTextView.getText().toString(), picUrlTextView.getText().toString(), checkBox.isChecked()));
        finish();
    }
}
