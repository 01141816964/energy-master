package com.example.omar.energy4.ui;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.simplelist.MaterialSimpleListAdapter;
import com.afollestad.materialdialogs.simplelist.MaterialSimpleListItem;
import com.example.omar.energy4.R;


public class SettingUp2Activity extends AppCompatActivity {

    private String[] roomName = {
            "Bed Room", "Living Room","Office",
            "Kitchen", "Path Room" };
    private int[] roomImageId = {
            R.drawable.bed_512, R.drawable.armchair_512, R.drawable.office_512,
            R.drawable.refrigerator_512, R.drawable.pathroom_512};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_up2);
    }

    public void addRoom(View view) {

        final MaterialSimpleListAdapter adapter = new MaterialSimpleListAdapter(new MaterialSimpleListAdapter.Callback() {
            @Override
            public void onMaterialListItemSelected(MaterialDialog dialog, int index, MaterialSimpleListItem item) {
                Toast.makeText(getApplicationContext(), "You selected: " + item.getContent() , Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        adapter.add(new MaterialSimpleListItem.Builder(this)
                .content(roomName[0])
                .icon(roomImageId[0])
                .backgroundColor(Color.WHITE)
                .build());
        adapter.add(new MaterialSimpleListItem.Builder(this)
                .content(roomName[1])
                .icon(roomImageId[1])
                .backgroundColor(Color.WHITE)
                .build());
        adapter.add(new MaterialSimpleListItem.Builder(this)
                .content(roomName[2])
                .icon(roomImageId[2])
                .backgroundColor(Color.WHITE)
                .build());
        adapter.add(new MaterialSimpleListItem.Builder(this)
                .content(roomName[3])
                .icon(roomImageId[3])
                .backgroundColor(Color.WHITE)
                .build());
        adapter.add(new MaterialSimpleListItem.Builder(this)
                .content(roomName[4])
                .icon(roomImageId[4])
                .backgroundColor(Color.WHITE)
                .build());


        new MaterialDialog.Builder(this)
                .title("Select Room")
                .adapter(adapter, null)
                .show();
    }
}
