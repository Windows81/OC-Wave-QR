package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class ComponentDialog extends Dialog implements LifecycleOwner, OnBackPressedDispatcherOwner, SavedStateRegistryOwner {

    /* renamed from: A  reason: collision with root package name */
    public final SavedStateRegistryController f55A;

    /* renamed from: B  reason: collision with root package name */
    public final OnBackPressedDispatcher f56B;

    /* renamed from: z  reason: collision with root package name */
    public LifecycleRegistry f57z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComponentDialog(Context context, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? 0 : i2);
    }

    public static final void f(ComponentDialog componentDialog) {
        super.onBackPressed();
    }

    public Lifecycle a() {
        return d();
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.i(view, "view");
        e();
        super.addContentView(view, layoutParams);
    }

    public final OnBackPressedDispatcher c() {
        return this.f56B;
    }

    public final LifecycleRegistry d() {
        LifecycleRegistry lifecycleRegistry = this.f57z;
        if (lifecycleRegistry != null) {
            return lifecycleRegistry;
        }
        LifecycleRegistry lifecycleRegistry2 = new LifecycleRegistry(this);
        this.f57z = lifecycleRegistry2;
        return lifecycleRegistry2;
    }

    public void e() {
        Window window = getWindow();
        Intrinsics.f(window);
        View decorView = window.getDecorView();
        Intrinsics.h(decorView, "window!!.decorView");
        ViewTreeLifecycleOwner.b(decorView, this);
        Window window2 = getWindow();
        Intrinsics.f(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.h(decorView2, "window!!.decorView");
        ViewTreeOnBackPressedDispatcherOwner.b(decorView2, this);
        Window window3 = getWindow();
        Intrinsics.f(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.h(decorView3, "window!!.decorView");
        ViewTreeSavedStateRegistryOwner.b(decorView3, this);
    }

    public void onBackPressed() {
        this.f56B.l();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f56B;
            OnBackInvokedDispatcher a2 = getOnBackInvokedDispatcher();
            Intrinsics.h(a2, "onBackInvokedDispatcher");
            onBackPressedDispatcher.o(a2);
        }
        this.f55A.d(bundle);
        d().i(Lifecycle.Event.ON_CREATE);
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.h(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f55A.e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    public void onStart() {
        super.onStart();
        d().i(Lifecycle.Event.ON_RESUME);
    }

    public void onStop() {
        d().i(Lifecycle.Event.ON_DESTROY);
        this.f57z = null;
        super.onStop();
    }

    public void setContentView(int i2) {
        e();
        super.setContentView(i2);
    }

    public SavedStateRegistry v() {
        return this.f55A.b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComponentDialog(Context context, int i2) {
        super(context, i2);
        Intrinsics.i(context, "context");
        this.f55A = SavedStateRegistryController.f22826c.b(this);
        this.f56B = new OnBackPressedDispatcher(new m(this));
    }

    public void setContentView(View view) {
        Intrinsics.i(view, "view");
        e();
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.i(view, "view");
        e();
        super.setContentView(view, layoutParams);
    }
}
