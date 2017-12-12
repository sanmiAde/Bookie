package ng.adetech.bookie;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class BookListActivity extends AppCompatActivity {

    private static final String URL_STRING_EXTRA = "com.android.ng.adetech.bookie.url_string_extra";

    /***
     * Creates a new intent that accepts a url string as an extra.
     * @param packageContext The activity starting the intent.
     * @param urlExra the string inputted by the user.
     * @return a new intent with urlExtra as an extra.
     */
    static Intent newIntent(Context packageContext, String urlExra) {
        Intent intent = new Intent(packageContext, BookListActivity.class);
        intent.putExtra(URL_STRING_EXTRA, urlExra);

        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);

        TextView urlStringExtra = findViewById(R.id.urlStringTxtExtra);

        urlStringExtra.setText(getUrlStringExtra());
    }

    String getUrlStringExtra(){
        Intent intent = getIntent();
        return intent.getStringExtra(URL_STRING_EXTRA);
    }
}
