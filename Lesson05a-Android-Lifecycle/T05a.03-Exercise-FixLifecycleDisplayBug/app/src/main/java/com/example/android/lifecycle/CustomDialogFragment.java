package com.example.android.lifecycle;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by I855677 on 2/23/2018.
 */
public class CustomDialogFragment extends DialogFragment {
    /** The system calls this to get the DialogFragment's layout, regardless
     of whether it's being displayed as a dialog or an embedded fragment. */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout to use as dialog or embedded fragment
        return inflater.inflate(R.layout.dialog_fragment, container, false);
    }

    /** The system calls this only when creating the layout in a dialog. */
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // The only reason you might override this method when using onCreateView() is
        // to modify any dialog characteristics. For example, the dialog includes a
        // title by default, but your custom layout might not need it. So here you can
        // remove the dialog title, but you must call the superclass to get the Dialog.

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("1.You can go through the search field in the upper right corner. \n" +
                "When you start typing, you'll get a maximum of 10 possible search results. This search works fastest, but you'll have to know what the channel is called (see below for the naming convention within Cloud Services & Support).\n" +
                "2.The other option is to go to Channels in the sidebar.  \n" +
                "Now you can search for the channel with a few more options. Also, you can read the channels' short descriptions to make sure you have the right one.\n" +
                "1.You can go through the search field in the upper right corner. \n" +
                "When you start typing, you'll get a maximum of 10 possible search results. This search works fastest, but you'll have to know what the channel is called (see below for the naming convention within Cloud Services & Support).\n" +
                "2.The other option is to go to Channels in the sidebar.  \n" +
                "Now you can search for the channel with a few more options. Also, you can read the channels' short descriptions to make sure you have the right one.\n" +
                "\n" +
                "To join a channel, first you click on the channel. Then when you're in it you simply click Join Channel.\n" +
                "1.You can go through the search field in the upper right corner. \n" +
                "When you start typing, you'll get a maximum of 10 possible search results. This search works fastest, but you'll have to know what the channel is called (see below for the naming convention within Cloud Services & Support).\n" +
                "2.The other option is to go to Channels in the sidebar.  \n" +
                "Now you can search for the channel with a few more options. Also, you can read the channels' short descriptions to make sure you have the right one.\n" +
                "\n" +
                "To join a channel, first you click on the channel. Then when you're in it you simply click Join Channel.\n" +
                "1.You can go through the search field in the upper right corner. \n" +
                "When you start typing, you'll get a maximum of 10 possible search results. This search works fastest, but you'll have to know what the channel is called (see below for the naming convention within Cloud Services & Support).\n" +
                "2.The other option is to go to Channels in the sidebar.  \n" +
                "Now you can search for the channel with a few more options. Also, you can read the channels' short descriptions to make sure you have the right one.\n" +
                "\n" +
                "To join a channel, first you click on the channel. Then when you're in it you simply click Join Channel.\n" +
                "1.You can go through the search field in the upper right corner. \n" +
                "When you start typing, you'll get a maximum of 10 possible search results. This search works fastest, but you'll have to know what the channel is called (see below for the naming convention within Cloud Services & Support).\n" +
                "2.The other option is to go to Channels in the sidebar.  \n" +
                "Now you can search for the channel with a few more options. Also, you can read the channels' short descriptions to make sure you have the right one.\n" +
                "\n" +
                "To join a channel, first you click on the channel. Then when you're in it you simply click Join Channel.\n" +
                "1.You can go through the search field in the upper right corner. \n" +
                "When you start typing, you'll get a maximum of 10 possible search results. This search works fastest, but you'll have to know what the channel is called (see below for the naming convention within Cloud Services & Support).\n" +
                "2.The other option is to go to Channels in the sidebar.  \n" +
                "Now you can search for the channel with a few more options. Also, you can read the channels' short descriptions to make sure you have the right one.\n" +
                "\n" +
                "To join a channel, first you click on the channel. Then when you're in it you simply click Join Channel.\n")
        .setTitle("Jap ji Sahib")
        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User cancelled the dialog
            }
        });
//        Dialog dialog = super.onCreateDialog(savedInstanceState);
//        dialog.setCanceledOnTouchOutside(true);
        return builder.create();
    }
}