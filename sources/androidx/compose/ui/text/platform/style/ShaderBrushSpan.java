package androidx.compose.ui.text.platform.style;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.text.platform.AndroidTextPaint_androidKt;
import kotlin.Metadata;

@Metadata
public final class ShaderBrushSpan extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a  reason: collision with root package name */
    public final ShaderBrush f19014a;

    /* renamed from: b  reason: collision with root package name */
    public final float f19015b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableState f19016c = SnapshotStateKt__SnapshotStateKt.e(Size.c(Size.f15876b.a()), (SnapshotMutationPolicy) null, 2, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    public final State f19017d = SnapshotStateKt.e(new ShaderBrushSpan$shaderState$1(this));

    public ShaderBrushSpan(ShaderBrush shaderBrush, float f2) {
        this.f19014a = shaderBrush;
        this.f19015b = f2;
    }

    public final ShaderBrush a() {
        return this.f19014a;
    }

    public final long b() {
        return ((Size) this.f19016c.getValue()).m();
    }

    public final void c(long j2) {
        this.f19016c.setValue(Size.c(j2));
    }

    public void updateDrawState(TextPaint textPaint) {
        AndroidTextPaint_androidKt.a(textPaint, this.f19015b);
        textPaint.setShader((Shader) this.f19017d.getValue());
    }
}
