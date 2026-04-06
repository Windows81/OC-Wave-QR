package com.hansecom.abt.ui.components.abtButton;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AbtButtonKt$AbtButton$2 implements Function3<RowScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f37873A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Integer f37874B;
    public final /* synthetic */ AbtButtonIconPosition C;
    public final /* synthetic */ AbtButtonStyle D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AbtButtonState f37875z;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f37876a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.hansecom.abt.ui.components.abtButton.AbtButtonState[] r0 = com.hansecom.abt.ui.components.abtButton.AbtButtonState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.hansecom.abt.ui.components.abtButton.AbtButtonState r1 = com.hansecom.abt.ui.components.abtButton.AbtButtonState.Enabled     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.hansecom.abt.ui.components.abtButton.AbtButtonState r1 = com.hansecom.abt.ui.components.abtButton.AbtButtonState.Disabled     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.hansecom.abt.ui.components.abtButton.AbtButtonState r1 = com.hansecom.abt.ui.components.abtButton.AbtButtonState.Loading     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f37876a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.abtButton.AbtButtonKt$AbtButton$2.WhenMappings.<clinit>():void");
        }
    }

    public AbtButtonKt$AbtButton$2(AbtButtonState abtButtonState, String str, Integer num, AbtButtonIconPosition abtButtonIconPosition, AbtButtonStyle abtButtonStyle) {
        this.f37875z = abtButtonState;
        this.f37873A = str;
        this.f37874B = num;
        this.C = abtButtonIconPosition;
        this.D = abtButtonStyle;
    }

    public final void b(RowScope rowScope, Composer composer, int i2) {
        Intrinsics.i(rowScope, "$this$Button");
        if ((i2 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(607539339, i2, -1, "com.hansecom.abt.ui.components.abtButton.AbtButton.<anonymous> (AbtButton.kt:87)");
            }
            int i3 = WhenMappings.f37876a[this.f37875z.ordinal()];
            if (i3 == 1 || i3 == 2) {
                composer.X(448675472);
                AbtButtonKt.o(this.f37873A, this.f37874B, this.C, composer, 0);
                composer.M();
            } else if (i3 == 3) {
                composer.X(448681402);
                AbtButtonKt.q(this.D, composer, 0);
                composer.M();
            } else {
                composer.X(448672639);
                composer.M();
                throw new NoWhenBranchMatchedException();
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
