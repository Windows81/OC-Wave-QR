package androidx.compose.ui.text;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
final class JvmAnnotatedString_jvmKt$transform$1 extends Lambda implements Function1<List<? extends Integer>, Integer> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function3 f18278A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ AnnotatedString f18279B;
    public final /* synthetic */ Map C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f18280z;

    /* renamed from: b */
    public final Integer invoke(List list) {
        int intValue = ((Number) list.get(0)).intValue();
        int intValue2 = ((Number) list.get(1)).intValue();
        Ref.ObjectRef objectRef = this.f18280z;
        objectRef.f40908z = ((String) this.f18280z.f40908z) + ((String) this.f18278A.d(this.f18279B.k(), Integer.valueOf(intValue), Integer.valueOf(intValue2)));
        return (Integer) this.C.put(Integer.valueOf(intValue2), Integer.valueOf(((String) this.f18280z.f40908z).length()));
    }
}
