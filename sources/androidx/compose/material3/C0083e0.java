package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* renamed from: androidx.compose.material3.e0  reason: case insensitive filesystem */
public final /* synthetic */ class C0083e0 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f12005A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f12006z;

    public /* synthetic */ C0083e0(Ref.IntRef intRef, List list) {
        this.f12006z = intRef;
        this.f12005A = list;
    }

    public final Object invoke(Object obj) {
        return CenteredContentMeasurePolicy.g(this.f12006z, this.f12005A, (Placeable.PlacementScope) obj);
    }
}
