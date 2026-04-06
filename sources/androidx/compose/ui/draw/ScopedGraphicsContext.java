package androidx.compose.ui.draw;

import androidx.collection.MutableObjectList;
import androidx.collection.ObjectListKt;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;

@Metadata
final class ScopedGraphicsContext implements GraphicsContext {

    /* renamed from: a  reason: collision with root package name */
    public MutableObjectList f15717a;

    /* renamed from: b  reason: collision with root package name */
    public GraphicsContext f15718b;

    public void a(GraphicsLayer graphicsLayer) {
        GraphicsContext graphicsContext = this.f15718b;
        if (graphicsContext != null) {
            graphicsContext.a(graphicsLayer);
        }
    }

    public GraphicsLayer b() {
        GraphicsContext graphicsContext = this.f15718b;
        if (!(graphicsContext != null)) {
            InlineClassHelperKt.c("GraphicsContext not provided");
        }
        GraphicsLayer b2 = graphicsContext.b();
        MutableObjectList mutableObjectList = this.f15717a;
        if (mutableObjectList == null) {
            this.f15717a = ObjectListKt.g(b2);
        } else {
            mutableObjectList.n(b2);
        }
        return b2;
    }

    public final GraphicsContext c() {
        return this.f15718b;
    }

    public final void d() {
        MutableObjectList mutableObjectList = this.f15717a;
        if (mutableObjectList != null) {
            Object[] objArr = mutableObjectList.f1937a;
            int i2 = mutableObjectList.f1938b;
            for (int i3 = 0; i3 < i2; i3++) {
                a((GraphicsLayer) objArr[i3]);
            }
            mutableObjectList.t();
        }
    }

    public final void e(GraphicsContext graphicsContext) {
        d();
        this.f15718b = graphicsContext;
    }
}
