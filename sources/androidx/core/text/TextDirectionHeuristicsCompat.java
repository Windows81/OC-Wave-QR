package androidx.core.text;

public final class TextDirectionHeuristicsCompat {

    /* renamed from: a  reason: collision with root package name */
    public static final TextDirectionHeuristicCompat f20095a = new TextDirectionHeuristicInternal((TextDirectionAlgorithm) null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final TextDirectionHeuristicCompat f20096b = new TextDirectionHeuristicInternal((TextDirectionAlgorithm) null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final TextDirectionHeuristicCompat f20097c;

    /* renamed from: d  reason: collision with root package name */
    public static final TextDirectionHeuristicCompat f20098d;

    /* renamed from: e  reason: collision with root package name */
    public static final TextDirectionHeuristicCompat f20099e = new TextDirectionHeuristicInternal(AnyStrong.f20101b, false);

    /* renamed from: f  reason: collision with root package name */
    public static final TextDirectionHeuristicCompat f20100f = TextDirectionHeuristicLocale.f20106b;

    public static class AnyStrong implements TextDirectionAlgorithm {

        /* renamed from: b  reason: collision with root package name */
        public static final AnyStrong f20101b = new AnyStrong(true);

        /* renamed from: a  reason: collision with root package name */
        public final boolean f20102a;

        public AnyStrong(boolean z2) {
            this.f20102a = z2;
        }
    }

    public static class FirstStrong implements TextDirectionAlgorithm {

        /* renamed from: a  reason: collision with root package name */
        public static final FirstStrong f20103a = new FirstStrong();
    }

    public interface TextDirectionAlgorithm {
    }

    public static abstract class TextDirectionHeuristicImpl implements TextDirectionHeuristicCompat {

        /* renamed from: a  reason: collision with root package name */
        public final TextDirectionAlgorithm f20104a;

        public TextDirectionHeuristicImpl(TextDirectionAlgorithm textDirectionAlgorithm) {
            this.f20104a = textDirectionAlgorithm;
        }
    }

    public static class TextDirectionHeuristicInternal extends TextDirectionHeuristicImpl {

        /* renamed from: b  reason: collision with root package name */
        public final boolean f20105b;

        public TextDirectionHeuristicInternal(TextDirectionAlgorithm textDirectionAlgorithm, boolean z2) {
            super(textDirectionAlgorithm);
            this.f20105b = z2;
        }
    }

    public static class TextDirectionHeuristicLocale extends TextDirectionHeuristicImpl {

        /* renamed from: b  reason: collision with root package name */
        public static final TextDirectionHeuristicLocale f20106b = new TextDirectionHeuristicLocale();

        public TextDirectionHeuristicLocale() {
            super((TextDirectionAlgorithm) null);
        }
    }

    static {
        FirstStrong firstStrong = FirstStrong.f20103a;
        f20097c = new TextDirectionHeuristicInternal(firstStrong, false);
        f20098d = new TextDirectionHeuristicInternal(firstStrong, true);
    }
}
