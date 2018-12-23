package messagebox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.hasan.messagebox.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btMessageBox_Click(View view) {
        switch (view.getId()) {
            case R.id.btAdd:
                MessageBox.show(MainActivity.this, MessageBox.MODE.ADD, new btListener());
                break;
            case R.id.btDelete:
                MessageBox.show(MainActivity.this, MessageBox.MODE.DELETE, new btListener());
                break;
            case R.id.btUpdate:
                MessageBox.show(MainActivity.this, MessageBox.MODE.UPDATE, new btListener());
                break;
        }
    }

    class btListener implements MessageBox.IListener {

        @Override
        public void ok_Click() {
            //onaylandı
        }

        @Override
        public void cancel_Click() {
            //onaylanmadı
        }
    }

}