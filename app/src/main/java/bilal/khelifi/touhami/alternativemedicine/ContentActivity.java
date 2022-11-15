package bilal.khelifi.touhami.alternativemedicine;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Objects;


public class ContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);


        String title = getIntent().getStringExtra("title");
        String content = getIntent().getStringExtra("content");
        int img = getIntent().getIntExtra("img", 0);

        TextView title_tv = findViewById(R.id.titlec);
        TextView content_tv = findViewById(R.id.sub_item_contentc);
        ImageView img_v = findViewById(R.id.imageViewc);

        title_tv.setText(title);
        content_tv.setText(content);
        img_v.setImageResource(img);
    }
}