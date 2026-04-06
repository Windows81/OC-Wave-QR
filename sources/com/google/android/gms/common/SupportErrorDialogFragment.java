package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.Preconditions;

public class SupportErrorDialogFragment extends DialogFragment {
    public Dialog R0;
    public DialogInterface.OnCancelListener S0;
    public Dialog T0;

    public static SupportErrorDialogFragment k2(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        Dialog dialog2 = (Dialog) Preconditions.n(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        supportErrorDialogFragment.R0 = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.S0 = onCancelListener;
        }
        return supportErrorDialogFragment;
    }

    public Dialog d2(Bundle bundle) {
        Dialog dialog = this.R0;
        if (dialog != null) {
            return dialog;
        }
        h2(false);
        if (this.T0 == null) {
            this.T0 = new AlertDialog.Builder((Context) Preconditions.m(u())).create();
        }
        return this.T0;
    }

    public void j2(FragmentManager fragmentManager, String str) {
        super.j2(fragmentManager, str);
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.S0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
