package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.x0  reason: case insensitive filesystem */
public final /* synthetic */ class C0280x0 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f14464A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CustomAppBarItem f14465z;

    public /* synthetic */ C0280x0(CustomAppBarItem customAppBarItem, int i2) {
        this.f14465z = customAppBarItem;
        this.f14464A = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return CustomAppBarItem.e(this.f14465z, this.f14464A, (Composer) obj, ((Integer) obj2).intValue());
    }
}
