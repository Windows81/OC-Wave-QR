package androidx.compose.foundation.content;

import androidx.compose.ui.platform.ClipEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TransferableContent_androidKt {
    public static final String a(ClipEntry clipEntry) {
        int itemCount = clipEntry.a().getItemCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < itemCount; i2++) {
            z2 = z2 || clipEntry.a().getItemAt(i2).getText() != null;
        }
        if (!z2) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int itemCount2 = clipEntry.a().getItemCount();
        boolean z3 = false;
        for (int i3 = 0; i3 < itemCount2; i3++) {
            CharSequence text = clipEntry.a().getItemAt(i3).getText();
            if (text != null) {
                if (z3) {
                    sb.append("\n");
                }
                sb.append(text);
                z3 = true;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "toString(...)");
        return sb2;
    }
}
