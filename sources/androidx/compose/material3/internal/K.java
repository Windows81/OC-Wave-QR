package androidx.compose.material3.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class K implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f12275A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DialogLayout f12276z;

    public /* synthetic */ K(DialogLayout dialogLayout, int i2) {
        this.f12276z = dialogLayout;
        this.f12275A = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return DialogLayout.m(this.f12276z, this.f12275A, (Composer) obj, ((Integer) obj2).intValue());
    }
}
