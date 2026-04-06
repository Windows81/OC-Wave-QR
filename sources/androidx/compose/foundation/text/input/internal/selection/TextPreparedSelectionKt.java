package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata
public final class TextPreparedSelectionKt {

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6567a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                androidx.compose.foundation.text.input.internal.IndexTransformationType[] r0 = androidx.compose.foundation.text.input.internal.IndexTransformationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.text.input.internal.IndexTransformationType r1 = androidx.compose.foundation.text.input.internal.IndexTransformationType.Untransformed     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.text.input.internal.IndexTransformationType r1 = androidx.compose.foundation.text.input.internal.IndexTransformationType.Deletion     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.foundation.text.input.internal.IndexTransformationType r1 = androidx.compose.foundation.text.input.internal.IndexTransformationType.Replacement     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.foundation.text.input.internal.IndexTransformationType r1 = androidx.compose.foundation.text.input.internal.IndexTransformationType.Insertion     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f6567a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextPreparedSelectionKt.WhenMappings.<clinit>():void");
        }
    }

    public static final long a(int i2, int i3, TransformedTextFieldState transformedTextFieldState) {
        if (i2 == -1) {
            return CursorAndWedgeAffinity.c(i3);
        }
        boolean z2 = i2 > i3;
        long q2 = transformedTextFieldState.q(i2);
        long s2 = transformedTextFieldState.s(q2);
        int i4 = WhenMappings.f6567a[((!TextRange.h(q2) || !TextRange.h(s2)) ? (TextRange.h(q2) || TextRange.h(s2)) ? (!TextRange.h(q2) || TextRange.h(s2)) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion : IndexTransformationType.Replacement : IndexTransformationType.Untransformed).ordinal()];
        if (i4 == 1) {
            return CursorAndWedgeAffinity.d(i2, z2 ? WedgeAffinity.Start : WedgeAffinity.End);
        } else if (i4 == 2) {
            return CursorAndWedgeAffinity.c(i2);
        } else {
            if (i4 == 3) {
                return z2 ? CursorAndWedgeAffinity.d(TextRange.i(s2), WedgeAffinity.Start) : CursorAndWedgeAffinity.d(TextRange.n(s2), WedgeAffinity.End);
            }
            if (i4 == 4) {
                return z2 ? i2 == TextRange.n(s2) ? CursorAndWedgeAffinity.d(i2, WedgeAffinity.Start) : CursorAndWedgeAffinity.d(TextRange.i(s2), WedgeAffinity.End) : i2 == TextRange.i(s2) ? CursorAndWedgeAffinity.d(i2, WedgeAffinity.End) : CursorAndWedgeAffinity.d(TextRange.n(s2), WedgeAffinity.Start);
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
