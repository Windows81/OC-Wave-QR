package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.l2  reason: case insensitive filesystem */
public final /* synthetic */ class C0174l2 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SingleRowTopAppBarOverrideScope f12503A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f12504B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DefaultSingleRowTopAppBarOverride f12505z;

    public /* synthetic */ C0174l2(DefaultSingleRowTopAppBarOverride defaultSingleRowTopAppBarOverride, SingleRowTopAppBarOverrideScope singleRowTopAppBarOverrideScope, int i2) {
        this.f12505z = defaultSingleRowTopAppBarOverride;
        this.f12503A = singleRowTopAppBarOverrideScope;
        this.f12504B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return DefaultSingleRowTopAppBarOverride.j(this.f12505z, this.f12503A, this.f12504B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
