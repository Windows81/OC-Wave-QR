package androidx.compose.ui.contentcapture;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.SemanticsNodeCopy;
import androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.platform.SemanticsUtils_androidKt;
import androidx.compose.ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

@Metadata
public final class AndroidContentCaptureManager implements ContentCaptureManager, DefaultLifecycleObserver, View.OnAttachStateChangeListener {
    public static final Companion O = new Companion((DefaultConstructorMarker) null);
    public static final int P = 8;

    /* renamed from: A  reason: collision with root package name */
    public Function0 f15630A;

    /* renamed from: B  reason: collision with root package name */
    public ContentCaptureSessionCompat f15631B;
    public final List C = new ArrayList();
    public long D = 100;
    public TranslateStatus E = TranslateStatus.SHOW_ORIGINAL;
    public boolean F = true;
    public final Channel G = ChannelKt.b(1, (BufferOverflow) null, (Function1) null, 6, (Object) null);
    public final Handler H = new Handler(Looper.getMainLooper());
    public IntObjectMap I = IntObjectMapKt.b();
    public long J;
    public MutableIntObjectMap K = IntObjectMapKt.c();
    public SemanticsNodeCopy L;
    public boolean M;
    public final Runnable N;

    /* renamed from: z  reason: collision with root package name */
    public final AndroidComposeView f15632z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public enum TranslateStatus {
        SHOW_ORIGINAL,
        SHOW_TRANSLATED;

        static {
            TranslateStatus[] d2;
            C = EnumEntriesKt.a(d2);
        }
    }

    @Metadata
    public static final class ViewTranslationHelperMethods {

        /* renamed from: a  reason: collision with root package name */
        public static final ViewTranslationHelperMethods f15636a = new ViewTranslationHelperMethods();

        public static final void e(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray longSparseArray) {
            f15636a.b(androidContentCaptureManager, longSparseArray);
        }

