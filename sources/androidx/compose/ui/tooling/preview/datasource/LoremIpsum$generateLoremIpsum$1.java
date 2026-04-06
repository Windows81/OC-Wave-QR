package androidx.compose.ui.tooling.preview.datasource;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
final class LoremIpsum$generateLoremIpsum$1 extends Lambda implements Function0<String> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f19134A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f19135z;

    public final String invoke() {
        List a2 = LoremIpsum_androidKt.f19136a;
        Ref.IntRef intRef = this.f19135z;
        int i2 = intRef.f40906z;
        intRef.f40906z = i2 + 1;
        return (String) a2.get(i2 % this.f19134A);
    }
}
