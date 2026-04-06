package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.os.Build;
import kotlin.Metadata;

@Metadata
public final class AndroidClipboardManager implements ClipboardManager {

    /* renamed from: a  reason: collision with root package name */
    public final ClipboardManager f17493a;

    public AndroidClipboardManager(ClipboardManager clipboardManager) {
        this.f17493a = clipboardManager;
    }

    public ClipEntry a() {
        ClipData primaryClip = this.f17493a.getPrimaryClip();
        if (primaryClip != null) {
            return new ClipEntry(primaryClip);
        }
        return null;
    }

    public boolean b() {
        ClipDescription primaryClipDescription = this.f17493a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    public void c(ClipEntry clipEntry) {
        if (clipEntry != null) {
            this.f17493a.setPrimaryClip(clipEntry.a());
        } else if (Build.VERSION.SDK_INT >= 28) {
            Api28ClipboardManagerClipClear.a(this.f17493a);
        } else {
            this.f17493a.setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AndroidClipboardManager(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "clipboard"
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.content.ClipboardManager"
            kotlin.jvm.internal.Intrinsics.g(r2, r0)
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2
            r1.<init>((android.content.ClipboardManager) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidClipboardManager.<init>(android.content.Context):void");
    }
}
