package androidx.compose.ui.graphics;

import android.graphics.Shader;
import kotlin.Metadata;

@Metadata
public final class BrushKt {
    public static final ShaderBrush a(Shader shader) {
        return new BrushKt$ShaderBrush$1(shader);
    }
}
