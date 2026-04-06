package androidx.compose.ui.text.font;

import androidx.compose.ui.text.platform.SynchronizedObject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TypefaceRequestCache$runCached$currentTypefaceResult$1 extends Lambda implements Function1<TypefaceResult, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TypefaceRequest f18773A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TypefaceRequestCache f18774z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypefaceRequestCache$runCached$currentTypefaceResult$1(TypefaceRequestCache typefaceRequestCache, TypefaceRequest typefaceRequest) {
        super(1);
        this.f18774z = typefaceRequestCache;
        this.f18773A = typefaceRequest;
    }

    public final void b(TypefaceResult typefaceResult) {
        SynchronizedObject b2 = this.f18774z.b();
        TypefaceRequestCache typefaceRequestCache = this.f18774z;
        TypefaceRequest typefaceRequest = this.f18773A;
        synchronized (b2) {
            try {
                if (typefaceResult.f()) {
                    typefaceRequestCache.f18772b.f(typefaceRequest, typefaceResult);
                } else {
                    typefaceRequestCache.f18772b.g(typefaceRequest);
                }
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((TypefaceResult) obj);
        return Unit.f40552a;
    }
}
