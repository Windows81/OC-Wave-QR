package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FlowLayoutOverflow;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@Deprecated
public final class FlowColumnOverflow extends FlowLayoutOverflow {

    /* renamed from: f  reason: collision with root package name */
    public static final Companion f3904f = new Companion((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final FlowColumnOverflow f3905g = new FlowColumnOverflow(FlowLayoutOverflow.OverflowType.Visible, 0, 0, (Function1) null, (Function1) null, 30, (DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public static final FlowColumnOverflow f3906h = new FlowColumnOverflow(FlowLayoutOverflow.OverflowType.Clip, 0, 0, (Function1) null, (Function1) null, 30, (DefaultConstructorMarker) null);

    @Metadata
    @Deprecated
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FlowColumnOverflow a() {
            return FlowColumnOverflow.f3906h;
        }

        public Companion() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowColumnOverflow(FlowLayoutOverflow.OverflowType overflowType, int i2, int i3, Function1 function1, Function1 function12, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(overflowType, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? null : function1, (i4 & 16) != 0 ? null : function12);
    }

    public FlowColumnOverflow(FlowLayoutOverflow.OverflowType overflowType, int i2, int i3, Function1 function1, Function1 function12) {
        super(overflowType, i2, i3, function1, function12, (DefaultConstructorMarker) null);
    }
}
