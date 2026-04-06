package androidx.activity;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ComponentActivity$onBackPressedDispatcher$2 extends Lambda implements Function0<OnBackPressedDispatcher> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f54z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComponentActivity$onBackPressedDispatcher$2(ComponentActivity componentActivity) {
        super(0);
        this.f54z = componentActivity;
    }

    public static final void f(ComponentActivity componentActivity) {
        try {
            ComponentActivity$onBackPressedDispatcher$2.super.onBackPressed();
        } catch (IllegalStateException e2) {
            if (!Intrinsics.d(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e2;
            }
        } catch (NullPointerException e3) {
            if (!Intrinsics.d(e3.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e3;
            }
        }
    }

    public static final void g(ComponentActivity componentActivity, OnBackPressedDispatcher onBackPressedDispatcher) {
        componentActivity.Q(onBackPressedDispatcher);
    }

    /* renamed from: e */
    public final OnBackPressedDispatcher invoke() {
        OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(new j(this.f54z));
        ComponentActivity componentActivity = this.f54z;
        if (Build.VERSION.SDK_INT >= 33) {
            if (!Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new k(componentActivity, onBackPressedDispatcher));
            } else {
                componentActivity.Q(onBackPressedDispatcher);
            }
        }
        return onBackPressedDispatcher;
    }
}
