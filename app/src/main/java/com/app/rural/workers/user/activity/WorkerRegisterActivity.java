package com.app.rural.workers.user.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.CheckBox;

import com.app.rural.workers.user.R;

public class WorkerRegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_register);

        CheckBox simpleCheckBox = (CheckBox) findViewById(R.id.worker_confirm_checkBox);

        simpleCheckBox.setText(Html.fromHtml(getResources().getString(R.string.worker_agree_text)));


//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                // Initialize alert dialog
//                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//
//                // set title
//                builder.setTitle("Select Language");
//
//                // set dialog non cancelable
//                builder.setCancelable(false);
//
//                builder.setMultiChoiceItems(langArray, selectedLanguage, new DialogInterface.OnMultiChoiceClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i, boolean b) {
//                        // check condition
//                        if (b) {
//                            // when checkbox selected
//                            // Add position  in lang list
//                            langList.add(i);
//                            // Sort array list
//                            Collections.sort(langList);
//                        } else {
//                            // when checkbox unselected
//                            // Remove position from langList
//                            langList.remove(Integer.valueOf(i));
//                        }
//                    }
//                });
//
//                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        // Initialize string builder
//                        StringBuilder stringBuilder = new StringBuilder();
//                        // use for loop
//                        for (int j = 0; j < langList.size(); j++) {
//                            // concat array value
//                            stringBuilder.append(langArray[langList.get(j)]);
//                            // check condition
//                            if (j != langList.size() - 1) {
//                                // When j value  not equal
//                                // to lang list size - 1
//                                // add comma
//                                stringBuilder.append(", ");
//                            }
//                        }
//                        // set text on textView
//                        textView.setText(stringBuilder.toString());
//                    }
//                });
//
//                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        // dismiss dialog
//                        dialogInterface.dismiss();
//                    }
//                });
//                builder.setNeutralButton("Clear All", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        // use for loop
//                        for (int j = 0; j < selectedLanguage.length; j++) {
//                            // remove all selection
//                            selectedLanguage[j] = false;
//                            // clear language list
//                            langList.clear();
//                            // clear text view value
//                            textView.setText("");
//                        }
//                    }
//                });
//                // show dialog
//                builder.show();
//            }
//        });
    }
}