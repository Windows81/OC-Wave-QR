package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

public final /* synthetic */ class X6 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f11803A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ List f11804B;
    public final /* synthetic */ Ref.IntRef C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f11805z;

    public /* synthetic */ X6(List list, List list2, List list3, Ref.IntRef intRef, int i2) {
        this.f11805z = list;
        this.f11803A = list2;
        this.f11804B = list3;
        this.C = intRef;
        this.D = i2;
    }

    public final Object invoke(Object obj) {
        return TabRowKt$TabRowImpl$1$2$1.d(this.f11805z, this.f11803A, this.f11804B, this.C, this.D, (Placeable.PlacementScope) obj);
    }
}
