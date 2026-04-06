package androidx.compose.material3.internal;

import androidx.compose.runtime.Composer;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.internal.f  reason: case insensitive filesystem */
public final /* synthetic */ class C0133f implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f12433A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f12434B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f12435z;

    public /* synthetic */ C0133f(LifecycleOwner lifecycleOwner, Function1 function1, Function0 function0, int i2, int i3) {
        this.f12435z = lifecycleOwner;
        this.f12433A = function1;
        this.f12434B = function0;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return AccessibilityServiceStateProvider_androidKt.k(this.f12435z, this.f12433A, this.f12434B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
