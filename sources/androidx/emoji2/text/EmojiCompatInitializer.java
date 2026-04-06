package androidx.emoji2.text;

import android.content.Context;
import androidx.core.os.TraceCompat;
import androidx.emoji2.text.EmojiCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.AppInitializer;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

public class EmojiCompatInitializer implements Initializer<Boolean> {

    public static class BackgroundDefaultConfig extends EmojiCompat.Config {
        public BackgroundDefaultConfig(Context context) {
            super(new BackgroundDefaultLoader(context));
            b(1);
        }
    }

    public static class BackgroundDefaultLoader implements EmojiCompat.MetadataRepoLoader {

        /* renamed from: a  reason: collision with root package name */
        public final Context f21288a;

        public BackgroundDefaultLoader(Context context) {
            this.f21288a = context.getApplicationContext();
        }

        public void a(EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback) {
            ThreadPoolExecutor b2 = ConcurrencyHelpers.b("EmojiCompatInitializer");
            b2.execute(new c(this, metadataRepoLoaderCallback, b2));
        }

        /* renamed from: c */
        public void d(final EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback, final ThreadPoolExecutor threadPoolExecutor) {
            try {
                FontRequestEmojiCompatConfig a2 = DefaultEmojiCompatConfig.a(this.f21288a);
                if (a2 != null) {
                    a2.c(threadPoolExecutor);
                    a2.a().a(new EmojiCompat.MetadataRepoLoaderCallback() {
                        public void a(Throwable th) {
                            try {
                                metadataRepoLoaderCallback.a(th);
                            } finally {
                                threadPoolExecutor.shutdown();
                            }
                        }

                        public void b(MetadataRepo metadataRepo) {
                            try {
                                metadataRepoLoaderCallback.b(metadataRepo);
                            } finally {
                                threadPoolExecutor.shutdown();
                            }
                        }
                    });
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th) {
                metadataRepoLoaderCallback.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    public static class LoadEmojiCompatRunnable implements Runnable {
        public void run() {
            try {
                TraceCompat.a("EmojiCompat.EmojiCompatInitializer.run");
                if (EmojiCompat.k()) {
                    EmojiCompat.c().n();
                }
            } finally {
                TraceCompat.b();
            }
        }
    }

    public List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* renamed from: c */
    public Boolean b(Context context) {
        EmojiCompat.j(new BackgroundDefaultConfig(context));
        d(context);
        return Boolean.TRUE;
    }

    public void d(Context context) {
        final Lifecycle a2 = ((LifecycleOwner) AppInitializer.e(context).f(ProcessLifecycleInitializer.class)).a();
        a2.a(new DefaultLifecycleObserver() {
            public void c(LifecycleOwner lifecycleOwner) {
                EmojiCompatInitializer.this.e();
                a2.d(this);
            }
        });
    }

    public void e() {
        ConcurrencyHelpers.d().postDelayed(new LoadEmojiCompatRunnable(), 500);
    }
}
