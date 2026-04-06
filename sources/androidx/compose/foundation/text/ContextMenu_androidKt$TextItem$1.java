package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ContextMenu_androidKt$TextItem$1 extends Lambda implements Function2<Composer, Integer, String> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextContextMenuItems f5662z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContextMenu_androidKt$TextItem$1(TextContextMenuItems textContextMenuItems) {
        super(2);
        this.f5662z = textContextMenuItems;
    }

    public final String b(Composer composer, int i2) {
        composer.X(-1744780674);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1744780674, i2, -1, "androidx.compose.foundation.text.TextItem.<anonymous> (ContextMenu.android.kt:143)");
        }
        String f2 = this.f5662z.f(composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return f2;
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b((Composer) obj, ((Number) obj2).intValue());
    }
}
