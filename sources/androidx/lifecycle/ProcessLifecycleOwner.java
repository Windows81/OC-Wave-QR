package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ReportFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ProcessLifecycleOwner implements LifecycleOwner {
    public static final Companion H = new Companion((DefaultConstructorMarker) null);
    public static final ProcessLifecycleOwner I = new ProcessLifecycleOwner();

    /* renamed from: A  reason: collision with root package name */
    public int f21948A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f21949B = true;
    public boolean C = true;
    public Handler D;
    public final LifecycleRegistry E = new LifecycleRegistry(this);
    public final Runnable F = new g(this);
    public final ReportFragment.ActivityInitializationListener G = new ProcessLifecycleOwner$initializationListener$1(this);

    /* renamed from: z  reason: collision with root package name */
    public int f21950z;

    @Metadata
    public static final class Api29Impl {

        /* renamed from: a  reason: collision with root package name */
        public static final Api29Impl f21951a = new Api29Impl();

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            Intrinsics.i(activity, "activity");
            Intrinsics.i(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LifecycleOwner a() {
            return ProcessLifecycleOwner.I;
        }

        public final void b(Context context) {
            Intrinsics.i(context, "context");
            ProcessLifecycleOwner.I.j(context);
        }

        public Companion() {
        }
    }

    public static final void k(ProcessLifecycleOwner processLifecycleOwner) {
        processLifecycleOwner.l();
        processLifecycleOwner.m();
    }

    public static final LifecycleOwner n() {
        return H.a();
    }

    public Lifecycle a() {
        return this.E;
    }

    public final void f() {
        int i2 = this.f21948A - 1;
        this.f21948A = i2;
        if (i2 == 0) {
            Handler handler = this.D;
            Intrinsics.f(handler);
            handler.postDelayed(this.F, 700);
        }
    }

    public final void g() {
        int i2 = this.f21948A + 1;
        this.f21948A = i2;
        if (i2 != 1) {
            return;
        }
        if (this.f21949B) {
            this.E.i(Lifecycle.Event.ON_RESUME);
            this.f21949B = false;
            return;
        }
        Handler handler = this.D;
        Intrinsics.f(handler);
        handler.removeCallbacks(this.F);
    }

    public final void h() {
        int i2 = this.f21950z + 1;
        this.f21950z = i2;
        if (i2 == 1 && this.C) {
            this.E.i(Lifecycle.Event.ON_START);
            this.C = false;
        }
    }

    public final void i() {
        this.f21950z--;
        m();
    }

    public final void j(Context context) {
        Intrinsics.i(context, "context");
        this.D = new Handler();
        this.E.i(Lifecycle.Event.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new ProcessLifecycleOwner$attach$1(this));
    }

    public final void l() {
        if (this.f21948A == 0) {
            this.f21949B = true;
            this.E.i(Lifecycle.Event.ON_PAUSE);
        }
    }

    public final void m() {
        if (this.f21950z == 0 && this.f21949B) {
            this.E.i(Lifecycle.Event.ON_STOP);
            this.C = true;
        }
    }
}
