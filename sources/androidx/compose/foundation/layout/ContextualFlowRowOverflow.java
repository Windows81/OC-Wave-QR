package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FlowLayoutOverflow;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@Deprecated
public final class ContextualFlowRowOverflow extends FlowLayoutOverflow {

    /* renamed from: f  reason: collision with root package name */
    public static final Companion f3848f = new Companion((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final ContextualFlowRowOverflow f3849g = new ContextualFlowRowOverflow(FlowLayoutOverflow.OverflowType.Visible, 0, 0, (Function1) null, (Function1) null, 30, (DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public static final ContextualFlowRowOverflow f3850h = new ContextualFlowRowOverflow(FlowLayoutOverflow.OverflowType.Clip, 0, 0, (Function1) null, (Function1) null, 30, (DefaultConstructorMarker) null);

    @Metadata
    @Deprecated
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ContextualFlowRowOverflow a() {
            return ContextualFlowRowOverflow.f3850h;
        }

        public Companion() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContextualFlowRowOverflow(FlowLayoutOverflow.OverflowType overflowType, int i2, int i3, Function1 function1, Function1 function12, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(overflowType, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? null : function1, (i4 & 16) != 0 ? null : function12);
    }

    public ContextualFlowRowOverflow(FlowLayoutOverflow.OverflowType overflowType, int i2, int i3, Function1 function1, Function1 function12) {
        super(overflowType, i2, i3, function1, function12, (DefaultConstructorMarker) null);
    }
}
