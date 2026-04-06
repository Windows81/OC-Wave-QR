package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

public class ErrorDialogFragment extends DialogFragment {

    /* renamed from: A  reason: collision with root package name */
    public DialogInterface.OnCancelListener f24379A;

    /* renamed from: B  reason: collision with root package name */
    public Dialog f24380B;

    /* renamed from: z  reason: collision with root package name */
    public Dialog f24381z;

    public static ErrorDialogFragment a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Dialog dialog2 = (Dialog) Preconditions.n(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        errorDialogFragment.f24381z = dialog2;
        if (onCancelListener != null) {
            errorDialogFragment.f24379A = onCancelListener;
        }
        return errorDialogFragment;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f24379A;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f24381z;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f24380B == null) {
            this.f24380B = new AlertDialog.Builder((Context) Preconditions.m(getActivity())).create();
        }
        return this.f24380B;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
