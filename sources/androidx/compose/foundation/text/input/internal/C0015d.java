package androidx.compose.foundation.text.input.internal;

import java.util.function.IntConsumer;

/* renamed from: androidx.compose.foundation.text.input.internal.d  reason: case insensitive filesystem */
public final /* synthetic */ class C0015d implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f6428A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ IntConsumer f6429z;

    public /* synthetic */ C0015d(IntConsumer intConsumer, int i2) {
        this.f6429z = intConsumer;
        this.f6428A = i2;
    }

    public final void run() {
        Api34PerformHandwritingGestureImpl.c(this.f6429z, this.f6428A);
    }
}
