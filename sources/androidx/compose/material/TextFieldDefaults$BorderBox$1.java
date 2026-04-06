package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldDefaults$BorderBox$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f8738A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f8739B;
    public final /* synthetic */ InteractionSource C;
    public final /* synthetic */ TextFieldColors D;
    public final /* synthetic */ Shape E;
    public final /* synthetic */ float F;
    public final /* synthetic */ float G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldDefaults f8740z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDefaults$BorderBox$1(TextFieldDefaults textFieldDefaults, boolean z2, boolean z3, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f2, float f3, int i2, int i3) {
        super(2);
        this.f8740z = textFieldDefaults;
        this.f8738A = z2;
        this.f8739B = z3;
        this.C = interactionSource;
        this.D = textFieldColors;
        this.E = shape;
        this.F = f2;
        this.G = f3;
        this.H = i2;
        this.I = i3;
    }

    public final void b(Composer composer, int i2) {
        this.f8740z.a(this.f8738A, this.f8739B, this.C, this.D, this.E, this.F, this.G, composer, RecomposeScopeImplKt.a(this.H | 1), this.I);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
