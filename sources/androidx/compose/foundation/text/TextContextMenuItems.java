package androidx.compose.foundation.text;

import android.os.Build;
import androidx.compose.foundation.R;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum TextContextMenuItems {
    Cut(17039363),
    Copy(17039361),
    Paste(17039371),
    SelectAll(17039373);
    

    /* renamed from: z  reason: collision with root package name */
    public final int f5879z;

    static {
        Cut = new TextContextMenuItems("Cut", 0, 17039363);
        Copy = new TextContextMenuItems("Copy", 1, 17039361);
        Paste = new TextContextMenuItems("Paste", 2, 17039371);
        SelectAll = new TextContextMenuItems("SelectAll", 3, 17039373);
        E = new TextContextMenuItems("Autofill", 4, Build.VERSION.SDK_INT <= 26 ? R.string.f3152a : 17039386);
        TextContextMenuItems[] d2 = d();
        F = d2;
        G = EnumEntriesKt.a(d2);
    }

    /* access modifiers changed from: public */
    TextContextMenuItems(int i2) {
        this.f5879z = i2;
    }

    public final String f(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-309609081, i2, -1, "androidx.compose.foundation.text.TextContextMenuItems.resolvedString (ContextMenu.android.kt:131)");
        }
        String b2 = StringResources_androidKt.b(this.f5879z, composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return b2;
    }
}
