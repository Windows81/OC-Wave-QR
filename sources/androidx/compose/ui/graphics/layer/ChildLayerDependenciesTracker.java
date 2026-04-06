package androidx.compose.ui.graphics.layer;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.ui.graphics.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ChildLayerDependenciesTracker {

    /* renamed from: a  reason: collision with root package name */
    public GraphicsLayer f16304a;

    /* renamed from: b  reason: collision with root package name */
    public GraphicsLayer f16305b;

    /* renamed from: c  reason: collision with root package name */
    public MutableScatterSet f16306c;

    /* renamed from: d  reason: collision with root package name */
    public MutableScatterSet f16307d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16308e;

    public final boolean i(GraphicsLayer graphicsLayer) {
        if (!this.f16308e) {
            InlineClassHelperKt.a("Only add dependencies during a tracking");
        }
        MutableScatterSet mutableScatterSet = this.f16306c;
        if (mutableScatterSet != null) {
            Intrinsics.f(mutableScatterSet);
            mutableScatterSet.h(graphicsLayer);
        } else if (this.f16304a != null) {
            MutableScatterSet a2 = ScatterSetKt.a();
            GraphicsLayer graphicsLayer2 = this.f16304a;
            Intrinsics.f(graphicsLayer2);
            a2.h(graphicsLayer2);
            a2.h(graphicsLayer);
            this.f16306c = a2;
            this.f16304a = null;
        } else {
            this.f16304a = graphicsLayer;
        }
        MutableScatterSet mutableScatterSet2 = this.f16307d;
        if (mutableScatterSet2 != null) {
            Intrinsics.f(mutableScatterSet2);
            return !mutableScatterSet2.y(graphicsLayer);
        } else if (this.f16305b != graphicsLayer) {
            return true;
        } else {
            this.f16305b = null;
            return false;
        }
    }
}
