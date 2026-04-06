package androidx.compose.material;

import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DrawerKt$BottomDrawer$1$1$2$1 extends Lambda implements Function1<IntSize, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f7716A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f7717B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BottomDrawerState f7718z;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7719a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.material.BottomDrawerValue[] r0 = androidx.compose.material.BottomDrawerValue.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material.BottomDrawerValue r1 = androidx.compose.material.BottomDrawerValue.Closed     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material.BottomDrawerValue r1 = androidx.compose.material.BottomDrawerValue.Open     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material.BottomDrawerValue r1 = androidx.compose.material.BottomDrawerValue.Expanded     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f7719a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt$BottomDrawer$1$1$2$1.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawer$1$1$2$1(BottomDrawerState bottomDrawerState, float f2, boolean z2) {
        super(1);
        this.f7718z = bottomDrawerState;
        this.f7716A = f2;
        this.f7717B = z2;
    }

    public final void b(long j2) {
        BottomDrawerValue bottomDrawerValue;
        DraggableAnchors a2 = AnchoredDraggableKt.a(new DrawerKt$BottomDrawer$1$1$2$1$newAnchors$1(this.f7716A, (float) IntSize.f(j2), this.f7717B));
        if (this.f7718z.c().o().e() <= 0 && a2.f(this.f7718z.d())) {
            bottomDrawerValue = this.f7718z.d();
        } else {
            int i2 = WhenMappings.f7719a[this.f7718z.f().ordinal()];
            if (i2 == 1) {
                bottomDrawerValue = BottomDrawerValue.Closed;
            } else if (i2 == 2 || i2 == 3) {
                bottomDrawerValue = BottomDrawerValue.Open;
                if (!a2.f(bottomDrawerValue)) {
                    bottomDrawerValue = BottomDrawerValue.Expanded;
                    if (!a2.f(bottomDrawerValue)) {
                        bottomDrawerValue = BottomDrawerValue.Closed;
                    }
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.f7718z.c().I(a2, bottomDrawerValue);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((IntSize) obj).j());
        return Unit.f40552a;
    }
}