        public final void b(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray longSparseArray) {
            TranslationResponseValue a2;
            CharSequence a3;
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
            SemanticsNode b2;
            AccessibilityAction accessibilityAction;
            Function1 function1;
            int size = longSparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                long keyAt = longSparseArray.keyAt(i2);
                ViewTranslationResponse a4 = g.a(longSparseArray.get(keyAt));
                if (!(a4 == null || (a2 = a4.getValue("android:text")) == null || (a3 = a2.getText()) == null || (semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) androidContentCaptureManager.q().b((int) keyAt)) == null || (b2 = semanticsNodeWithAdjustedBounds.b()) == null || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(b2.w(), SemanticsActions.f18056a.A())) == null || (function1 = (Function1) accessibilityAction.a()) == null)) {
                    Boolean bool = (Boolean) function1.invoke(new AnnotatedString(a3.toString(), (List) null, 2, (DefaultConstructorMarker) null));
                }
            }
        }

        public final void c(AndroidContentCaptureManager androidContentCaptureManager, long[] jArr, int[] iArr, Consumer consumer) {
            SemanticsNode b2;
            String e2;
            for (long j2 : jArr) {
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) androidContentCaptureManager.q().b((int) j2);
                if (!(semanticsNodeWithAdjustedBounds == null || (b2 = semanticsNodeWithAdjustedBounds.b()) == null)) {
                    f.a();
                    ViewTranslationRequest.Builder a2 = e.a(androidContentCaptureManager.r().getAutofillId(), (long) b2.o());
                    List list = (List) SemanticsConfigurationKt.a(b2.w(), SemanticsProperties.f18102a.H());
                    if (!(list == null || (e2 = ListUtilsKt.e(list, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null)) == null)) {
                        ViewTranslationRequest.Builder unused = a2.setValue("android:text", TranslationRequestValue.forText(new AnnotatedString(e2, (List) null, 2, (DefaultConstructorMarker) null)));
                        consumer.accept(a2.build());
                    }
                }
                Consumer consumer2 = consumer;
            }
        }

        public final void d(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray longSparseArray) {
            if (Build.VERSION.SDK_INT >= 31) {
                if (Intrinsics.d(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                    b(androidContentCaptureManager, longSparseArray);
                } else {
                    androidContentCaptureManager.r().post(new j(androidContentCaptureManager, longSparseArray));
                }
            }
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15637a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.ui.contentcapture.ContentCaptureEventType[] r0 = androidx.compose.ui.contentcapture.ContentCaptureEventType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.contentcapture.ContentCaptureEventType r1 = androidx.compose.ui.contentcapture.ContentCaptureEventType.VIEW_APPEAR     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.contentcapture.ContentCaptureEventType r1 = androidx.compose.ui.contentcapture.ContentCaptureEventType.VIEW_DISAPPEAR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f15637a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.WhenMappings.<clinit>():void");
        }
    }

    public AndroidContentCaptureManager(AndroidComposeView androidComposeView, Function0 function0) {
        this.f15632z = androidComposeView;
        this.f15630A = function0;
        this.L = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().d(), IntObjectMapKt.b());
        this.N = new a(this);
    }

    public static final void o(AndroidContentCaptureManager androidContentCaptureManager) {
        if (androidContentCaptureManager.t()) {
            Owner.d(androidContentCaptureManager.f15632z, false, 1, (Object) null);
            androidContentCaptureManager.G();
            androidContentCaptureManager.F(androidContentCaptureManager.f15632z.getSemanticsOwner().d(), androidContentCaptureManager.L);
            androidContentCaptureManager.m(androidContentCaptureManager.q());
            androidContentCaptureManager.M();
            androidContentCaptureManager.M = false;
        }
    }

    public final void A() {
        this.F = true;
        if (t() && !this.M) {
            this.M = true;
            this.H.post(this.N);
        }
    }

    public final void B() {
        this.E = TranslateStatus.SHOW_TRANSLATED;
        I();
    }

    public void C(LifecycleOwner lifecycleOwner) {
        L(this.f15632z.getSemanticsOwner().d());
        u();
        this.f15631B = null;
    }

    public final void E(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray longSparseArray) {
        ViewTranslationHelperMethods.f15636a.d(androidContentCaptureManager, longSparseArray);
    }

    public final void F(SemanticsNode semanticsNode, SemanticsNodeCopy semanticsNodeCopy) {
        p(semanticsNode, new AndroidContentCaptureManager$sendContentCaptureAppearEvents$1(semanticsNodeCopy, this));
        List t2 = semanticsNode.t();
        int size = t2.size();
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode2 = (SemanticsNode) t2.get(i2);
            if (q().a(semanticsNode2.o()) && this.K.a(semanticsNode2.o())) {
                Object b2 = this.K.b(semanticsNode2.o());
                if (b2 != null) {
                    F(semanticsNode2, (SemanticsNodeCopy) b2);
                } else {
                    InlineClassHelperKt.d("node not present in pruned tree before this change");
                    throw new KotlinNothingValueException();
                }
            }
        }
    }

    public final void G() {
        MutableIntObjectMap mutableIntObjectMap = this.K;
        int[] iArr = mutableIntObjectMap.f1793b;
        long[] jArr = mutableIntObjectMap.f1792a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = iArr[(i2 << 3) + i4];
                            if (!q().a(i5)) {
                                i(i5);
                                v();
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final void H(int i2, String str) {
        ContentCaptureSessionCompat contentCaptureSessionCompat;
        if (Build.VERSION.SDK_INT >= 29 && (contentCaptureSessionCompat = this.f15631B) != null) {
            AutofillId b2 = contentCaptureSessionCompat.b((long) i2);
            if (b2 != null) {
                contentCaptureSessionCompat.f(b2, str);
            } else {
                InlineClassHelperKt.d("Invalid content capture ID");
                throw new KotlinNothingValueException();
            }
        }
    }

    public final void I() {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        IntObjectMap q2 = q();
        Object[] objArr = q2.f1794c;
        long[] jArr = q2.f1792a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            SemanticsConfiguration w2 = ((SemanticsNodeWithAdjustedBounds) objArr[(i2 << 3) + i4]).b().w();
                            if (!(!Intrinsics.d(SemanticsConfigurationKt.a(w2, SemanticsProperties.f18102a.u()), Boolean.FALSE) || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(w2, SemanticsActions.f18056a.B())) == null || (function1 = (Function1) accessibilityAction.a()) == null)) {
                                Boolean bool = (Boolean) function1.invoke(Boolean.TRUE);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final ViewStructureCompat J(SemanticsNode semanticsNode, int i2) {
        AutofillIdCompat a2;
        AutofillId autofillId;
        String i3;
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.f15631B;
        if (contentCaptureSessionCompat == null || Build.VERSION.SDK_INT < 29 || (a2 = ViewCompatShims.a(this.f15632z)) == null) {
            return null;
        }
        SemanticsNode r2 = semanticsNode.r();
        if (r2 != null) {
            autofillId = contentCaptureSessionCompat.b((long) r2.o());
            if (autofillId == null) {
                return null;
            }
        } else {
            autofillId = a2.a();
        }
        ViewStructureCompat c2 = contentCaptureSessionCompat.c(autofillId, (long) semanticsNode.o());
        if (c2 == null) {
            return null;
        }
        SemanticsConfiguration w2 = semanticsNode.w();
        SemanticsProperties semanticsProperties = SemanticsProperties.f18102a;
        if (w2.h(semanticsProperties.A())) {
            return null;
        }
        Bundle a3 = c2.a();
        if (a3 != null) {
            a3.putLong("android.view.contentcapture.EventTimestamp", this.J);
            a3.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i2);
        }
        String str = (String) SemanticsConfigurationKt.a(w2, semanticsProperties.G());
        if (str != null) {
            c2.e(semanticsNode.o(), (String) null, (String) null, str);
        }
        if (((Boolean) SemanticsConfigurationKt.a(w2, semanticsProperties.v())) != null) {
            c2.b("android.widget.ViewGroup");
        }
        List list = (List) SemanticsConfigurationKt.a(w2, semanticsProperties.H());
        if (list != null) {
            c2.b("android.widget.TextView");
            c2.f(ListUtilsKt.e(list, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        }
        AnnotatedString annotatedString = (AnnotatedString) SemanticsConfigurationKt.a(w2, semanticsProperties.g());
        if (annotatedString != null) {
            c2.b("android.widget.EditText");
            c2.f(annotatedString);
        }
        List list2 = (List) SemanticsConfigurationKt.a(w2, semanticsProperties.d());
        if (list2 != null) {
            c2.c(ListUtilsKt.e(list2, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        }
        Role role = (Role) SemanticsConfigurationKt.a(w2, semanticsProperties.C());
        if (!(role == null || (i3 = SemanticsUtils_androidKt.i(role.p())) == null)) {
            c2.b(i3);
        }
        TextLayoutResult e2 = SemanticsUtils_androidKt.e(w2);
        if (e2 != null) {
            TextLayoutInput l2 = e2.l();
            c2.g(TextUnit.h(l2.i().l()) * l2.b().getDensity() * l2.b().u1(), 0, 0, 0);
        }
        Rect h2 = semanticsNode.h();
        c2.d((int) h2.o(), (int) h2.r(), 0, 0, (int) (h2.p() - h2.o()), (int) (h2.i() - h2.r()));
        return c2;
    }

    public final void K(int i2, SemanticsNode semanticsNode) {
        if (t()) {
            O(semanticsNode);
            h(semanticsNode.o(), J(semanticsNode, i2));
            p(semanticsNode, new AndroidContentCaptureManager$updateBuffersOnAppeared$1(this));
        }
    }

    public final void L(SemanticsNode semanticsNode) {
        if (t()) {
            i(semanticsNode.o());
            List t2 = semanticsNode.t();
            int size = t2.size();
            for (int i2 = 0; i2 < size; i2++) {
                L((SemanticsNode) t2.get(i2));
            }
        }
    }

    public final void M() {
        this.K.g();
        IntObjectMap q2 = q();
        int[] iArr = q2.f1793b;
        Object[] objArr = q2.f1794c;
        long[] jArr = q2.f1792a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            this.K.r(iArr[i5], new SemanticsNodeCopy(((SemanticsNodeWithAdjustedBounds) objArr[i5]).b(), q()));
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        this.L = new SemanticsNodeCopy(this.f15632z.getSemanticsOwner().d(), q());
    }

    public void N(LifecycleOwner lifecycleOwner) {
        this.f15631B = (ContentCaptureSessionCompat) this.f15630A.invoke();
        K(-1, this.f15632z.getSemanticsOwner().d());
        u();
    }

    public final void O(SemanticsNode semanticsNode) {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        Function1 function12;
        SemanticsConfiguration w2 = semanticsNode.w();
        Boolean bool = (Boolean) SemanticsConfigurationKt.a(w2, SemanticsProperties.f18102a.u());
        if (this.E == TranslateStatus.SHOW_ORIGINAL && Intrinsics.d(bool, Boolean.TRUE)) {
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.a(w2, SemanticsActions.f18056a.B());
            if (accessibilityAction2 != null && (function12 = (Function1) accessibilityAction2.a()) != null) {
                Boolean bool2 = (Boolean) function12.invoke(Boolean.FALSE);
            }
        } else if (this.E == TranslateStatus.SHOW_TRANSLATED && Intrinsics.d(bool, Boolean.FALSE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(w2, SemanticsActions.f18056a.B())) != null && (function1 = (Function1) accessibilityAction.a()) != null) {
            Boolean bool3 = (Boolean) function1.invoke(Boolean.TRUE);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(kotlin.coroutines.Continuation r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = (androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = new androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004a
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r2 = r0.D
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r5 = r0.C
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager r5 = (androidx.compose.ui.contentcapture.AndroidContentCaptureManager) r5
            kotlin.ResultKt.b(r10)
        L_0x0033:
            r10 = r2
            r2 = r5
            goto L_0x0054
        L_0x0036:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x003e:
            java.lang.Object r2 = r0.D
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r5 = r0.C
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager r5 = (androidx.compose.ui.contentcapture.AndroidContentCaptureManager) r5
            kotlin.ResultKt.b(r10)
            goto L_0x0065
        L_0x004a:
            kotlin.ResultKt.b(r10)
            kotlinx.coroutines.channels.Channel r10 = r9.G
            kotlinx.coroutines.channels.ChannelIterator r10 = r10.iterator()
            r2 = r9
        L_0x0054:
            r0.C = r2
            r0.D = r10
            r0.G = r4
            java.lang.Object r5 = r10.a(r0)
            if (r5 != r1) goto L_0x0061
            return r1
        L_0x0061:
            r8 = r2
            r2 = r10
            r10 = r5
            r5 = r8
        L_0x0065:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0095
            r2.next()
            boolean r10 = r5.t()
            if (r10 == 0) goto L_0x0079
            r5.u()
        L_0x0079:
            boolean r10 = r5.M
            if (r10 != 0) goto L_0x0086
            r5.M = r4
            android.os.Handler r10 = r5.H
            java.lang.Runnable r6 = r5.N
            r10.post(r6)
        L_0x0086:
            long r6 = r5.D
            r0.C = r5
            r0.D = r2
            r0.G = r3
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.b(r6, r0)
            if (r10 != r1) goto L_0x0033
            return r1
        L_0x0095:
            kotlin.Unit r10 = kotlin.Unit.f40552a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void h(int i2, ViewStructureCompat viewStructureCompat) {
        if (viewStructureCompat != null) {
            this.C.add(new ContentCaptureEvent(i2, this.J, ContentCaptureEventType.VIEW_APPEAR, viewStructureCompat));
        }
    }

    public final void i(int i2) {
        this.C.add(new ContentCaptureEvent(i2, this.J, ContentCaptureEventType.VIEW_DISAPPEAR, (ViewStructureCompat) null));
    }

    public final void m(IntObjectMap intObjectMap) {
        long[] jArr;
        int[] iArr;
        char c2;
        int i2;
        long[] jArr2;
        int[] iArr2;
        long j2;
        int i3;
        SemanticsNodeCopy semanticsNodeCopy;
        Object[] objArr;
        long[] jArr3;
        Object[] objArr2;
        long[] jArr4;
        SemanticsNodeCopy semanticsNodeCopy2;
        Object[] objArr3;
        Object[] objArr4;
        IntObjectMap intObjectMap2 = intObjectMap;
        int[] iArr3 = intObjectMap2.f1793b;
        long[] jArr5 = intObjectMap2.f1792a;
        int length = jArr5.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j3 = jArr5[i4];
                char c3 = 7;
                long j4 = -9187201950435737472L;
                if ((((~j3) << 7) & j3 & -9187201950435737472L) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j3 & 255) < 128) {
                            int i8 = iArr3[(i4 << 3) + i7];
                            SemanticsNodeCopy semanticsNodeCopy3 = (SemanticsNodeCopy) this.K.b(i8);
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) intObjectMap2.b(i8);
                            SemanticsNode b2 = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.b() : null;
                            if (b2 != null) {
                                if (semanticsNodeCopy3 == null) {
                                    MutableScatterMap q2 = b2.w().q();
                                    Object[] objArr5 = q2.f1960b;
                                    long[] jArr6 = q2.f1959a;
                                    int length2 = jArr6.length - 2;
                                    iArr2 = iArr3;
                                    if (length2 >= 0) {
                                        int i9 = 0;
                                        while (true) {
                                            long j5 = jArr6[i9];
                                            jArr2 = jArr5;
                                            i2 = length;
                                            if ((((~j5) << c3) & j5 & -9187201950435737472L) != -9187201950435737472L) {
                                                int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                                int i11 = 0;
                                                while (i11 < i10) {
                                                    if ((j5 & 255) < 128) {
                                                        SemanticsProperties semanticsProperties = SemanticsProperties.f18102a;
                                                        objArr4 = objArr5;
                                                        if (Intrinsics.d((SemanticsPropertyKey) objArr5[(i9 << 3) + i11], semanticsProperties.H())) {
                                                            List list = (List) SemanticsConfigurationKt.a(b2.w(), semanticsProperties.H());
                                                            H(b2.o(), String.valueOf(list != null ? (AnnotatedString) CollectionsKt.g0(list) : null));
                                                        }
                                                    } else {
                                                        objArr4 = objArr5;
                                                    }
                                                    j5 >>= 8;
                                                    i11++;
                                                    objArr5 = objArr4;
                                                }
                                                objArr3 = objArr5;
                                                if (i10 != 8) {
                                                    break;
                                                }
                                            } else {
                                                objArr3 = objArr5;
                                            }
                                            if (i9 == length2) {
                                                break;
                                            }
                                            i9++;
                                            jArr5 = jArr2;
                                            length = i2;
                                            objArr5 = objArr3;
                                            c3 = 7;
                                        }
                                    } else {
                                        jArr2 = jArr5;
                                        i2 = length;
                                    }
                                } else {
                                    iArr2 = iArr3;
                                    jArr2 = jArr5;
                                    i2 = length;
                                    MutableScatterMap q3 = b2.w().q();
                                    Object[] objArr6 = q3.f1960b;
                                    long[] jArr7 = q3.f1959a;
                                    int length3 = jArr7.length - 2;
                                    if (length3 >= 0) {
                                        int i12 = 0;
                                        while (true) {
                                            long j6 = jArr7[i12];
                                            c2 = 7;
                                            j2 = -9187201950435737472L;
                                            if ((((~j6) << 7) & j6 & -9187201950435737472L) != -9187201950435737472L) {
                                                int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                                int i14 = 0;
                                                while (i14 < i13) {
                                                    if ((j6 & 255) < 128) {
                                                        jArr4 = jArr7;
                                                        SemanticsProperties semanticsProperties2 = SemanticsProperties.f18102a;
                                                        objArr2 = objArr6;
                                                        if (Intrinsics.d((SemanticsPropertyKey) objArr6[(i12 << 3) + i14], semanticsProperties2.H())) {
                                                            List list2 = (List) SemanticsConfigurationKt.a(semanticsNodeCopy3.b(), semanticsProperties2.H());
                                                            AnnotatedString annotatedString = list2 != null ? (AnnotatedString) CollectionsKt.g0(list2) : null;
                                                            semanticsNodeCopy2 = semanticsNodeCopy3;
                                                            List list3 = (List) SemanticsConfigurationKt.a(b2.w(), semanticsProperties2.H());
                                                            AnnotatedString annotatedString2 = list3 != null ? (AnnotatedString) CollectionsKt.g0(list3) : null;
                                                            if (!Intrinsics.d(annotatedString, annotatedString2)) {
                                                                H(b2.o(), String.valueOf(annotatedString2));
                                                            }
                                                        }
                                                        semanticsNodeCopy2 = semanticsNodeCopy3;
                                                    } else {
                                                        jArr4 = jArr7;
                                                        objArr2 = objArr6;
                                                        semanticsNodeCopy2 = semanticsNodeCopy3;
                                                    }
                                                    j6 >>= 8;
                                                    i14++;
                                                    jArr7 = jArr4;
                                                    objArr6 = objArr2;
                                                    semanticsNodeCopy3 = semanticsNodeCopy2;
                                                }
                                                jArr3 = jArr7;
                                                objArr = objArr6;
                                                semanticsNodeCopy = semanticsNodeCopy3;
                                                if (i13 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr3 = jArr7;
                                                objArr = objArr6;
                                                semanticsNodeCopy = semanticsNodeCopy3;
                                            }
                                            if (i12 == length3) {
                                                break;
                                            }
                                            i12++;
                                            jArr7 = jArr3;
                                            objArr6 = objArr;
                                            semanticsNodeCopy3 = semanticsNodeCopy;
                                        }
                                        i3 = 8;
                                    }
                                }
                                j2 = -9187201950435737472L;
                                c2 = 7;
                                i3 = 8;
                            } else {
                                InlineClassHelperKt.d("no value for specified key");
                                throw new KotlinNothingValueException();
                            }
                        } else {
                            iArr2 = iArr3;
                            jArr2 = jArr5;
                            i2 = length;
                            c2 = c3;
                            j2 = j4;
                            i3 = i5;
                        }
                        j3 >>= i3;
                        i7++;
                        i5 = i3;
                        j4 = j2;
                        iArr3 = iArr2;
                        jArr5 = jArr2;
                        length = i2;
                        c3 = c2;
                        intObjectMap2 = intObjectMap;
                    }
                    iArr = iArr3;
                    jArr = jArr5;
                    int i15 = length;
                    if (i6 == i5) {
                        length = i15;
                    } else {
                        return;
                    }
                } else {
                    iArr = iArr3;
                    jArr = jArr5;
                }
                if (i4 != length) {
                    i4++;
                    intObjectMap2 = intObjectMap;
                    iArr3 = iArr;
                    jArr5 = jArr;
                } else {
                    return;
                }
            }
        }
    }

    public final void n() {
        AccessibilityAction accessibilityAction;
        Function0 function0;
        IntObjectMap q2 = q();
        Object[] objArr = q2.f1794c;
        long[] jArr = q2.f1792a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            SemanticsConfiguration w2 = ((SemanticsNodeWithAdjustedBounds) objArr[(i2 << 3) + i4]).b().w();
                            if (!(SemanticsConfigurationKt.a(w2, SemanticsProperties.f18102a.u()) == null || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(w2, SemanticsActions.f18056a.a())) == null || (function0 = (Function0) accessibilityAction.a()) == null)) {
                                Boolean bool = (Boolean) function0.invoke();
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.H.removeCallbacks(this.N);
        this.f15631B = null;
    }

    public final void p(SemanticsNode semanticsNode, Function2 function2) {
        List t2 = semanticsNode.t();
        int size = t2.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = t2.get(i3);
            if (q().a(((SemanticsNode) obj).o())) {
                function2.m(Integer.valueOf(i2), obj);
                i2++;
            }
        }
    }

    public final IntObjectMap q() {
        if (this.F) {
            this.F = false;
            this.I = SemanticsUtils_androidKt.b(this.f15632z.getSemanticsOwner());
            this.J = System.currentTimeMillis();
        }
        return this.I;
    }

    public final AndroidComposeView r() {
        return this.f15632z;
    }

    public final void s() {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        IntObjectMap q2 = q();
        Object[] objArr = q2.f1794c;
        long[] jArr = q2.f1792a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            SemanticsConfiguration w2 = ((SemanticsNodeWithAdjustedBounds) objArr[(i2 << 3) + i4]).b().w();
                            if (!(!Intrinsics.d(SemanticsConfigurationKt.a(w2, SemanticsProperties.f18102a.u()), Boolean.TRUE) || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(w2, SemanticsActions.f18056a.B())) == null || (function1 = (Function1) accessibilityAction.a()) == null)) {
                                Boolean bool = (Boolean) function1.invoke(Boolean.FALSE);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean t() {
        return ContentCaptureManager.f15648f.a() && this.f15631B != null;
    }

    public final void u() {
        AutofillId b2;
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.f15631B;
        if (contentCaptureSessionCompat != null && Build.VERSION.SDK_INT >= 29 && !this.C.isEmpty()) {
            List list = this.C;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ContentCaptureEvent contentCaptureEvent = (ContentCaptureEvent) list.get(i2);
                int i3 = WhenMappings.f15637a[contentCaptureEvent.c().ordinal()];
                if (i3 == 1) {
                    ViewStructureCompat b3 = contentCaptureEvent.b();
                    if (b3 != null) {
                        contentCaptureSessionCompat.d(b3.h());
                    }
                } else if (i3 == 2 && (b2 = contentCaptureSessionCompat.b((long) contentCaptureEvent.a())) != null) {
                    contentCaptureSessionCompat.e(b2);
                }
            }
            contentCaptureSessionCompat.a();
            this.C.clear();
        }
    }

    public final void v() {
        this.G.L(Unit.f40552a);
    }

    public final void w() {
        this.E = TranslateStatus.SHOW_ORIGINAL;
        n();
    }

    public final void x(long[] jArr, int[] iArr, Consumer consumer) {
        ViewTranslationHelperMethods.f15636a.c(this, jArr, iArr, consumer);
    }

    public final void y() {
        this.E = TranslateStatus.SHOW_ORIGINAL;
        s();
    }

    public final void z() {
        this.F = true;
        if (t()) {
            v();
        }
    }
}
