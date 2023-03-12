package cat.dam.ivan.provesanimacio;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //variables per a les animacions
    ImageView iv_dilatation;
    Button btn_dilatation;

    //metode onCreate per inicialitzar el layout i les animacions
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init_animations();
    }

    //metode per inicialitzar les animacions
    private void init_animations() {
        anim_dilatation();
        anim_desapareixer();
    }

    //metode per a la animacio de dilatacio
    private void anim_dilatation() {
        Animation anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.dilatacio);
        iv_dilatation = (ImageView) findViewById(R.id.bttrack);
        btn_dilatation = (Button) findViewById(R.id.btStart);
        btn_dilatation.setOnClickListener(v -> {
            iv_dilatation.startAnimation(anim);
        });
    }

    //metode per a la animacio de desapareixer
    private void anim_desapareixer()
    {
        Animation anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.desapareixer);
        iv_dilatation = (ImageView) findViewById(R.id.bttrack);
        btn_dilatation = (Button) findViewById(R.id.btDesapareixer);
        btn_dilatation.setOnClickListener(v -> {
            iv_dilatation.startAnimation(anim);
        });
    }
}