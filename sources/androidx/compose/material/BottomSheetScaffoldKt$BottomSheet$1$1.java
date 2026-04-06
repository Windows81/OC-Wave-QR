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
public final class BottomSheetScaffoldKt$BottomSheet$1$1 extends Lambda implements Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<BottomSheetValue>, ? extends BottomSheetValue>> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f7361A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BottomSheetState f7362z;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7363a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.material.BottomSheetValue[] r0 = androidx.compose.material.BottomSheetValue.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material.BottomSheetValue r1 = androidx.compose.material.BottomSheetValue.Collapsed     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material.BottomSheetValue r1 = androidx.compose.material.BottomSheetValue.Expanded     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f7363a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$1$1.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheet$1$1(BottomSheetState bottomSheetState, float f2) {
        super(2);
        this.f7362z = bottomSheetState;
        this.f7361A = f2;
    }

    public final Pair b(long j2, long j3) {
        BottomSheetValue bottomSheetValue;
        DraggableAnchors a2 = AnchoredDraggableKt.a(new BottomSheetScaffoldKt$BottomSheet$1$1$newAnchors$1(Constraints.k(j3), this.f7361A, (float) IntSize.f(j2)));
        int i2 = WhenMappings.f7363a[((BottomSheetValue) this.f7362z.c().x()).ordinal()];
        if (i2 == 1) {
            bottomSheetValue = BottomSheetValue.Collapsed;
        } else if (i2 == 2) {
            bottomSheetValue = BottomSheetValue.Expanded;
            if (!a2.f(bottomSheetValue)) {
                bottomSheetValue = BottomSheetValue.Collapsed;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return TuplesKt.a(a2, bottomSheetValue);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b(((IntSize) obj).j(), ((Constraints) obj2).r());
    }
}
