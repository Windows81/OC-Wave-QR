package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.R;
import androidx.appcompat.app.AlertController;

public class AlertDialog extends AppCompatDialog implements DialogInterface {
    public final AlertController E = new AlertController(getContext(), this, getWindow());

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final AlertController.AlertParams f567a;

        /* renamed from: b  reason: collision with root package name */
        public final int f568b;

        public Builder(Context context) {
            this(context, AlertDialog.n(context, 0));
        }

        public AlertDialog a() {
            AlertDialog alertDialog = new AlertDialog(this.f567a.f528a, this.f568b);
            this.f567a.a(alertDialog.E);
            alertDialog.setCancelable(this.f567a.f545r);
            if (this.f567a.f545r) {
                alertDialog.setCanceledOnTouchOutside(true);
            }
            alertDialog.setOnCancelListener(this.f567a.f546s);
            alertDialog.setOnDismissListener(this.f567a.f547t);
            DialogInterface.OnKeyListener onKeyListener = this.f567a.f548u;
            if (onKeyListener != null) {
                alertDialog.setOnKeyListener(onKeyListener);
            }
            return alertDialog;
        }

        public Context b() {
            return this.f567a.f528a;
        }

        public Builder c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f567a;
            alertParams.f550w = listAdapter;
            alertParams.f551x = onClickListener;
            return this;
        }

        public Builder d(View view) {
            this.f567a.f534g = view;
            return this;
        }

        public Builder e(Drawable drawable) {
            this.f567a.f531d = drawable;
            return this;
        }

        public Builder f(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f567a;
            alertParams.f539l = charSequence;
            alertParams.f541n = onClickListener;
            return this;
        }

        public Builder g(DialogInterface.OnKeyListener onKeyListener) {
            this.f567a.f548u = onKeyListener;
            return this;
        }

        public Builder h(ListAdapter listAdapter, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f567a;
            alertParams.f550w = listAdapter;
            alertParams.f551x = onClickListener;
            alertParams.I = i2;
            alertParams.H = true;
            return this;
        }

        public Builder i(CharSequence charSequence) {
            this.f567a.f533f = charSequence;
            return this;
        }

        public Builder j(View view) {
            AlertController.AlertParams alertParams = this.f567a;
            alertParams.f553z = view;
            alertParams.f552y = 0;
            alertParams.E = false;
            return this;
        }

        public Builder(Context context, int i2) {
            this.f567a = new AlertController.AlertParams(new ContextThemeWrapper(context, AlertDialog.n(context, i2)));
            this.f568b = i2;
        }
    }

    public AlertDialog(Context context, int i2) {
        super(context, n(context, i2));
    }

    public static int n(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.f310p, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView m() {
        return this.E.d();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E.e();
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (this.E.g(i2, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (this.E.h(i2, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.E.q(charSequence);
    }
}
