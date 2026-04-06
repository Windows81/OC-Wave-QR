package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.core.util.Preconditions;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class SpannableBuilder extends SpannableStringBuilder {

    /* renamed from: A  reason: collision with root package name */
    public final List f21344A = new ArrayList();

    /* renamed from: z  reason: collision with root package name */
    public final Class f21345z;

    public static class WatcherWrapper implements TextWatcher, SpanWatcher {

        /* renamed from: A  reason: collision with root package name */
        public final AtomicInteger f21346A = new AtomicInteger(0);

        /* renamed from: z  reason: collision with root package name */
        public final Object f21347z;

        public WatcherWrapper(Object obj) {
            this.f21347z = obj;
        }

        public final void a() {
            this.f21346A.incrementAndGet();
        }

        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f21347z).afterTextChanged(editable);
        }

        public final boolean b(Object obj) {
            return obj instanceof EmojiSpan;
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            ((TextWatcher) this.f21347z).beforeTextChanged(charSequence, i2, i3, i4);
        }

        public final void c() {
            this.f21346A.decrementAndGet();
        }

        public void onSpanAdded(Spannable spannable, Object obj, int i2, int i3) {
            if (this.f21346A.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f21347z).onSpanAdded(spannable, obj, i2, i3);
            }
        }

        public void onSpanChanged(Spannable spannable, Object obj, int i2, int i3, int i4, int i5) {
            int i6;
            int i7;
            if (this.f21346A.get() <= 0 || !b(obj)) {
                if (Build.VERSION.SDK_INT < 28) {
                    if (i2 > i3) {
                        i2 = 0;
                    }
                    if (i4 > i5) {
                        i7 = i2;
                        i6 = 0;
                        ((SpanWatcher) this.f21347z).onSpanChanged(spannable, obj, i7, i3, i6, i5);
                    }
                }
                i7 = i2;
                i6 = i4;
                ((SpanWatcher) this.f21347z).onSpanChanged(spannable, obj, i7, i3, i6, i5);
            }
        }

        public void onSpanRemoved(Spannable spannable, Object obj, int i2, int i3) {
            if (this.f21346A.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f21347z).onSpanRemoved(spannable, obj, i2, i3);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            ((TextWatcher) this.f21347z).onTextChanged(charSequence, i2, i3, i4);
        }
    }

    public SpannableBuilder(Class cls, CharSequence charSequence) {
        super(charSequence);
        Preconditions.g(cls, "watcherClass cannot be null");
        this.f21345z = cls;
    }

    public static SpannableBuilder c(Class cls, CharSequence charSequence) {
        return new SpannableBuilder(cls, charSequence);
    }

    public void a() {
        b();
    }

    public final void b() {
        for (int i2 = 0; i2 < this.f21344A.size(); i2++) {
            ((WatcherWrapper) this.f21344A.get(i2)).a();
        }
    }

    public void d() {
        i();
        e();
    }

    public final void e() {
        for (int i2 = 0; i2 < this.f21344A.size(); i2++) {
            ((WatcherWrapper) this.f21344A.get(i2)).onTextChanged(this, 0, length(), length());
        }
    }

    public final WatcherWrapper f(Object obj) {
        for (int i2 = 0; i2 < this.f21344A.size(); i2++) {
            WatcherWrapper watcherWrapper = (WatcherWrapper) this.f21344A.get(i2);
            if (watcherWrapper.f21347z == obj) {
                return watcherWrapper;
            }
        }
        return null;
    }

    public final boolean g(Class cls) {
        return this.f21345z == cls;
    }

    public int getSpanEnd(Object obj) {
        WatcherWrapper f2;
        if (h(obj) && (f2 = f(obj)) != null) {
            obj = f2;
        }
        return super.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        WatcherWrapper f2;
        if (h(obj) && (f2 = f(obj)) != null) {
            obj = f2;
        }
        return super.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        WatcherWrapper f2;
        if (h(obj) && (f2 = f(obj)) != null) {
            obj = f2;
        }
        return super.getSpanStart(obj);
    }

    public Object[] getSpans(int i2, int i3, Class cls) {
        if (!g(cls)) {
            return super.getSpans(i2, i3, cls);
        }
        WatcherWrapper[] watcherWrapperArr = (WatcherWrapper[]) super.getSpans(i2, i3, WatcherWrapper.class);
        Object[] objArr = (Object[]) Array.newInstance(cls, watcherWrapperArr.length);
        for (int i4 = 0; i4 < watcherWrapperArr.length; i4++) {
            objArr[i4] = watcherWrapperArr[i4].f21347z;
        }
        return objArr;
    }

    public final boolean h(Object obj) {
        return obj != null && g(obj.getClass());
    }

    public final void i() {
        for (int i2 = 0; i2 < this.f21344A.size(); i2++) {
            ((WatcherWrapper) this.f21344A.get(i2)).c();
        }
    }

    public int nextSpanTransition(int i2, int i3, Class<WatcherWrapper> cls) {
        if (cls == null || g(cls)) {
            cls = WatcherWrapper.class;
        }
        return super.nextSpanTransition(i2, i3, cls);
    }

    public void removeSpan(Object obj) {
        WatcherWrapper watcherWrapper;
        if (h(obj)) {
            watcherWrapper = f(obj);
            if (watcherWrapper != null) {
                obj = watcherWrapper;
            }
        } else {
            watcherWrapper = null;
        }
        super.removeSpan(obj);
        if (watcherWrapper != null) {
            this.f21344A.remove(watcherWrapper);
        }
    }

    public void setSpan(Object obj, int i2, int i3, int i4) {
        if (h(obj)) {
            WatcherWrapper watcherWrapper = new WatcherWrapper(obj);
            this.f21344A.add(watcherWrapper);
            obj = watcherWrapper;
        }
        super.setSpan(obj, i2, i3, i4);
    }

    public CharSequence subSequence(int i2, int i3) {
        return new SpannableBuilder(this.f21345z, this, i2, i3);
    }

    public SpannableStringBuilder delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    public SpannableStringBuilder insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    public SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence) {
        b();
        super.replace(i2, i3, charSequence);
        i();
        return this;
    }

    public SpannableStringBuilder insert(int i2, CharSequence charSequence, int i3, int i4) {
        super.insert(i2, charSequence, i3, i4);
        return this;
    }

    public SpannableBuilder(Class cls, CharSequence charSequence, int i2, int i3) {
        super(charSequence, i2, i3);
        Preconditions.g(cls, "watcherClass cannot be null");
        this.f21345z = cls;
    }

    public SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        b();
        super.replace(i2, i3, charSequence, i4, i5);
        i();
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public SpannableStringBuilder append(char c2) {
        super.append(c2);
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i2) {
        super.append(charSequence, obj, i2);
        return this;
    }
}
