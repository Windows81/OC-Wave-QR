package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;

public class DialogFragment extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler B0;
    public Runnable C0 = new Runnable() {
        public void run() {
            DialogFragment.this.E0.onDismiss(DialogFragment.this.M0);
        }
    };
    public DialogInterface.OnCancelListener D0 = new DialogInterface.OnCancelListener() {
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogFragment.this.M0 != null) {
                DialogFragment dialogFragment = DialogFragment.this;
                dialogFragment.onCancel(dialogFragment.M0);
            }
        }
    };
    public DialogInterface.OnDismissListener E0 = new DialogInterface.OnDismissListener() {
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogFragment.this.M0 != null) {
                DialogFragment dialogFragment = DialogFragment.this;
                dialogFragment.onDismiss(dialogFragment.M0);
            }
        }
    };
    public int F0 = 0;
    public int G0 = 0;
    public boolean H0 = true;
    public boolean I0 = true;
    public int J0 = -1;
    public boolean K0;
    public Observer L0 = new Observer<LifecycleOwner>() {
        /* renamed from: b */
        public void a(LifecycleOwner lifecycleOwner) {
            if (lifecycleOwner != null && DialogFragment.this.I0) {
                View C1 = DialogFragment.this.C1();
                if (C1.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (DialogFragment.this.M0 != null) {
                    if (FragmentManager.N0(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogFragment.this.M0);
                    }
                    DialogFragment.this.M0.setContentView(C1);
                }
            }
        }
    };
    public Dialog M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0 = false;

    public void G0() {
        super.G0();
        Dialog dialog = this.M0;
        if (dialog != null) {
            this.N0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.M0.dismiss();
            if (!this.O0) {
                onDismiss(this.M0);
            }
            this.M0 = null;
            this.Q0 = false;
        }
    }

    public void H0() {
        super.H0();
        if (!this.P0 && !this.O0) {
            this.O0 = true;
        }
        d0().n(this.L0);
    }

    public LayoutInflater I0(Bundle bundle) {
        LayoutInflater I02 = super.I0(bundle);
        if (!this.I0 || this.K0) {
            if (FragmentManager.N0(2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (!this.I0) {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                } else {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                }
            }
            return I02;
        }
        g2(bundle);
        if (FragmentManager.N0(2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.M0;
        return dialog != null ? I02.cloneInContext(dialog.getContext()) : I02;
    }

    public void V0(Bundle bundle) {
        super.V0(bundle);
        Dialog dialog = this.M0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i2 = this.F0;
        if (i2 != 0) {
            bundle.putInt("android:style", i2);
        }
        int i3 = this.G0;
        if (i3 != 0) {
            bundle.putInt("android:theme", i3);
        }
        boolean z2 = this.H0;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.I0;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i4 = this.J0;
        if (i4 != -1) {
            bundle.putInt("android:backStackId", i4);
        }
    }

    public void W0() {
        super.W0();
        Dialog dialog = this.M0;
        if (dialog != null) {
            this.N0 = false;
            dialog.show();
            View decorView = this.M0.getWindow().getDecorView();
            ViewTreeLifecycleOwner.b(decorView, this);
            ViewTreeViewModelStoreOwner.b(decorView, this);
            ViewTreeSavedStateRegistryOwner.b(decorView, this);
        }
    }

    public void X0() {
        super.X0();
        Dialog dialog = this.M0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void Z0(Bundle bundle) {
        Bundle bundle2;
        super.Z0(bundle);
        if (this.M0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.M0.onRestoreInstanceState(bundle2);
        }
    }

    public void a2() {
        b2(true, false, false);
    }

    public final void b2(boolean z2, boolean z3, boolean z4) {
        if (!this.O0) {
            this.O0 = true;
            this.P0 = false;
            Dialog dialog = this.M0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.M0.dismiss();
                if (!z3) {
                    if (Looper.myLooper() == this.B0.getLooper()) {
                        onDismiss(this.M0);
                    } else {
                        this.B0.post(this.C0);
                    }
                }
            }
            this.N0 = true;
            if (this.J0 >= 0) {
                if (z4) {
                    J().g1(this.J0, 1);
                } else {
                    J().e1(this.J0, 1, z2);
                }
                this.J0 = -1;
                return;
            }
            FragmentTransaction p2 = J().p();
            p2.r(true);
            p2.p(this);
            if (z4) {
                p2.j();
            } else if (z2) {
                p2.i();
            } else {
                p2.h();
            }
        }
    }

    public int c2() {
        return this.G0;
    }

    public Dialog d2(Bundle bundle) {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new ComponentDialog(B1(), c2());
    }

    public View e2(int i2) {
        Dialog dialog = this.M0;
        if (dialog != null) {
            return dialog.findViewById(i2);
        }
        return null;
    }

    public boolean f2() {
        return this.Q0;
    }

    public FragmentContainer g() {
        final FragmentContainer g2 = super.g();
        return new FragmentContainer() {
            public View f(int i2) {
                return g2.h() ? g2.f(i2) : DialogFragment.this.e2(i2);
            }

            public boolean h() {
                return g2.h() || DialogFragment.this.f2();
            }
        };
    }

    public void g1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.g1(layoutInflater, viewGroup, bundle);
        if (this.h0 == null && this.M0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.M0.onRestoreInstanceState(bundle2);
        }
    }

    public final void g2(Bundle bundle) {
        if (this.I0 && !this.Q0) {
            try {
                this.K0 = true;
                Dialog d2 = d2(bundle);
                this.M0 = d2;
                if (this.I0) {
                    i2(d2, this.F0);
                    Context u2 = u();
                    if (u2 instanceof Activity) {
                        this.M0.setOwnerActivity((Activity) u2);
                    }
                    this.M0.setCancelable(this.H0);
                    this.M0.setOnCancelListener(this.D0);
                    this.M0.setOnDismissListener(this.E0);
                    this.Q0 = true;
                } else {
                    this.M0 = null;
                }
            } finally {
                this.K0 = false;
            }
        }
    }

    public void h2(boolean z2) {
        this.I0 = z2;
    }

    public void i2(Dialog dialog, int i2) {
        if (!(i2 == 1 || i2 == 2)) {
            if (i2 == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void j2(FragmentManager fragmentManager, String str) {
        this.O0 = false;
        this.P0 = true;
        FragmentTransaction p2 = fragmentManager.p();
        p2.r(true);
        p2.e(this, str);
        p2.h();
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.N0) {
            if (FragmentManager.N0(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            b2(true, true, false);
        }
    }

    public void t0(Bundle bundle) {
        super.t0(bundle);
    }

    public void w0(Context context) {
        super.w0(context);
        d0().j(this.L0);
        if (!this.P0) {
            this.O0 = false;
        }
    }

    public void z0(Bundle bundle) {
        super.z0(bundle);
        this.B0 = new Handler();
        this.I0 = this.X == 0;
        if (bundle != null) {
            this.F0 = bundle.getInt("android:style", 0);
            this.G0 = bundle.getInt("android:theme", 0);
            this.H0 = bundle.getBoolean("android:cancelable", true);
            this.I0 = bundle.getBoolean("android:showsDialog", this.I0);
            this.J0 = bundle.getInt("android:backStackId", -1);
        }
    }
}
