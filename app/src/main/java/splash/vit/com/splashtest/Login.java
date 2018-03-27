package splash.vit.com.splashtest;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by palash on 2/28/2015.
 */
public class Login extends ActionBarActivity {

    private EditText username;
    private EditText password;
    private Button login;
    private TextView loginLockedTv;
    private TextView attemptsLeftTv;
    private TextView numberOfRemainingLoginAttemptsTv;
    int numberOfRemainingLoginAttempts = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setUpVariables();

    }

    public void auth(View view){
        if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
            Toast.makeText(getApplicationContext(),"Hello Admin!!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(), "you're not an admin", Toast.LENGTH_SHORT).show();
            numberOfRemainingLoginAttempts--;
            attemptsLeftTv.setVisibility(View.VISIBLE);
            numberOfRemainingLoginAttemptsTv.setVisibility(View.VISIBLE);
            numberOfRemainingLoginAttemptsTv.setText(Integer.toString(numberOfRemainingLoginAttempts));
        }

        if (numberOfRemainingLoginAttempts == 0) {
            login.setEnabled(false);
            loginLockedTv.setVisibility(view.VISIBLE);
            loginLockedTv.setBackgroundColor(Color.RED);
            loginLockedTv.setText("login locked!!");
        }
    }

    private void setUpVariables(){
        username = (EditText) findViewById(R.id.editText1);
        password = (EditText) findViewById(R.id.editText2);
        login    = (Button)   findViewById(R.id.button);
        loginLockedTv = (TextView) findViewById(R.id.loginLockedTV);
        attemptsLeftTv = (TextView) findViewById(R.id.attemptsLeftTV);
        numberOfRemainingLoginAttemptsTv = (TextView) findViewById(R.id.numberOfRemainingLoginAttemptsTV);
        numberOfRemainingLoginAttemptsTv.setText(Integer.toString(numberOfRemainingLoginAttempts));
    }

}
