package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {109}, m = "invokeSuspend")
public final class FontListFontFamilyTypefaceAdapter$preload$3$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
    public int D;
    public final /* synthetic */ FontListFontFamilyTypefaceAdapter E;
    public final /* synthetic */ Font F;
    public final /* synthetic */ PlatformFontLoader G;

    @Metadata
    @DebugMetadata(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {111}, m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Object>, Object> {
        public int D;

        public final Continuation A(Continuation continuation) {
            return new AnonymousClass1(font, platformFontLoader, continuation);
        }

        /* renamed from: B */
        public final Object invoke(Continuation continuation) {
            return ((AnonymousClass1) A(continuation)).x(Unit.f40552a);
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                final PlatformFontLoader platformFontLoader = platformFontLoader;
                final Font font = font;
                AnonymousClass1 r7 = new Function2<CoroutineScope, Continuation<? super Object>, Object>((Continuation) null) {
                    public int D;

                    /* renamed from: A */
                    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
                        return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
                    }

                    public final Continuation s(Object obj, Continuation continuation) {
                        return 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public FontListFontFamilyTypefaceAdapter$preload$3$2$1(FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, Font font, PlatformFontLoader platformFontLoader, Continuation continuation) {
                            super(2, continuation);
                            this.E = fontListFontFamilyTypefaceAdapter;
                            this.F = font;
                            this.G = platformFontLoader;
                        }

                        /* renamed from: A */
                        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
                            return ((FontListFontFamilyTypefaceAdapter$preload$3$2$1) s(coroutineScope, continuation)).x(Unit.f40552a);
                        }

                        public final Continuation s(Object obj, Continuation continuation) {
                            return new FontListFontFamilyTypefaceAdapter$preload$3$2$1(this.E, this.F, this.G, continuation);
                        }

                        public final Object x(Object obj) {
                            Object f2 = IntrinsicsKt.f();
                            int i2 = this.D;
                            if (i2 == 0) {
                                ResultKt.b(obj);
                                AsyncTypefaceCache a2 = this.E.f18716a;
                                final Font font = this.F;
                                final PlatformFontLoader platformFontLoader = this.G;
                                AnonymousClass1 r7 = new AnonymousClass1((Continuation) null);
                                this.D = 1;
                                obj = a2.g(font, platformFontLoader, true, r7, this);
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
