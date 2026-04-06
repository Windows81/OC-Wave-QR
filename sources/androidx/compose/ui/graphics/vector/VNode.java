package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public abstract class VNode {

    /* renamed from: a  reason: collision with root package name */
    public Function1 f16608a;

    public /* synthetic */ VNode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void a(DrawScope drawScope);

    public Function1 b() {
        return this.f16608a;
    }

    public final void c() {
        Function1 b2 = b();
        if (b2 != null) {
            b2.invoke(this);
        }
    }

    public void d(Function1 function1) {
        this.f16608a = function1;
    }

    public VNode() {
    }
}
