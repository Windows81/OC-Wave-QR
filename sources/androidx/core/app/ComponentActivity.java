package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.KeyEventDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class ComponentActivity extends Activity implements LifecycleOwner, KeyEventDispatcher.Component {

    /* renamed from: A  reason: collision with root package name */
    public final LifecycleRegistry f19486A = new LifecycleRegistry(this);

    /* renamed from: z  reason: collision with root package name */
    public final SimpleArrayMap f19487z = new SimpleArrayMap(0, 1, (DefaultConstructorMarker) null);

    @Metadata
    @Deprecated
    public static class ExtraData {
    }

    public final boolean A(String[] strArr) {
        return !B(strArr);
    }

    public final boolean B(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        String str = strArr[0];
        switch (str.hashCode()) {
            case -645125871:
                return str.equals("--translation") && Build.VERSION.SDK_INT >= 31;
            case 100470631:
                if (!str.equals("--dump-dumpable")) {
                    return false;
                }
                break;
            case 472614934:
                if (!str.equals("--list-dumpables")) {
                    return false;
                }
                break;
            case 1159329357:
                return str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29;
            case 1455016274:
                return str.equals("--autofill");
            default:
                return false;
        }
        return Build.VERSION.SDK_INT >= 33;
    }

    public Lifecycle a() {
        return this.f19486A;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Intrinsics.i(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        Intrinsics.h(decorView, "window.decorView");
        if (KeyEventDispatcher.d(decorView, keyEvent)) {
            return true;
        }
        return KeyEventDispatcher.e(this, decorView, this, keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        Intrinsics.i(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        Intrinsics.h(decorView, "window.decorView");
        if (KeyEventDispatcher.d(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReportFragment.f21958A.c(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        Intrinsics.i(bundle, "outState");
        this.f19486A.n(Lifecycle.State.CREATED);
        super.onSaveInstanceState(bundle);
    }

    public boolean w(KeyEvent keyEvent) {
        Intrinsics.i(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }
}
