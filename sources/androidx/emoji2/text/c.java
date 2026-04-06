package androidx.emoji2.text;

import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.concurrent.ThreadPoolExecutor;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ EmojiCompat.MetadataRepoLoaderCallback f21357A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f21358B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer.BackgroundDefaultLoader f21359z;

    public /* synthetic */ c(EmojiCompatInitializer.BackgroundDefaultLoader backgroundDefaultLoader, EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback, ThreadPoolExecutor threadPoolExecutor) {
        this.f21359z = backgroundDefaultLoader;
        this.f21357A = metadataRepoLoaderCallback;
        this.f21358B = threadPoolExecutor;
    }

    public final void run() {
        this.f21359z.d(this.f21357A, this.f21358B);
    }
}
