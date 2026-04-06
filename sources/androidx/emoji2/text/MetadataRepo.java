package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.core.os.TraceCompat;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.nio.ByteBuffer;

public final class MetadataRepo {

    /* renamed from: a  reason: collision with root package name */
    public final MetadataList f21338a;

    /* renamed from: b  reason: collision with root package name */
    public final char[] f21339b;

    /* renamed from: c  reason: collision with root package name */
    public final Node f21340c = new Node(1024);

    /* renamed from: d  reason: collision with root package name */
    public final Typeface f21341d;

    public static class Node {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray f21342a;

        /* renamed from: b  reason: collision with root package name */
        public TypefaceEmojiRasterizer f21343b;

        public Node() {
            this(1);
        }

        public Node a(int i2) {
            SparseArray sparseArray = this.f21342a;
            if (sparseArray == null) {
                return null;
            }
            return (Node) sparseArray.get(i2);
        }

        public final TypefaceEmojiRasterizer b() {
            return this.f21343b;
        }

        public void c(TypefaceEmojiRasterizer typefaceEmojiRasterizer, int i2, int i3) {
            Node a2 = a(typefaceEmojiRasterizer.b(i2));
            if (a2 == null) {
                a2 = new Node();
                this.f21342a.put(typefaceEmojiRasterizer.b(i2), a2);
            }
            if (i3 > i2) {
                a2.c(typefaceEmojiRasterizer, i2 + 1, i3);
            } else {
                a2.f21343b = typefaceEmojiRasterizer;
            }
        }

        public Node(int i2) {
            this.f21342a = new SparseArray(i2);
        }
    }

    public MetadataRepo(Typeface typeface, MetadataList metadataList) {
        this.f21341d = typeface;
        this.f21338a = metadataList;
        this.f21339b = new char[(metadataList.l() * 2)];
        a(metadataList);
    }

    public static MetadataRepo b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            TraceCompat.a("EmojiCompat.MetadataRepo.create");
            return new MetadataRepo(typeface, MetadataListReader.b(byteBuffer));
        } finally {
            TraceCompat.b();
        }
    }

    public final void a(MetadataList metadataList) {
        int l2 = metadataList.l();
        for (int i2 = 0; i2 < l2; i2++) {
            TypefaceEmojiRasterizer typefaceEmojiRasterizer = new TypefaceEmojiRasterizer(this, i2);
            Character.toChars(typefaceEmojiRasterizer.f(), this.f21339b, i2 * 2);
            h(typefaceEmojiRasterizer);
        }
    }

    public char[] c() {
        return this.f21339b;
    }

    public MetadataList d() {
        return this.f21338a;
    }

    public int e() {
        return this.f21338a.m();
    }

    public Node f() {
        return this.f21340c;
    }

    public Typeface g() {
        return this.f21341d;
    }

    public void h(TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        Preconditions.g(typefaceEmojiRasterizer, "emoji metadata cannot be null");
        Preconditions.a(typefaceEmojiRasterizer.c() > 0, "invalid metadata codepoint length");
        this.f21340c.c(typefaceEmojiRasterizer, 0, typefaceEmojiRasterizer.c() - 1);
    }
}
