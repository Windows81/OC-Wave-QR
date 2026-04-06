package androidx.compose.ui.text.font;

import androidx.collection.MutableScatterSet;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.DispatcherKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

@Metadata
public final class FontListFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f18712c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f18713d = 8;

    /* renamed from: e  reason: collision with root package name */
    public static final FontMatcher f18714e = new FontMatcher();

    /* renamed from: f  reason: collision with root package name */
    public static final CoroutineExceptionHandler f18715f = new FontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.f41378w);

    /* renamed from: a  reason: collision with root package name */
    public final AsyncTypefaceCache f18716a;

    /* renamed from: b  reason: collision with root package name */
    public CoroutineScope f18717b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, CoroutineContext coroutineContext) {
        this.f18716a = asyncTypefaceCache;
        this.f18717b = CoroutineScopeKt.a(f18715f.y(DispatcherKt.a()).y(coroutineContext).y(SupervisorKt.a((Job) coroutineContext.d(Job.f41415x))));
    }

    public final Object b(FontFamily fontFamily, PlatformFontLoader platformFontLoader, Continuation continuation) {
        FontFamily fontFamily2 = fontFamily;
        PlatformFontLoader platformFontLoader2 = platformFontLoader;
        if (!(fontFamily2 instanceof FontListFontFamily)) {
            return Unit.f40552a;
        }
        FontListFontFamily fontListFontFamily = (FontListFontFamily) fontFamily2;
        List p2 = fontListFontFamily.p();
        List p3 = fontListFontFamily.p();
        ArrayList arrayList = new ArrayList(p3.size());
        int size = p3.size();
        for (int i2 = 0; i2 < size; i2++) {
            Font font = (Font) p3.get(i2);
            if (FontLoadingStrategy.f(font.b(), FontLoadingStrategy.f18719b.a())) {
                arrayList.add(TuplesKt.a(font.a(), FontStyle.c(font.c())));
            }
        }
        MutableScatterSet mutableScatterSet = new MutableScatterSet(arrayList.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Object obj = arrayList.get(i3);
            if (mutableScatterSet.h((Pair) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size3 = arrayList2.size();
        int i4 = 0;
        while (i4 < size3) {
            Pair pair = (Pair) arrayList2.get(i4);
            FontWeight fontWeight = (FontWeight) pair.a();
            int i5 = ((FontStyle) pair.b()).i();
            List a2 = f18714e.a(p2, fontWeight, i5);
            TypefaceRequest typefaceRequest = r1;
            TypefaceRequest typefaceRequest2 = new TypefaceRequest(fontFamily, fontWeight, i5, FontSynthesis.f18728b.a(), platformFontLoader.a(), (DefaultConstructorMarker) null);
            List list = (List) FontListFontFamilyTypefaceAdapterKt.b(a2, typefaceRequest, this.f18716a, platformFontLoader2, FontListFontFamilyTypefaceAdapter$preload$2$1.f18718z).a();
            if (list != null) {
                arrayList3.add(CollectionsKt.e0(list));
            }
            i4++;
            FontFamily fontFamily3 = fontFamily;
        }
        Object f2 = CoroutineScopeKt.f(new FontListFontFamilyTypefaceAdapter$preload$3(arrayList3, this, platformFontLoader2, (Continuation) null), continuation);
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }

    public TypefaceResult c(TypefaceRequest typefaceRequest, PlatformFontLoader platformFontLoader, Function1 function1, Function1 function12) {
        if (!(typefaceRequest.c() instanceof FontListFontFamily)) {
            return null;
        }
        Pair a2 = FontListFontFamilyTypefaceAdapterKt.b(f18714e.a(((FontListFontFamily) typefaceRequest.c()).p(), typefaceRequest.f(), typefaceRequest.d()), typefaceRequest, this.f18716a, platformFontLoader, function12);
        List list = (List) a2.a();
        Object b2 = a2.b();
        if (list == null) {
            return new TypefaceResult.Immutable(b2, false, 2, (DefaultConstructorMarker) null);
        }
        AsyncFontListLoader asyncFontListLoader = new AsyncFontListLoader(list, b2, typefaceRequest, this.f18716a, function1, platformFontLoader);
        Job unused = BuildersKt__Builders_commonKt.d(this.f18717b, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new FontListFontFamilyTypefaceAdapter$resolve$1(asyncFontListLoader, (Continuation) null), 1, (Object) null);
        return new TypefaceResult.Async(asyncFontListLoader);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, CoroutineContext coroutineContext, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new AsyncTypefaceCache() : asyncTypefaceCache, (i2 & 2) != 0 ? EmptyCoroutineContext.f40721z : coroutineContext);
    }
}
