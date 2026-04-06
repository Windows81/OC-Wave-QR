package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedCallback;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ChannelResult;

@Metadata
final class PredictiveBackHandlerCallback extends OnBackPressedCallback {

    /* renamed from: d  reason: collision with root package name */
    public CoroutineScope f162d;

    /* renamed from: e  reason: collision with root package name */
    public Function2 f163e;

    /* renamed from: f  reason: collision with root package name */
    public OnBackInstance f164f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f165g;

    public PredictiveBackHandlerCallback(boolean z2, CoroutineScope coroutineScope, Function2 function2) {
        super(z2);
        this.f162d = coroutineScope;
        this.f163e = function2;
    }

    public void c() {
        super.c();
        OnBackInstance onBackInstance = this.f164f;
        if (onBackInstance != null) {
            onBackInstance.a();
        }
        OnBackInstance onBackInstance2 = this.f164f;
        if (onBackInstance2 != null) {
            onBackInstance2.f(false);
        }
        this.f165g = false;
    }

    public void d() {
        OnBackInstance onBackInstance = this.f164f;
        if (onBackInstance != null && !onBackInstance.d()) {
            onBackInstance.a();
            this.f164f = null;
        }
        if (this.f164f == null) {
            this.f164f = new OnBackInstance(this.f162d, false, this.f163e, this);
        }
        OnBackInstance onBackInstance2 = this.f164f;
        if (onBackInstance2 != null) {
            onBackInstance2.b();
        }
        OnBackInstance onBackInstance3 = this.f164f;
        if (onBackInstance3 != null) {
            onBackInstance3.f(false);
        }
        this.f165g = false;
    }

    public void e(BackEventCompat backEventCompat) {
        super.e(backEventCompat);
        OnBackInstance onBackInstance = this.f164f;
        if (onBackInstance != null) {
            ChannelResult.b(onBackInstance.e(backEventCompat));
        }
    }

    public void f(BackEventCompat backEventCompat) {
        super.f(backEventCompat);
        OnBackInstance onBackInstance = this.f164f;
        if (onBackInstance != null) {
            onBackInstance.a();
        }
        if (g()) {
            this.f164f = new OnBackInstance(this.f162d, true, this.f163e, this);
        }
        this.f165g = true;
    }

    public final void l(Function2 function2) {
        this.f163e = function2;
    }

    public final void m(boolean z2) {
        OnBackInstance onBackInstance;
        if (!z2 && !this.f165g && g() && (onBackInstance = this.f164f) != null) {
            onBackInstance.a();
        }
        j(z2);
    }

    public final void n(CoroutineScope coroutineScope) {
        this.f162d = coroutineScope;
    }
}
