package messagebox;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

import com.example.hasan.messagebox.R;

public class MessageBox {

    interface IListener {
        void ok_Click();

        void cancel_Click();
    }

    enum MODE {
        ADD,
        UPDATE,
        DELETE
    }

    public static void show(final Context context, MODE mode, final IListener iListener) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage("Are you sure?");
        builder.setCancelable(false);

        switch (mode) {
            case ADD:
                builder.setTitle("ADD");
                builder.setIcon(R.drawable.custom_ic_add);
                break;
            case DELETE:
                builder.setTitle("DELETE");
                builder.setIcon(R.drawable.custom_ic_delete);
                break;
            case UPDATE:
                builder.setTitle("UPDATE");
                builder.setIcon(R.drawable.custom_ic_update);
                break;
        }

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                iListener.ok_Click();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                iListener.cancel_Click();
            }
        });
        builder.show();
    }
}
