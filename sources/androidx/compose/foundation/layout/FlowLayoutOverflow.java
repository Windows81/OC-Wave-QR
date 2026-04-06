package androidx.compose.foundation.layout;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@Deprecated
public abstract class FlowLayoutOverflow {

    /* renamed from: a  reason: collision with root package name */
    public final OverflowType f3958a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3959b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3960c;

    /* renamed from: d  reason: collision with root package name */
    public final Function1 f3961d;

    /* renamed from: e  reason: collision with root package name */
    public final Function1 f3962e;

    @Metadata
    public enum OverflowType {
        Visible,
        Clip,
        ExpandIndicator,
        ExpandOrCollapseIndicator;

        static {
            OverflowType[] d2;
            E = EnumEntriesKt.a(d2);
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3966a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType[] r0 = androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType r1 = androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType.ExpandIndicator     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType r1 = androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f3966a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutOverflow.WhenMappings.<clinit>():void");
        }
    }

    public /* synthetic */ FlowLayoutOverflow(OverflowType overflowType, int i2, int i3, Function1 function1, Function1 function12, DefaultConstructorMarker defaultConstructorMarker) {
        this(overflowType, i2, i3, function1, function12);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.compose.foundation.layout.FlowLayoutOverflowState r4, java.util.List r5) {
        /*
            r3 = this;
            kotlin.jvm.functions.Function1 r0 = r3.f3961d
            r1 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r0.invoke(r4)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            goto L_0x000d
        L_0x000c:
            r0 = r1
        L_0x000d:
            kotlin.jvm.functions.Function1 r2 = r3.f3962e
            if (r2 == 0) goto L_0x0018
            java.lang.Object r4 = r2.invoke(r4)
            r1 = r4
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
        L_0x0018:
            androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType r4 = r3.f3958a
            int[] r2 = androidx.compose.foundation.layout.FlowLayoutOverflow.WhenMappings.f3966a
            int r4 = r4.ordinal()
            r4 = r2[r4]
            r2 = 1
            if (r4 == r2) goto L_0x0034
            r2 = 2
            if (r4 == r2) goto L_0x0029
            goto L_0x0039
        L_0x0029:
            if (r0 == 0) goto L_0x002e
            r5.add(r0)
        L_0x002e:
            if (r1 == 0) goto L_0x0039
            r5.add(r1)
            goto L_0x0039
        L_0x0034:
            if (r0 == 0) goto L_0x0039
            r5.add(r0)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutOverflow.a(androidx.compose.foundation.layout.FlowLayoutOverflowState, java.util.List):void");
    }

    public final FlowLayoutOverflowState b() {
        return new FlowLayoutOverflowState(this.f3958a, this.f3959b, this.f3960c);
    }

    public FlowLayoutOverflow(OverflowType overflowType, int i2, int i3, Function1 function1, Function1 function12) {
        this.f3958a = overflowType;
        this.f3959b = i2;
        this.f3960c = i3;
        this.f3961d = function1;
        this.f3962e = function12;
    }
}
