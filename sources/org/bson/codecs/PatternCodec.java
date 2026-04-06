package org.bson.codecs;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.bson.BsonReader;
import org.bson.BsonRegularExpression;
import org.bson.BsonWriter;

public class PatternCodec implements Codec<Pattern> {

    public enum RegexFlag {
        CANON_EQ(128, 'c', "Pattern.CANON_EQ"),
        UNIX_LINES(1, 'd', "Pattern.UNIX_LINES"),
        GLOBAL(256, 'g', (int) null),
        CASE_INSENSITIVE(2, 'i', (int) null),
        MULTILINE(8, 'm', (int) null),
        DOTALL(32, 's', "Pattern.DOTALL"),
        LITERAL(16, 't', "Pattern.LITERAL"),
        UNICODE_CASE(64, 'u', "Pattern.UNICODE_CASE"),
        COMMENTS(4, 'x', (int) null);
        
        public static final Map L = null;

        /* renamed from: A  reason: collision with root package name */
        public final char f43748A;

        /* renamed from: B  reason: collision with root package name */
        public final String f43749B;

        /* renamed from: z  reason: collision with root package name */
        public final int f43750z;

        static {
            L = new HashMap();
            for (RegexFlag regexFlag : values()) {
                L.put(Character.valueOf(regexFlag.f43748A), regexFlag);
            }
        }

        /* access modifiers changed from: public */
        RegexFlag(int i2, char c2, String str) {
            this.f43750z = i2;
            this.f43748A = c2;
            this.f43749B = str;
        }

        public static RegexFlag j(char c2) {
            return (RegexFlag) L.get(Character.valueOf(c2));
        }
    }

    public static int f(BsonRegularExpression bsonRegularExpression) {
        String l0 = bsonRegularExpression.l0();
        int i2 = 0;
        if (l0 == null || l0.length() == 0) {
            return 0;
        }
        String lowerCase = l0.toLowerCase();
        int i3 = 0;
        while (i2 < lowerCase.length()) {
            RegexFlag j2 = RegexFlag.j(lowerCase.charAt(i2));
            if (j2 != null) {
                i3 |= j2.f43750z;
                String unused = j2.f43749B;
                i2++;
            } else {
                throw new IllegalArgumentException("unrecognized flag [" + lowerCase.charAt(i2) + "] " + lowerCase.charAt(i2));
            }
        }
        return i3;
    }

    public static String g(Pattern pattern) {
        int flags = pattern.flags();
        StringBuilder sb = new StringBuilder();
        for (RegexFlag regexFlag : RegexFlag.values()) {
            if ((pattern.flags() & regexFlag.f43750z) > 0) {
                sb.append(regexFlag.f43748A);
                flags -= regexFlag.f43750z;
            }
        }
        if (flags <= 0) {
            return sb.toString();
        }
        throw new IllegalArgumentException("some flags could not be recognized.");
    }

    /* renamed from: c */
    public Pattern b(BsonReader bsonReader, DecoderContext decoderContext) {
        BsonRegularExpression f1 = bsonReader.f1();
        return Pattern.compile(f1.p0(), f(f1));
    }

    public Class d() {
        return Pattern.class;
    }

    /* renamed from: e */
    public void a(BsonWriter bsonWriter, Pattern pattern, EncoderContext encoderContext) {
        bsonWriter.G(new BsonRegularExpression(pattern.pattern(), g(pattern)));
    }
}
