package androidx.compose.ui.text.platform;

import android.graphics.Shader;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ShaderBrush;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidTextPaint$setBrush$1 extends Lambda implements Function0<Shader> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f18975A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Brush f18976z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidTextPaint$setBrush$1(Brush brush, long j2) {
        super(0);
        this.f18976z = brush;
        this.f18975A = j2;
    }

    /* renamed from: b */
    public final Shader invoke() {
        return ((ShaderBrush) this.f18976z).c(this.f18975A);
    }
}
