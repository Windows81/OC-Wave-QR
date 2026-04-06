package androidx.compose.ui.text.platform.style;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ShaderBrushSpan$shaderState$1 extends Lambda implements Function0<Shader> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ShaderBrushSpan f19018z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShaderBrushSpan$shaderState$1(ShaderBrushSpan shaderBrushSpan) {
        super(0);
        this.f19018z = shaderBrushSpan;
    }

    /* renamed from: b */
    public final Shader invoke() {
        if (this.f19018z.b() != 9205357640488583168L && !Size.k(this.f19018z.b())) {
            return this.f19018z.a().c(this.f19018z.b());
        }
        return null;
    }
}
