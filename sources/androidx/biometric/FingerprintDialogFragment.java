package androidx.biometric;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.Observer;

public class FingerprintDialogFragment extends DialogFragment {
    public final Handler R0 = new Handler(Looper.getMainLooper());
    public final Runnable S0 = new Runnable() {
        public void run() {
            FingerprintDialogFragment.this.p2();
        }
    };
    public BiometricViewModel T0;
    public int U0;
    public int V0;
    public ImageView W0;
    public TextView X0;

    public static class Api21Impl {
        public static void a(Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }

    public static class Api26Impl {
        public static int a() {
            return R.attr.f320z;
        }
    }

    private void k2() {
        BiometricViewModel f2 = BiometricPrompt.f(this, n2());
        this.T0 = f2;
        f2.v().i(this, new Observer<Integer>() {
            /* renamed from: b */
            public void a(Integer num) {
                FingerprintDialogFragment fingerprintDialogFragment = FingerprintDialogFragment.this;
                fingerprintDialogFragment.R0.removeCallbacks(fingerprintDialogFragment.S0);
                FingerprintDialogFragment.this.r2(num.intValue());
                FingerprintDialogFragment.this.s2(num.intValue());
                FingerprintDialogFragment fingerprintDialogFragment2 = FingerprintDialogFragment.this;
                fingerprintDialogFragment2.R0.postDelayed(fingerprintDialogFragment2.S0, 2000);
            }
        });
        this.T0.t().i(this, new Observer<CharSequence>() {
            /* renamed from: b */
            public void a(CharSequence charSequence) {
                FingerprintDialogFragment fingerprintDialogFragment = FingerprintDialogFragment.this;
                fingerprintDialogFragment.R0.removeCallbacks(fingerprintDialogFragment.S0);
                FingerprintDialogFragment.this.t2(charSequence);
                FingerprintDialogFragment fingerprintDialogFragment2 = FingerprintDialogFragment.this;
                fingerprintDialogFragment2.R0.postDelayed(fingerprintDialogFragment2.S0, 2000);
            }
        });
    }

    private boolean n2() {
        return r().getBoolean("host_activity", true);
    }

    public static FingerprintDialogFragment o2(boolean z2) {
        FingerprintDialogFragment fingerprintDialogFragment = new FingerprintDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("host_activity", z2);
        fingerprintDialogFragment.H1(bundle);
        return fingerprintDialogFragment;
    }

    public void P0() {
        super.P0();
        this.R0.removeCallbacksAndMessages((Object) null);
    }

    public void U0() {
        super.U0();
        this.T0.h0(0);
        this.T0.i0(1);
        this.T0.g0(W(R.string.f1513c));
    }

    public Dialog d2(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(B1());
        builder.i(this.T0.E());
        View inflate = LayoutInflater.from(builder.b()).inflate(R.layout.f1510a, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.f1509d);
        if (textView != null) {
            CharSequence D = this.T0.D();
            if (TextUtils.isEmpty(D)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(D);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.f1506a);
        if (textView2 != null) {
            CharSequence s2 = this.T0.s();
            if (TextUtils.isEmpty(s2)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(s2);
            }
        }
        this.W0 = (ImageView) inflate.findViewById(R.id.f1508c);
        this.X0 = (TextView) inflate.findViewById(R.id.f1507b);
        builder.f(AuthenticatorUtils.d(this.T0.g()) ? W(R.string.f1511a) : this.T0.C(), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i2) {
                FingerprintDialogFragment.this.T0.l0(true);
            }
        });
        builder.j(inflate);
        AlertDialog a2 = builder.a();
        a2.setCanceledOnTouchOutside(false);
        return a2;
    }

    public final Drawable l2(int i2, int i3) {
        int i4;
        Context u2 = u();
        if (u2 == null) {
            Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            return null;
        }
        if (i2 == 0 && i3 == 1) {
            i4 = R.drawable.f1505b;
        } else if (i2 == 1 && i3 == 2) {
            i4 = R.drawable.f1504a;
        } else if (i2 == 2 && i3 == 1) {
            i4 = R.drawable.f1505b;
        } else if (i2 != 1 || i3 != 3) {
            return null;
        } else {
            i4 = R.drawable.f1505b;
        }
        return ContextCompat.e(u2, i4);
    }

    public final int m2(int i2) {
        Context u2 = u();
        if (u2 == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        u2.getTheme().resolveAttribute(i2, typedValue, true);
        TypedArray obtainStyledAttributes = u2.obtainStyledAttributes(typedValue.data, new int[]{i2});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.T0.e0(true);
    }

    public void p2() {
        Context u2 = u();
        if (u2 == null) {
            Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
            return;
        }
        this.T0.i0(1);
        this.T0.g0(u2.getString(R.string.f1513c));
    }

    public final boolean q2(int i2, int i3) {
        if (i2 == 0 && i3 == 1) {
            return false;
        }
        if (i2 == 1 && i3 == 2) {
            return true;
        }
        return i2 == 2 && i3 == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r0 = r3.T0.u();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void r2(int r4) {
        /*
            r3 = this;
            android.widget.ImageView r0 = r3.W0
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            androidx.biometric.BiometricViewModel r0 = r3.T0
            int r0 = r0.u()
            android.graphics.drawable.Drawable r1 = r3.l2(r0, r4)
            if (r1 != 0) goto L_0x0012
            return
        L_0x0012:
            android.widget.ImageView r2 = r3.W0
            r2.setImageDrawable(r1)
            boolean r0 = r3.q2(r0, r4)
            if (r0 == 0) goto L_0x0020
            androidx.biometric.FingerprintDialogFragment.Api21Impl.a(r1)
        L_0x0020:
            androidx.biometric.BiometricViewModel r0 = r3.T0
            r0.h0(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.FingerprintDialogFragment.r2(int):void");
    }

    public void s2(int i2) {
        TextView textView = this.X0;
        if (textView != null) {
            textView.setTextColor(i2 == 2 ? this.U0 : this.V0);
        }
    }

    public void t2(CharSequence charSequence) {
        TextView textView = this.X0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void z0(Bundle bundle) {
        super.z0(bundle);
        k2();
        this.U0 = m2(Api26Impl.a());
        this.V0 = m2(16842808);
    }
}
