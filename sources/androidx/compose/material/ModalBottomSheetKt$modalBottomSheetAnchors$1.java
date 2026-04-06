package androidx.compose.material;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ModalBottomSheetKt$modalBottomSheetAnchors$1 extends Lambda implements Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<ModalBottomSheetValue>, ? extends ModalBottomSheetValue>> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ModalBottomSheetState f8014z;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8015a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.material.ModalBottomSheetValue[] r0 = androidx.compose.material.ModalBottomSheetValue.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material.ModalBottomSheetValue r1 = androidx.compose.material.ModalBottomSheetValue.Hidden     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material.ModalBottomSheetValue r1 = androidx.compose.material.ModalBottomSheetValue.HalfExpanded     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material.ModalBottomSheetValue r1 = androidx.compose.material.ModalBottomSheetValue.Expanded     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f8015a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ModalBottomSheetKt$modalBottomSheetAnchors$1.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$modalBottomSheetAnchors$1(ModalBottomSheetState modalBottomSheetState) {
        super(2);
        this.f8014z = modalBottomSheetState;
    }

    public final Pair b(long j2, long j3) {
        DraggableAnchors a2 = AnchoredDraggableKt.a(new ModalBottomSheetKt$modalBottomSheetAnchors$1$newAnchors$1((float) Constraints.k(j3), this.f8014z, j2));
        boolean z2 = this.f8014z.d().o().e() > 0;
        ModalBottomSheetValue e2 = this.f8014z.e();
        if (z2 || !a2.f(e2)) {
            int i2 = WhenMappings.f8015a[this.f8014z.g().ordinal()];
            if (i2 == 1) {
                e2 = ModalBottomSheetValue.Hidden;
            } else if (i2 == 2 || i2 == 3) {
                ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.HalfExpanded;
                if (!a2.f(modalBottomSheetValue)) {
                    modalBottomSheetValue = ModalBottomSheetValue.Expanded;
                    if (!a2.f(modalBottomSheetValue)) {
                        modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                    }
                }
                e2 = modalBottomSheetValue;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return TuplesKt.a(a2, e2);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b(((IntSize) obj).j(), ((Constraints) obj2).r());
    }
}
