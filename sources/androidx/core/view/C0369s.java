package androidx.core.view;

import android.view.WindowInsetsController;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.core.view.s  reason: case insensitive filesystem */
public final /* synthetic */ class C0369s implements WindowInsetsController.OnControllableInsetsChangedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f20430a;

    public /* synthetic */ C0369s(AtomicBoolean atomicBoolean) {
        this.f20430a = atomicBoolean;
    }

    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i2) {
        SoftwareKeyboardControllerCompat.Impl30.f(this.f20430a, windowInsetsController, i2);
    }
}
