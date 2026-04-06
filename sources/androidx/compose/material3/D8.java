package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.material3.WideNavigationRailKt$WideNavigationRailLayout$1;
import androidx.compose.runtime.State;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

public final /* synthetic */ class D8 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MeasureScope f9638A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f9639B;
    public final /* synthetic */ List C;
    public final /* synthetic */ Arrangement.Vertical D;
    public final /* synthetic */ State E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f9640z;

    public /* synthetic */ D8(int i2, MeasureScope measureScope, Ref.ObjectRef objectRef, List list, Arrangement.Vertical vertical, State state) {
        this.f9640z = i2;
        this.f9638A = measureScope;
        this.f9639B = objectRef;
        this.C = list;
        this.D = vertical;
        this.E = state;
    }

    public final Object invoke(Object obj) {
        return WideNavigationRailKt$WideNavigationRailLayout$1.AnonymousClass2.g(this.f9640z, this.f9638A, this.f9639B, this.C, this.D, this.E, (Placeable.PlacementScope) obj);
    }
}
