package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.collection.ArraySet;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class EmojiCompat {

    /* renamed from: o  reason: collision with root package name */
    public static final Object f21252o = new Object();

    /* renamed from: p  reason: collision with root package name */
    public static final Object f21253p = new Object();

    /* renamed from: q  reason: collision with root package name */
    public static volatile EmojiCompat f21254q;

    /* renamed from: a  reason: collision with root package name */
    public final ReadWriteLock f21255a = new ReentrantReadWriteLock();

    /* renamed from: b  reason: collision with root package name */
    public final Set f21256b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f21257c = 3;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f21258d;

    /* renamed from: e  reason: collision with root package name */
    public final CompatInternal f21259e;

    /* renamed from: f  reason: collision with root package name */
    public final MetadataRepoLoader f21260f;

    /* renamed from: g  reason: collision with root package name */
    public final SpanFactory f21261g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f21262h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f21263i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f21264j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f21265k;

    /* renamed from: l  reason: collision with root package name */
    public final int f21266l;

    /* renamed from: m  reason: collision with root package name */
    public final int f21267m;

    /* renamed from: n  reason: collision with root package name */
    public final GlyphChecker f21268n;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CodepointSequenceMatchResult {
    }

    public static class CompatInternal {

        /* renamed from: a  reason: collision with root package name */
        public final EmojiCompat f21269a;

        public CompatInternal(EmojiCompat emojiCompat) {
            this.f21269a = emojiCompat;
        }

        public int a(CharSequence charSequence, int i2) {
            return -1;
        }

        public int b(CharSequence charSequence, int i2) {
            return -1;
        }

        public void c() {
            this.f21269a.q();
        }

        public CharSequence d(CharSequence charSequence, int i2, int i3, int i4, boolean z2) {
            return charSequence;
        }

        public void e(EditorInfo editorInfo) {
        }
    }

    public static final class CompatInternal19 extends CompatInternal {

        /* renamed from: b  reason: collision with root package name */
        public volatile EmojiProcessor f21270b;

        /* renamed from: c  reason: collision with root package name */
        public volatile MetadataRepo f21271c;

        public CompatInternal19(EmojiCompat emojiCompat) {
            super(emojiCompat);
        }

        public int a(CharSequence charSequence, int i2) {
            return this.f21270b.b(charSequence, i2);
        }

        public int b(CharSequence charSequence, int i2) {
            return this.f21270b.c(charSequence, i2);
        }

        public void c() {
            try {
                this.f21269a.f21260f.a(new MetadataRepoLoaderCallback() {
                    public void a(Throwable th) {
                        CompatInternal19.this.f21269a.p(th);
                    }

                    public void b(MetadataRepo metadataRepo) {
                        CompatInternal19.this.f(metadataRepo);
                    }
                });
            } catch (Throwable th) {
                this.f21269a.p(th);
            }
        }

        public CharSequence d(CharSequence charSequence, int i2, int i3, int i4, boolean z2) {
            return this.f21270b.j(charSequence, i2, i3, i4, z2);
        }

        public void e(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f21271c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f21269a.f21262h);
        }

        public void f(MetadataRepo metadataRepo) {
            if (metadataRepo == null) {
                this.f21269a.p(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f21271c = metadataRepo;
            MetadataRepo metadataRepo2 = this.f21271c;
            SpanFactory a2 = this.f21269a.f21261g;
            GlyphChecker b2 = this.f21269a.f21268n;
            EmojiCompat emojiCompat = this.f21269a;
            this.f21270b = new EmojiProcessor(metadataRepo2, a2, b2, emojiCompat.f21263i, emojiCompat.f21264j, EmojiExclusions.a());
            this.f21269a.q();
        }
    }

    public static abstract class Config {

        /* renamed from: a  reason: collision with root package name */
        public final MetadataRepoLoader f21273a;

        /* renamed from: b  reason: collision with root package name */
        public SpanFactory f21274b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f21275c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f21276d;

        /* renamed from: e  reason: collision with root package name */
        public int[] f21277e;

        /* renamed from: f  reason: collision with root package name */
        public Set f21278f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f21279g;

        /* renamed from: h  reason: collision with root package name */
        public int f21280h = -16711936;

        /* renamed from: i  reason: collision with root package name */
        public int f21281i = 0;

        /* renamed from: j  reason: collision with root package name */
        public GlyphChecker f21282j = new DefaultGlyphChecker();

        public Config(MetadataRepoLoader metadataRepoLoader) {
            Preconditions.g(metadataRepoLoader, "metadataLoader cannot be null.");
            this.f21273a = metadataRepoLoader;
        }

        public final MetadataRepoLoader a() {
            return this.f21273a;
        }

        public Config b(int i2) {
            this.f21281i = i2;
            return this;
        }
    }

    public static class DefaultSpanFactory implements SpanFactory {
        public EmojiSpan a(TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            return new TypefaceEmojiSpan(typefaceEmojiRasterizer);
        }
    }

    public interface GlyphChecker {
        boolean a(CharSequence charSequence, int i2, int i3, int i4);
    }

    public static abstract class InitCallback {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    public static class ListenerDispatcher implements Runnable {

        /* renamed from: A  reason: collision with root package name */
        public final Throwable f21283A;

        /* renamed from: B  reason: collision with root package name */
        public final int f21284B;

        /* renamed from: z  reason: collision with root package name */
        public final List f21285z;

        public ListenerDispatcher(InitCallback initCallback, int i2) {
            this(Arrays.asList(new InitCallback[]{(InitCallback) Preconditions.g(initCallback, "initCallback cannot be null")}), i2, (Throwable) null);
        }

        public void run() {
            int size = this.f21285z.size();
            int i2 = 0;
            if (this.f21284B != 1) {
                while (i2 < size) {
                    ((InitCallback) this.f21285z.get(i2)).a(this.f21283A);
                    i2++;
                }
                return;
            }
            while (i2 < size) {
                ((InitCallback) this.f21285z.get(i2)).b();
                i2++;
            }
        }

        public ListenerDispatcher(Collection collection, int i2) {
            this(collection, i2, (Throwable) null);
        }

        public ListenerDispatcher(Collection collection, int i2, Throwable th) {
            Preconditions.g(collection, "initCallbacks cannot be null");
            this.f21285z = new ArrayList(collection);
            this.f21284B = i2;
            this.f21283A = th;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LoadStrategy {
    }

    public interface MetadataRepoLoader {
        void a(MetadataRepoLoaderCallback metadataRepoLoaderCallback);
    }

    public static abstract class MetadataRepoLoaderCallback {
        public abstract void a(Throwable th);

        public abstract void b(MetadataRepo metadataRepo);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ReplaceStrategy {
    }

    public interface SpanFactory {
        EmojiSpan a(TypefaceEmojiRasterizer typefaceEmojiRasterizer);
    }

    public EmojiCompat(Config config) {
        this.f21262h = config.f21275c;
        this.f21263i = config.f21276d;
        this.f21264j = config.f21277e;
        this.f21265k = config.f21279g;
        this.f21266l = config.f21280h;
        this.f21260f = config.f21273a;
        this.f21267m = config.f21281i;
        this.f21268n = config.f21282j;
        this.f21258d = new Handler(Looper.getMainLooper());
        ArraySet arraySet = new ArraySet();
        this.f21256b = arraySet;
        SpanFactory spanFactory = config.f21274b;
        this.f21261g = spanFactory == null ? new DefaultSpanFactory() : spanFactory;
        Set set = config.f21278f;
        if (set != null && !set.isEmpty()) {
            arraySet.addAll(config.f21278f);
        }
        this.f21259e = new CompatInternal19(this);
        o();
    }

    public static EmojiCompat c() {
        EmojiCompat emojiCompat;
        synchronized (f21252o) {
            emojiCompat = f21254q;
            Preconditions.h(emojiCompat != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return emojiCompat;
    }

    public static boolean h(InputConnection inputConnection, Editable editable, int i2, int i3, boolean z2) {
        return EmojiProcessor.d(inputConnection, editable, i2, i3, z2);
    }

    public static boolean i(Editable editable, int i2, KeyEvent keyEvent) {
        return EmojiProcessor.e(editable, i2, keyEvent);
    }

    public static EmojiCompat j(Config config) {
        EmojiCompat emojiCompat = f21254q;
        if (emojiCompat == null) {
            synchronized (f21252o) {
                try {
                    emojiCompat = f21254q;
                    if (emojiCompat == null) {
                        emojiCompat = new EmojiCompat(config);
                        f21254q = emojiCompat;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emojiCompat;
    }

    public static boolean k() {
        return f21254q != null;
    }

    public int d(CharSequence charSequence, int i2) {
        Preconditions.h(m(), "Not initialized yet");
        Preconditions.g(charSequence, "charSequence cannot be null");
        return this.f21259e.a(charSequence, i2);
    }

    public int e() {
        return this.f21266l;
    }

    public int f(CharSequence charSequence, int i2) {
        Preconditions.h(m(), "Not initialized yet");
        Preconditions.g(charSequence, "charSequence cannot be null");
        return this.f21259e.b(charSequence, i2);
    }

    public int g() {
        this.f21255a.readLock().lock();
        try {
            return this.f21257c;
        } finally {
            this.f21255a.readLock().unlock();
        }
    }

    public boolean l() {
        return this.f21265k;
    }

    public final boolean m() {
        return g() == 1;
    }

    public void n() {
        boolean z2 = true;
        if (this.f21267m != 1) {
            z2 = false;
        }
        Preconditions.h(z2, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (!m()) {
            this.f21255a.writeLock().lock();
            try {
                if (this.f21257c != 0) {
                    this.f21257c = 0;
                    this.f21255a.writeLock().unlock();
                    this.f21259e.c();
                }
            } finally {
                this.f21255a.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void o() {
        this.f21255a.writeLock().lock();
        try {
            if (this.f21267m == 0) {
                this.f21257c = 0;
            }
            this.f21255a.writeLock().unlock();
            if (g() == 0) {
                this.f21259e.c();
            }
        } catch (Throwable th) {
            this.f21255a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void p(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f21255a.writeLock().lock();
        try {
            this.f21257c = 2;
            arrayList.addAll(this.f21256b);
            this.f21256b.clear();
            this.f21255a.writeLock().unlock();
            this.f21258d.post(new ListenerDispatcher(arrayList, this.f21257c, th));
        } catch (Throwable th2) {
            this.f21255a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    public void q() {
        ArrayList arrayList = new ArrayList();
        this.f21255a.writeLock().lock();
        try {
            this.f21257c = 1;
            arrayList.addAll(this.f21256b);
            this.f21256b.clear();
            this.f21255a.writeLock().unlock();
            this.f21258d.post(new ListenerDispatcher((Collection) arrayList, this.f21257c));
        } catch (Throwable th) {
            this.f21255a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence r(CharSequence charSequence) {
        return s(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence s(CharSequence charSequence, int i2, int i3) {
        return t(charSequence, i2, i3, Integer.MAX_VALUE);
    }

    public CharSequence t(CharSequence charSequence, int i2, int i3, int i4) {
        return u(charSequence, i2, i3, i4, 0);
    }

    public CharSequence u(CharSequence charSequence, int i2, int i3, int i4, int i5) {
        boolean z2;
        Preconditions.h(m(), "Not initialized yet");
        Preconditions.d(i2, "start cannot be negative");
        Preconditions.d(i3, "end cannot be negative");
        Preconditions.d(i4, "maxEmojiCount cannot be negative");
        boolean z3 = false;
        Preconditions.a(i2 <= i3, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        Preconditions.a(i2 <= charSequence.length(), "start should be < than charSequence length");
        Preconditions.a(i3 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i2 == i3) {
            return charSequence;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                z3 = this.f21262h;
            }
            z2 = z3;
        } else {
            z2 = true;
        }
        return this.f21259e.d(charSequence, i2, i3, i4, z2);
    }

    public void v(InitCallback initCallback) {
        Preconditions.g(initCallback, "initCallback cannot be null");
        this.f21255a.writeLock().lock();
        try {
            if (this.f21257c != 1) {
                if (this.f21257c != 2) {
                    this.f21256b.add(initCallback);
                }
            }
            this.f21258d.post(new ListenerDispatcher(initCallback, this.f21257c));
        } finally {
            this.f21255a.writeLock().unlock();
        }
    }

    public void w(InitCallback initCallback) {
        Preconditions.g(initCallback, "initCallback cannot be null");
        this.f21255a.writeLock().lock();
        try {
            this.f21256b.remove(initCallback);
        } finally {
            this.f21255a.writeLock().unlock();
        }
    }

    public void x(EditorInfo editorInfo) {
        if (m() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.f21259e.e(editorInfo);
        }
    }
}
