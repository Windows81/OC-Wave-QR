package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.MetadataRepo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

final class EmojiProcessor {

    /* renamed from: a  reason: collision with root package name */
    public final EmojiCompat.SpanFactory f21292a;

    /* renamed from: b  reason: collision with root package name */
    public final MetadataRepo f21293b;

    /* renamed from: c  reason: collision with root package name */
    public EmojiCompat.GlyphChecker f21294c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f21295d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f21296e;

    public static final class CodepointIndexFinder {
        public static int a(CharSequence charSequence, int i2, int i3) {
            int length = charSequence.length();
            if (i2 < 0 || length < i2 || i3 < 0) {
                return -1;
            }
            while (true) {
                boolean z2 = false;
                while (i3 != 0) {
                    i2--;
                    if (i2 < 0) {
                        return z2 ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i2);
                    if (z2) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i3--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i3--;
                    } else if (Character.isHighSurrogate(charAt)) {
                        return -1;
                    } else {
                        z2 = true;
                    }
                }
                return i2;
            }
        }

        public static int b(CharSequence charSequence, int i2, int i3) {
            int length = charSequence.length();
            if (i2 < 0 || length < i2 || i3 < 0) {
                return -1;
            }
            while (true) {
                boolean z2 = false;
                while (i3 != 0) {
                    if (r7 < length) {
                        char charAt = charSequence.charAt(r7);
                        if (z2) {
                            if (!Character.isLowSurrogate(charAt)) {
                                return -1;
                            }
                            i3--;
                            i2 = r7 + 1;
                        } else if (!Character.isSurrogate(charAt)) {
                            i3--;
                            r7++;
                        } else if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        } else {
                            r7++;
                            z2 = true;
                        }
                    } else if (z2) {
                        return -1;
                    } else {
                        return length;
                    }
                }
                return r7;
            }
        }
    }

    public static class EmojiProcessAddSpanCallback implements EmojiProcessCallback<UnprecomputeTextOnModificationSpannable> {

        /* renamed from: a  reason: collision with root package name */
        public UnprecomputeTextOnModificationSpannable f21297a;

        /* renamed from: b  reason: collision with root package name */
        public final EmojiCompat.SpanFactory f21298b;

        public EmojiProcessAddSpanCallback(UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable, EmojiCompat.SpanFactory spanFactory) {
            this.f21297a = unprecomputeTextOnModificationSpannable;
            this.f21298b = spanFactory;
        }

        public boolean b(CharSequence charSequence, int i2, int i3, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if (typefaceEmojiRasterizer.k()) {
                return true;
            }
            if (this.f21297a == null) {
                this.f21297a = new UnprecomputeTextOnModificationSpannable(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f21297a.setSpan(this.f21298b.a(typefaceEmojiRasterizer), i2, i3, 33);
            return true;
        }

        /* renamed from: c */
        public UnprecomputeTextOnModificationSpannable a() {
            return this.f21297a;
        }
    }

    public interface EmojiProcessCallback<T> {
        Object a();

        boolean b(CharSequence charSequence, int i2, int i3, TypefaceEmojiRasterizer typefaceEmojiRasterizer);
    }

    public static class EmojiProcessLookupCallback implements EmojiProcessCallback<EmojiProcessLookupCallback> {

        /* renamed from: a  reason: collision with root package name */
        public final int f21299a;

        /* renamed from: b  reason: collision with root package name */
        public int f21300b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f21301c = -1;

        public EmojiProcessLookupCallback(int i2) {
            this.f21299a = i2;
        }

        public boolean b(CharSequence charSequence, int i2, int i3, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            int i4 = this.f21299a;
            if (i2 > i4 || i4 >= i3) {
                return i3 <= i4;
            }
            this.f21300b = i2;
            this.f21301c = i3;
            return false;
        }

        /* renamed from: c */
        public EmojiProcessLookupCallback a() {
            return this;
        }
    }

    public static class MarkExclusionCallback implements EmojiProcessCallback<MarkExclusionCallback> {

        /* renamed from: a  reason: collision with root package name */
        public final String f21302a;

        public MarkExclusionCallback(String str) {
            this.f21302a = str;
        }

        public boolean b(CharSequence charSequence, int i2, int i3, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if (!TextUtils.equals(charSequence.subSequence(i2, i3), this.f21302a)) {
                return true;
            }
            typefaceEmojiRasterizer.l(true);
            return false;
        }

        /* renamed from: c */
        public MarkExclusionCallback a() {
            return this;
        }
    }

    public static final class ProcessorSm {

        /* renamed from: a  reason: collision with root package name */
        public int f21303a = 1;

        /* renamed from: b  reason: collision with root package name */
        public final MetadataRepo.Node f21304b;

        /* renamed from: c  reason: collision with root package name */
        public MetadataRepo.Node f21305c;

        /* renamed from: d  reason: collision with root package name */
        public MetadataRepo.Node f21306d;

        /* renamed from: e  reason: collision with root package name */
        public int f21307e;

        /* renamed from: f  reason: collision with root package name */
        public int f21308f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f21309g;

        /* renamed from: h  reason: collision with root package name */
        public final int[] f21310h;

        public ProcessorSm(MetadataRepo.Node node, boolean z2, int[] iArr) {
            this.f21304b = node;
            this.f21305c = node;
            this.f21309g = z2;
            this.f21310h = iArr;
        }

        public static boolean d(int i2) {
            return i2 == 65039;
        }

        public static boolean f(int i2) {
            return i2 == 65038;
        }

        public int a(int i2) {
            MetadataRepo.Node a2 = this.f21305c.a(i2);
            int i3 = 2;
            if (this.f21303a != 2) {
                if (a2 == null) {
                    i3 = g();
                } else {
                    this.f21303a = 2;
                    this.f21305c = a2;
                    this.f21308f = 1;
                }
            } else if (a2 != null) {
                this.f21305c = a2;
                this.f21308f++;
            } else if (f(i2)) {
                i3 = g();
            } else if (!d(i2)) {
                if (this.f21305c.b() != null) {
                    i3 = 3;
                    if (this.f21308f != 1) {
                        this.f21306d = this.f21305c;
                        g();
                    } else if (h()) {
                        this.f21306d = this.f21305c;
                        g();
                    } else {
                        i3 = g();
                    }
                } else {
                    i3 = g();
                }
            }
            this.f21307e = i2;
            return i3;
        }

        public TypefaceEmojiRasterizer b() {
            return this.f21305c.b();
        }

        public TypefaceEmojiRasterizer c() {
            return this.f21306d.b();
        }

        public boolean e() {
            return this.f21303a == 2 && this.f21305c.b() != null && (this.f21308f > 1 || h());
        }

        public final int g() {
            this.f21303a = 1;
            this.f21305c = this.f21304b;
            this.f21308f = 0;
            return 1;
        }

        public final boolean h() {
            if (this.f21305c.b().j() || d(this.f21307e)) {
                return true;
            }
            if (this.f21309g) {
                if (this.f21310h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f21310h, this.f21305c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public EmojiProcessor(MetadataRepo metadataRepo, EmojiCompat.SpanFactory spanFactory, EmojiCompat.GlyphChecker glyphChecker, boolean z2, int[] iArr, Set set) {
        this.f21292a = spanFactory;
        this.f21293b = metadataRepo;
        this.f21294c = glyphChecker;
        this.f21295d = z2;
        this.f21296e = iArr;
        i(set);
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z2) {
        EmojiSpan[] emojiSpanArr;
        if (h(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!g(selectionStart, selectionEnd) && (emojiSpanArr = (EmojiSpan[]) editable.getSpans(selectionStart, selectionEnd, EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
            int length = emojiSpanArr.length;
            int i2 = 0;
            while (i2 < length) {
                EmojiSpan emojiSpan = emojiSpanArr[i2];
                int spanStart = editable.getSpanStart(emojiSpan);
                int spanEnd = editable.getSpanEnd(emojiSpan);
                if ((!z2 || spanStart != selectionStart) && ((z2 || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i2++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean d(InputConnection inputConnection, Editable editable, int i2, int i3, boolean z2) {
        int i4;
        int i5;
        if (editable != null && inputConnection != null && i2 >= 0 && i3 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (g(selectionStart, selectionEnd)) {
                return false;
            }
            if (z2) {
                i5 = CodepointIndexFinder.a(editable, selectionStart, Math.max(i2, 0));
                i4 = CodepointIndexFinder.b(editable, selectionEnd, Math.max(i3, 0));
                if (i5 == -1 || i4 == -1) {
                    return false;
                }
            } else {
                i5 = Math.max(selectionStart - i2, 0);
                i4 = Math.min(selectionEnd + i3, editable.length());
            }
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) editable.getSpans(i5, i4, EmojiSpan.class);
            if (emojiSpanArr != null && emojiSpanArr.length > 0) {
                for (EmojiSpan emojiSpan : emojiSpanArr) {
                    int spanStart = editable.getSpanStart(emojiSpan);
                    int spanEnd = editable.getSpanEnd(emojiSpan);
                    i5 = Math.min(spanStart, i5);
                    i4 = Math.max(spanEnd, i4);
                }
                int max = Math.max(i5, 0);
                int min = Math.min(i4, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max, min);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public static boolean e(Editable editable, int i2, KeyEvent keyEvent) {
        if (!(i2 != 67 ? i2 != 112 ? false : a(editable, keyEvent, true) : a(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    public static boolean g(int i2, int i3) {
        return i2 == -1 || i3 == -1 || i2 != i3;
    }

    public static boolean h(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    public int b(CharSequence charSequence, int i2) {
        if (i2 < 0 || i2 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i2, i2 + 1, EmojiSpan.class);
            if (emojiSpanArr.length > 0) {
                return spanned.getSpanEnd(emojiSpanArr[0]);
            }
        }
        return ((EmojiProcessLookupCallback) k(charSequence, Math.max(0, i2 - 16), Math.min(charSequence.length(), i2 + 16), Integer.MAX_VALUE, true, new EmojiProcessLookupCallback(i2))).f21301c;
    }

    public int c(CharSequence charSequence, int i2) {
        if (i2 < 0 || i2 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i2, i2 + 1, EmojiSpan.class);
            if (emojiSpanArr.length > 0) {
                return spanned.getSpanStart(emojiSpanArr[0]);
            }
        }
        return ((EmojiProcessLookupCallback) k(charSequence, Math.max(0, i2 - 16), Math.min(charSequence.length(), i2 + 16), Integer.MAX_VALUE, true, new EmojiProcessLookupCallback(i2))).f21300b;
    }

    public final boolean f(CharSequence charSequence, int i2, int i3, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        if (typefaceEmojiRasterizer.d() == 0) {
            typefaceEmojiRasterizer.m(this.f21294c.a(charSequence, i2, i3, typefaceEmojiRasterizer.h()));
        }
        return typefaceEmojiRasterizer.d() == 2;
    }

    public final void i(Set set) {
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int[] iArr = (int[]) it.next();
                String str = new String(iArr, 0, iArr.length);
                k(str, 0, str.length(), 1, true, new MarkExclusionCallback(str));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049 A[Catch:{ all -> 0x002a }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066 A[Catch:{ all -> 0x002a }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence j(java.lang.CharSequence r11, int r12, int r13, int r14, boolean r15) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof androidx.emoji2.text.SpannableBuilder
            if (r0 == 0) goto L_0x000a
            r1 = r11
            androidx.emoji2.text.SpannableBuilder r1 = (androidx.emoji2.text.SpannableBuilder) r1
            r1.a()
        L_0x000a:
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r1 = androidx.emoji2.text.EmojiSpan.class
            if (r0 != 0) goto L_0x002f
            boolean r2 = r11 instanceof android.text.Spannable     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0013
            goto L_0x002f
        L_0x0013:
            boolean r2 = r11 instanceof android.text.Spanned     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x002d
            r2 = r11
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch:{ all -> 0x002a }
            int r3 = r12 + -1
            int r4 = r13 + 1
            int r2 = r2.nextSpanTransition(r3, r4, r1)     // Catch:{ all -> 0x002a }
            if (r2 > r13) goto L_0x002d
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r2 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable     // Catch:{ all -> 0x002a }
            r2.<init>((java.lang.CharSequence) r11)     // Catch:{ all -> 0x002a }
            goto L_0x0037
        L_0x002a:
            r12 = move-exception
            goto L_0x00b2
        L_0x002d:
            r2 = 0
            goto L_0x0037
        L_0x002f:
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r2 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable     // Catch:{ all -> 0x002a }
            r3 = r11
            android.text.Spannable r3 = (android.text.Spannable) r3     // Catch:{ all -> 0x002a }
            r2.<init>((android.text.Spannable) r3)     // Catch:{ all -> 0x002a }
        L_0x0037:
            r3 = 0
            if (r2 == 0) goto L_0x0063
            java.lang.Object[] r4 = r2.getSpans(r12, r13, r1)     // Catch:{ all -> 0x002a }
            androidx.emoji2.text.EmojiSpan[] r4 = (androidx.emoji2.text.EmojiSpan[]) r4     // Catch:{ all -> 0x002a }
            if (r4 == 0) goto L_0x0063
            int r5 = r4.length     // Catch:{ all -> 0x002a }
            if (r5 <= 0) goto L_0x0063
            int r5 = r4.length     // Catch:{ all -> 0x002a }
            r6 = r3
        L_0x0047:
            if (r6 >= r5) goto L_0x0063
            r7 = r4[r6]     // Catch:{ all -> 0x002a }
            int r8 = r2.getSpanStart(r7)     // Catch:{ all -> 0x002a }
            int r9 = r2.getSpanEnd(r7)     // Catch:{ all -> 0x002a }
            if (r8 == r13) goto L_0x0058
            r2.removeSpan(r7)     // Catch:{ all -> 0x002a }
        L_0x0058:
            int r12 = java.lang.Math.min(r8, r12)     // Catch:{ all -> 0x002a }
            int r13 = java.lang.Math.max(r9, r13)     // Catch:{ all -> 0x002a }
            int r6 = r6 + 1
            goto L_0x0047
        L_0x0063:
            r4 = r13
            if (r12 == r4) goto L_0x00a9
            int r13 = r11.length()     // Catch:{ all -> 0x002a }
            if (r12 < r13) goto L_0x006d
            goto L_0x00a9
        L_0x006d:
            r13 = 2147483647(0x7fffffff, float:NaN)
            if (r14 == r13) goto L_0x0080
            if (r2 == 0) goto L_0x0080
            int r13 = r2.length()     // Catch:{ all -> 0x002a }
            java.lang.Object[] r13 = r2.getSpans(r3, r13, r1)     // Catch:{ all -> 0x002a }
            androidx.emoji2.text.EmojiSpan[] r13 = (androidx.emoji2.text.EmojiSpan[]) r13     // Catch:{ all -> 0x002a }
            int r13 = r13.length     // Catch:{ all -> 0x002a }
            int r14 = r14 - r13
        L_0x0080:
            r5 = r14
            androidx.emoji2.text.EmojiProcessor$EmojiProcessAddSpanCallback r7 = new androidx.emoji2.text.EmojiProcessor$EmojiProcessAddSpanCallback     // Catch:{ all -> 0x002a }
            androidx.emoji2.text.EmojiCompat$SpanFactory r13 = r10.f21292a     // Catch:{ all -> 0x002a }
            r7.<init>(r2, r13)     // Catch:{ all -> 0x002a }
            r1 = r10
            r2 = r11
            r3 = r12
            r6 = r15
            java.lang.Object r12 = r1.k(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x002a }
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r12 = (androidx.emoji2.text.UnprecomputeTextOnModificationSpannable) r12     // Catch:{ all -> 0x002a }
            if (r12 == 0) goto L_0x00a0
            android.text.Spannable r12 = r12.b()     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x009f
            androidx.emoji2.text.SpannableBuilder r11 = (androidx.emoji2.text.SpannableBuilder) r11
            r11.d()
        L_0x009f:
            return r12
        L_0x00a0:
            if (r0 == 0) goto L_0x00a8
            r12 = r11
            androidx.emoji2.text.SpannableBuilder r12 = (androidx.emoji2.text.SpannableBuilder) r12
            r12.d()
        L_0x00a8:
            return r11
        L_0x00a9:
            if (r0 == 0) goto L_0x00b1
            r12 = r11
            androidx.emoji2.text.SpannableBuilder r12 = (androidx.emoji2.text.SpannableBuilder) r12
            r12.d()
        L_0x00b1:
            return r11
        L_0x00b2:
            if (r0 == 0) goto L_0x00b9
            androidx.emoji2.text.SpannableBuilder r11 = (androidx.emoji2.text.SpannableBuilder) r11
            r11.d()
        L_0x00b9:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.EmojiProcessor.j(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }

    public final Object k(CharSequence charSequence, int i2, int i3, int i4, boolean z2, EmojiProcessCallback emojiProcessCallback) {
        int i5;
        ProcessorSm processorSm = new ProcessorSm(this.f21293b.f(), this.f21295d, this.f21296e);
        int i6 = 0;
        boolean z3 = true;
        int codePointAt = Character.codePointAt(charSequence, i2);
        loop0:
        while (true) {
            i5 = i2;
            while (i2 < i3 && i6 < i4 && z3) {
                int a2 = processorSm.a(codePointAt);
                if (a2 == 1) {
                    i5 += Character.charCount(Character.codePointAt(charSequence, i5));
                    if (i5 < i3) {
                        codePointAt = Character.codePointAt(charSequence, i5);
                    }
                    i2 = i5;
                } else if (a2 == 2) {
                    i2 += Character.charCount(codePointAt);
                    if (i2 < i3) {
                        codePointAt = Character.codePointAt(charSequence, i2);
                    }
                } else if (a2 == 3) {
                    if (z2 || !f(charSequence, i5, i2, processorSm.c())) {
                        z3 = emojiProcessCallback.b(charSequence, i5, i2, processorSm.c());
                        i6++;
                    }
                }
            }
        }
        if (processorSm.e() && i6 < i4 && z3 && (z2 || !f(charSequence, i5, i2, processorSm.b()))) {
            emojiProcessCallback.b(charSequence, i5, i2, processorSm.b());
        }
        return emojiProcessCallback.a();
    }
}
