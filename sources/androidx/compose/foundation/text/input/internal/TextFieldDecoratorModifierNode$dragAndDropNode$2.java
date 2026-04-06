package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldDecoratorModifierNode$dragAndDropNode$2 extends Lambda implements Function2<ClipEntry, ClipMetadata, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6322z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$dragAndDropNode$2(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(2);
        this.f6322z = textFieldDecoratorModifierNode;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0036, code lost:
        r10 = r10.a();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean m(androidx.compose.ui.platform.ClipEntry r10, androidx.compose.ui.platform.ClipMetadata r11) {
        /*
            r9 = this;
            androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r0 = r9.f6322z
            r0.s3()
            androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r0 = r9.f6322z
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = r0.A3()
            r0.G()
            java.lang.String r0 = androidx.compose.foundation.content.TransferableContent_androidKt.a(r10)
            androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r1 = r9.f6322z
            androidx.compose.foundation.content.internal.ReceiveContentConfiguration r1 = androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt.b(r1)
            if (r1 == 0) goto L_0x0044
            androidx.compose.foundation.content.TransferableContent r0 = new androidx.compose.foundation.content.TransferableContent
            androidx.compose.foundation.content.TransferableContent$Source$Companion r2 = androidx.compose.foundation.content.TransferableContent.Source.f3207b
            int r5 = r2.b()
            r7 = 8
            r8 = 0
            r6 = 0
            r2 = r0
            r3 = r10
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.compose.foundation.content.ReceiveContentListener r10 = r1.a()
            androidx.compose.foundation.content.TransferableContent r10 = r10.e(r0)
            if (r10 == 0) goto L_0x0042
            androidx.compose.ui.platform.ClipEntry r10 = r10.a()
            if (r10 == 0) goto L_0x0042
            java.lang.String r10 = androidx.compose.foundation.content.TransferableContent_androidKt.a(r10)
        L_0x0040:
            r0 = r10
            goto L_0x0044
        L_0x0042:
            r10 = 0
            goto L_0x0040
        L_0x0044:
            r2 = r0
            if (r2 == 0) goto L_0x0056
            androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r10 = r9.f6322z
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r1 = r10.B3()
            r6 = 14
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState.x(r1, r2, r3, r4, r5, r6, r7)
        L_0x0056:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$2.m(androidx.compose.ui.platform.ClipEntry, androidx.compose.ui.platform.ClipMetadata):java.lang.Boolean");
    }
}
