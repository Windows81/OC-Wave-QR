package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

@Metadata
@DebugMetadata(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {282}, m = "invokeSuspend")
public final class AsyncFontListLoader$load$2$typeface$1 extends SuspendLambda implements Function1<Continuation<? super Object>, Object> {
    public int D;
    public final /* synthetic */ AsyncFontListLoader E;
    public final /* synthetic */ Font F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$2$typeface$1(AsyncFontListLoader asyncFontListLoader, Font font, Continuation continuation) {
        super(1, continuation);
        this.E = asyncFontListLoader;
        this.F = font;
    }

    public final Continuation A(Continuation continuation) {
        return new AsyncFontListLoader$load$2$typeface$1(this.E, this.F, continuation);
    }

    /* renamed from: B */
    public final Object invoke(Continuation continuation) {
        return ((AsyncFontListLoader$load$2$typeface$1) A(continuation)).x(Unit.f40552a);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            AsyncFontListLoader asyncFontListLoader = this.E;
            Font font = this.F;
            this.D = 1;
            obj = asyncFontListLoader.m(font, this);
            if (obj == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
