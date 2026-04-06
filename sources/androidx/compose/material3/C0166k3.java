package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.k3  reason: case insensitive filesystem */
public final /* synthetic */ class C0166k3 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TypographyKeyTokens f12488A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f12489B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f12490z;

    public /* synthetic */ C0166k3(long j2, TypographyKeyTokens typographyKeyTokens, Function2 function2, int i2) {
        this.f12490z = j2;
        this.f12488A = typographyKeyTokens;
        this.f12489B = function2;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return ListItemKt.g(this.f12490z, this.f12488A, this.f12489B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
