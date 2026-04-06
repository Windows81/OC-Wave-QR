package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.util.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class FragmentHostCallback<E> extends FragmentContainer {

    /* renamed from: A  reason: collision with root package name */
    public final Context f21598A;

    /* renamed from: B  reason: collision with root package name */
    public final Handler f21599B;
    public final int C;
    public final FragmentManager D;

    /* renamed from: z  reason: collision with root package name */
    public final Activity f21600z;

    public FragmentHostCallback(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
    }

    public void A() {
    }

    public View f(int i2) {
        return null;
    }

    public boolean h() {
        return true;
    }

    public Activity i() {
        return this.f21600z;
    }

    public Context l() {
        return this.f21598A;
    }

    public Handler m() {
        return this.f21599B;
    }

    public void n(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract Object r();

    public LayoutInflater t() {
        return LayoutInflater.from(this.f21598A);
    }

    public void w(Fragment fragment, Intent intent, int i2, Bundle bundle) {
        if (i2 == -1) {
            ContextCompat.m(this.f21598A, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    public FragmentHostCallback(Activity activity, Context context, Handler handler, int i2) {
        this.D = new FragmentManagerImpl();
        this.f21600z = activity;
        this.f21598A = (Context) Preconditions.g(context, "context == null");
        this.f21599B = (Handler) Preconditions.g(handler, "handler == null");
        this.C = i2;
    }
}
