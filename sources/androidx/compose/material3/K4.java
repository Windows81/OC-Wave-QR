package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class K4 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f10186A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Alignment.Horizontal f10187B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f10188z;

    public /* synthetic */ K4(Function0 function0, PaddingValues paddingValues, Alignment.Horizontal horizontal) {
        this.f10188z = function0;
        this.f10186A = paddingValues;
        this.f10187B = horizontal;
    }

    public final Object invoke(Object obj) {
        return OutlinedTextFieldKt.n(this.f10188z, this.f10186A, this.f10187B, (ContentDrawScope) obj);
    }
}
