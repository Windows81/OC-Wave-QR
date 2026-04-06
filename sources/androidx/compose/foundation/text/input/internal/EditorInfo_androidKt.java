package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.input.ImeOptions;
import kotlin.Metadata;

@Metadata
public final class EditorInfo_androidKt {
    public static final boolean a(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(android.view.inputmethod.EditorInfo r8, java.lang.CharSequence r9, long r10, androidx.compose.ui.text.input.ImeOptions r12, java.lang.String[] r13) {
        /*
            int r0 = r12.e()
            androidx.compose.ui.text.input.ImeAction$Companion r1 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r2 = r1.a()
            boolean r2 = androidx.compose.ui.text.input.ImeAction.m(r0, r2)
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 6
            r7 = 1
            if (r2 == 0) goto L_0x001e
            boolean r0 = r12.h()
            if (r0 == 0) goto L_0x001c
            goto L_0x0070
        L_0x001c:
            r6 = r5
            goto L_0x0070
        L_0x001e:
            int r2 = r1.e()
            boolean r2 = androidx.compose.ui.text.input.ImeAction.m(r0, r2)
            if (r2 == 0) goto L_0x002a
            r6 = r7
            goto L_0x0070
        L_0x002a:
            int r2 = r1.c()
            boolean r2 = androidx.compose.ui.text.input.ImeAction.m(r0, r2)
            if (r2 == 0) goto L_0x0036
            r6 = r4
            goto L_0x0070
        L_0x0036:
            int r2 = r1.d()
            boolean r2 = androidx.compose.ui.text.input.ImeAction.m(r0, r2)
            if (r2 == 0) goto L_0x0042
            r6 = 5
            goto L_0x0070
        L_0x0042:
            int r2 = r1.f()
            boolean r2 = androidx.compose.ui.text.input.ImeAction.m(r0, r2)
            if (r2 == 0) goto L_0x004e
            r6 = 7
            goto L_0x0070
        L_0x004e:
            int r2 = r1.g()
            boolean r2 = androidx.compose.ui.text.input.ImeAction.m(r0, r2)
            if (r2 == 0) goto L_0x005a
            r6 = r3
            goto L_0x0070
        L_0x005a:
            int r2 = r1.h()
            boolean r2 = androidx.compose.ui.text.input.ImeAction.m(r0, r2)
            if (r2 == 0) goto L_0x0066
            r6 = 4
            goto L_0x0070
        L_0x0066:
            int r2 = r1.b()
            boolean r0 = androidx.compose.ui.text.input.ImeAction.m(r0, r2)
            if (r0 == 0) goto L_0x01d1
        L_0x0070:
            r8.imeOptions = r6
            androidx.compose.ui.text.input.PlatformImeOptions r0 = r12.g()
            if (r0 == 0) goto L_0x0080
            java.lang.String r0 = r0.a()
            if (r0 == 0) goto L_0x0080
            r8.privateImeOptions = r0
        L_0x0080:
            androidx.compose.foundation.text.input.internal.LocaleListHelper r0 = androidx.compose.foundation.text.input.internal.LocaleListHelper.f6257a
            androidx.compose.ui.text.intl.LocaleList r2 = r12.d()
            r0.a(r8, r2)
            int r0 = r12.f()
            androidx.compose.ui.text.input.KeyboardType$Companion r2 = androidx.compose.ui.text.input.KeyboardType.f18852b
            int r6 = r2.h()
            boolean r6 = androidx.compose.ui.text.input.KeyboardType.n(r0, r6)
            if (r6 == 0) goto L_0x009c
        L_0x0099:
            r3 = r7
            goto L_0x0105
        L_0x009c:
            int r6 = r2.a()
            boolean r6 = androidx.compose.ui.text.input.KeyboardType.n(r0, r6)
            if (r6 == 0) goto L_0x00ae
            int r0 = r8.imeOptions
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r3
            r8.imeOptions = r0
            goto L_0x0099
        L_0x00ae:
            int r6 = r2.d()
            boolean r6 = androidx.compose.ui.text.input.KeyboardType.n(r0, r6)
            if (r6 == 0) goto L_0x00ba
            r3 = r4
            goto L_0x0105
        L_0x00ba:
            int r4 = r2.g()
            boolean r4 = androidx.compose.ui.text.input.KeyboardType.n(r0, r4)
            if (r4 == 0) goto L_0x00c5
            goto L_0x0105
        L_0x00c5:
            int r3 = r2.j()
            boolean r3 = androidx.compose.ui.text.input.KeyboardType.n(r0, r3)
            if (r3 == 0) goto L_0x00d2
            r3 = 17
            goto L_0x0105
        L_0x00d2:
            int r3 = r2.c()
            boolean r3 = androidx.compose.ui.text.input.KeyboardType.n(r0, r3)
            if (r3 == 0) goto L_0x00df
            r3 = 33
            goto L_0x0105
        L_0x00df:
            int r3 = r2.f()
            boolean r3 = androidx.compose.ui.text.input.KeyboardType.n(r0, r3)
            if (r3 == 0) goto L_0x00ec
            r3 = 129(0x81, float:1.81E-43)
            goto L_0x0105
        L_0x00ec:
            int r3 = r2.e()
            boolean r3 = androidx.compose.ui.text.input.KeyboardType.n(r0, r3)
            if (r3 == 0) goto L_0x00f9
            r3 = 18
            goto L_0x0105
        L_0x00f9:
            int r3 = r2.b()
            boolean r0 = androidx.compose.ui.text.input.KeyboardType.n(r0, r3)
            if (r0 == 0) goto L_0x01c9
            r3 = 8194(0x2002, float:1.1482E-41)
        L_0x0105:
            r8.inputType = r3
            boolean r0 = r12.h()
            if (r0 != 0) goto L_0x0131
            int r0 = r8.inputType
            boolean r0 = a(r0, r7)
            if (r0 == 0) goto L_0x0131
            int r0 = r8.inputType
            r3 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 | r3
            r8.inputType = r0
            int r0 = r12.e()
            int r1 = r1.a()
            boolean r0 = androidx.compose.ui.text.input.ImeAction.m(r0, r1)
            if (r0 == 0) goto L_0x0131
            int r0 = r8.imeOptions
            r1 = 1073741824(0x40000000, float:2.0)
            r0 = r0 | r1
            r8.imeOptions = r0
        L_0x0131:
            int r0 = r8.inputType
            boolean r0 = a(r0, r7)
            if (r0 == 0) goto L_0x017f
            int r0 = r12.c()
            androidx.compose.ui.text.input.KeyboardCapitalization$Companion r1 = androidx.compose.ui.text.input.KeyboardCapitalization.f18845b
            int r3 = r1.a()
            boolean r3 = androidx.compose.ui.text.input.KeyboardCapitalization.i(r0, r3)
            if (r3 == 0) goto L_0x0150
            int r0 = r8.inputType
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r8.inputType = r0
            goto L_0x0171
        L_0x0150:
            int r3 = r1.e()
            boolean r3 = androidx.compose.ui.text.input.KeyboardCapitalization.i(r0, r3)
            if (r3 == 0) goto L_0x0161
            int r0 = r8.inputType
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r8.inputType = r0
            goto L_0x0171
        L_0x0161:
            int r1 = r1.c()
            boolean r0 = androidx.compose.ui.text.input.KeyboardCapitalization.i(r0, r1)
            if (r0 == 0) goto L_0x0171
            int r0 = r8.inputType
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r8.inputType = r0
        L_0x0171:
            boolean r0 = r12.b()
            if (r0 == 0) goto L_0x017f
            int r0 = r8.inputType
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 | r1
            r8.inputType = r0
        L_0x017f:
            int r0 = androidx.compose.ui.text.TextRange.n(r10)
            r8.initialSelStart = r0
            int r10 = androidx.compose.ui.text.TextRange.i(r10)
            r8.initialSelEnd = r10
            androidx.core.view.inputmethod.EditorInfoCompat.e(r8, r9)
            if (r13 == 0) goto L_0x0193
            androidx.core.view.inputmethod.EditorInfoCompat.c(r8, r13)
        L_0x0193:
            int r9 = r8.imeOptions
            r10 = 33554432(0x2000000, float:9.403955E-38)
            r9 = r9 | r10
            r8.imeOptions = r9
            boolean r9 = androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt.a()
            if (r9 == 0) goto L_0x01c5
            int r9 = r12.f()
            int r10 = r2.f()
            boolean r9 = androidx.compose.ui.text.input.KeyboardType.n(r9, r10)
            if (r9 != 0) goto L_0x01c5
            int r9 = r12.f()
            int r10 = r2.e()
            boolean r9 = androidx.compose.ui.text.input.KeyboardType.n(r9, r10)
            if (r9 != 0) goto L_0x01c5
            androidx.core.view.inputmethod.EditorInfoCompat.f(r8, r7)
            androidx.compose.foundation.text.input.internal.EditorInfoApi34 r9 = androidx.compose.foundation.text.input.internal.EditorInfoApi34.f6185a
            r9.a(r8)
            goto L_0x01c8
        L_0x01c5:
            androidx.core.view.inputmethod.EditorInfoCompat.f(r8, r5)
        L_0x01c8:
            return
        L_0x01c9:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Invalid Keyboard Type"
            r8.<init>(r9)
            throw r8
        L_0x01d1:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "invalid ImeAction"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.EditorInfo_androidKt.b(android.view.inputmethod.EditorInfo, java.lang.CharSequence, long, androidx.compose.ui.text.input.ImeOptions, java.lang.String[]):void");
    }

    public static /* synthetic */ void c(EditorInfo editorInfo, CharSequence charSequence, long j2, ImeOptions imeOptions, String[] strArr, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            strArr = null;
        }
        b(editorInfo, charSequence, j2, imeOptions, strArr);
    }
}
