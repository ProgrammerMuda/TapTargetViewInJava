package autocomplete.so.id.taptargetpromptinjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.getkeepsafe.taptargetview.TapTarget;
import com.getkeepsafe.taptargetview.TapTargetView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TapTargetView.showFor(this, TapTarget.forView(findViewById(R.id.button), "Tombol ini adalah target silahkan klik ini")
        .tintTarget(false)
        .outerCircleColor(R.color.colorAccent));


    }
}
