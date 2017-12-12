package ng.adetech.bookie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        final EditText searchEditTxt = findViewById(R.id.searchEditTxt);
        Button searchBtn = findViewById(R.id.searchBtn);

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check if text field is empty else launch intent.
                if(TextUtils.isEmpty(searchEditTxt.getText())){
                    Toast.makeText(SearchActivity.this,R.string.text_field_empty,Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = BookListActivity.newIntent(SearchActivity.this, String.valueOf(searchEditTxt.getText()));
                    startActivity(intent);
                }

            }
        });
    }
}
