package com.example.gridview;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import androidx.appcompat.app.AlertDialog;

public class GridAd extends BaseAdapter {

    Context context;
    ImageView img;
    int[] image;

    public GridAd(Context context,int[] image) {
        this.context=context;
        this.image=image;
    }


    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null)
        {
            view = LayoutInflater.from(context).inflate(R.layout.img,null);
        }
        img=view.findViewById(R.id.imageView2);
        img.setImageResource(image[i]);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(view.getContext());
                alertDialogBuilder.setTitle("Clicked");
                int k=i+1;
                alertDialogBuilder.setMessage("You clicked the image"+k+".....");

                alertDialogBuilder.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        });
                alertDialogBuilder.setNegativeButton("Cancel",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        });
                alertDialogBuilder.show();

            }
        });


        return view;
    }
}