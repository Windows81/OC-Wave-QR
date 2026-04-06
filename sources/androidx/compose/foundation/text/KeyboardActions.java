package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class KeyboardActions {

    /* renamed from: g  reason: collision with root package name */
    public static final Companion f5763g = new Companion((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public static final KeyboardActions f5764h = new KeyboardActions((Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, 63, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f5765a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1 f5766b;

    /* renamed from: c  reason: collision with root package name */
    public final Function1 f5767c;

    /* renamed from: d  reason: collision with root package name */
    public final Function1 f5768d;

    /* renamed from: e  reason: collision with root package name */
    public final Function1 f5769e;

    /* renamed from: f  reason: collision with root package name */
    public final Function1 f5770f;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KeyboardActions a() {
            return KeyboardActions.f5764h;
        }

        public Companion() {
        }
    }

    public KeyboardActions(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16) {
        this.f5765a = function1;
        this.f5766b = function12;
        this.f5767c = function13;
        this.f5768d = function14;
        this.f5769e = function15;
        this.f5770f = function16;
    }

    public final Function1 b() {
        return this.f5765a;
    }

    public final Function1 c() {
        return this.f5766b;
    }

    public final Function1 d() {
        return this.f5767c;
    }

    public final Function1 e() {
        return this.f5768d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardActions)) {
            return false;
        }
        KeyboardActions keyboardActions = (KeyboardActions) obj;
        return this.f5765a == keyboardActions.f5765a && this.f5766b == keyboardActions.f5766b && this.f5767c == keyboardActions.f5767c && this.f5768d == keyboardActions.f5768d && this.f5769e == keyboardActions.f5769e && this.f5770f == keyboardActions.f5770f;
    }

    public final Function1 f() {
        return this.f5769e;
    }

    public final Function1 g() {
        return this.f5770f;
    }

    public int hashCode() {
        Function1 function1 = this.f5765a;
        int i2 = 0;
        int hashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1 function12 = this.f5766b;
        int hashCode2 = (hashCode + (function12 != null ? function12.hashCode() : 0)) * 31;
        Function1 function13 = this.f5767c;
        int hashCode3 = (hashCode2 + (function13 != null ? function13.hashCode() : 0)) * 31;
        Function1 function14 = this.f5768d;
        int hashCode4 = (hashCode3 + (function14 != null ? function14.hashCode() : 0)) * 31;
        Function1 function15 = this.f5769e;
        int hashCode5 = (hashCode4 + (function15 != null ? function15.hashCode() : 0)) * 31;
        Function1 function16 = this.f5770f;
        if (function16 != null) {
            i2 = function16.hashCode();
        }
        return hashCode5 + i2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ KeyboardActions(kotlin.jvm.functions.Function1 r6, kotlin.jvm.functions.Function1 r7, kotlin.jvm.functions.Function1 r8, kotlin.jvm.functions.Function1 r9, kotlin.jvm.functions.Function1 r10, kotlin.jvm.functions.Function1 r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r9
        L_0x001d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r10
        L_0x0024:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002a
            r12 = r0
            goto L_0x002b
        L_0x002a:
            r12 = r11
        L_0x002b:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.KeyboardActions.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
