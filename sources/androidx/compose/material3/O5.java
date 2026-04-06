package androidx.compose.material3;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class O5 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f10525A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f10526B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ColumnScope f10527z;

    public /* synthetic */ O5(ColumnScope columnScope, Function2 function2, int i2) {
        this.f10527z = columnScope;
        this.f10525A = function2;
        this.f10526B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return SheetDefaultsKt.h(this.f10527z, this.f10525A, this.f10526B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
