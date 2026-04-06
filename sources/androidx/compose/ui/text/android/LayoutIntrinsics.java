package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LayoutIntrinsics {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f18535a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f18536b;

    /* renamed from: c  reason: collision with root package name */
    public final int f18537c;

    /* renamed from: d  reason: collision with root package name */
    public float f18538d = Float.NaN;

    /* renamed from: e  reason: collision with root package name */
    public float f18539e = Float.NaN;

    /* renamed from: f  reason: collision with root package name */
    public BoringLayout.Metrics f18540f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f18541g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f18542h;

    public LayoutIntrinsics(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.f18535a = charSequence;
        this.f18536b = textPaint;
        this.f18537c = i2;
    }

    public static final int d(Pair pair, Pair pair2) {
        return (((Number) pair.f()).intValue() - ((Number) pair.e()).intValue()) - (((Number) pair2.f()).intValue() - ((Number) pair2.e()).intValue());
    }

    public static /* synthetic */ float h(LayoutIntrinsics layoutIntrinsics, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = layoutIntrinsics.f().length();
        }
        return layoutIntrinsics.g(i2, i3);
    }

    public final float b() {
        BoringLayout.Metrics e2 = e();
        float f2 = (float) (e2 != null ? e2.width : -1);
        if (f2 < 0.0f) {
            f2 = (float) Math.ceil((double) h(this, 0, 0, 3, (Object) null));
        }
        return LayoutIntrinsics_androidKt.d(f2, this.f18535a, this.f18536b) ? f2 + 0.5f : f2;
    }

    public final float c() {
        BreakIterator lineInstance = BreakIterator.getLineInstance(this.f18536b.getTextLocale());
        CharSequence charSequence = this.f18535a;
        int i2 = 0;
        lineInstance.setText(new CharSequenceCharacterIterator(charSequence, 0, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new u());
        int next = lineInstance.next();
        while (true) {
            int i3 = i2;
            i2 = next;
            int i4 = i3;
            if (i2 == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i4), Integer.valueOf(i2)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.f()).intValue() - ((Number) pair.e()).intValue() < i2 - i4) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i4), Integer.valueOf(i2)));
                }
            }
            next = lineInstance.next();
        }
        if (priorityQueue.isEmpty()) {
            return 0.0f;
        }
        Iterator it = priorityQueue.iterator();
        if (it.hasNext()) {
            Pair pair2 = (Pair) it.next();
            float g2 = g(((Number) pair2.a()).intValue(), ((Number) pair2.b()).intValue());
            while (it.hasNext()) {
                Pair pair3 = (Pair) it.next();
                g2 = Math.max(g2, g(((Number) pair3.a()).intValue(), ((Number) pair3.b()).intValue()));
            }
            return g2;
        }
        throw new NoSuchElementException();
    }

    public final BoringLayout.Metrics e() {
        if (!this.f18541g) {
            this.f18540f = BoringLayoutFactory.f18508a.c(this.f18535a, this.f18536b, TextLayout_androidKt.k(this.f18537c));
            this.f18541g = true;
        }
        return this.f18540f;
    }

    public final CharSequence f() {
        CharSequence charSequence = this.f18542h;
        if (charSequence != null) {
            Intrinsics.f(charSequence);
            return charSequence;
        } else if (!LayoutIntrinsics_androidKt.f18543a) {
            return this.f18535a;
        } else {
            CharSequence c2 = LayoutIntrinsics_androidKt.e(this.f18535a);
            this.f18542h = c2;
            return c2;
        }
    }

    public final float g(int i2, int i3) {
        return Layout.getDesiredWidth(f(), i2, i3, this.f18536b);
    }

    public final float i() {
        if (!Float.isNaN(this.f18538d)) {
            return this.f18538d;
        }
        float b2 = b();
        this.f18538d = b2;
        return b2;
    }

    public final float j() {
        if (!Float.isNaN(this.f18539e)) {
            return this.f18539e;
        }
        float c2 = c();
        this.f18539e = c2;
        return c2;
    }
}
