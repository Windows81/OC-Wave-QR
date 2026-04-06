package androidx.core.provider;

import android.graphics.Typeface;
import androidx.core.provider.FontRequestWorker;
import androidx.core.provider.FontsContractCompat;
import java.util.concurrent.Executor;

class CallbackWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final FontsContractCompat.FontRequestCallback f19980a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f19981b;

    public CallbackWrapper(FontsContractCompat.FontRequestCallback fontRequestCallback, Executor executor) {
        this.f19980a = fontRequestCallback;
        this.f19981b = executor;
    }

    public final void a(final int i2) {
        final FontsContractCompat.FontRequestCallback fontRequestCallback = this.f19980a;
        this.f19981b.execute(new Runnable() {
            public void run() {
                fontRequestCallback.a(i2);
            }
        });
    }

    public void b(FontRequestWorker.TypefaceResult typefaceResult) {
        if (typefaceResult.a()) {
            c(typefaceResult.f20015a);
        } else {
            a(typefaceResult.f20016b);
        }
    }

    public final void c(final Typeface typeface) {
        final FontsContractCompat.FontRequestCallback fontRequestCallback = this.f19980a;
        this.f19981b.execute(new Runnable() {
            public void run() {
                fontRequestCallback.b(typeface);
            }
        });
    }
}
