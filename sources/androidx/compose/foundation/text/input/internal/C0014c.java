package androidx.compose.foundation.text.input.internal;

import java.util.function.IntConsumer;

/* renamed from: androidx.compose.foundation.text.input.internal.c  reason: case insensitive filesystem */
public final /* synthetic */ class C0014c implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f6426A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ IntConsumer f6427z;

    public /* synthetic */ C0014c(IntConsumer intConsumer, int i2) {
        this.f6427z = intConsumer;
        this.f6426A = i2;
    }

    public final void run() {
        Api34LegacyPerformHandwritingGestureImpl.c(this.f6427z, this.f6426A);
    }
}
